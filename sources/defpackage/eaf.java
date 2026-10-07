package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class eaf extends kpe {
    public final /* synthetic */ int b;

    public /* synthetic */ eaf(int i) {
        this.b = i;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new j7c(h5Var.d(133), h5Var.d(353));
            case 1:
                return new xk7(h5Var.d(168), h5Var.d(85), h5Var.d(348));
            case 2:
                return new kpd((t51) h5Var.c(116), h5Var.d(23));
            case 3:
                return new tvf(h5Var.d(157));
            case 4:
                return new ge0(h5Var.d(146), h5Var.d(246));
            case 5:
                return new vne(h5Var.d(325), h5Var.d(326), h5Var.d(146), h5Var.d(24), h5Var.d(324), h5Var.d(26), h5Var.d(23), h5Var.d(90));
            case 6:
                return new fc9(h5Var.d(7), h5Var.d(69), h5Var.d(85), h5Var.d(78), h5Var.d(327), h5Var.d(329), h5Var.d(HttpStatus.SC_NOT_MODIFIED));
            case 7:
                return new tc9(h5Var.d(327), h5Var.d(329), h5Var.d(78), (Context) h5Var.c(7));
            case 8:
                return new pc9(h5Var.d(157));
            case 9:
                return new eg0(h5Var.d(157));
            case 10:
                return new lqe(h5Var.d(161), h5Var.d(162), h5Var.d(90), h5Var.d(179), h5Var.d(23));
            case 11:
                return new dzf(h5Var.d(157), h5Var.d(85));
            case 12:
                return new rv4((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 13:
                return new hxc((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 14:
                return new ri8(h5Var.d(157), h5Var.d(163), h5Var.d(82), (Context) h5Var.c(7));
            case 15:
                return new eog(h5Var.d(362), h5Var.d(363), (vdh) h5Var.c(355), (xhh) h5Var.c(23));
            case 16:
                return new apg((eog) h5Var.c(359), (xhh) h5Var.c(23), h5Var.d(358), h5Var.d(290), h5Var.d(18), h5Var.d(85), h5Var.d(157));
            case 17:
                return new nzg(h5Var.d(288), h5Var.d(23), h5Var.d(267), h5Var.d(268));
            case 18:
                return new b3h(h5Var.d(289), h5Var.d(23), h5Var.d(268), h5Var.d(267));
            case 19:
                return new u1h(h5Var.d(266), h5Var.d(23), h5Var.d(267), h5Var.d(268));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ahf(h5Var.d(290), h5Var.d(144), h5Var.d(291), h5Var.d(23));
            case 21:
                return new n0h();
            case 22:
                return new b0h();
            case 23:
                return new nj4(h5Var.d(287), h5Var.d(269), (wmi) h5Var.c(139));
            case 24:
                return new op3(h5Var.d(26));
            case 25:
                return new v99(h5Var.d(23), h5Var.d(187), (Context) h5Var.c(7));
            case 26:
                return new cm0(h5Var.d(23), h5Var.d(88));
            case 27:
                return new u99(h5Var.d(23), h5Var.d(187));
            case 28:
                return new lp3(((e5d) h5Var.c(26)).C3.a(e5d.S6[238]));
            default:
                return new zl7(h5Var.d(146), h5Var.d(1034));
        }
    }
}
