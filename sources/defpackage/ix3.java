package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ix3 {
    public static final ix3 a;
    public static final ix3 b;
    public static final ix3 c;
    public static final /* synthetic */ ix3[] d;

    static {
        ix3 ix3Var = new ix3("LIGHT", 0);
        a = ix3Var;
        ix3 ix3Var2 = new ix3("DARK", 1);
        b = ix3Var2;
        ix3 ix3Var3 = new ix3("UNIVERSAL", 2);
        c = ix3Var3;
        d = new ix3[]{ix3Var, ix3Var2, ix3Var3};
    }

    public static ix3 valueOf(String str) {
        return (ix3) Enum.valueOf(ix3.class, str);
    }

    public static ix3[] values() {
        return (ix3[]) d.clone();
    }
}
