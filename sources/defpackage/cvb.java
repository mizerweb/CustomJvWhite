package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cvb[], still in use, count: 1, list:
  (r0v1 cvb[]) from 0x0021: CONSTRUCTOR (r0v1 cvb[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cvb {
    DIGITAL_ID(1, "digital_id_tabbar"),
    CHANNELS_FOLDER(2, "channel_recsys_folder");

    public static final /* synthetic */ ma6 f;
    public final int a;
    public final String b;

    static {
        f = new ma6(cvbVarArr);
    }

    public cvb(int i, String str) {
        super(str, i);
        this.a = i;
        this.b = str;
    }

    public static cvb valueOf(String str) {
        return (cvb) Enum.valueOf(cvb.class, str);
    }

    public static cvb[] values() {
        return (cvb[]) e.clone();
    }
}
