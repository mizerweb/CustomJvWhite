package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {
    public static final us0 a;
    public static final us0 b;
    public static final us0 c;
    public static final us0 d;
    public static final us0 e;
    public static final /* synthetic */ us0[] f;
    public static final /* synthetic */ ma6 g;

    static {
        us0 us0Var = new us0("SMALLEST", 0);
        a = us0Var;
        us0 us0Var2 = new us0("SMALL", 1);
        b = us0Var2;
        us0 us0Var3 = new us0("MEDIUM", 2);
        c = us0Var3;
        us0 us0Var4 = new us0("BIG", 3);
        d = us0Var4;
        us0 us0Var5 = new us0("MAX", 4);
        e = us0Var5;
        us0[] us0VarArr = {us0Var, us0Var2, us0Var3, us0Var4, us0Var5};
        f = us0VarArr;
        g = new ma6(us0VarArr);
    }

    public static us0 valueOf(String str) {
        return (us0) Enum.valueOf(us0.class, str);
    }

    public static us0[] values() {
        return (us0[]) f.clone();
    }
}
