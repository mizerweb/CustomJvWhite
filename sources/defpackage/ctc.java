package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 ctc[], still in use, count: 1, list:
  (r0v47 ctc[]) from 0x02db: CONSTRUCTOR (r0v47 ctc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ctc {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    TYPE_MSG_DELETE(1),
    TYPE_MSG_SEND(2),
    TYPE_PROFILE(3),
    TYPE_CONTACT_UPDATE(4),
    TYPE_CONFIG(5),
    TYPE_CHAT_DELETE(6),
    TYPE_CHATS_LIST(7),
    TYPE_MSG_EDIT(8),
    TYPE_CHAT_CLEAR(9),
    TYPE_VIDEO_PLAY(10),
    TYPE_CHAT_MARK(11),
    TYPE_SYNC_CHAT_HISTORY(12),
    TYPE_CHAT_UPDATE(13),
    TYPE_CHAT_LEAVE(14),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_CHAT_CREATE(16),
    TYPE_MSG_SHARE_PREVIEW(17),
    TYPE_CHAT_MEMBERS_UPDATE(18),
    TYPE_CHAT_SUBSCRIBE(19),
    TYPE_CHAT_PIN_SET_VISIBILITY(20),
    TYPE_FILE_DOWNLOAD_CMD(21),
    TYPE_REMOVE_CONTACT_PHOTO(22),
    TYPE_MSG_DELETE_RANGE(24),
    TYPE_CHAT_COMPLAIN(26),
    TYPE_MSG_SEND_CALLBACK(27),
    TYPE_SUSPEND_BOT(28),
    TYPE_LOCATION_REQUEST(29),
    TYPE_CHANGE_PROFILE_OR_CHAT_PHOTO(32),
    TYPE_LOCATION_STOP(34),
    TYPE_ASSETS_ADD(37),
    TYPE_ASSETS_LIST_MODIFY(38),
    TYPE_ASSETS_REMOVE(39),
    TYPE_ASSETS_MOVE(40),
    TYPE_CHAT_HIDE(41),
    TYPE_MSG_REACT(44),
    TYPE_MSG_CANCEL_REACTION(45),
    TYPE_UPDATE_FIRE_TIME(46),
    TYPE_CHANGE_CHAT_PHOTO(47),
    TYPE_STAT_CRIT_EVENT(48),
    TYPE_COMPLAIN(49),
    TYPE_CHAT_PERSONAL_CONFIG(50),
    TYPE_WARM_CHAT_HISTORY(51),
    TYPE_CHAT_MARK_BATCH(52),
    TYPE_CHAT_DELETE_BATCH(53),
    TYPE_CALL_HISTORY_CLEAR_BATCH(54),
    TYPE_COMMENT_SEND(55),
    TYPE_COMMENT_DELETE(56),
    TYPE_COMMENT_EDIT(57),
    TYPE_COMMENT_DELETE_USER(58);

    public static final /* synthetic */ ma6 w1;
    public final int a;

    static {
        w1 = new ma6(ctcVarArr);
    }

    public ctc(int i) {
        super(str, i);
        this.a = i;
    }

    public static ctc valueOf(String str) {
        return (ctc) Enum.valueOf(ctc.class, str);
    }

    public static ctc[] values() {
        return (ctc[]) v1.clone();
    }
}
