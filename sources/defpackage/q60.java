package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q60 {
    public static final q60 a;
    public static final q60 b;
    public static final q60 c;
    public static final /* synthetic */ q60[] d;

    static {
        q60 q60Var = new q60("DEFAULT", 0);
        a = q60Var;
        q60 q60Var2 = new q60("PROCESSING", 1);
        b = q60Var2;
        q60 q60Var3 = new q60("PROCESSED", 2);
        c = q60Var3;
        d = new q60[]{q60Var, q60Var2, q60Var3};
    }

    public static q60 valueOf(String str) {
        return (q60) Enum.valueOf(q60.class, str);
    }

    public static q60[] values() {
        return (q60[]) d.clone();
    }
}
