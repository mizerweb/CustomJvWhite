package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bv1 {
    public static final bv1 a;
    public static final bv1 b;
    public static final bv1 c;
    public static final /* synthetic */ bv1[] d;

    static {
        bv1 bv1Var = new bv1("NONE", 0);
        a = bv1Var;
        bv1 bv1Var2 = new bv1("LOCAL", 1);
        b = bv1Var2;
        bv1 bv1Var3 = new bv1("APPLICATION", 2);
        c = bv1Var3;
        d = new bv1[]{bv1Var, bv1Var2, bv1Var3};
    }

    public static bv1 valueOf(String str) {
        return (bv1) Enum.valueOf(bv1.class, str);
    }

    public static bv1[] values() {
        return (bv1[]) d.clone();
    }
}
