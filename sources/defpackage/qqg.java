package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class qqg extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ qqg(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = 1;
        int i2 = 9;
        int i3 = 0;
        switch (this.b) {
            case 0:
                return new xk2();
            case 1:
                return new q7g(h5Var.d(266), h5Var.d(271), h5Var.d(267));
            case 2:
                return new g1h(h5Var.d(292), h5Var.d(267), h5Var.d(268));
            case 3:
                e5d e5dVar = (e5d) h5Var.c(26);
                return new jk3((wmi) h5Var.c(139), h5Var.d(266), h5Var.d(271), new wqg(e5dVar, i3), e5dVar.r());
            case 4:
                return new ssg(h5Var.d(146));
            case 5:
                return new i2h(new t2g(i2, (e5d) h5Var.c(26)));
            case 6:
                return new aj5(h5Var.d(264), h5Var.d(271), h5Var.d(227), h5Var.d(132), h5Var.d(265));
            case 7:
                return new erg(h5Var.d(85), h5Var.d(284), h5Var.d(272));
            case 8:
                return new ltg(h5Var.d(285), h5Var.d(23));
            case 9:
                return (aj5) h5Var.c(266);
            case 10:
                return new vzg((wmi) h5Var.c(139), (aj5) h5Var.c(266), (erg) h5Var.c(267), h5Var.d(286), h5Var.d(287), h5Var.d(85), h5Var.d(132));
            case 11:
                return new asg(new wqg((e5d) h5Var.c(26), i));
            case 12:
                return new twg();
            case 13:
                return new jug((xhh) h5Var.c(23), h5Var.d(85), h5Var.d(144), h5Var.d(281), h5Var.d(287), h5Var.d(286), h5Var.d(270), (cg9) h5Var.c(619), h5Var.d(279), h5Var.d(950), h5Var.d(139));
            case 14:
                drc drcVar = new drc();
                drcVar.e = (rrc) h5Var.c(8);
                krc krcVar = (krc) h5Var.c(9);
                drcVar.d = krcVar != null ? krcVar.a : null;
                drcVar.f = (exb) h5Var.c(10);
                drcVar.e((zqc) h5Var.c(11));
                drcVar.b("open_story_viewer_to_render");
                drcVar.b = new bsc(new xyh());
                drcVar.c();
                drcVar.d(new s03(h5Var.d(0), (rrc) h5Var.c(8), 1));
                drcVar.f(h5Var.a(0));
                return new t3h(drcVar.a());
            case 15:
                return new oug();
            case 16:
                return new kvg((vzg) h5Var.c(270), (xhh) h5Var.c(23), (oug) h5Var.c(952), (et3) h5Var.c(85), (t3h) h5Var.c(953));
            case 17:
                return new wvg(h5Var.d(23), h5Var.d(269), (q7g) h5Var.c(273), (ahf) h5Var.c(277));
            case 18:
                return new q0h(h5Var.d(279), h5Var.d(278), h5Var.d(23));
            case 19:
                return new id9();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new pwh();
            case 21:
                return new loh();
            case 22:
                return new nm0(h5Var.d(188), h5Var.d(23), h5Var.d(139), (Context) h5Var.c(7));
            case 23:
                return new wph(h5Var.d(189), h5Var.d(23));
            case 24:
                return new p18(new i3c(h5Var.d(122), h5Var.d(17), h5Var.d(36), (u1i) h5Var.c(689), h5Var.d(0), h5Var.d(85), h5Var.d(26)));
            case 25:
                return new czh(new am5());
            case 26:
                return new nd4(h5Var.d(27), h5Var.d(139));
            case 27:
                return new ouh(h5Var.d(697), h5Var.d(341), h5Var.d(4), h5Var.d(698), h5Var.d(701));
            case 28:
                return new puh(h5Var.d(699));
            default:
                return new u1i(h5Var.d(205), h5Var.d(24), new ifh(new t2g(21, h5Var.d(77))), h5Var.d(138), h5Var.d(318), h5Var.d(443), h5Var.d(85));
        }
    }
}
