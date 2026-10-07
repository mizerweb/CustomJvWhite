package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ub4 {
    public static final ub4 a;
    public static final ub4 b;
    public static final ub4 c;
    public static final /* synthetic */ ub4[] d;

    static {
        ub4 ub4Var = new ub4("DEFAULT", 0);
        a = ub4Var;
        ub4 ub4Var2 = new ub4("SUCCESS", 1);
        b = ub4Var2;
        ub4 ub4Var3 = new ub4("ERROR", 2);
        c = ub4Var3;
        d = new ub4[]{ub4Var, ub4Var2, ub4Var3};
    }

    public static ub4 valueOf(String str) {
        return (ub4) Enum.valueOf(ub4.class, str);
    }

    public static ub4[] values() {
        return (ub4[]) d.clone();
    }
}
