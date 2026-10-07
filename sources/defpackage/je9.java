package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 je9[], still in use, count: 1, list:
  (r0v1 je9[]) from 0x005c: CONSTRUCTOR (r0v1 je9[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class je9 {
    c(2, "VERBOSE"),
    d(3, "DEBUG"),
    e(4, "INFO"),
    f(5, "WARN"),
    g(6, "ERROR"),
    h(7, "ASSERT"),
    i(7, "ASSERT_NOT_REPORT");

    public static final /* synthetic */ ma6 k;
    public final int a;
    public final char b;

    static {
        k = new ma6(je9VarArr);
    }

    public je9(int i2, String str) {
        super(str, i);
        this.a = i2;
        this.b = c;
    }

    public static je9 valueOf(String str) {
        return (je9) Enum.valueOf(je9.class, str);
    }

    public static je9[] values() {
        return (je9[]) j.clone();
    }

    public final int a() {
        return this.a;
    }
}
