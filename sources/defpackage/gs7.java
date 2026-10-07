package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gs7 {
    public static final gs7 a;
    public static final gs7 b;
    public static final gs7 c;
    public static final gs7 d;
    public static final /* synthetic */ gs7[] e;

    static {
        gs7 gs7Var = new gs7("DIAL", 0);
        a = gs7Var;
        gs7 gs7Var2 = new gs7("NOT_CONTACT_DIAL", 1);
        b = gs7Var2;
        gs7 gs7Var3 = new gs7("ACTIVE", 2);
        c = gs7Var3;
        gs7 gs7Var4 = new gs7("RECONNECTION", 3);
        d = gs7Var4;
        e = new gs7[]{gs7Var, gs7Var2, gs7Var3, gs7Var4};
    }

    public static gs7 valueOf(String str) {
        return (gs7) Enum.valueOf(gs7.class, str);
    }

    public static gs7[] values() {
        return (gs7[]) e.clone();
    }
}
