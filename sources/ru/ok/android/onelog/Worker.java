package ru.ok.android.onelog;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
final class Worker implements OneLogAppender {
    private static final long MAX_FILE_LENGTH = 10000000;
    private static final int MSG_APPEND = 0;
    private static final int MSG_FLUSH = 1;
    private static final int MSG_UPLOAD_MAX_TIMEOUT = 17;
    private static final int MSG_UPLOAD_SILENCE_TIMEOUT = 16;
    private static volatile Looper looper;
    private final FileAppender appender;
    private final String collector;
    private int count = 0;
    private volatile Handler handler;

    public Worker(Provider<File> provider, Lock lock, String str) {
        this.collector = str;
        this.appender = new FileAppender(provider, lock);
    }

    private void flush(ConditionVariable conditionVariable) {
        Message.obtain(obtainHandler(), 1, conditionVariable).sendToTarget();
        conditionVariable.block();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAppend(OneLogItem oneLogItem) {
        if (this.appender.length() > MAX_FILE_LENGTH) {
            drop();
        }
        this.appender.append(oneLogItem);
        this.count++;
        int defFileLengthToUpload = OneLogImpl.getInstance().getDefFileLengthToUpload();
        int defCountToUpload = OneLogImpl.getInstance().getDefCountToUpload();
        long j = defFileLengthToUpload;
        if (this.appender.length() >= j) {
            startUpload(OneLogTrigger.exceededFileLength(j));
        } else if (this.count >= defCountToUpload) {
            startUpload(OneLogTrigger.exceededCount(defCountToUpload));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFlush(ConditionVariable conditionVariable) {
        conditionVariable.open();
        long defFileLengthToUpload = OneLogImpl.getInstance().getDefFileLengthToUpload();
        if (this.appender.length() >= defFileLengthToUpload) {
            startUpload(OneLogTrigger.exceededFileLength(defFileLengthToUpload));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadMaxTimeout(long j) {
        if (this.count == 0) {
            return;
        }
        startUpload(OneLogTrigger.exceededMaxTime(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadSilenceTimeout() {
        if (this.count == 0) {
            return;
        }
        startUpload(OneLogTrigger.passedSilenceTime(OneLogImpl.getInstance().getDefSilenceMillisToUpload()));
    }

    private Handler obtainHandler() {
        if (this.handler == null) {
            synchronized (this) {
                try {
                    if (this.handler == null) {
                        this.handler = new Handler(obtainLooper(), new Callback(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.handler;
    }

    private static Looper obtainLooper() {
        if (looper == null) {
            synchronized (Worker.class) {
                try {
                    if (looper == null) {
                        HandlerThread handlerThread = new HandlerThread(UploadService.SCHEME);
                        handlerThread.start();
                        looper = handlerThread.getLooper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return looper;
    }

    private void startUpload(OneLogTrigger oneLogTrigger) {
        if (this.count == 0) {
            return;
        }
        this.count = 0;
        OneLogImpl.getInstance().startUpload(this.collector, oneLogTrigger);
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        Handler handlerObtainHandler = obtainHandler();
        handlerObtainHandler.sendMessage(Message.obtain(handlerObtainHandler, 0, oneLogItem));
        long defSilenceMillisToUpload = OneLogImpl.getInstance().getDefSilenceMillisToUpload();
        if (defSilenceMillisToUpload < BuildConfig.MAX_TIME_TO_UPLOAD) {
            handlerObtainHandler.removeMessages(16);
            handlerObtainHandler.sendEmptyMessageDelayed(16, defSilenceMillisToUpload);
        }
        long maxMillisToUpload = OneLogImpl.getInstance().getMaxMillisToUpload(oneLogItem.collector(), oneLogItem.operation());
        if (maxMillisToUpload < BuildConfig.MAX_TIME_TO_UPLOAD) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 17;
            messageObtain.arg1 = (int) Math.min(maxMillisToUpload, 2147483647L);
            handlerObtainHandler.sendMessageDelayed(messageObtain, maxMillisToUpload);
        }
    }

    public void drop() {
        try {
            this.appender.drop();
        } catch (IOException unused) {
        }
    }

    public void grab(File file) throws IOException {
        if (file.length() > MAX_FILE_LENGTH) {
            Files.delete(file);
        }
        this.appender.grab(file);
    }

    public class Callback implements Handler.Callback {
        private Callback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Worker.this.handleAppend((OneLogItem) message.obj);
                return true;
            }
            if (i == 1) {
                Worker.this.handleFlush((ConditionVariable) message.obj);
                return true;
            }
            if (i == 16) {
                Worker.this.handleUploadSilenceTimeout();
                return true;
            }
            if (i != 17) {
                return false;
            }
            Worker.this.handleUploadMaxTimeout(message.arg1);
            return true;
        }

        public /* synthetic */ Callback(Worker worker, int i) {
            this();
        }
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        flush(new ConditionVariable());
    }
}
