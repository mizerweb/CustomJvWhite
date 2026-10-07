package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class th {
    public static final z2f a;

    static {
        try {
            xs7 xs7Var = sh.a;
            if (xs7Var == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = xs7Var;
        } catch (Throwable th) {
            throw gd6.b(th);
        }
    }

    public static z2f a() {
        z2f z2fVar = a;
        if (z2fVar != null) {
            return z2fVar;
        }
        ore.n("scheduler == null");
        return null;
    }
}
