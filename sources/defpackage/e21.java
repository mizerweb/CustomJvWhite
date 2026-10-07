package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e21 {
    public static final e21 a;
    public static final e21 b;
    public static final e21 c;
    public static final e21 d;
    public static final e21 e;
    public static final e21 f;
    public static final e21 g;
    public static final /* synthetic */ e21[] h;

    static {
        e21 e21Var = new e21("INPUT", 0);
        a = e21Var;
        e21 e21Var2 = new e21("SEARCH", 1);
        b = e21Var2;
        e21 e21Var3 = new e21("CHAT_STATUS", 2);
        c = e21Var3;
        e21 e21Var4 = new e21("MULTI_SELECT", 3);
        d = e21Var4;
        e21 e21Var5 = new e21("COMMENTS_DISABLED", 4);
        e = e21Var5;
        e21 e21Var6 = new e21("NONE", 5);
        f = e21Var6;
        e21 e21Var7 = new e21("PREVIEW", 6);
        g = e21Var7;
        h = new e21[]{e21Var, e21Var2, e21Var3, e21Var4, e21Var5, e21Var6, e21Var7};
    }

    public static e21 valueOf(String str) {
        return (e21) Enum.valueOf(e21.class, str);
    }

    public static e21[] values() {
        return (e21[]) h.clone();
    }
}
