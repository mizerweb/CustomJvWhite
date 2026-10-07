package defpackage;

import ru.oneme.app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 f9j[], still in use, count: 1, list:
  (r0v1 f9j[]) from 0x0057: CONSTRUCTOR (r0v1 f9j[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f9j {
    None(null),
    Timer(Integer.valueOf(R.drawable.ic_animated_clock)),
    Send(Integer.valueOf(R.drawable.icon_status_delivered)),
    Seen(Integer.valueOf(R.drawable.icon_status_read)),
    Error(Integer.valueOf(R.drawable.icon_warning_fill_color_mini));

    public static final /* synthetic */ ma6 h;
    public final Integer a;

    static {
        h = new ma6(f9jVarArr);
    }

    public f9j(Integer num) {
        super(str, i);
        this.a = num;
    }

    public static f9j valueOf(String str) {
        return (f9j) Enum.valueOf(f9j.class, str);
    }

    public static f9j[] values() {
        return (f9j[]) g.clone();
    }
}
