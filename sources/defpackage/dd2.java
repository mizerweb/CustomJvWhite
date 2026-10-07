package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dd2 {
    public static final dd2 a;
    public static final dd2 b;
    public static final dd2 c;
    public static final dd2 d;
    public static final dd2 e;
    public static final dd2 f;
    public static final dd2 g;
    public static final /* synthetic */ dd2[] h;

    static {
        dd2 dd2Var = new dd2("UNKNOWN", 0);
        a = dd2Var;
        dd2 dd2Var2 = new dd2("INACTIVE", 1);
        b = dd2Var2;
        dd2 dd2Var3 = new dd2("SCANNING", 2);
        c = dd2Var3;
        dd2 dd2Var4 = new dd2("PASSIVE_FOCUSED", 3);
        d = dd2Var4;
        dd2 dd2Var5 = new dd2("PASSIVE_NOT_FOCUSED", 4);
        e = dd2Var5;
        dd2 dd2Var6 = new dd2("LOCKED_FOCUSED", 5);
        f = dd2Var6;
        dd2 dd2Var7 = new dd2("LOCKED_NOT_FOCUSED", 6);
        g = dd2Var7;
        h = new dd2[]{dd2Var, dd2Var2, dd2Var3, dd2Var4, dd2Var5, dd2Var6, dd2Var7};
    }

    public static dd2 valueOf(String str) {
        return (dd2) Enum.valueOf(dd2.class, str);
    }

    public static dd2[] values() {
        return (dd2[]) h.clone();
    }
}
