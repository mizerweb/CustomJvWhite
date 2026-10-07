package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jx4 {
    public static final jx4 a;
    public static final jx4 b;
    public static final /* synthetic */ jx4[] c;

    static {
        jx4 jx4Var = new jx4("CIRCLE", 0);
        a = jx4Var;
        jx4 jx4Var2 = new jx4("ROUNDED_RECT", 1);
        b = jx4Var2;
        c = new jx4[]{jx4Var, jx4Var2};
    }

    public static jx4 valueOf(String str) {
        return (jx4) Enum.valueOf(jx4.class, str);
    }

    public static jx4[] values() {
        return (jx4[]) c.clone();
    }
}
