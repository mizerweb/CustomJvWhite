package defpackage;

import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class jr4 implements af7 {
    public final /* synthetic */ int a;
    public static final jr4 b = new jr4(0);
    public static final jr4 c = new jr4(1);
    public static final jr4 d = new jr4(2);
    public static final jr4 e = new jr4(3);
    public static final jr4 f = new jr4(4);
    public static final jr4 g = new jr4(5);
    public static final jr4 h = new jr4(6);
    public static final jr4 i = new jr4(7);
    public static final jr4 j = new jr4(8);
    public static final jr4 k = new jr4(9);
    public static final jr4 l = new jr4(10);
    public static final jr4 m = new jr4(11);
    public static final jr4 n = new jr4(12);
    public static final jr4 o = new jr4(13);
    public static final jr4 p = new jr4(14);
    public static final jr4 q = new jr4(15);
    public static final jr4 r = new jr4(16);
    public static final jr4 s = new jr4(17);
    public static final jr4 t = new jr4(18);
    public static final jr4 u = new jr4(19);
    public static final jr4 v = new jr4(20);
    public static final jr4 w = new jr4(21);
    public static final jr4 x = new jr4(22);
    public static final jr4 y = new jr4(23);
    public static final jr4 z = new jr4(24);
    public static final jr4 A = new jr4(25);
    public static final jr4 B = new jr4(26);
    public static final jr4 C = new jr4(27);
    public static final jr4 D = new jr4(28);
    public static final jr4 E = new jr4(29);

    public /* synthetic */ jr4(int i2) {
        this.a = i2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return br4.class;
            case 1:
                return null;
            case 2:
                return vji.Companion.serializer();
            case 3:
                return bk5.b.serializer();
            case 4:
                return yqc.b.serializer();
            case 5:
                return hrc.Companion.serializer();
            case 6:
                return kcb.b.serializer();
            case 7:
                return lvb.o0(zl9.Companion.serializer());
            case 8:
                return x51.Companion.serializer();
            case 9:
                return ad5.Companion.serializer();
            case 10:
                return pad.Companion.serializer();
            case 11:
                return rd7.Companion.serializer();
            case 12:
                return af.Companion.serializer();
            case 13:
                return xm0.a.serializer();
            case 14:
                return vqg.Companion.serializer();
            case 15:
                return stg.Companion.serializer();
            case 16:
                return vsg.Companion.serializer();
            case 17:
                return e14.Companion.serializer();
            case 18:
                return hs2.Companion.serializer();
            case 19:
                return b01.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return b01.a;
            case 21:
                return ka2.Companion.serializer();
            case 22:
                return lvb.o0(ef8.Companion.serializer());
            case 23:
                return yhb.Companion.serializer();
            case 24:
                return llh.Companion.serializer();
            case 25:
                return lvb.o0(vhe.Companion.serializer());
            case 26:
                return b01.a;
            case 27:
                return iec.a.serializer();
            case 28:
                return edb.d.serializer();
            default:
                return a82.Companion.serializer();
        }
    }
}
