package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends Handler {
    public static final fh a = new fh();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = eh.a;
        String loggerName = logRecord.getLoggerName();
        int iA = bsk.a(logRecord);
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strU1 = (String) eh.b.get(loggerName);
        if (strU1 == null) {
            strU1 = r5h.u1(23, loggerName);
        }
        if (Log.isLoggable(strU1, iA)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int iU0 = r5h.U0(message, '\n', i, 4);
                if (iU0 == -1) {
                    iU0 = length;
                }
                while (true) {
                    iMin = Math.min(iU0, i + y5g.CLOSE_SOCKET_CODE_TIMEOUT);
                    Log.println(iA, strU1, message.substring(i, iMin));
                    if (iMin >= iU0) {
                        break;
                    } else {
                        i = iMin;
                    }
                }
                i = iMin + 1;
            }
        }
    }
}
