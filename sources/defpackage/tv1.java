package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tv1[], still in use, count: 1, list:
  (r0v1 tv1[]) from 0x0025: CONSTRUCTOR (r0v1 tv1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class tv1 {
    SOCKET(1),
    VENDOR_PUSH(2),
    /* JADX INFO: Fake field, exist only in values array */
    RUSTORE(3);

    public static final /* synthetic */ ma6 e;
    public final int a;

    static {
        e = new ma6(tv1VarArr);
    }

    public tv1(int i) {
        super(str, i);
        this.a = i;
    }

    public static tv1 valueOf(String str) {
        return (tv1) Enum.valueOf(tv1.class, str);
    }

    public static tv1[] values() {
        return (tv1[]) d.clone();
    }
}
