package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xw2 {
    public static final xw2 a;
    public static final xw2 b;
    public static final xw2 c;
    public static final /* synthetic */ xw2[] d;

    static {
        xw2 xw2Var = new xw2("SOUND", 0);
        a = xw2Var;
        xw2 xw2Var2 = new xw2("VIBRATION", 1);
        b = xw2Var2;
        xw2 xw2Var3 = new xw2("LED", 2);
        c = xw2Var3;
        d = new xw2[]{xw2Var, xw2Var2, xw2Var3};
    }

    public static xw2 valueOf(String str) {
        return (xw2) Enum.valueOf(xw2.class, str);
    }

    public static xw2[] values() {
        return (xw2[]) d.clone();
    }
}
