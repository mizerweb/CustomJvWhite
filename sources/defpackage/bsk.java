package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bsk {
    public static final int a(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static boolean b(IllegalStateException illegalStateException) {
        return f0a.u(illegalStateException);
    }
}
