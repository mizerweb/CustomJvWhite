package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class pwb implements si8 {
    public final /* synthetic */ int a;

    public /* synthetic */ pwb(int i) {
        this.a = i;
    }

    @Override // defpackage.si8
    public final Object a(h5 h5Var) {
        switch (this.a) {
            case 0:
                return ((c1c) h5Var.c(1094)).c();
            case 1:
                return new ns3(h5Var.d(100), h5Var.d(85), h5Var.d(101), h5Var.d(451), h5Var.d(356), h5Var.d(357), h5Var.d(358), h5Var.d(312), h5Var.d(662), h5Var.d(470), h5Var.d(561), h5Var.d(533), h5Var.d(562), h5Var.d(315), h5Var.d(23), h5Var.d(289), h5Var.d(127), h5Var.d(260));
            case 2:
                xhh xhhVar = (xhh) h5Var.c(23);
                svb svbVar = (svb) h5Var.c(100);
                nni nniVar = (nni) h5Var.c(161);
                ifh ifhVarD = h5Var.d(132);
                ifh ifhVarD2 = h5Var.d(456);
                ifh ifhVarD3 = h5Var.d(90);
                return new i09(svbVar, nniVar, ifhVarD, ifhVarD2, h5Var.d(565), h5Var.d(450), h5Var.d(458), ifhVarD3, h5Var.d(447), xhhVar);
            case 3:
                ifh ifhVarD4 = h5Var.d(54);
                ifh ifhVarD5 = h5Var.d(23);
                ifh ifhVarD6 = h5Var.d(157);
                ifh ifhVarD7 = h5Var.d(7);
                ifh ifhVarD8 = h5Var.d(24);
                ifh ifhVarD9 = h5Var.d(220);
                return new tz7(h5Var.d(69), ifhVarD5, h5Var.d(325), h5Var.d(341), ifhVarD9, ifhVarD8, ifhVarD7, ifhVarD6, ifhVarD4, (a2c) h5Var.c(27));
            case 4:
                return new mbj(((krc) h5Var.c(9)).a, h5Var.d(24));
            case 5:
                return new nh8(h5Var.d(344), h5Var.d(348), h5Var.d(23), (Context) h5Var.c(7));
            case 6:
                et3 et3Var = (et3) h5Var.c(85);
                return new va9(new xnh("OneVideo: отображение debug info у видео"), new jc1(et3Var, 8), new hj5(et3Var, 3), R.drawable.icon_smile_happy, 16);
            case 7:
                return new dti(h5Var.d(157), h5Var.d(24), (xhh) h5Var.c(23), (ite) h5Var.c(90));
            case 8:
                return new bjd(h5Var.d(36));
            case 9:
                return jad.a;
            case 10:
                h5Var.d(54);
                return new jmd(0);
            case 11:
                et3 et3Var2 = (et3) h5Var.c(85);
                return new va9(new xnh("Отображение debug info в профиле"), new jc1(et3Var2, 9), new hj5(et3Var2, 4), R.drawable.icon_smile_happy, 16);
            case 12:
                ifh ifhVarD10 = h5Var.d(97);
                ifh ifhVarD11 = h5Var.d(54);
                ifh ifhVarD12 = h5Var.d(377);
                ifh ifhVarD13 = h5Var.d(85);
                return new pbf(h5Var.d(353), h5Var.d(348), ifhVarD13, ifhVarD10, ifhVarD11, h5Var.d(26), ifhVarD12, h5Var.d(344));
            case 13:
                return new fh5(h5Var.d(146));
            case 14:
                return new gh5(h5Var.d(146));
            case 15:
                return new lnd(h5Var.d(97));
            case 16:
                return new ssd(h5Var.d(479), h5Var.d(480), h5Var.d(132), h5Var.d(377), h5Var.d(85), h5Var.d(97));
            case 17:
                return j0e.b;
            case 18:
                return new i7f(h5Var);
            case 19:
                return (hh9) h5Var.c(497);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return (hh9) h5Var.c(227);
            case 21:
                return (hh9) h5Var.c(226);
            case 22:
                return (hh9) h5Var.c(546);
            case 23:
                return (hh9) h5Var.c(580);
            case 24:
                return (cs3) h5Var.c(566);
            case 25:
                return (hh9) h5Var.c(601);
            case 26:
                return (hh9) h5Var.c(629);
            case 27:
                return new wei(h5Var.d(146), h5Var.d(161), h5Var.d(23), h5Var.d(670), h5Var.d(144), h5Var.d(481), h5Var.d(169));
            case 28:
                return new mfi(h5Var.d(146), h5Var.d(161), h5Var.d(23));
            default:
                return new ve3(h5Var.d(146), h5Var.d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED), h5Var.d(226), h5Var.d(205), h5Var.d(634));
        }
    }
}
