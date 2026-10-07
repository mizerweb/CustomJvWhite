package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y0e extends Enum {

    /* JADX INFO: renamed from: f */
    public static final y0e P_2160;

    /* JADX INFO: renamed from: g */
    public static final y0e P_1080;

    /* JADX INFO: renamed from: h */
    public static final y0e P_720;

    /* JADX INFO: renamed from: i */
    public static final y0e P_480;

    /* JADX INFO: renamed from: j */
    public static final y0e P_360;
    public static final /* synthetic */ y0e[] k;
    public static final /* synthetic */ ma6 l;
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX INFO: renamed from: EF1 */
    y0e P_1440;

    /* JADX INFO: renamed from: EF133 */
    y0e P_240;

    /* JADX INFO: renamed from: EF151 */
    y0e P_144;

    static {
        y0e y0eVar = new y0e("4K", 0, 3840, 2160, 20736000);
        P_2160 = y0eVar;
        y0e y0eVar2 = new y0e("2K", 1, 2560, 1440, 9216000);
        y0e y0eVar3 = new y0e("1080p", 2, 1920, 1080, 5222400);
        P_1080 = y0eVar3;
        y0e y0eVar4 = new y0e("720p", 3, 1280, 720, 2304000);
        P_720 = y0eVar4;
        y0e y0eVar5 = new y0e("480p", 4, 853, 480, 1024000);
        P_480 = y0eVar5;
        y0e y0eVar6 = new y0e("360p", 5, 640, 360, 576000);
        P_360 = y0eVar6;
        y0e[] y0eVarArr = {y0eVar, y0eVar2, y0eVar3, y0eVar4, y0eVar5, y0eVar6, new y0e("240p", 6, 426, 240, 255720), new y0e("144p", 7, np0.n, 144, 92160)};
        k = y0eVarArr;
        l = new ma6(y0eVarArr);
    }

    public y0e(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static y0e valueOf(String str) {
        return (y0e) Enum.valueOf(y0e.class, str);
    }

    public static y0e[] values() {
        return (y0e[]) k.clone();
    }

    public final long a() {
        int i = this.c;
        int i2 = this.d;
        return bj8.a(Math.max(i, i2), Math.min(i, i2));
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA = nbh.A(this.b, "QualityValue(", "|", this.a, "|");
        qt4.x(this.c, this.d, "x", "|", sbA);
        return zo5.t(sbA, this.e, ")");
    }
}
