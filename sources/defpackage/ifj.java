package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ifj[], still in use, count: 1, list:
  (r0v1 ifj[]) from 0x006c: CONSTRUCTOR (r0v1 ifj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class ifj implements pkj {
    GET_INFO("WebAppBiometryGetInfo", "biometry_get_info", 18),
    REQUEST_ACCESS("WebAppBiometryRequestAccess", "biometry_request_access", 9),
    UPDATE_TOKEN("WebAppBiometryUpdateToken", "biometry_update_token", 10),
    REQUEST_AUTH("WebAppBiometryRequestAuth", "biometry_request_auth", 11),
    OPEN_SETTINGS("WebAppBiometryOpenSettings", "biometry_open_settings", 13);

    public static final /* synthetic */ ma6 j;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        j = new ma6(ifjVarArr);
    }

    public ifj(String str, String str2, Integer num) {
        super(str, i);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public static ifj valueOf(String str) {
        return (ifj) Enum.valueOf(ifj.class, str);
    }

    public static ifj[] values() {
        return (ifj[]) i.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.pkj
    public final String h() {
        return this.a;
    }

    @Override // defpackage.pkj
    public final String i() {
        return this.b;
    }
}
