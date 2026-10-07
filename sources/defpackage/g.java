package defpackage;

import android.app.Application;
import android.content.Context;
import com.vk.push.core.base.AidlException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                wzj wzjVar = (wzj) h5Var.c(290);
                return new z(h5Var.d(82), (e5d) h5Var.c(26), (xn3) h5Var.c(144), wzjVar);
            case 1:
                return new r5((tci) h5Var.c(170), h5Var.d(144), h5Var.d(85), (yt0) h5Var.c(903), (svb) h5Var.c(100), h5Var.d(23));
            case 2:
                return new svb(h5Var.d(101), h5Var.d(102));
            case 3:
                return new xb(h5Var.d(792));
            case 4:
                return new ed((xc) h5Var.c(846), h5Var.d(717), h5Var.d(839), h5Var.d(23));
            case 5:
                return new zid();
            case 6:
                ifh ifhVarD = h5Var.d(45);
                Context context = (Context) h5Var.c(7);
                trc trcVar = (trc) h5Var.c(46);
                qv0 qv0Var = ((mba) h5Var.c(47)).a;
                ifh ifhVarD2 = h5Var.d(26);
                xhh xhhVar = (xhh) h5Var.c(23);
                return new lba(qv0Var, (yt4) h5Var.c(48), ifhVarD2, ifhVarD, h5Var.d(38), h5Var.d(36), trcVar, xhhVar, context);
            case 7:
                return new tba(h5Var.b(1), h5Var.d(37));
            case 8:
                return new pcb((Context) h5Var.c(7));
            case 9:
                ifh ifhVarD3 = h5Var.d(26);
                qv0 qv0Var2 = ((nv0) h5Var.c(49)).a;
                trc trcVar2 = (trc) h5Var.c(46);
                Context context2 = (Context) h5Var.c(7);
                return new mv0(qv0Var2, (yt4) h5Var.c(48), ifhVarD3, h5Var.d(36), h5Var.d(42), h5Var.d(44), trcVar2, (xhh) h5Var.c(23), context2);
            case 10:
                return new rvb(h5Var.d(114), h5Var.d(115));
            case 11:
                return new uyb(h5Var.d(114), h5Var.d(85), h5Var.d(100));
            case 12:
                return new rzb(h5Var.d(114));
            case 13:
                return new a6c(h5Var.d(114));
            case 14:
                h5Var.d(114);
                return new ku8();
            case 15:
                return new wt(h5Var);
            case 16:
                return new og8(h5Var.d(157), h5Var.d(220));
            case 17:
                return new j0f(h5Var.d(294), h5Var.d(138), h5Var.d(54), h5Var.d(23), h5Var.d(441), h5Var.d(139));
            case 18:
                Context context3 = (Context) h5Var.c(7);
                return new npa((pa4) h5Var.c(738), h5Var.d(922), h5Var.d(923), h5Var.d(178), context3, (wmi) h5Var.c(139));
            case 19:
                return new vvc((Context) h5Var.c(7));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new quc(h5Var.d(85), h5Var.d(538), h5Var.d(138), h5Var.d(924), (vvc) h5Var.c(909));
            case 21:
                return new gti((Context) h5Var.c(7), h5Var.d(924), h5Var.d(917), h5Var.d(161), h5Var.d(85), (vvc) h5Var.c(909));
            case 22:
                Context context4 = (Context) h5Var.c(7);
                ifh ifhVarD4 = h5Var.d(138);
                ifh ifhVarD5 = h5Var.d(294);
                ifh ifhVarD6 = h5Var.d(121);
                ifh ifhVarD7 = h5Var.d(582);
                ifh ifhVarD8 = h5Var.d(878);
                ifh ifhVarD9 = h5Var.d(883);
                return new a50(context4, ifhVarD4, ifhVarD8, ifhVarD5, ifhVarD6, ifhVarD7, h5Var.d(917), ifhVarD9, h5Var.d(918), h5Var.d(913), h5Var.d(54), h5Var.d(26), h5Var.d(161), h5Var.d(910), h5Var.d(911), h5Var.d(97), h5Var.d(132), h5Var.d(891), h5Var.d(129));
            case 23:
                return new mea(h5Var.d(178), h5Var.d(922), h5Var.d(353), h5Var.d(914), (Context) h5Var.c(7));
            case 24:
                return new l0c(h5Var.d(353), h5Var.d(486), h5Var.d(908), h5Var.d(132), h5Var.d(582), h5Var.d(481), (Context) h5Var.c(7), (a50) h5Var.c(912), (mea) h5Var.c(913), new t40(h5Var.d(161), h5Var.d(583), h5Var.d(85), h5Var.d(23), h5Var.d(7), h5Var.d(486), h5Var.d(582), h5Var.d(353), h5Var.d(669), h5Var.d(26)), h5Var.d(227), h5Var.d(924), h5Var.d(144), h5Var.d(919), h5Var.d(54), h5Var.d(669), h5Var.d(925), h5Var.d(377), h5Var.d(26));
            case 25:
                return new b2a(h5Var.d(886), h5Var.d(918), h5Var.d(AidlException.SDK_IS_NOT_INITIALIZED), h5Var.d(130), h5Var.d(144), h5Var.d(136), h5Var.d(915), h5Var.d(23), h5Var.d(926), h5Var.d(161), h5Var.d(48), (w7b) h5Var.c(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION));
            case 26:
                return (b2a) h5Var.c(887);
            case 27:
                ifh ifhVarD10 = h5Var.d(54);
                ifh ifhVarD11 = h5Var.d(23);
                ifh ifhVarD12 = h5Var.d(157);
                ifh ifhVarD13 = h5Var.d(353);
                ifh ifhVarD14 = h5Var.d(908);
                ifh ifhVarD15 = h5Var.d(219);
                ifh ifhVarD16 = h5Var.d(486);
                zed zedVar = (zed) h5Var.c(166);
                ifh ifhVarD17 = h5Var.d(101);
                ifh ifhVarD18 = h5Var.d(496);
                return new mv(zedVar, ifhVarD17, h5Var.d(7), ifhVarD18, ifhVarD16, ifhVarD15, ifhVarD14, ifhVarD11, ifhVarD13, ifhVarD12, h5Var.d(189), (o1c) h5Var.c(806), ifhVarD10);
            case 28:
                return new ka0((Context) h5Var.c(7), (w7b) h5Var.c(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION), (bxd) h5Var.c(106), h5Var.d(107));
            default:
                return new in0((Application) h5Var.c(70), h5Var.d(85), (e5d) h5Var.c(26), h5Var.d(334), h5Var.d(69), (ite) h5Var.c(90), (xhh) h5Var.c(23), h5Var.d(337), (eh9) h5Var.c(342));
        }
    }
}
