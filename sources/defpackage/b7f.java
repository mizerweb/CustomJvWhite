package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class b7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ b7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = 23;
        switch (this.b) {
            case 0:
                return new sa5();
            case 1:
                return new iq6((rs6) h5Var.c(138), (e5d) h5Var.c(26));
            case 2:
                return new mm4((gu4) h5Var.c(139), h5Var.d(101), h5Var.d(132), h5Var.d(144), new ifh(new ic1(h5Var, i)));
            case 3:
                return (rnf) h5Var.c(461);
            case 4:
                return new jcd((wo6) h5Var.c(54));
            case 5:
                return new xg4(h5Var.d(219), h5Var.d(144), h5Var.d(377));
            case 6:
                return new mh4(h5Var.d(132), h5Var.d(131), h5Var.d(685), h5Var.d(146), h5Var.d(116), h5Var.d(23));
            case 7:
                return new bm4(h5Var.d(132), h5Var.d(685), h5Var.d(146), h5Var.d(116));
            case 8:
                return new nm4(h5Var.d(132), h5Var.d(685), h5Var.d(146), h5Var.d(116), h5Var.d(23), h5Var.d(286));
            case 9:
                return new ch4(h5Var.d(132), h5Var.d(685), h5Var.d(146), h5Var.d(116), h5Var.d(144), h5Var.d(HttpStatus.SC_NOT_IMPLEMENTED), h5Var.d(54), h5Var.d(537));
            case 10:
                return new dm4(h5Var.d(132), h5Var.d(685), h5Var.d(146), h5Var.d(116), h5Var.d(537));
            case 11:
                return new pzd((gjf) h5Var.c(97), (Context) h5Var.c(7), h5Var.d(463), h5Var.d(69), h5Var.d(75));
            case 12:
                return new zob(h5Var.d(157));
            case 13:
                return new t83(h5Var.d(578), h5Var.d(579), h5Var.d(HttpStatus.SC_REQUEST_TIMEOUT), h5Var.d(101), h5Var.d(144), h5Var.d(69), h5Var.d(678), h5Var.d(139), (ha9) h5Var.c(30), (Context) h5Var.c(7));
            case 14:
                return (onf) h5Var.c(461);
            case 15:
                return new na9((Context) h5Var.c(7), (zed) h5Var.c(101), (xhh) h5Var.c(23), h5Var.d(131), h5Var.d(219), h5Var.d(221), h5Var.d(678), h5Var.d(581), h5Var.d(429), h5Var.d(538));
            case 16:
                return new un6((Context) h5Var.c(7), (zed) h5Var.c(101), h5Var.d(538), h5Var.d(580), h5Var.d(HttpStatus.SC_REQUEST_TIMEOUT), h5Var.d(429), h5Var.d(131), h5Var.d(219), h5Var.d(678), h5Var.d(221), h5Var.d(353), h5Var.d(583), (xhh) h5Var.c(23));
            case 17:
                return new rob(h5Var.d(HttpStatus.SC_NOT_ACCEPTABLE), h5Var.d(23), h5Var.d(139));
            case 18:
                return new hnb((p4c) h5Var.c(353), h5Var.d(219), h5Var.d(85), h5Var.d(26), h5Var.d(583));
            case 19:
                return new ih4(h5Var.d(132), h5Var.d(85));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new woh(h5Var.d(582));
            case 21:
                h5Var.d(138);
                h5Var.d(23);
                return new so2(29);
            case 22:
                return new wl7(h5Var.d(146), h5Var.d(320), h5Var.d(525));
            case 23:
                return ((u7f) h5Var.c(343)).a();
            case 24:
                return new dr6(h5Var.d(205), h5Var.d(23), h5Var.d(97), h5Var.d(90), (Context) h5Var.c(7));
            case 25:
                return new od4(h5Var.d(101), h5Var.d(69), h5Var.d(75), h5Var.d(84), h5Var.d(24), h5Var.d(325));
            case 26:
                return new gm7(h5Var.d(146), h5Var.d(97), h5Var.d(219), h5Var.d(480), h5Var.d(537), h5Var.d(116));
            case 27:
                return new qyf(new px8(false), h5Var.d(116), h5Var.d(205), h5Var.d(290), h5Var.d(136), h5Var.d(18), h5Var.d(26));
            case 28:
                return new iae(h5Var.d(131), h5Var.d(132), h5Var.d(23));
            default:
                return new pja(h5Var.d(26), h5Var.d(136), h5Var.d(85), h5Var.d(114), (ite) h5Var.c(90), h5Var.d(525), h5Var.d(144));
        }
    }
}
