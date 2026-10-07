package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fh6 {
    public static final fh6 a;
    public static final fh6 b;
    public static final fh6 c;
    public static final /* synthetic */ fh6[] d;

    static {
        fh6 fh6Var = new fh6("DISABLED", 0);
        a = fh6Var;
        fh6 fh6Var2 = new fh6("ONLY_SW_VP8", 1);
        b = fh6Var2;
        fh6 fh6Var3 = new fh6("ALL_SUPPORTED_CODEC", 2);
        c = fh6Var3;
        d = new fh6[]{fh6Var, fh6Var2, fh6Var3};
    }

    public static fh6 valueOf(String str) {
        return (fh6) Enum.valueOf(fh6.class, str);
    }

    public static fh6[] values() {
        return (fh6[]) d.clone();
    }

    public final boolean a() {
        return this == b || this == c;
    }
}
