package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lmj implements pkj {
    public static final lmj a;
    public static final /* synthetic */ lmj[] b;
    public static final /* synthetic */ ma6 c;

    static {
        lmj lmjVar = new lmj("REQUEST_PHONE", 0);
        a = lmjVar;
        lmj[] lmjVarArr = {lmjVar};
        b = lmjVarArr;
        c = new ma6(lmjVarArr);
    }

    public static lmj valueOf(String str) {
        return (lmj) Enum.valueOf(lmj.class, str);
    }

    public static lmj[] values() {
        return (lmj[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return 55;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppRequestPhone";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "request_phone";
    }
}
