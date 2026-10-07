package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gn1 {
    public static final gn1 a;
    public static final gn1 b;
    public static final gn1 c;
    public static final gn1 d;
    public static final gn1 e;
    public static final /* synthetic */ gn1[] f;

    static {
        gn1 gn1Var = new gn1("CALLING", 0);
        a = gn1Var;
        gn1 gn1Var2 = new gn1("NOT_CONTACT_CALLING", 1);
        b = gn1Var2;
        gn1 gn1Var3 = new gn1("ACTIVE", 2);
        c = gn1Var3;
        gn1 gn1Var4 = new gn1("NO_CONNECTION", 3);
        d = gn1Var4;
        gn1 gn1Var5 = new gn1("HOLD", 4);
        e = gn1Var5;
        f = new gn1[]{gn1Var, gn1Var2, gn1Var3, gn1Var4, gn1Var5};
    }

    public static gn1 valueOf(String str) {
        return (gn1) Enum.valueOf(gn1.class, str);
    }

    public static gn1[] values() {
        return (gn1[]) f.clone();
    }
}
