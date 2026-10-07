package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n18 {
    public static final n18 a;
    public static final n18 b;
    public static final n18 c;
    public static final /* synthetic */ n18[] d;

    static {
        n18 n18Var = new n18("ALREADY_DOWNLOADING_BY_OTHER", 0);
        a = n18Var;
        n18 n18Var2 = new n18("FINISH", 1);
        b = n18Var2;
        n18 n18Var3 = new n18("ERROR", 2);
        c = n18Var3;
        d = new n18[]{n18Var, n18Var2, n18Var3};
    }

    public static n18 valueOf(String str) {
        return (n18) Enum.valueOf(n18.class, str);
    }

    public static n18[] values() {
        return (n18[]) d.clone();
    }
}
