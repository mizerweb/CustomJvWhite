package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n09 {
    public static final n09 a;
    public static final n09 b;
    public static final n09 c;
    public static final n09 d;
    public static final n09 e;
    public static final /* synthetic */ n09[] f;

    static {
        n09 n09Var = new n09("DESTROYED", 0);
        a = n09Var;
        n09 n09Var2 = new n09("INITIALIZED", 1);
        b = n09Var2;
        n09 n09Var3 = new n09("CREATED", 2);
        c = n09Var3;
        n09 n09Var4 = new n09("STARTED", 3);
        d = n09Var4;
        n09 n09Var5 = new n09("RESUMED", 4);
        e = n09Var5;
        f = new n09[]{n09Var, n09Var2, n09Var3, n09Var4, n09Var5};
    }

    public static n09 valueOf(String str) {
        return (n09) Enum.valueOf(n09.class, str);
    }

    public static n09[] values() {
        return (n09[]) f.clone();
    }

    public final boolean a(n09 n09Var) {
        return compareTo(n09Var) >= 0;
    }
}
