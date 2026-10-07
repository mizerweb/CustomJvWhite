package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tsd[], still in use, count: 1, list:
  (r0v1 tsd[]) from 0x002d: CONSTRUCTOR (r0v1 tsd[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tsd {
    /* JADX INFO: Fake field, exist only in values array */
    ESIA_CONNECTION(1),
    SECOND_FACTOR_PASSWORD_ENABLED(2),
    SECOND_FACTOR_HAS_EMAIL(3),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND_FACTOR_HAS_HINT(4);

    public static final /* synthetic */ ma6 e;
    public final int a;

    static {
        e = new ma6(tsdVarArr);
    }

    public tsd(int i) {
        super(str, i);
        this.a = i;
    }

    public static tsd valueOf(String str) {
        return (tsd) Enum.valueOf(tsd.class, str);
    }

    public static tsd[] values() {
        return (tsd[]) d.clone();
    }
}
