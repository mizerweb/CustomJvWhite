package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ug7 {
    public static final ug7 a;
    public static final ug7 b;
    public static final ug7 c;
    public static final /* synthetic */ ug7[] d;

    static {
        ug7 ug7Var = new ug7("UNKNOWN", 0);
        a = ug7Var;
        ug7 ug7Var2 = new ug7("DEFAULT", 1);
        b = ug7Var2;
        ug7 ug7Var3 = new ug7("YUV", 2);
        c = ug7Var3;
        d = new ug7[]{ug7Var, ug7Var2, ug7Var3};
    }

    public static ug7 valueOf(String str) {
        return (ug7) Enum.valueOf(ug7.class, str);
    }

    public static ug7[] values() {
        return (ug7[]) d.clone();
    }
}
