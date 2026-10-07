package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bq6 {
    public static final bq6 a;
    public static final bq6 b;
    public static final bq6 c;
    public static final /* synthetic */ bq6[] d;

    static {
        bq6 bq6Var = new bq6("PHOTO", 0);
        a = bq6Var;
        bq6 bq6Var2 = new bq6("VIDEO", 1);
        b = bq6Var2;
        bq6 bq6Var3 = new bq6("UNKNOWN", 2);
        c = bq6Var3;
        d = new bq6[]{bq6Var, bq6Var2, bq6Var3};
    }

    public static bq6 valueOf(String str) {
        return (bq6) Enum.valueOf(bq6.class, str);
    }

    public static bq6[] values() {
        return (bq6[]) d.clone();
    }
}
