package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ni1 {
    public static final ni1 a;
    public static final ni1 b;
    public static final ni1 c;
    public static final /* synthetic */ ni1[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ni1 EF0;

    static {
        ni1 ni1Var = new ni1("FEASIBLE", 0);
        ni1 ni1Var2 = new ni1("CALLER_IS_BLOCKED", 1);
        ni1 ni1Var3 = new ni1("NOT_FRIENDS", 2);
        ni1 ni1Var4 = new ni1("CALLEE_IS_OFFLINE", 3);
        ni1 ni1Var5 = new ni1("UNKNOWN_ERROR", 4);
        a = ni1Var5;
        ni1 ni1Var6 = new ni1("UNSUPPORTED", 5);
        b = ni1Var6;
        ni1 ni1Var7 = new ni1("OLD_VERSION", 6);
        c = ni1Var7;
        d = new ni1[]{ni1Var, ni1Var2, ni1Var3, ni1Var4, ni1Var5, ni1Var6, ni1Var7};
    }

    public static ni1 valueOf(String str) {
        return (ni1) Enum.valueOf(ni1.class, str);
    }

    public static ni1[] values() {
        return (ni1[]) d.clone();
    }
}
