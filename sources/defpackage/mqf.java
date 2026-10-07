package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mqf[], still in use, count: 1, list:
  (r0v1 mqf[]) from 0x001b: CONSTRUCTOR (r0v1 mqf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@mif(with = lqf.class)
public final class mqf {
    LEFT(1),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER(2);

    public static final lqf b = new lqf();
    public static final thd c = yab.c("Status", phd.g);
    public static final /* synthetic */ ma6 f;
    public final int a;

    static {
        f = new ma6(new mqf[]{r0, new mqf(2)});
    }

    public mqf(int i) {
        super(str, i);
        this.a = i;
    }

    public static mqf valueOf(String str) {
        return (mqf) Enum.valueOf(mqf.class, str);
    }

    public static mqf[] values() {
        return (mqf[]) e.clone();
    }
}
