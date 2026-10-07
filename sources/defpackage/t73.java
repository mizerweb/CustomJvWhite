package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class t73 {
    public static final t73 b;
    public static final t73 c;
    public static final t73 d;
    public static final t73 e;
    public static final /* synthetic */ t73[] f;
    public final mg5 a;

    static {
        mg5 mg5Var = mg5.REGULAR;
        t73 t73Var = new t73("REGULAR", 0, mg5Var);
        b = t73Var;
        t73 t73Var2 = new t73("SCHEDULED", 1, mg5.DELAYED);
        c = t73Var2;
        t73 t73Var3 = new t73("COMMENTS", 2, mg5Var);
        d = t73Var3;
        t73 t73Var4 = new t73("STORIES", 3, mg5Var);
        e = t73Var4;
        f = new t73[]{t73Var, t73Var2, t73Var3, t73Var4};
    }

    public t73(String str, int i, mg5 mg5Var) {
        super(str, i);
        this.a = mg5Var;
    }

    public static t73 valueOf(String str) {
        return (t73) Enum.valueOf(t73.class, str);
    }

    public static t73[] values() {
        return (t73[]) f.clone();
    }

    public final boolean a() {
        return this == d;
    }

    public final boolean h() {
        return this == b;
    }

    public final boolean i() {
        return this == c;
    }
}
