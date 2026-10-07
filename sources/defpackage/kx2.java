package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kx2 {
    public static final kx2 a;
    public static final kx2 b;
    public static final kx2 c;
    public static final kx2 d;
    public static final kx2 e;
    public static final kx2 f;
    public static final kx2 g;
    public static final kx2 h;
    public static final /* synthetic */ kx2[] i;

    static {
        kx2 kx2Var = new kx2("ACTIVE", 0);
        a = kx2Var;
        kx2 kx2Var2 = new kx2("LEFT", 1);
        b = kx2Var2;
        kx2 kx2Var3 = new kx2("LEAVING", 2);
        c = kx2Var3;
        kx2 kx2Var4 = new kx2("REMOVED", 3);
        d = kx2Var4;
        kx2 kx2Var5 = new kx2("REMOVING", 4);
        e = kx2Var5;
        kx2 kx2Var6 = new kx2("CLOSED", 5);
        f = kx2Var6;
        kx2 kx2Var7 = new kx2("BLOCKED", 6);
        g = kx2Var7;
        kx2 kx2Var8 = new kx2("HIDDEN", 7);
        h = kx2Var8;
        i = new kx2[]{kx2Var, kx2Var2, kx2Var3, kx2Var4, kx2Var5, kx2Var6, kx2Var7, kx2Var8};
    }

    public static kx2 valueOf(String str) {
        return (kx2) Enum.valueOf(kx2.class, str);
    }

    public static kx2[] values() {
        return (kx2[]) i.clone();
    }
}
