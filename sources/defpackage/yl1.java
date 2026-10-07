package defpackage;

import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yl1[], still in use, count: 1, list:
  (r0v1 yl1[]) from 0x0022: CONSTRUCTOR (r0v1 yl1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class yl1 {
    ALL(R.string.call_history_call_tab_all),
    MISSING(R.string.call_history_call_tab_missing);

    public static final /* synthetic */ ma6 e;
    public final int a;

    static {
        e = new ma6(yl1VarArr);
    }

    public yl1(int i) {
        super(str, i);
        this.a = i;
    }

    public static yl1 valueOf(String str) {
        return (yl1) Enum.valueOf(yl1.class, str);
    }

    public static yl1[] values() {
        return (yl1[]) d.clone();
    }
}
