package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t59 extends Enum {
    public static final t59 a;
    public static final t59 b;
    public static final t59 c;
    public static final t59 d;
    public static final t59 e;
    public static final t59 f;
    public static final /* synthetic */ t59[] g;
    public static final /* synthetic */ ma6 h;

    static {
        t59 t59Var = new t59("URL", 0);
        a = t59Var;
        t59 t59Var2 = new t59("HASH_TAG", 1);
        b = t59Var2;
        t59 t59Var3 = new t59("BOT_COMMAND", 2);
        c = t59Var3;
        t59 t59Var4 = new t59("PROFILE_TAG", 3);
        d = t59Var4;
        t59 t59Var5 = new t59("MENTION", 4);
        e = t59Var5;
        t59 t59Var6 = new t59("ML_ENTRY", 5);
        t59 t59Var7 = new t59("MARKDOWN_LINK", 6);
        f = t59Var7;
        t59[] t59VarArr = {t59Var, t59Var2, t59Var3, t59Var4, t59Var5, t59Var6, t59Var7};
        g = t59VarArr;
        h = new ma6(t59VarArr);
    }

    public static t59 valueOf(String str) {
        return (t59) Enum.valueOf(t59.class, str);
    }

    public static t59[] values() {
        return (t59[]) g.clone();
    }
}
