package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rsi implements pkj {
    public static final rsi a;
    public static final /* synthetic */ rsi[] b;
    public static final /* synthetic */ ma6 c;

    static {
        rsi rsiVar = new rsi("VERIFY_MOBILE_ID", 0);
        a = rsiVar;
        rsi[] rsiVarArr = {rsiVar};
        b = rsiVarArr;
        c = new ma6(rsiVarArr);
    }

    public static rsi valueOf(String str) {
        return (rsi) Enum.valueOf(rsi.class, str);
    }

    public static rsi[] values() {
        return (rsi[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return null;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppVerifyMobileId";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "verify_mobile_id";
    }

    @Override // defpackage.pkj
    public final boolean k() {
        return true;
    }
}
