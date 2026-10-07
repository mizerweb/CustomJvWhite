package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ns5[], still in use, count: 1, list:
  (r0v1 ns5[]) from 0x0061: CONSTRUCTOR (r0v1 ns5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ns5 {
    UNKNOWN(0),
    AUTOLOAD(1),
    CHAT_MEDIA(2),
    CHAT(3),
    MEDIA_PLAYLIST(4),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_SCREENS(5),
    WEBAPP(6),
    MEDIA_EDITOR(7),
    STORY_VIEWER(8);

    public static final /* synthetic */ ma6 k;
    public final int a;

    static {
        k = new ma6(ns5VarArr);
    }

    public ns5(int i) {
        super(str, i);
        this.a = i;
    }

    public static ns5 valueOf(String str) {
        return (ns5) Enum.valueOf(ns5.class, str);
    }

    public static ns5[] values() {
        return (ns5[]) j.clone();
    }

    public final int a() {
        return this.a;
    }
}
