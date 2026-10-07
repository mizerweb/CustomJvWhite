package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 su[], still in use, count: 1, list:
  (r0v1 su[]) from 0x0027: CONSTRUCTOR (r0v1 su[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class su {
    SYSTEM(1),
    LIGHT(2),
    DARK(3);

    public static final /* synthetic */ ma6 f;
    public final int a;

    static {
        f = new ma6(suVarArr);
    }

    public su(int i) {
        super(str, i);
        this.a = i;
    }

    public static su valueOf(String str) {
        return (su) Enum.valueOf(su.class, str);
    }

    public static su[] values() {
        return (su[]) e.clone();
    }
}
