package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 fa8[], still in use, count: 1, list:
  (r0v1 fa8[]) from 0x0068: CONSTRUCTOR (r0v1 fa8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fa8 {
    SEND_5_MESSAGES("messageSent"),
    CREATE_FOLDER("folderCreated"),
    SEND_AUDIO_MESSAGE("voiceMessageSent"),
    ADD_2_REACTIONS("reactionSet"),
    SEND_3_STICKERS("stickerSent"),
    CREATE_2_GROUP_CHATS("groupChatCreated"),
    MADE_2_PIN("pinMade"),
    PARTICIPATED_IN_CALL("callMade");

    public static final /* synthetic */ ma6 k;
    public final String a;

    static {
        k = new ma6(fa8VarArr);
    }

    public fa8(String str) {
        super(str, i);
        this.a = str;
    }

    public static fa8 valueOf(String str) {
        return (fa8) Enum.valueOf(fa8.class, str);
    }

    public static fa8[] values() {
        return (fa8[]) j.clone();
    }

    public final String a() {
        return this.a;
    }
}
