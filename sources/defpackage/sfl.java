package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sfl {
    public static void a(o1 o1Var, long j) {
        LockSupport.parkNanos(o1Var, Math.min(j, 2147483647999999999L));
    }

    public static final int b(int i, boolean z) {
        return z ? i | 1 : i & (-2);
    }

    public static final int c(int i, boolean z) {
        return z ? i | 2 : i & (-3);
    }
}
