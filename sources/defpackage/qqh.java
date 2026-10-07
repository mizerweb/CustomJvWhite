package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qqh {
    public static final ThreadLocal a = new ThreadLocal();

    public static nc6 a() {
        ThreadLocal threadLocal = a;
        nc6 nc6Var = (nc6) threadLocal.get();
        if (nc6Var != null) {
            return nc6Var;
        }
        kz0 kz0Var = new kz0(Thread.currentThread());
        threadLocal.set(kz0Var);
        return kz0Var;
    }
}
