package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cae[], still in use, count: 1, list:
  (r0v1 cae[]) from 0x0026: CONSTRUCTOR (r0v1 cae[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cae {
    UNKNOWN("UNKNOWN"),
    EMOJI("EMOJI"),
    ANIMOJI("ANIMOJI");

    public static final /* synthetic */ ma6 f;
    public final String a;

    static {
        f = new ma6(caeVarArr);
    }

    public cae(String str) {
        super(str, i);
        this.a = str;
    }

    public static cae valueOf(String str) {
        return (cae) Enum.valueOf(cae.class, str);
    }

    public static cae[] values() {
        return (cae[]) e.clone();
    }
}
