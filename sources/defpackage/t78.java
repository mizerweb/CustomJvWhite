package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t78 {
    public static final t78 a;
    public static final t78 b;
    public static final /* synthetic */ t78[] c;

    static {
        t78 t78Var = new t78("SMALL", 0);
        a = t78Var;
        t78 t78Var2 = new t78("DEFAULT", 1);
        b = t78Var2;
        c = new t78[]{t78Var, t78Var2, new t78("DYNAMIC", 2)};
    }

    public static t78 valueOf(String str) {
        return (t78) Enum.valueOf(t78.class, str);
    }

    public static t78[] values() {
        return (t78[]) c.clone();
    }
}
