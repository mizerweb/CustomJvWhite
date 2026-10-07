package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ma2 implements oa2 {
    public static final ma2 a;
    public static final /* synthetic */ ma2[] b;

    static {
        ma2 ma2Var = new ma2("CALL_BY_LINK", 0);
        a = ma2Var;
        b = new ma2[]{ma2Var};
    }

    public static ma2 valueOf(String str) {
        return (ma2) Enum.valueOf(ma2.class, str);
    }

    public static ma2[] values() {
        return (ma2[]) b.clone();
    }

    @Override // defpackage.oa2
    public final String a() {
        return "CALL_BY_LINK";
    }
}
