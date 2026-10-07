package ru.ok.android.externcalls.analytics.internal.storage;

import defpackage.ckc;
import defpackage.h2d;
import defpackage.iu6;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.Lock;
import java.util.zip.GZIPOutputStream;
import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class FileCacheWriter implements CacheWriter {
    private static final String LOG_TAG = "CallAnalyticsFileCacheWriter";
    private static final long MAX_FILE_LENGTH = 10000000;
    private final boolean compressContent;
    private final Provider<File> file;
    private final Lock lock;
    private long length = -1;
    private final ByteArrayOutputStream proxyStream = new ByteArrayOutputStream();
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    public FileCacheWriter(Provider<File> provider, boolean z, Lock lock) {
        this.file = provider;
        this.lock = lock;
        this.compressContent = z;
    }

    private void atomicWrite(boolean z, CallAnalyticsEvent callAnalyticsEvent, OutputStream outputStream) throws IOException {
        try {
            this.proxyStream.reset();
            OutputStream gZIPOutputStream = this.compressContent ? new GZIPOutputStream(this.proxyStream, 1024, true) : this.proxyStream;
            try {
                write(z, callAnalyticsEvent, gZIPOutputStream);
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                this.proxyStream.writeTo(outputStream);
                outputStream.flush();
            } catch (Throwable th) {
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            this.logger.report(LOG_TAG, "Error writing event to file cache", new FileCacheException(e));
        }
    }

    private void verifyOutputFormat(File file) {
        this.logger.d(LOG_TAG, "Existing file is not empty, check compression state");
        try {
            boolean zD = iu6.d(file);
            boolean z = this.compressContent;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            if (zD != z) {
                callAnalyticsLogger.d(LOG_TAG, "Existing file compression doesn't match expected compression state (" + this.compressContent + "), drop");
                try {
                    drop();
                } catch (IOException e) {
                    this.logger.e(LOG_TAG, "drop caused by compression conflict failed", e);
                }
            } else {
                callAnalyticsLogger.d(LOG_TAG, "Existing file compression state matches expected one (" + this.compressContent + ")");
            }
        } catch (Throwable th) {
            this.logger.e(LOG_TAG, "Can't check if file compressed or not, drop", th);
            try {
                drop();
            } catch (IOException e2) {
                this.logger.e(LOG_TAG, "drop caused by compression conflict check fault failed", e2);
            }
        }
    }

    private void write(boolean z, CallAnalyticsEvent callAnalyticsEvent, OutputStream outputStream) throws IOException {
        if (z) {
            outputStream.write(iu6.a);
        }
        h2d h2dVar = new h2d(new ckc(outputStream));
        try {
            EventSerializer.INSTANCE.serialize(h2dVar, callAnalyticsEvent);
            h2dVar.close();
        } catch (Throwable th) {
            try {
                h2dVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public int count() {
        return 0;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void drop() throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                iu6.b(file);
                this.logger.d(LOG_TAG, "drop " + file);
            } else {
                this.logger.d(LOG_TAG, "no drop " + file);
            }
        } finally {
            this.length = iu6.e(file);
            this.lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void grab(Provider<File> provider) throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (this.length == 0) {
                this.logger.d(LOG_TAG, "grab | input file is empty, cancel");
            } else if (file.exists()) {
                File file2 = provider.get();
                this.logger.d(LOG_TAG, "grab | " + file + " >> " + file2);
                if (iu6.e(file2) > MAX_FILE_LENGTH) {
                    iu6.b(file2);
                }
                long jE = iu6.e(file2);
                iu6.a(file2, file, this.compressContent);
                long jE2 = iu6.e(file2);
                this.logger.d(LOG_TAG, "grab | done, size changed: " + jE + " -> " + jE2);
            } else {
                this.logger.d(LOG_TAG, "grab | file " + file + " doesn't exist, cancel");
            }
        } finally {
            this.length = iu6.e(file);
            this.lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public long length() {
        long j = this.length;
        if (j >= 0) {
            return j;
        }
        File file = this.file.get();
        try {
            this.lock.lock();
            long jE = iu6.e(file);
            this.length = jE;
            if (jE > 0) {
                verifyOutputFormat(file);
            }
            return this.length;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.storage.CacheWriter
    public void writeToCache(CallAnalyticsEvent callAnalyticsEvent) {
        File file = this.file.get();
        if (length() > MAX_FILE_LENGTH) {
            this.logger.w(LOG_TAG, "append file too big, drop");
            try {
                drop();
            } catch (IOException e) {
                this.logger.e(LOG_TAG, "drop failed", e);
            }
        }
        try {
            try {
                this.lock.lock();
                iu6.g(file);
                boolean z = true;
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    if (iu6.e(file) <= 0) {
                        z = false;
                    }
                    atomicWrite(z, callAnalyticsEvent, fileOutputStream);
                    fileOutputStream.close();
                    this.logger.v(LOG_TAG, "append (c=" + this.compressContent + ") " + callAnalyticsEvent);
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                this.logger.e(LOG_TAG, "Error while writing to disk" + callAnalyticsEvent, e2);
                try {
                    iu6.b(file);
                } catch (IOException unused) {
                    this.logger.e(LOG_TAG, "Can not delete broken file " + file.getPath(), e2);
                }
            }
            this.length = iu6.e(file);
            this.lock.unlock();
        } catch (Throwable th3) {
            this.length = iu6.e(file);
            this.lock.unlock();
            throw th3;
        }
    }
}
