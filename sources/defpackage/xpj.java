package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xpj[], still in use, count: 1, list:
  (r0v1 xpj[]) from 0x0030: CONSTRUCTOR (r0v1 xpj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xpj implements pkj {
    SHARE("WebAppShare", "web_app_share", 14),
    MAX_SHARE("WebAppMaxShare", "web_app_max_share", 15);

    public static final /* synthetic */ ma6 g;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        g = new ma6(xpjVarArr);
    }

    public xpj(String str, String str2, Integer num) {
        super(str, i);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public static xpj valueOf(String str) {
        return (xpj) Enum.valueOf(xpj.class, str);
    }

    public static xpj[] values() {
        return (xpj[]) f.clone();
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
