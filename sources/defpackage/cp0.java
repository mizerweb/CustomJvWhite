package defpackage;

import android.app.Application;
import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends kpe {
    public final /* synthetic */ int b;

    public /* synthetic */ cp0(int i) {
        this.b = i;
    }

    @Override // defpackage.kpe
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new ym4(0);
            case 1:
                return new uo0((Application) h5Var.c(70), (t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 2:
                return new ym4(2);
            case 3:
                return new ku1(h5Var.d(107), h5Var.d(132), h5Var.d(26));
            case 4:
                return new j02(h5Var.d(236));
            case 5:
                return new k02(h5Var.d(711));
            case 6:
                return new os4(h5Var.d(54));
            case 7:
                return new zcd((gm7) h5Var.c(588));
            case 8:
                return new y92(h5Var.d(HttpStatus.SC_GONE), h5Var.d(157), (Context) h5Var.c(7), (xhh) h5Var.c(23));
            case 9:
                return new tm4(h5Var.d(107), h5Var.d(132), h5Var.d(227), h5Var.d(23));
            case 10:
                return new hs1(h5Var.d(706), h5Var.d(734), h5Var.d(107), h5Var.d(139), h5Var.d(23), h5Var.d(7));
            case 11:
                b95 b95Var = (b95) h5Var.c(107);
                rd1 rd1Var = (rd1) h5Var.c(55);
                zb1 zb1Var = (zb1) h5Var.c(56);
                bxd bxdVar = (bxd) h5Var.c(106);
                z3f z3fVar = (z3f) h5Var.c(63);
                fa2 fa2Var = (fa2) h5Var.c(62);
                ifh ifhVarD = h5Var.d(236);
                return new w82(b95Var, zb1Var, rd1Var, fa2Var, z3fVar, bxdVar, (y82) h5Var.c(65), (da1) h5Var.c(717), (to1) h5Var.c(716), (wd4) h5Var.c(24), ifhVarD, (xhh) h5Var.c(23), h5Var.d(54), h5Var.d(26));
            case 12:
                return new p32(h5Var.d(174), h5Var.d(168), (Context) h5Var.c(7));
            case 13:
                return new u42((w82) h5Var.c(839), (b95) h5Var.c(107), h5Var.d(236), h5Var.d(144), h5Var.d(717));
            case 14:
                return new xc();
            case 15:
                return new msc(h5Var.d(34));
            case 16:
                return new ce1((Context) h5Var.c(7));
            case 17:
                return new xl1(h5Var.d(157));
            case 18:
                return new bm1((Context) h5Var.c(7), (jcd) h5Var.c(377));
            case 19:
                return new j92(h5Var.d(485), (bm1) h5Var.c(779), h5Var.d(377));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new co1((Context) h5Var.c(7));
            case 21:
                return ((Boolean) ((e5d) h5Var.c(26)).c().i()).booleanValue() ? new pfb(h5Var.d(23), h5Var.d(146), h5Var.d(602), 0) : new pfb(h5Var.d(290), h5Var.d(23), h5Var.d(146), 1);
            case 22:
                return new ofb(h5Var.d(144), h5Var.d(85), h5Var.d(485), h5Var.d(377), (bm1) h5Var.c(779));
            case 23:
                return new l12();
            case 24:
                return new av1((wsc) h5Var.c(34), (osc) h5Var.c(141), (et3) h5Var.c(85), h5Var.d(142), h5Var.d(147));
            case 25:
                return new ut7(h5Var.d(136), h5Var.d(23));
            case 26:
                return new dpa(h5Var.d(144), h5Var.d(136), h5Var.d(486));
            case 27:
                return new cq8(h5Var.d(146), h5Var.d(144));
            case 28:
                return new iva(h5Var.d(23), h5Var.d(290), h5Var.d(1059), h5Var.d(1046), h5Var.d(291));
            default:
                return new n34(h5Var.d(23), h5Var.d(290), h5Var.d(291));
        }
    }
}
