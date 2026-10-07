package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rn0 {
    public static final rn0 a;
    public static final rn0 b;
    public static final /* synthetic */ rn0[] c;

    static {
        rn0 rn0Var = new rn0("EXPONENTIAL", 0);
        a = rn0Var;
        rn0 rn0Var2 = new rn0("LINEAR", 1);
        b = rn0Var2;
        c = new rn0[]{rn0Var, rn0Var2};
    }

    public static rn0 valueOf(String str) {
        return (rn0) Enum.valueOf(rn0.class, str);
    }

    public static rn0[] values() {
        return (rn0[]) c.clone();
    }
}
