package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pjj[], still in use, count: 1, list:
  (r0v1 pjj[]) from 0x0044: CONSTRUCTOR (r0v1 pjj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pjj implements pkj {
    HAPTIC_FEEDBACK_IMPACT("WebAppHapticFeedbackImpact", "haptic_feedback_impact", 8),
    HAPTIC_FEEDBACK_NOTIFICATION("WebAppHapticFeedbackNotification", "haptic_feedback_notification", 20),
    HAPTIC_FEEDBACK_SELECTION_CHANGE("WebAppHapticFeedbackSelectionChange", "haptic_feedback_selection_change", 16);

    public static final /* synthetic */ ma6 h;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        h = new ma6(pjjVarArr);
    }

    public pjj(String str, String str2, Integer num) {
        super(str, i);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public static pjj valueOf(String str) {
        return (pjj) Enum.valueOf(pjj.class, str);
    }

    public static pjj[] values() {
        return (pjj[]) g.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.pkj
    public final String h() {
        return this.a;
    }

    @Override // defpackage.pkj
    public final String i() {
        return this.b;
    }
}
