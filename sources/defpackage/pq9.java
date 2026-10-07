package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pq9[], still in use, count: 1, list:
  (r0v1 pq9[]) from 0x001d: CONSTRUCTOR (r0v1 pq9[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pq9 {
    PHOTO(1),
    VIDEO(2);

    public static final /* synthetic */ ma6 e;
    public final int a;

    static {
        e = new ma6(pq9VarArr);
    }

    public pq9(int i) {
        super(str, i);
        this.a = i;
    }

    public static pq9 valueOf(String str) {
        return (pq9) Enum.valueOf(pq9.class, str);
    }

    public static pq9[] values() {
        return (pq9[]) d.clone();
    }
}
