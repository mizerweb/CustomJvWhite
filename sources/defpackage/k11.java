package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k11 {
    public static final k11 a;
    public static final k11 b;
    public static final k11 c;
    public static final /* synthetic */ k11[] d;

    static {
        k11 k11Var = new k11("TOOLS", 0);
        a = k11Var;
        k11 k11Var2 = new k11("WIDTH", 1);
        b = k11Var2;
        k11 k11Var3 = new k11("COLOR", 2);
        c = k11Var3;
        d = new k11[]{k11Var, k11Var2, k11Var3};
    }

    public static k11 valueOf(String str) {
        return (k11) Enum.valueOf(k11.class, str);
    }

    public static k11[] values() {
        return (k11[]) d.clone();
    }
}
