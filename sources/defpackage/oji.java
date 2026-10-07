package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 oji[], still in use, count: 1, list:
  (r0v1 oji[]) from 0x0070: CONSTRUCTOR (r0v1 oji[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class oji {
    UNKNOWN(0),
    VIDEO(1),
    PHOTO(2),
    PROFILE_PHOTO(3),
    FILE(4),
    AUDIO(5),
    STICKER(7),
    VIDEO_MESSAGE(8),
    STORY_PHOTO(9),
    STORY_VIDEO(10);

    public static final /* synthetic */ ma6 m;
    public final int a;

    static {
        m = new ma6(ojiVarArr);
    }

    public oji(int i) {
        super(str, i);
        this.a = i;
    }

    public static oji valueOf(String str) {
        return (oji) Enum.valueOf(oji.class, str);
    }

    public static oji[] values() {
        return (oji[]) l.clone();
    }

    public final int a() {
        switch (mji.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 21;
            case 9:
                return 22;
            default:
                return 0;
        }
    }
}
