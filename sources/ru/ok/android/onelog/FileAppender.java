package ru.ok.android.onelog;

import defpackage.ckc;
import defpackage.h2d;
import defpackage.mv8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
final class FileAppender implements OneLogAppender {
    private final Provider<File> file;
    private long length = -1;
    private final Lock lock;

    public FileAppender(Provider<File> provider, Lock lock) {
        this.file = provider;
        this.lock = lock;
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        File file = this.file.get();
        try {
            try {
                this.lock.lock();
                if (OneLogImpl.getInstance().getForceFallbackLogs()) {
                    throw new IOException("Testing log fallback");
                }
                Files.mkfile(file);
                FileLocks.Holder holderLock = FileLocks.lock(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                    try {
                        if (file.length() > 0) {
                            fileOutputStream.write(Files.SEPARATOR);
                        }
                        h2d h2dVar = new h2d(new ckc(fileOutputStream));
                        try {
                            OneLogItemSerializer.INSTANCE.serialize((mv8) h2dVar, oneLogItem);
                            h2dVar.flush();
                            fileOutputStream.getFD().sync();
                        } catch (SyncFailedException unused) {
                        } finally {
                            h2dVar.close();
                        }
                        fileOutputStream.close();
                        if (holderLock != null) {
                            holderLock.close();
                        }
                        this.length = file.length();
                        this.lock.unlock();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (holderLock != null) {
                        try {
                            holderLock.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Exception e) {
                file.delete();
                OneLogDiagnostics.reportAppendFailed(e, oneLogItem);
                OneLogImpl.getInstance().getErrorHandler().handleFailedItemStore(e, oneLogItem);
            }
        } catch (Throwable th5) {
            this.length = file.length();
            this.lock.unlock();
            throw th5;
        }
    }

    public void drop() throws IOException {
        File file = this.file.get();
        try {
            this.lock.lock();
            if (file.exists()) {
                FileLocks.Holder holderLock = FileLocks.lock(file);
                try {
                    Files.delete(file);
                    if (holderLock != null) {
                        holderLock.close();
                    }
                } catch (Throwable th) {
                    if (holderLock != null) {
                        try {
                            holderLock.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            this.length = file.length();
            this.lock.unlock();
        } catch (Throwable th3) {
            this.length = file.length();
            this.lock.unlock();
            throw th3;
        }
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
    }

    public void grab(File file) throws IOException {
        File file2 = this.file.get();
        try {
            this.lock.lock();
            if (file2.exists()) {
                FileLocks.Holder holderLock = FileLocks.lock(file2);
                try {
                    Files.cat(file, file2);
                    if (holderLock != null) {
                        holderLock.close();
                    }
                } catch (Throwable th) {
                    if (holderLock != null) {
                        try {
                            holderLock.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            this.length = file2.length();
            this.lock.unlock();
        } catch (Throwable th3) {
            this.length = file2.length();
            this.lock.unlock();
            throw th3;
        }
    }

    public long length() {
        long j = this.length;
        if (j >= 0) {
            return j;
        }
        File file = this.file.get();
        try {
            this.lock.lock();
            this.length = file.length();
            return this.length;
        } finally {
            this.lock.unlock();
        }
    }
}
