package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ii4 {
    public static final ii4 a;
    public static final ii4 b;
    public static final /* synthetic */ ii4[] c;

    static {
        ii4 ii4Var = new ii4("BLOCKED", 0);
        a = ii4Var;
        ii4 ii4Var2 = new ii4("REMOVED", 1);
        b = ii4Var2;
        c = new ii4[]{ii4Var, ii4Var2};
    }

    public static ii4 valueOf(String str) {
        return (ii4) Enum.valueOf(ii4.class, str);
    }

    public static ii4[] values() {
        return (ii4[]) c.clone();
    }
}
