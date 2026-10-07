package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sl2 {
    public static final sl2 a;
    public static final sl2 b;
    public static final sl2 c;
    public static final /* synthetic */ sl2[] d;

    static {
        sl2 sl2Var = new sl2("PRE_CAPTURE", 0);
        a = sl2Var;
        sl2 sl2Var2 = new sl2("MAIN_CAPTURE", 1);
        b = sl2Var2;
        sl2 sl2Var3 = new sl2("POST_CAPTURE", 2);
        c = sl2Var3;
        d = new sl2[]{sl2Var, sl2Var2, sl2Var3};
    }

    public static sl2 valueOf(String str) {
        return (sl2) Enum.valueOf(sl2.class, str);
    }

    public static sl2[] values() {
        return (sl2[]) d.clone();
    }
}
