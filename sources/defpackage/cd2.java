package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cd2 {
    public static final cd2 a;
    public static final cd2 b;
    public static final cd2 c;
    public static final cd2 d;
    public static final cd2 e;
    public static final cd2 f;
    public static final /* synthetic */ cd2[] g;

    static {
        cd2 cd2Var = new cd2("UNKNOWN", 0);
        a = cd2Var;
        cd2 cd2Var2 = new cd2("INACTIVE", 1);
        b = cd2Var2;
        cd2 cd2Var3 = new cd2("SEARCHING", 2);
        c = cd2Var3;
        cd2 cd2Var4 = new cd2("FLASH_REQUIRED", 3);
        d = cd2Var4;
        cd2 cd2Var5 = new cd2("CONVERGED", 4);
        e = cd2Var5;
        cd2 cd2Var6 = new cd2("LOCKED", 5);
        f = cd2Var6;
        g = new cd2[]{cd2Var, cd2Var2, cd2Var3, cd2Var4, cd2Var5, cd2Var6};
    }

    public static cd2 valueOf(String str) {
        return (cd2) Enum.valueOf(cd2.class, str);
    }

    public static cd2[] values() {
        return (cd2[]) g.clone();
    }
}
