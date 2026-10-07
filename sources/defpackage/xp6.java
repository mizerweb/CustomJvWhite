package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class xp6 implements zp6 {
    public static final /* synthetic */ xp6[] b;
    public static final /* synthetic */ ma6 c;
    public final np6 a;

    /* JADX INFO: Fake field, exist only in values array */
    xp6 EF1;

    static {
        np6 np6Var = np6.f;
        xp6 xp6Var = new xp6("PDF", 0, np6Var);
        xp6 xp6Var2 = new xp6("PPT", 1, np6Var);
        xp6 xp6Var3 = new xp6("PPTX", 2, np6Var);
        xp6 xp6Var4 = new xp6("KEY", 3, np6Var);
        np6 np6Var2 = np6.g;
        xp6 xp6Var5 = new xp6("XLS", 4, np6Var2);
        xp6 xp6Var6 = new xp6("XLSX", 5, np6Var2);
        xp6 xp6Var7 = new xp6("CSV", 6, np6Var2);
        np6 np6Var3 = np6.h;
        xp6 xp6Var8 = new xp6("DOC", 7, np6Var3);
        xp6 xp6Var9 = new xp6("DOCX", 8, np6Var3);
        xp6 xp6Var10 = new xp6("TXT", 9, np6Var3);
        xp6 xp6Var11 = new xp6("RTF", 10, np6Var3);
        xp6 xp6Var12 = new xp6("ODT", 11, np6Var3);
        np6 np6Var4 = np6.i;
        xp6 xp6Var13 = new xp6("JPG", 12, np6Var4);
        xp6 xp6Var14 = new xp6("PNG", 13, np6Var4);
        xp6 xp6Var15 = new xp6("GIF", 14, np6Var4);
        xp6 xp6Var16 = new xp6("BMP", 15, np6Var4);
        xp6 xp6Var17 = new xp6("HEIC", 16, np6Var4);
        xp6 xp6Var18 = new xp6("HEIF", 17, np6Var4);
        xp6 xp6Var19 = new xp6("AVIF", 18, np6Var4);
        xp6 xp6Var20 = new xp6("WEBP", 19, np6Var4);
        xp6 xp6Var21 = new xp6("SVG", 20, np6Var4);
        np6 np6Var5 = np6.j;
        xp6 xp6Var22 = new xp6("MP4", 21, np6Var5);
        xp6 xp6Var23 = new xp6("MOV", 22, np6Var5);
        xp6 xp6Var24 = new xp6("AVI", 23, np6Var5);
        xp6 xp6Var25 = new xp6("MKV", 24, np6Var5);
        xp6 xp6Var26 = new xp6("WEBM", 25, np6Var5);
        np6 np6Var6 = np6.k;
        xp6 xp6Var27 = new xp6("ZIP", 26, np6Var6);
        xp6 xp6Var28 = new xp6("RAR", 27, np6Var6);
        xp6 xp6Var29 = new xp6("7Z", 28, np6Var6);
        xp6 xp6Var30 = new xp6("TAR", 29, np6Var6);
        xp6 xp6Var31 = new xp6("GZ", 30, np6Var6);
        np6 np6Var7 = np6.l;
        xp6 xp6Var32 = new xp6("EXE", 31, np6Var7);
        xp6 xp6Var33 = new xp6("APK", 32, np6Var7);
        xp6 xp6Var34 = new xp6("DMG", 33, np6Var7);
        xp6 xp6Var35 = new xp6("BAT", 34, np6Var7);
        xp6 xp6Var36 = new xp6("SH", 35, np6Var7);
        np6 np6Var8 = np6.m;
        xp6[] xp6VarArr = {xp6Var, xp6Var2, xp6Var3, xp6Var4, xp6Var5, xp6Var6, xp6Var7, xp6Var8, xp6Var9, xp6Var10, xp6Var11, xp6Var12, xp6Var13, xp6Var14, xp6Var15, xp6Var16, xp6Var17, xp6Var18, xp6Var19, xp6Var20, xp6Var21, xp6Var22, xp6Var23, xp6Var24, xp6Var25, xp6Var26, xp6Var27, xp6Var28, xp6Var29, xp6Var30, xp6Var31, xp6Var32, xp6Var33, xp6Var34, xp6Var35, xp6Var36, new xp6("MP3", 36, np6Var8), new xp6("WAV", 37, np6Var8), new xp6("AAC", 38, np6Var8), new xp6("OGG", 39, np6Var8), new xp6("FLAC", 40, np6Var8)};
        b = xp6VarArr;
        c = new ma6(xp6VarArr);
    }

    public xp6(String str, int i, np6 np6Var) {
        super(str, i);
        this.a = np6Var;
    }

    public static xp6 valueOf(String str) {
        return (xp6) Enum.valueOf(xp6.class, str);
    }

    public static xp6[] values() {
        return (xp6[]) b.clone();
    }

    @Override // defpackage.zp6
    public final String a() {
        return name();
    }

    @Override // defpackage.zp6
    public final np6 h() {
        return this.a;
    }
}
