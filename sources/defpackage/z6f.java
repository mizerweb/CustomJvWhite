package defpackage;

import android.content.res.Resources;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class z6f extends kpe {
    public final /* synthetic */ int b;

    public /* synthetic */ z6f(int i) {
        this.b = i;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new sch(h5Var.d(290), h5Var.d(144));
            case 1:
                return new zk6((wo6) h5Var.c(54), (e5d) h5Var.c(26), (pk5) h5Var.c(88));
            case 2:
                return new da4(h5Var.d(116), (xhh) h5Var.c(23));
            case 3:
                return new afi(h5Var.d(146), h5Var.d(161), h5Var.d(23), h5Var.d(205));
            case 4:
                return new bfi(h5Var.d(146), h5Var.d(161), h5Var.d(23), h5Var.d(205));
            case 5:
                return new rkb(h5Var.d(168), h5Var.d(537));
            case 6:
                return new l7f(h5Var);
            case 7:
                return new ari();
            case 8:
                return new fe3(h5Var.d(146), h5Var.d(144), h5Var.d(23), h5Var.d(205));
            case 9:
                return new o54((yt4) h5Var.c(48), h5Var.d(146), h5Var.d(HttpStatus.SC_SEE_OTHER), h5Var.d(85), (xhh) h5Var.c(23));
            case 10:
                return new yy2(h5Var.d(146), h5Var.d(144), h5Var.d(23), h5Var.d(205));
            case 11:
                return new dh3((Resources) h5Var.c(688), h5Var.d(24));
            case 12:
                return new afh(h5Var.d(97), h5Var.d(222), h5Var.d(139), h5Var.d(21));
            case 13:
                return new eei(h5Var.d(144), h5Var.d(85), h5Var.d(638), (l7f) h5Var.c(229));
            case 14:
                return new iei(h5Var.d(144), (l7f) h5Var.c(229));
            case 15:
                return new gei(h5Var.d(144), h5Var.d(85), h5Var.d(136), (l7f) h5Var.c(229), h5Var.d(638), h5Var.d(636), h5Var.d(204), h5Var.d(26));
            case 16:
                return new lei(h5Var.d(144), h5Var.d(540), (l7f) h5Var.c(229));
            case 17:
                return new cic(h5Var.d(624), h5Var.d(146), h5Var.d(139), h5Var.d(23));
            case 18:
                return new hp0(h5Var.d(146), h5Var.d(139), h5Var.d(205), h5Var.d(311), h5Var.d(312), h5Var.d(85), h5Var.d(558));
            case 19:
                return new ykb(h5Var.d(136), h5Var.d(23), h5Var.d(144), h5Var.d(644));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return (yfd) h5Var.c(480);
            case 21:
                return new wkb();
            case 22:
                return (wkb) h5Var.c(644);
            case 23:
                return new pei(h5Var.d(434));
            case 24:
                return new oz5(h5Var.d(291), h5Var.d(144), h5Var.d(228), h5Var.d(290));
            case 25:
                return new ki8(h5Var.d(434), h5Var.d(300), h5Var.d(77), h5Var.d(54), h5Var.d(320), h5Var.d(487));
            case 26:
                return new ngf(h5Var.d(146), h5Var.d(228), h5Var.d(526), h5Var.d(320), h5Var.d(325), h5Var.d(139));
            case 27:
                return new mj2(h5Var.d(146), h5Var.d(325), h5Var.d(228), h5Var.d(526));
            case 28:
                return new zu6(h5Var.d(348));
            default:
                return new z7f(h5Var.d(749), h5Var.d(168), h5Var.d(85));
        }
    }
}
