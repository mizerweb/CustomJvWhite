package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 trj[], still in use, count: 1, list:
  (r0v1 trj[]) from 0x0056: CONSTRUCTOR (r0v1 trj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class trj implements pkj {
    /* JADX INFO: Fake field, exist only in values array */
    READY("WebAppReady", "ready"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE("WebAppClose", "close"),
    SETUP_BACK_BUTTON("WebAppSetupBackButton", "setup_back_button"),
    SETUP_CLOSING_BEHAVIOUR("WebAppSetupClosingBehavior", "setup_closing_behaviour"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_CLICK_BACK("WebAppBackButtonPressed", "back_button_pressed"),
    SETUP_SCREEN_CAPTURE_BEHAVIOR("WebAppSetupScreenCaptureBehavior", "setup_screen_capture_behavior");

    public static final /* synthetic */ ma6 g;
    public final String a;
    public final String b;

    static {
        g = new ma6(trjVarArr);
    }

    public trj(String str, String str2) {
        super(str, i);
        this.a = str;
        this.b = str2;
    }

    public static trj valueOf(String str) {
        return (trj) Enum.valueOf(trj.class, str);
    }

    public static trj[] values() {
        return (trj[]) f.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return null;
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
