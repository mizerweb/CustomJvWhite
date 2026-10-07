package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kl4 {
    public static final kl4 a;
    public static final kl4 b;
    public static final kl4 c;
    public static final /* synthetic */ kl4[] d;

    static {
        kl4 kl4Var = new kl4("CUSTOM", 0);
        a = kl4Var;
        kl4 kl4Var2 = new kl4("DEVICE", 1);
        kl4 kl4Var3 = new kl4("ONEME", 2);
        b = kl4Var3;
        kl4 kl4Var4 = new kl4("UNKNOWN", 3);
        c = kl4Var4;
        d = new kl4[]{kl4Var, kl4Var2, kl4Var3, kl4Var4};
    }

    public static kl4 valueOf(String str) {
        return (kl4) Enum.valueOf(kl4.class, str);
    }

    public static kl4[] values() {
        return (kl4[]) d.clone();
    }
}
