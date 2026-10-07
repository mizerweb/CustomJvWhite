package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l1h[], still in use, count: 1, list:
  (r0v1 l1h[]) from 0x001c: CONSTRUCTOR (r0v1 l1h[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class l1h {
    EMOJI(0),
    STICKER(1);

    public static final /* synthetic */ ma6 e;
    public final int a;

    static {
        e = new ma6(l1hVarArr);
    }

    public l1h(int i) {
        super(str, i);
        this.a = i;
    }

    public static l1h valueOf(String str) {
        return (l1h) Enum.valueOf(l1h.class, str);
    }

    public static l1h[] values() {
        return (l1h[]) d.clone();
    }
}
