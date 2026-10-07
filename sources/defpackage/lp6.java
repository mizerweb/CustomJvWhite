package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class lp6 {
    public static final lp6 b;
    public static final lp6 c;
    public static final lp6[] d;
    public static final /* synthetic */ lp6[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    lp6 EF0;

    static {
        ro8 ro8Var = ro8.e;
        lp6 lp6Var = new lp6("DOUBLE", 0, 0, 1, ro8Var);
        ro8 ro8Var2 = ro8.d;
        lp6 lp6Var2 = new lp6("FLOAT", 1, 1, 1, ro8Var2);
        ro8 ro8Var3 = ro8.c;
        lp6 lp6Var3 = new lp6("INT64", 2, 2, 1, ro8Var3);
        lp6 lp6Var4 = new lp6("UINT64", 3, 3, 1, ro8Var3);
        ro8 ro8Var4 = ro8.b;
        lp6 lp6Var5 = new lp6("INT32", 4, 4, 1, ro8Var4);
        lp6 lp6Var6 = new lp6("FIXED64", 5, 5, 1, ro8Var3);
        lp6 lp6Var7 = new lp6("FIXED32", 6, 6, 1, ro8Var4);
        ro8 ro8Var5 = ro8.f;
        lp6 lp6Var8 = new lp6("BOOL", 7, 7, 1, ro8Var5);
        ro8 ro8Var6 = ro8.g;
        lp6 lp6Var9 = new lp6("STRING", 8, 8, 1, ro8Var6);
        ro8 ro8Var7 = ro8.j;
        lp6 lp6Var10 = new lp6("MESSAGE", 9, 9, 1, ro8Var7);
        ro8 ro8Var8 = ro8.h;
        lp6 lp6Var11 = new lp6("BYTES", 10, 10, 1, ro8Var8);
        lp6 lp6Var12 = new lp6("UINT32", 11, 11, 1, ro8Var4);
        ro8 ro8Var9 = ro8.i;
        lp6 lp6Var13 = new lp6("ENUM", 12, 12, 1, ro8Var9);
        lp6 lp6Var14 = new lp6("SFIXED32", 13, 13, 1, ro8Var4);
        lp6 lp6Var15 = new lp6("SFIXED64", 14, 14, 1, ro8Var3);
        lp6 lp6Var16 = new lp6("SINT32", 15, 15, 1, ro8Var4);
        lp6 lp6Var17 = new lp6("SINT64", 16, 16, 1, ro8Var3);
        lp6 lp6Var18 = new lp6("GROUP", 17, 17, 1, ro8Var7);
        lp6 lp6Var19 = new lp6("DOUBLE_LIST", 18, 18, 2, ro8Var);
        lp6 lp6Var20 = new lp6("FLOAT_LIST", 19, 19, 2, ro8Var2);
        lp6 lp6Var21 = new lp6("INT64_LIST", 20, 20, 2, ro8Var3);
        lp6 lp6Var22 = new lp6("UINT64_LIST", 21, 21, 2, ro8Var3);
        lp6 lp6Var23 = new lp6("INT32_LIST", 22, 22, 2, ro8Var4);
        lp6 lp6Var24 = new lp6("FIXED64_LIST", 23, 23, 2, ro8Var3);
        lp6 lp6Var25 = new lp6("FIXED32_LIST", 24, 24, 2, ro8Var4);
        lp6 lp6Var26 = new lp6("BOOL_LIST", 25, 25, 2, ro8Var5);
        lp6 lp6Var27 = new lp6("STRING_LIST", 26, 26, 2, ro8Var6);
        lp6 lp6Var28 = new lp6("MESSAGE_LIST", 27, 27, 2, ro8Var7);
        lp6 lp6Var29 = new lp6("BYTES_LIST", 28, 28, 2, ro8Var8);
        lp6 lp6Var30 = new lp6("UINT32_LIST", 29, 29, 2, ro8Var4);
        lp6 lp6Var31 = new lp6("ENUM_LIST", 30, 30, 2, ro8Var9);
        lp6 lp6Var32 = new lp6("SFIXED32_LIST", 31, 31, 2, ro8Var4);
        lp6 lp6Var33 = new lp6("SFIXED64_LIST", 32, 32, 2, ro8Var3);
        lp6 lp6Var34 = new lp6("SINT32_LIST", 33, 33, 2, ro8Var4);
        lp6 lp6Var35 = new lp6("SINT64_LIST", 34, 34, 2, ro8Var3);
        lp6 lp6Var36 = new lp6("DOUBLE_LIST_PACKED", 35, 35, 3, ro8Var);
        b = lp6Var36;
        lp6 lp6Var37 = new lp6("FLOAT_LIST_PACKED", 36, 36, 3, ro8Var2);
        lp6 lp6Var38 = new lp6("INT64_LIST_PACKED", 37, 37, 3, ro8Var3);
        lp6 lp6Var39 = new lp6("UINT64_LIST_PACKED", 38, 38, 3, ro8Var3);
        lp6 lp6Var40 = new lp6("INT32_LIST_PACKED", 39, 39, 3, ro8Var4);
        lp6 lp6Var41 = new lp6("FIXED64_LIST_PACKED", 40, 40, 3, ro8Var3);
        lp6 lp6Var42 = new lp6("FIXED32_LIST_PACKED", 41, 41, 3, ro8Var4);
        lp6 lp6Var43 = new lp6("BOOL_LIST_PACKED", 42, 42, 3, ro8Var5);
        lp6 lp6Var44 = new lp6("UINT32_LIST_PACKED", 43, 43, 3, ro8Var4);
        lp6 lp6Var45 = new lp6("ENUM_LIST_PACKED", 44, 44, 3, ro8Var9);
        lp6 lp6Var46 = new lp6("SFIXED32_LIST_PACKED", 45, 45, 3, ro8Var4);
        lp6 lp6Var47 = new lp6("SFIXED64_LIST_PACKED", 46, 46, 3, ro8Var3);
        lp6 lp6Var48 = new lp6("SINT32_LIST_PACKED", 47, 47, 3, ro8Var4);
        lp6 lp6Var49 = new lp6("SINT64_LIST_PACKED", 48, 48, 3, ro8Var3);
        c = lp6Var49;
        e = new lp6[]{lp6Var, lp6Var2, lp6Var3, lp6Var4, lp6Var5, lp6Var6, lp6Var7, lp6Var8, lp6Var9, lp6Var10, lp6Var11, lp6Var12, lp6Var13, lp6Var14, lp6Var15, lp6Var16, lp6Var17, lp6Var18, lp6Var19, lp6Var20, lp6Var21, lp6Var22, lp6Var23, lp6Var24, lp6Var25, lp6Var26, lp6Var27, lp6Var28, lp6Var29, lp6Var30, lp6Var31, lp6Var32, lp6Var33, lp6Var34, lp6Var35, lp6Var36, lp6Var37, lp6Var38, lp6Var39, lp6Var40, lp6Var41, lp6Var42, lp6Var43, lp6Var44, lp6Var45, lp6Var46, lp6Var47, lp6Var48, lp6Var49, new lp6("GROUP_LIST", 49, 49, 2, ro8Var7), new lp6("MAP", 50, 50, 4, ro8.a)};
        lp6[] lp6VarArrValues = values();
        d = new lp6[lp6VarArrValues.length];
        for (lp6 lp6Var50 : lp6VarArrValues) {
            d[lp6Var50.a] = lp6Var50;
        }
    }

    public lp6(String str, int i, int i2, int i3, ro8 ro8Var) {
        super(str, i);
        this.a = i2;
        int iD = qt4.D(i3);
        if (iD == 1 || iD == 3) {
            ro8Var.getClass();
        }
        if (i3 == 1) {
            ro8Var.ordinal();
        }
    }

    public static lp6 valueOf(String str) {
        return (lp6) Enum.valueOf(lp6.class, str);
    }

    public static lp6[] values() {
        return (lp6[]) e.clone();
    }
}
