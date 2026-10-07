package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v23 xj5[], still in use, count: 1, list:
  (r0v23 xj5[]) from 0x0153: CONSTRUCTOR (r0v23 xj5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xj5 {
    /* JADX INFO: Fake field, exist only in values array */
    STARTUP_REPORT("startup_report"),
    AB_EVENT("ab_event"),
    OPCODE("opcode"),
    CHAT_HISTORY_WARM("ch_history"),
    CHAT_LIST("open_chats_to_render"),
    WEB_APP("web_app"),
    UPLOAD_HANG("upload_hang"),
    UPLOAD_ERROR("upload_error"),
    MEMORY("memory"),
    BATTERY("battery"),
    TRANSCODE("transcode"),
    BAD_PUSHES("bad_pushes"),
    DOWNLOAD_ERROR("download_error"),
    EXIT_REASON("exit_reason"),
    NATIVE_LIB_INIT_DURATION("native_lib_init_duration"),
    CRIT_LOG("crit_log"),
    DATABASE_STAT("db_stat"),
    MULTIACCOUNT("multiaccount"),
    CALLS_INIT("calls_init"),
    CALL_SCREEN_INIT("calls_screen_init"),
    INCOMING_CALL_INIT("incoming_calls_init"),
    STORY_VIEWER_OPEN("open_story_viewer_to_render"),
    APP_UPDATE_AVAILABILITY("app_update_availability");

    public static final /* synthetic */ ma6 y;
    public final String a;

    static {
        y = new ma6(xj5VarArr);
    }

    public xj5(String str) {
        super(str, i);
        this.a = str;
    }

    public static xj5 valueOf(String str) {
        return (xj5) Enum.valueOf(xj5.class, str);
    }

    public static xj5[] values() {
        return (xj5[]) x.clone();
    }
}
