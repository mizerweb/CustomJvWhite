package defpackage;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xfa[], still in use, count: 1, list:
  (r0v1 xfa[]) from 0x0042: CONSTRUCTOR (r0v1 xfa[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xfa {
    UNKNOWN(0),
    SENDING(10),
    SENT(20),
    READ(30),
    ERROR(40);

    public static final List b;
    public final int a;

    static {
        b = ww3.T1(new ma6(xfaVarArr));
    }

    public xfa(int i) {
        super(str, i);
        this.a = i;
    }

    public static xfa valueOf(String str) {
        return (xfa) Enum.valueOf(xfa.class, str);
    }

    public static xfa[] values() {
        return (xfa[]) h.clone();
    }
}
