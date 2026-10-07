package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q54[], still in use, count: 1, list:
  (r0v1 q54[]) from 0x006e: CONSTRUCTOR (r0v1 q54[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class q54 {
    CHAT((byte) 1),
    CHANNEL((byte) 2),
    MSG_DIALOG((byte) 3),
    MSG_CHAT((byte) 4),
    MSG_CHANNEL((byte) 5),
    USER_PROFILE((byte) 6),
    BOT_PROFILE((byte) 7),
    UNKNOWN_CALL((byte) 8),
    STORY((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    STICKER((byte) 10);

    public static final /* synthetic */ ma6 l;
    public final byte a;

    static {
        l = new ma6(q54VarArr);
    }

    public q54(byte b) {
        super(str, i);
        this.a = b;
    }

    public static q54 valueOf(String str) {
        return (q54) Enum.valueOf(q54.class, str);
    }

    public static q54[] values() {
        return (q54[]) k.clone();
    }

    public final byte a() {
        return this.a;
    }
}
