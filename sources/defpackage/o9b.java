package defpackage;

import android.text.Layout;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o9b {
    public static void a(e89 e89Var, kg7 kg7Var, Executor executor) {
        kg7Var.getClass();
        e89Var.b(new og7(e89Var, 0, kg7Var), executor);
    }

    public static Object b(Future future) {
        qyj.l("Future was expected to be done, " + future, future.isDone());
        return e(future);
    }

    public static final int c(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    public static final int d(Layout layout) {
        if (layout != null) {
            return (layout.getLineCount() <= 0 || layout.getEllipsisCount(0) != 0) ? layout.getEllipsizedWidth() : (int) layout.getLineMax(0);
        }
        return 0;
    }

    public static Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static g88 f(Object obj) {
        return obj == null ? g88.c : new g88(0, obj);
    }

    public static e89 g(e89 e89Var) {
        e89Var.getClass();
        return e89Var.isDone() ? e89Var : f55.m(new mg7(e89Var, 0));
    }

    public static void h(e89 e89Var, r72 r72Var) {
        i(true, e89Var, r72Var, zjl.a());
    }

    public static void i(boolean z, e89 e89Var, r72 r72Var, jm5 jm5Var) {
        e89Var.getClass();
        r72Var.getClass();
        jm5Var.getClass();
        a(e89Var, new ft0(r72Var), jm5Var);
        if (z) {
            r72Var.a(new pi(19, e89Var), zjl.a());
        }
    }

    public static bp2 j(e89 e89Var, u00 u00Var, Executor executor) {
        bp2 bp2Var = new bp2(u00Var, e89Var);
        e89Var.b(bp2Var, executor);
        return bp2Var;
    }
}
