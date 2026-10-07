package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xn0 {
    public static final xn0 a;
    public static final xn0 b;
    public static final xn0 c;
    public static final xn0 d;
    public static final xn0 e;
    public static final /* synthetic */ xn0[] f;

    static {
        xn0 xn0Var = new xn0("REMOTE", 0);
        a = xn0Var;
        xn0 xn0Var2 = new xn0("LOCAL_RTT", 1);
        b = xn0Var2;
        xn0 xn0Var3 = new xn0("LOCAL_LOSS", 2);
        c = xn0Var3;
        xn0 xn0Var4 = new xn0("REMOTE_RTT", 3);
        d = xn0Var4;
        xn0 xn0Var5 = new xn0("REMOTE_LOSS", 4);
        e = xn0Var5;
        f = new xn0[]{xn0Var, xn0Var2, xn0Var3, xn0Var4, xn0Var5};
    }

    public static xn0 valueOf(String str) {
        return (xn0) Enum.valueOf(xn0.class, str);
    }

    public static xn0[] values() {
        return (xn0[]) f.clone();
    }
}
