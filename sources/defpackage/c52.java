package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c52 {
    public static final c52 a;
    public static final c52 b;
    public static final /* synthetic */ c52[] c;

    static {
        c52 c52Var = new c52("NEGATIVE_POSITIVE", 0);
        a = c52Var;
        c52 c52Var2 = new c52("NEUTRAL_POSITIVE", 1);
        b = c52Var2;
        c = new c52[]{c52Var, c52Var2};
    }

    public static c52 valueOf(String str) {
        return (c52) Enum.valueOf(c52.class, str);
    }

    public static c52[] values() {
        return (c52[]) c.clone();
    }
}
