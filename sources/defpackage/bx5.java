package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bx5 {
    public static final bx5 a;
    public static final bx5 b;
    public static final bx5 c;
    public static final bx5 d;
    public static final bx5 e;
    public static final bx5 f;
    public static final /* synthetic */ bx5[] g;

    static {
        bx5 bx5Var = new bx5("MEDIUM", 0);
        a = bx5Var;
        bx5 bx5Var2 = new bx5("LARGE", 1);
        b = bx5Var2;
        bx5 bx5Var3 = new bx5("XLARGE", 2);
        c = bx5Var3;
        bx5 bx5Var4 = new bx5("XXLARGE", 3);
        d = bx5Var4;
        bx5 bx5Var5 = new bx5("XXXLARGE", 4);
        e = bx5Var5;
        bx5 bx5Var6 = new bx5("XXXXLARGE", 5);
        f = bx5Var6;
        g = new bx5[]{bx5Var, bx5Var2, bx5Var3, bx5Var4, bx5Var5, bx5Var6};
    }

    public static bx5 valueOf(String str) {
        return (bx5) Enum.valueOf(bx5.class, str);
    }

    public static bx5[] values() {
        return (bx5[]) g.clone();
    }
}
