package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 dkj[], still in use, count: 1, list:
  (r0v1 dkj[]) from 0x0024: CONSTRUCTOR (r0v1 dkj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class dkj implements pkj {
    OPEN_LINK("WebAppOpenLink", "open_link"),
    OPEN_MAX_LINK("WebAppOpenMaxLink", "open_max_link");

    public static final /* synthetic */ ma6 f;
    public final String a;
    public final String b;

    static {
        f = new ma6(dkjVarArr);
    }

    public dkj(String str, String str2) {
        super(str, i);
        this.a = str;
        this.b = str2;
    }

    public static dkj valueOf(String str) {
        return (dkj) Enum.valueOf(dkj.class, str);
    }

    public static dkj[] values() {
        return (dkj[]) e.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return null;
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
