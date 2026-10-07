package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d52 {
    public static final d52 a;
    public static final d52 b;
    public static final d52 c;
    public static final d52 d;
    public static final d52 e;
    public static final d52 f;
    public static final /* synthetic */ d52[] g;

    static {
        d52 d52Var = new d52("ACTIVE", 0);
        a = d52Var;
        d52 d52Var2 = new d52("CALLING", 1);
        b = d52Var2;
        d52 d52Var3 = new d52("NOT_CONTACT_CALLING", 2);
        c = d52Var3;
        d52 d52Var4 = new d52("NO_CONNECTION", 3);
        d = d52Var4;
        d52 d52Var5 = new d52("HOLD", 4);
        e = d52Var5;
        d52 d52Var6 = new d52("NONE", 5);
        f = d52Var6;
        g = new d52[]{d52Var, d52Var2, d52Var3, d52Var4, d52Var5, d52Var6};
    }

    public static d52 valueOf(String str) {
        return (d52) Enum.valueOf(d52.class, str);
    }

    public static d52[] values() {
        return (d52[]) g.clone();
    }
}
