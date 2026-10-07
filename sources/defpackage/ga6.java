package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ga6 {
    public static final ga6 a;
    public static final ga6 b;
    public static final /* synthetic */ ga6[] c;

    static {
        ga6 ga6Var = new ga6("SUCCESS", 0);
        a = ga6Var;
        ga6 ga6Var2 = new ga6("FAILURE", 1);
        b = ga6Var2;
        c = new ga6[]{ga6Var, ga6Var2};
    }

    public static ga6 valueOf(String str) {
        return (ga6) Enum.valueOf(ga6.class, str);
    }

    public static ga6[] values() {
        return (ga6[]) c.clone();
    }
}
