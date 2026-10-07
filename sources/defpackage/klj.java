package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 klj[], still in use, count: 1, list:
  (r0v1 klj[]) from 0x0044: CONSTRUCTOR (r0v1 klj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class klj implements pkj {
    GET_INFO("WebAppNfcGetInfo", "nfc_get_info", 40),
    EMULATE_NFC_TAG("WebAppNfcEmulateNfcTag", "nfc_emulate_nfc_tag", 43),
    OPEN_SYSTEM_SETTINGS("WebAppNfcOpenSystemSettings", "nfc_open_system_settings", 42);

    public static final /* synthetic */ ma6 h;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        h = new ma6(kljVarArr);
    }

    public klj(String str, String str2, Integer num) {
        super(str, i);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public static klj valueOf(String str) {
        return (klj) Enum.valueOf(klj.class, str);
    }

    public static klj[] values() {
        return (klj[]) g.clone();
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
