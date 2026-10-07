package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xg9 {
    public static final xg9 a;
    public static final xg9 b;
    public static final xg9 c;
    public static final /* synthetic */ xg9[] d;

    static {
        xg9 xg9Var = new xg9("IDLE", 0);
        a = xg9Var;
        xg9 xg9Var2 = new xg9("NOT_READY", 1);
        b = xg9Var2;
        xg9 xg9Var3 = new xg9("READY", 2);
        c = xg9Var3;
        d = new xg9[]{xg9Var, xg9Var2, xg9Var3};
    }

    public static xg9 valueOf(String str) {
        return (xg9) Enum.valueOf(xg9.class, str);
    }

    public static xg9[] values() {
        return (xg9[]) d.clone();
    }
}
