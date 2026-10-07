package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xx1 {
    public static final xx1 a;
    public static final xx1 b;
    public static final /* synthetic */ xx1[] c;

    static {
        xx1 xx1Var = new xx1("LOW", 0);
        a = xx1Var;
        xx1 xx1Var2 = new xx1("MIDDLE", 1);
        b = xx1Var2;
        c = new xx1[]{xx1Var, xx1Var2, new xx1("HIGH", 2)};
    }

    public static xx1 valueOf(String str) {
        return (xx1) Enum.valueOf(xx1.class, str);
    }

    public static xx1[] values() {
        return (xx1[]) c.clone();
    }
}
