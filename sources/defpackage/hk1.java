package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hk1[], still in use, count: 1, list:
  (r0v1 hk1[]) from 0x001a: CONSTRUCTOR (r0v1 hk1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class hk1 {
    LINK(0),
    /* JADX INFO: Fake field, exist only in values array */
    CHAT(1);

    public static final /* synthetic */ ma6 d;
    public final int a;

    static {
        d = new ma6(hk1VarArr);
    }

    public hk1(int i) {
        super(str, i);
        this.a = i;
    }

    public static hk1 valueOf(String str) {
        return (hk1) Enum.valueOf(hk1.class, str);
    }

    public static hk1[] values() {
        return (hk1[]) c.clone();
    }
}
