package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rdg[], still in use, count: 1, list:
  (r0v1 rdg[]) from 0x0043: CONSTRUCTOR (r0v1 rdg[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class rdg {
    DIALOG_USER_ID(1),
    DIALOG_BOT_ID(2),
    CHAT_ID(3),
    /* JADX INFO: Fake field, exist only in values array */
    CHANNEL_ID(4),
    FOLDER_ID(5),
    WEBAPP_ID(6);

    public static final /* synthetic */ ma6 h;
    public final int a;

    static {
        h = new ma6(rdgVarArr);
    }

    public rdg(int i) {
        super(str, i);
        this.a = i;
    }

    public static rdg valueOf(String str) {
        return (rdg) Enum.valueOf(rdg.class, str);
    }

    public static rdg[] values() {
        return (rdg[]) g.clone();
    }
}
