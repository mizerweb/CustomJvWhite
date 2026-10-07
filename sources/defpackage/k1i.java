package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 k1i[], still in use, count: 1, list:
  (r0v1 k1i[]) from 0x002c: CONSTRUCTOR (r0v1 k1i[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class k1i {
    /* JADX INFO: Fake field, exist only in values array */
    PROCESSING((byte) 0),
    SUCCESS((byte) 1),
    FAILED((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_NOT_READY((byte) 3);

    public static final /* synthetic */ ma6 e;
    public final byte a;

    static {
        e = new ma6(k1iVarArr);
    }

    public k1i(byte b) {
        super(str, i);
        this.a = b;
    }

    public static k1i valueOf(String str) {
        return (k1i) Enum.valueOf(k1i.class, str);
    }

    public static k1i[] values() {
        return (k1i[]) d.clone();
    }
}
