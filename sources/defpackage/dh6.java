package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dh6 {
    public static final dh6 a;
    public static final dh6 b;
    public static final dh6 c;
    public static final /* synthetic */ dh6[] d;

    static {
        dh6 dh6Var = new dh6("NONE", 0);
        a = dh6Var;
        dh6 dh6Var2 = new dh6("REMOTE", 1);
        b = dh6Var2;
        dh6 dh6Var3 = new dh6("LOCAL", 2);
        c = dh6Var3;
        d = new dh6[]{dh6Var, dh6Var2, dh6Var3};
    }

    public static dh6 valueOf(String str) {
        return (dh6) Enum.valueOf(dh6.class, str);
    }

    public static dh6[] values() {
        return (dh6[]) d.clone();
    }
}
