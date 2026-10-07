package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0m {
    public static byte a(long j) {
        lvb.N(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static final void b(Handler handler, Runnable runnable) {
        if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static int c(byte b) {
        return b & 255;
    }
}
