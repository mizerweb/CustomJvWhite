package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kxg[], still in use, count: 1, list:
  (r0v1 kxg[]) from 0x0026: CONSTRUCTOR (r0v1 kxg[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class kxg {
    PHOTO(0),
    VIDEO(1),
    TEXT(2);

    public static final /* synthetic */ ma6 f;
    public final int a;

    static {
        f = new ma6(kxgVarArr);
    }

    public kxg(int i) {
        super(str, i);
        this.a = i;
    }

    public static kxg valueOf(String str) {
        return (kxg) Enum.valueOf(kxg.class, str);
    }

    public static kxg[] values() {
        return (kxg[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
