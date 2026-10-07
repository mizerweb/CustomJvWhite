package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ei4 {
    public static final ei4 a;
    public static final ei4 b;
    public static final ei4 c;
    public static final ei4 d;
    public static final /* synthetic */ ei4[] e;

    static {
        ei4 ei4Var = new ei4("CUSTOM", 0);
        a = ei4Var;
        ei4 ei4Var2 = new ei4("DEVICE", 1);
        b = ei4Var2;
        ei4 ei4Var3 = new ei4("ONEME", 2);
        c = ei4Var3;
        ei4 ei4Var4 = new ei4("UNKNOWN", 3);
        d = ei4Var4;
        e = new ei4[]{ei4Var, ei4Var2, ei4Var3, ei4Var4};
    }

    public static ei4 valueOf(String str) {
        return (ei4) Enum.valueOf(ei4.class, str);
    }

    public static ei4[] values() {
        return (ei4[]) e.clone();
    }
}
