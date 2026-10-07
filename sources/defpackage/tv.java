package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class tv extends cqk {
    public static volatile tv l;
    public static final sv m = new sv(0);
    public final he5 k = new he5();

    public static tv S() {
        if (l != null) {
            return l;
        }
        synchronized (tv.class) {
            try {
                if (l == null) {
                    l = new tv();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l;
    }

    public final void T(Runnable runnable) {
        he5 he5Var = this.k;
        if (he5Var.m == null) {
            synchronized (he5Var.k) {
                try {
                    if (he5Var.m == null) {
                        he5Var.m = he5.S(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        he5Var.m.post(runnable);
    }
}
