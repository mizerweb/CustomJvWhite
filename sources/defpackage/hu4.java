package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hu4 {
    public static final hu4 a;
    public static final /* synthetic */ hu4[] b;

    static {
        hu4 hu4Var = new hu4("COROUTINE_SUSPENDED", 0);
        a = hu4Var;
        b = new hu4[]{hu4Var, new hu4("UNDECIDED", 1), new hu4("RESUMED", 2)};
    }

    public static hu4 valueOf(String str) {
        return (hu4) Enum.valueOf(hu4.class, str);
    }

    public static hu4[] values() {
        return (hu4[]) b.clone();
    }
}
