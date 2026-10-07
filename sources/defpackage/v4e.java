package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 v4e[], still in use, count: 1, list:
  (r0v1 v4e[]) from 0x006e: CONSTRUCTOR (r0v1 v4e[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class v4e {
    AUDIO_FREEZES("AUDIO_FREEZES"),
    AUDIO_CALL_INTERRUPTION("AUDIO_CALL_INTERRUPTION"),
    VOICE_COMMUNICATION_PROBLEM("VOICE_COMMUNICATION_PROBLEM"),
    AUDIO_QUALITY("AUDIO_QUALITY"),
    AUDIO_ECHO("AUDIO_ECHO"),
    VIDEO_FREEZES("VIDEO_FREEZES"),
    VIDEO_QUALITY("VIDEO_QUALITY"),
    VIDEO_SYNC("VIDEO_SYNC"),
    VIDEO_CALL_INTERRUPTION("VIDEO_CALL_INTERRUPTION"),
    USERS_FREEZES("USERS_FREEZES");

    public static final /* synthetic */ ma6 m;
    public final String a;

    static {
        m = new ma6(v4eVarArr);
    }

    public v4e(String str) {
        super(str, i);
        this.a = str;
    }

    public static v4e valueOf(String str) {
        return (v4e) Enum.valueOf(v4e.class, str);
    }

    public static v4e[] values() {
        return (v4e[]) l.clone();
    }
}
