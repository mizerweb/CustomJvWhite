package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pa5 {
    public static final jg5 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        jg5 jg5Var;
        int i = agh.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            ao5 ao5Var = ao5.a;
            lk9 lk9Var = rk9.a;
            jg5Var = ((lk9Var.S0() instanceof c0b) || !(lk9Var instanceof jg5)) ? oa5.l : (jg5) lk9Var;
        } else {
            jg5Var = oa5.l;
        }
        a = jg5Var;
    }
}
