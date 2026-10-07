package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 uvj[], still in use, count: 1, list:
  (r0v1 uvj[]) from 0x004a: CONSTRUCTOR (r0v1 uvj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class uvj {
    UNKNOWN((short) 0),
    /* JADX INFO: Fake field, exist only in values array */
    ADAPTIVE_ICON((short) 1),
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE((short) 2),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_BIG((short) 3),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_STANDARD((short) 4),
    /* JADX INFO: Fake field, exist only in values array */
    DESCRIPTION((short) 5),
    /* JADX INFO: Fake field, exist only in values array */
    FILE((short) 6),
    /* JADX INFO: Fake field, exist only in values array */
    KEYBOARD((short) 7);

    public static final /* synthetic */ ma6 d;
    public final short a;

    static {
        d = new ma6(uvjVarArr);
    }

    public uvj(short s) {
        super(str, i);
        this.a = s;
    }

    public static uvj valueOf(String str) {
        return (uvj) Enum.valueOf(uvj.class, str);
    }

    public static uvj[] values() {
        return (uvj[]) c.clone();
    }
}
