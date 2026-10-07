package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 d5g[], still in use, count: 1, list:
  (r0v16 d5g[]) from 0x009a: CONSTRUCTOR (r0v16 d5g[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d5g {
    /* JADX INFO: Fake field, exist only in values array */
    CANCELED("CANCELED"),
    /* JADX INFO: Fake field, exist only in values array */
    REJECTED("REJECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    HUNGUP("HUNGUP"),
    /* JADX INFO: Fake field, exist only in values array */
    MISSED("MISSED"),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT("TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    BUSY("BUSY"),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED("FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOVED("REMOVED"),
    /* JADX INFO: Fake field, exist only in values array */
    BANNED("BANNED"),
    /* JADX INFO: Fake field, exist only in values array */
    ANOTHER_DEVICE("ANOTHER_DEVICE"),
    /* JADX INFO: Fake field, exist only in values array */
    KILLED("KILLED"),
    /* JADX INFO: Fake field, exist only in values array */
    KILLED_WITHOUT_DELETE("KILLED_WITHOUT_DELETE"),
    /* JADX INFO: Fake field, exist only in values array */
    CALL_TIMEOUT("CALL_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    SOCKET_CLOSED("SOCKET_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALLY_CLOSED("INITIALLY_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    OBSOLETE_CLIENT("OBSOLETE_CLIENT");

    public static final /* synthetic */ ma6 c;
    public final String a;

    static {
        c = new ma6(d5gVarArr);
    }

    public d5g(String str) {
        super(str, i);
        this.a = str;
    }

    public static final d5g a(String str) {
        Object next;
        y1 y1Var = new y1(0, c);
        while (y1Var.hasNext()) {
            next = y1Var.next();
            if (((d5g) next).a.equals(str)) {
                return (d5g) next;
            }
        }
        next = null;
        return (d5g) next;
    }

    public static d5g valueOf(String str) {
        return (d5g) Enum.valueOf(d5g.class, str);
    }

    public static d5g[] values() {
        return (d5g[]) b.clone();
    }
}
