package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 v2d[], still in use, count: 1, list:
  (r0v1 v2d[]) from 0x002c: CONSTRUCTOR (r0v1 v2d[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class v2d {
    b("X1"),
    c("X1_5"),
    d("X2");

    public static final /* synthetic */ ma6 f;
    public final float a;

    static {
        f = new ma6(v2dVarArr);
    }

    public v2d(String str) {
        super(str, i);
        this.a = f;
    }

    public static v2d valueOf(String str) {
        return (v2d) Enum.valueOf(v2d.class, str);
    }

    public static v2d[] values() {
        return (v2d[]) e.clone();
    }
}
