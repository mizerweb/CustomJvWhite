package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n02[], still in use, count: 1, list:
  (r0v1 n02[]) from 0x0031: CONSTRUCTOR (r0v1 n02[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class n02 {
    CALL(0),
    STOP(1),
    RESTART_FOREGROUND(3),
    RESTART_FOREGROUND_SCREENSHARING(5);

    public static final /* synthetic */ ma6 g;
    public final int a;

    static {
        g = new ma6(n02VarArr);
    }

    public n02(int i) {
        super(str, i);
        this.a = i;
    }

    public static n02 valueOf(String str) {
        return (n02) Enum.valueOf(n02.class, str);
    }

    public static n02[] values() {
        return (n02[]) f.clone();
    }
}
