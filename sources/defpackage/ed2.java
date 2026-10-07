package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ed2 {
    public static final ed2 a;
    public static final ed2 b;
    public static final ed2 c;
    public static final ed2 d;
    public static final ed2 e;
    public static final /* synthetic */ ed2[] f;

    static {
        ed2 ed2Var = new ed2("UNKNOWN", 0);
        a = ed2Var;
        ed2 ed2Var2 = new ed2("INACTIVE", 1);
        b = ed2Var2;
        ed2 ed2Var3 = new ed2("METERING", 2);
        c = ed2Var3;
        ed2 ed2Var4 = new ed2("CONVERGED", 3);
        d = ed2Var4;
        ed2 ed2Var5 = new ed2("LOCKED", 4);
        e = ed2Var5;
        f = new ed2[]{ed2Var, ed2Var2, ed2Var3, ed2Var4, ed2Var5};
    }

    public static ed2 valueOf(String str) {
        return (ed2) Enum.valueOf(ed2.class, str);
    }

    public static ed2[] values() {
        return (ed2[]) f.clone();
    }
}
