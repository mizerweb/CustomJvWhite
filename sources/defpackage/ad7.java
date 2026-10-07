package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ad7 {
    public static final ad7 a;
    public static final ad7 b;
    public static final ad7 c;
    public static final ad7 d;
    public static final /* synthetic */ ad7[] e;

    static {
        ad7 ad7Var = new ad7("STARTED", 0);
        a = ad7Var;
        ad7 ad7Var2 = new ad7("FRAME_INFO_COMPLETE", 1);
        b = ad7Var2;
        ad7 ad7Var3 = new ad7("STREAM_RESULTS_COMPLETE", 2);
        c = ad7Var3;
        ad7 ad7Var4 = new ad7("COMPLETE", 3);
        d = ad7Var4;
        e = new ad7[]{ad7Var, ad7Var2, ad7Var3, ad7Var4};
    }

    public static ad7 valueOf(String str) {
        return (ad7) Enum.valueOf(ad7.class, str);
    }

    public static ad7[] values() {
        return (ad7[]) e.clone();
    }
}
