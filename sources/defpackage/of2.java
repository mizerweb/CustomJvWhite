package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class of2 {
    public static final of2 a;
    public static final of2 b;
    public static final of2 c;
    public static final of2 d;
    public static final of2 e;
    public static final of2 f;
    public static final of2 g;
    public static final /* synthetic */ of2[] h;

    static {
        of2 of2Var = new of2("RELEASED", 0);
        a = of2Var;
        of2 of2Var2 = new of2("RELEASING", 1);
        b = of2Var2;
        of2 of2Var3 = new of2("CLOSED", 2);
        c = of2Var3;
        of2 of2Var4 = new of2("PENDING_OPEN", 3);
        d = of2Var4;
        of2 of2Var5 = new of2("CLOSING", 4);
        e = of2Var5;
        of2 of2Var6 = new of2("OPENING", 5);
        f = of2Var6;
        of2 of2Var7 = new of2("OPEN", 6);
        g = of2Var7;
        h = new of2[]{of2Var, of2Var2, of2Var3, of2Var4, of2Var5, of2Var6, of2Var7, new of2("CONFIGURED", 7)};
    }

    public static of2 valueOf(String str) {
        return (of2) Enum.valueOf(of2.class, str);
    }

    public static of2[] values() {
        return (of2[]) h.clone();
    }
}
