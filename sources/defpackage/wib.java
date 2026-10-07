package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wib[], still in use, count: 1, list:
  (r0v1 wib[]) from 0x0018: CONSTRUCTOR (r0v1 wib[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class wib {
    /* JADX INFO: Fake field, exist only in values array */
    ADD("ADD"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOVE("REMOVE");

    public static final /* synthetic */ ma6 c;
    public final String a;

    static {
        c = new ma6(wibVarArr);
    }

    public wib(String str) {
        super(str, i);
        this.a = str;
    }

    public static wib valueOf(String str) {
        return (wib) Enum.valueOf(wib.class, str);
    }

    public static wib[] values() {
        return (wib[]) b.clone();
    }
}
