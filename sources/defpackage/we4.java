package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 we4[], still in use, count: 1, list:
  (r0v1 we4[]) from 0x003b: CONSTRUCTOR (r0v1 we4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class we4 implements Comparable {
    TYPE_UNKNOWN(0),
    TYPE_WIFI(2),
    TYPE_MOBILE_SLOW(3),
    TYPE_MOBILE_NORMAL(4),
    TYPE_MOBILE_FAST(5);

    public static final /* synthetic */ ma6 h;
    public final int a;

    static {
        h = new ma6(we4VarArr);
    }

    public we4(int i) {
        super(str, i);
        this.a = i;
    }

    public static we4 valueOf(String str) {
        return (we4) Enum.valueOf(we4.class, str);
    }

    public static we4[] values() {
        return (we4[]) g.clone();
    }

    public final String a() {
        int i = ve4.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "WIFI";
        }
        if (i == 2) {
            return "2G";
        }
        if (i != 3) {
            return i != 4 ? "UNKNOWN" : "4G";
        }
        return "3G";
    }
}
