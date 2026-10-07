package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ayb {
    public static final ayb g;
    public static final ayb h;
    public static final ayb i;
    public static final ayb j;
    public static final /* synthetic */ ayb[] k;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final noh f;

    static {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        int iK2 = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        int iK4 = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        int iK5 = gm0.K(22.0f * yl5.d().getDisplayMetrics().density);
        noh nohVar = q9i.a;
        noh nohVar2 = q9i.p;
        ayb aybVar = new ayb("LARGE", 0, iK, iK2, iK3, iK4, iK5, nohVar2);
        g = aybVar;
        ayb aybVar2 = new ayb("MEDIUM", 1, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), nohVar2);
        h = aybVar2;
        ayb aybVar3 = new ayb("SMALL", 2, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), q9i.q);
        i = aybVar3;
        ayb aybVar4 = new ayb("XSMALL", 3, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(32.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), q9i.r);
        j = aybVar4;
        k = new ayb[]{aybVar, aybVar2, aybVar3, aybVar4};
    }

    public ayb(String str, int i2, int i3, int i4, int i5, int i6, int i7, noh nohVar) {
        super(str, i2);
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = i6;
        this.e = i7;
        this.f = nohVar;
    }

    public static ayb valueOf(String str) {
        return (ayb) Enum.valueOf(ayb.class, str);
    }

    public static ayb[] values() {
        return (ayb[]) k.clone();
    }
}
