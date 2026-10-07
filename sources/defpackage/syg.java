package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 syg[], still in use, count: 1, list:
  (r0v1 syg[]) from 0x001b: CONSTRUCTOR (r0v1 syg[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class syg {
    UNKNOWN((byte) -1),
    /* JADX INFO: Fake field, exist only in values array */
    LINK((byte) 0);

    public static final /* synthetic */ ma6 d;
    public final byte a;

    static {
        d = new ma6(sygVarArr);
    }

    public syg(byte b) {
        super(str, i);
        this.a = b;
    }

    public static syg valueOf(String str) {
        return (syg) Enum.valueOf(syg.class, str);
    }

    public static syg[] values() {
        return (syg[]) c.clone();
    }
}
