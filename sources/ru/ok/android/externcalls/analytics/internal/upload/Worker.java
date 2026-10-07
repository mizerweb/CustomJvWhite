package ru.ok.android.externcalls.analytics.internal.upload;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.nbh;
import defpackage.qt4;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.storage.CacheWriter;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.analytics.internal.storage.DbCacheWriter;
import ru.ok.android.externcalls.analytics.internal.storage.FileCacheWriter;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class Worker {
    private static final String LOG_TAG = "CallAnalyticsWorker";
    private static final int MSG_APPEND = 0;
    private static final int MSG_FLUSH = 1;
    private static final int MSG_UPLOAD_MAX_TIMEOUT = 3;
    private static final int MSG_UPLOAD_SILENCE_TIMEOUT = 2;
    private static volatile Looper looper;
    private final EventChannel channel;
    private final CacheWriter fileCacheWriter;
    private final Handler handler;
    private final CallAnalyticsLogger logger;
    private volatile long millisToUploadAny = BuildConfig.MAX_TIME_TO_UPLOAD;
    private final ConcurrentHashMap<String, Long> millisToUpload = new ConcurrentHashMap<>();

    public Worker(Context context, Provider<Looper> provider, Provider<File> provider2, Lock lock, EventChannel eventChannel, DatabaseHelper databaseHelper, boolean z) {
        this.channel = eventChannel;
        this.fileCacheWriter = databaseHelper != null ? new DbCacheWriter(databaseHelper, lock) : new FileCacheWriter(provider2, z, lock);
        this.handler = new Handler(provider.get(), new Callback(this, 0));
        this.logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    }

    private void flush(ConditionVariable conditionVariable) {
        Message.obtain(this.handler, 1, conditionVariable).sendToTarget();
        conditionVariable.block();
    }

    private long getMaxTimeToUpload(String str) {
        Long l = this.millisToUpload.get(str);
        if (l == null || l.longValue() >= BuildConfig.MAX_TIME_TO_UPLOAD) {
            return this.millisToUploadAny < BuildConfig.MAX_TIME_TO_UPLOAD ? this.millisToUploadAny : CallAnalyticsConfigStorage.INSTANCE.getUpload().getMaxTimeToUploadMillis();
        }
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAppend(CallAnalyticsEvent callAnalyticsEvent) {
        this.fileCacheWriter.writeToCache(callAnalyticsEvent);
        UploadConfig upload = CallAnalyticsConfigStorage.INSTANCE.getUpload();
        int fileLengthTriggerToUploadBytes = upload.getFileLengthTriggerToUploadBytes();
        long length = this.fileCacheWriter.length();
        if (length < fileLengthTriggerToUploadBytes) {
            int eventCountToUploadNumber = upload.getEventCountToUploadNumber();
            int iCount = this.fileCacheWriter.count();
            if (iCount >= eventCountToUploadNumber) {
                this.logger.d(LOG_TAG, qt4.l("trigger | record count (", iCount, eventCountToUploadNumber, ") exceeded "));
                startUpload("record count");
                return;
            }
            return;
        }
        this.logger.d(LOG_TAG, "trigger | log file size (" + (length / 1000) + "Kb) exceeded " + (fileLengthTriggerToUploadBytes / 1000) + "Kb");
        startUpload("file size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFlush(ConditionVariable conditionVariable) {
        conditionVariable.open();
        this.logger.d(LOG_TAG, "trigger flush");
        startUpload("flush");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadMaxTimeout() {
        this.logger.d(LOG_TAG, "trigger | max time since log item passed");
        startUpload("timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadSilenceTimeout() {
        this.logger.d(LOG_TAG, nbh.s(CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis(), "trigger | time since last log item exceeded ", "ms"));
        startUpload("silence timeout");
    }

    private void startUpload(String str) {
        CallAnalyticsLogger callAnalyticsLogger = this.logger;
        StringBuilder sbV = qt4.v("upload requested. reason=", str, ", channel=");
        sbV.append(this.channel.getKey());
        callAnalyticsLogger.d(LOG_TAG, sbV.toString());
        UploadStarter.INSTANCE.startUpload(this.channel);
    }

    public void clearMaxMillisToUpload() {
        this.millisToUploadAny = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.millisToUpload.clear();
    }

    public void drop() {
        try {
            this.fileCacheWriter.drop();
        } catch (IOException e) {
            this.logger.e(LOG_TAG, "drop failed", e);
        }
    }

    public void grab(Provider<File> provider) throws IOException {
        if (provider == null) {
            return;
        }
        this.fileCacheWriter.grab(provider);
    }

    public void scheduleEventSend(CallAnalyticsEvent callAnalyticsEvent) {
        Handler handler = this.handler;
        handler.sendMessage(Message.obtain(handler, 0, callAnalyticsEvent));
        long silenceToUploadMillis = CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis();
        if (silenceToUploadMillis < BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, silenceToUploadMillis);
        }
    }

    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        long silenceToUploadMillis = CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis();
        if (silenceToUploadMillis < BuildConfig.MAX_TIME_TO_UPLOAD && idleStateProvider != null && idleStateProvider.isIdle() && !this.handler.hasMessages(2)) {
            this.handler.sendEmptyMessageDelayed(2, silenceToUploadMillis);
            this.logger.d(LOG_TAG, "Schedule upload by timeout by leaving idle state");
        }
    }

    public void setMaxMillisToUpload(String str, long j) {
        ConcurrentHashMap<String, Long> concurrentHashMap = this.millisToUpload;
        if (j < BuildConfig.MAX_TIME_TO_UPLOAD) {
            concurrentHashMap.put(str, Long.valueOf(j));
        } else {
            concurrentHashMap.remove(str);
        }
    }

    public void setMaxMillisToUploadAny(long j) {
        this.millisToUploadAny = j;
    }

    public class Callback implements Handler.Callback {
        private Callback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Worker.this.handleAppend((CallAnalyticsEvent) message.obj);
                return true;
            }
            if (i == 1) {
                Worker.this.handleFlush((ConditionVariable) message.obj);
                return true;
            }
            if (i == 2) {
                Worker.this.handleUploadSilenceTimeout();
                return true;
            }
            if (i != 3) {
                return false;
            }
            Worker.this.handleUploadMaxTimeout();
            return true;
        }

        public /* synthetic */ Callback(Worker worker, int i) {
            this();
        }
    }

    public void flush() {
        flush(new ConditionVariable());
    }
}
