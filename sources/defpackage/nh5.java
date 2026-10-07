package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nh5[], still in use, count: 1, list:
  (r0v1 nh5[]) from 0x0067: CONSTRUCTOR (r0v1 nh5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class nh5 {
    /* JADX INFO: Fake field, exist only in values array */
    LDPI(new hj8(Integer.MIN_VALUE, 120, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    MDPI(new hj8(120, 160, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    HDPI(new hj8(160, 240, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    XHDPI(new hj8(240, 320, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    XXHDPI(new hj8(320, 480, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    XXXHDPI(new hj8(480, Integer.MAX_VALUE, 1));

    public static final xvc b = new xvc(17);
    public static final /* synthetic */ ma6 d = new ma6(new nh5[]{new nh5(new hj8(Integer.MIN_VALUE, 120, 1)), new nh5(new hj8(120, 160, 1)), new nh5(new hj8(160, 240, 1)), new nh5(new hj8(240, 320, 1)), new nh5(new hj8(320, 480, 1)), new nh5(new hj8(480, Integer.MAX_VALUE, 1))});
    public final hj8 a;

    static {
    }

    public nh5(hj8 hj8Var) {
        super(str, i);
        this.a = hj8Var;
    }

    public static nh5 valueOf(String str) {
        return (nh5) Enum.valueOf(nh5.class, str);
    }

    public static nh5[] values() {
        return (nh5[]) c.clone();
    }
}
