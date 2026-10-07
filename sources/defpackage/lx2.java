package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lx2 {
    public static final lx2 a;
    public static final lx2 b;
    public static final lx2 c;
    public static final lx2 d;
    public static final lx2 e;
    public static final /* synthetic */ lx2[] f;

    static {
        lx2 lx2Var = new lx2("DIALOG", 0);
        a = lx2Var;
        lx2 lx2Var2 = new lx2("CHAT", 1);
        b = lx2Var2;
        lx2 lx2Var3 = new lx2("CHANNEL", 2);
        c = lx2Var3;
        lx2 lx2Var4 = new lx2("GROUP_CHAT", 3);
        d = lx2Var4;
        lx2 lx2Var5 = new lx2("COMMENTS", 4);
        e = lx2Var5;
        f = new lx2[]{lx2Var, lx2Var2, lx2Var3, lx2Var4, lx2Var5};
    }

    public static lx2 valueOf(String str) {
        return (lx2) Enum.valueOf(lx2.class, str);
    }

    public static lx2[] values() {
        return (lx2[]) f.clone();
    }
}
