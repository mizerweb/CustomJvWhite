package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class at5 {
    public static final at5 a;
    public static final at5 b;
    public static final at5 c;
    public static final /* synthetic */ at5[] d;

    static {
        at5 at5Var = new at5("ALWAYS", 0);
        a = at5Var;
        at5 at5Var2 = new at5("AUTO", 1);
        b = at5Var2;
        at5 at5Var3 = new at5("NEVER", 2);
        c = at5Var3;
        d = new at5[]{at5Var, at5Var2, at5Var3};
    }

    public static at5 valueOf(String str) {
        return (at5) Enum.valueOf(at5.class, str);
    }

    public static at5[] values() {
        return (at5[]) d.clone();
    }
}
