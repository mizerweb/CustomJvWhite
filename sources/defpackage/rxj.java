package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class rxj {
    public static final nxj c;
    public static final oxj d;
    public static final pxj e;
    public static final /* synthetic */ rxj[] f;
    public final sxj a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    rxj EF0;

    /* JADX INFO: Fake field, exist only in values array */
    rxj EF1;

    /* JADX INFO: Fake field, exist only in values array */
    rxj EF2;

    static {
        rxj rxjVar = new rxj("DOUBLE", 0, sxj.d, 1);
        rxj rxjVar2 = new rxj("FLOAT", 1, sxj.c, 5);
        sxj sxjVar = sxj.b;
        rxj rxjVar3 = new rxj("INT64", 2, sxjVar, 0);
        rxj rxjVar4 = new rxj("UINT64", 3, sxjVar, 0);
        sxj sxjVar2 = sxj.a;
        rxj rxjVar5 = new rxj("INT32", 4, sxjVar2, 0);
        rxj rxjVar6 = new rxj("FIXED64", 5, sxjVar, 1);
        rxj rxjVar7 = new rxj("FIXED32", 6, sxjVar2, 5);
        rxj rxjVar8 = new rxj("BOOL", 7, sxj.e, 0);
        nxj nxjVar = new nxj("STRING", 8, sxj.f, 2);
        c = nxjVar;
        sxj sxjVar3 = sxj.i;
        oxj oxjVar = new oxj("GROUP", 9, sxjVar3, 3);
        d = oxjVar;
        pxj pxjVar = new pxj("MESSAGE", 10, sxjVar3, 2);
        e = pxjVar;
        f = new rxj[]{rxjVar, rxjVar2, rxjVar3, rxjVar4, rxjVar5, rxjVar6, rxjVar7, rxjVar8, nxjVar, oxjVar, pxjVar, new qxj("BYTES", 11, sxj.g, 2), new rxj("UINT32", 12, sxjVar2, 0), new rxj("ENUM", 13, sxj.h, 0), new rxj("SFIXED32", 14, sxjVar2, 5), new rxj("SFIXED64", 15, sxjVar, 1), new rxj("SINT32", 16, sxjVar2, 0), new rxj("SINT64", 17, sxjVar, 0)};
    }

    public rxj(String str, int i, sxj sxjVar, int i2) {
        super(str, i);
        this.a = sxjVar;
        this.b = i2;
    }

    public static rxj valueOf(String str) {
        return (rxj) Enum.valueOf(rxj.class, str);
    }

    public static rxj[] values() {
        return (rxj[]) f.clone();
    }
}
