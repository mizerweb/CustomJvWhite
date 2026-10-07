package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xq4 {
    public static final xq4 a;
    public static final xq4 b;
    public static final /* synthetic */ xq4[] c;

    static {
        xq4 xq4Var = new xq4("RELEASE_DETACH", 0);
        a = xq4Var;
        xq4 xq4Var2 = new xq4("RETAIN_DETACH", 1);
        b = xq4Var2;
        c = new xq4[]{xq4Var, xq4Var2};
    }

    public static xq4 valueOf(String str) {
        return (xq4) Enum.valueOf(xq4.class, str);
    }

    public static xq4[] values() {
        return (xq4[]) c.clone();
    }
}
