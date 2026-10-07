package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xc7[], still in use, count: 1, list:
  (r0v1 xc7[]) from 0x0087: CONSTRUCTOR (r0v1 xc7[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xc7 {
    c(np0.n, 144),
    d(426, 240),
    e(640, 360),
    f(853, 480),
    g(1280, 720),
    h(1920, 1080),
    i(2560, 1440),
    j(3840, 2160),
    k(7680, 4320);

    public static final /* synthetic */ ma6 m;
    public final int a;
    public final int b;

    static {
        m = new ma6(xc7VarArr);
    }

    public xc7(int i2, int i3) {
        super(str, i);
        this.a = i2;
        this.b = i3;
    }

    public static xc7 valueOf(String str) {
        return (xc7) Enum.valueOf(xc7.class, str);
    }

    public static xc7[] values() {
        return (xc7[]) l.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b + "p";
    }
}
