package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ve6 {
    public static final ve6 a;
    public static final ve6 b;
    public static final ve6 c;
    public static final ve6 d;
    public static final /* synthetic */ ve6[] e;

    static {
        ve6 ve6Var = new ve6("REPLACE", 0);
        a = ve6Var;
        ve6 ve6Var2 = new ve6("KEEP", 1);
        b = ve6Var2;
        ve6 ve6Var3 = new ve6("APPEND", 2);
        c = ve6Var3;
        ve6 ve6Var4 = new ve6("APPEND_OR_REPLACE", 3);
        d = ve6Var4;
        e = new ve6[]{ve6Var, ve6Var2, ve6Var3, ve6Var4};
    }

    public static ve6 valueOf(String str) {
        return (ve6) Enum.valueOf(ve6.class, str);
    }

    public static ve6[] values() {
        return (ve6[]) e.clone();
    }
}
