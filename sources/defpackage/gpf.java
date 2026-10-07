package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gpf[], still in use, count: 1, list:
  (r0v1 gpf[]) from 0x0037: CONSTRUCTOR (r0v1 gpf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gpf {
    FIRST_STEP(0.0f, 3),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND_STEP(1.0f, 10),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_STEP(2.0f, 100),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_STEP(3.0f, 2000);

    public static final /* synthetic */ ma6 e;
    public final float a;
    public final int b;

    static {
        e = new ma6(gpfVarArr);
    }

    public gpf(float f, int i) {
        super(str, i);
        this.a = f;
        this.b = i;
    }

    public static gpf valueOf(String str) {
        return (gpf) Enum.valueOf(gpf.class, str);
    }

    public static gpf[] values() {
        return (gpf[]) d.clone();
    }
}
