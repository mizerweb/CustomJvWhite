package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 d93[], still in use, count: 1, list:
  (r0v1 d93[]) from 0x0030: CONSTRUCTOR (r0v1 d93[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d93 {
    UNKNOWN(0),
    CHAT_LIST(1),
    SEARCH(2),
    PUSH(3);

    public static final /* synthetic */ ma6 g;
    public final int a;

    static {
        g = new ma6(d93VarArr);
    }

    public d93(int i) {
        super(str, i);
        this.a = i;
    }

    public static d93 valueOf(String str) {
        return (d93) Enum.valueOf(d93.class, str);
    }

    public static d93[] values() {
        return (d93[]) f.clone();
    }

    public final int a() {
        return this.a;
    }
}
