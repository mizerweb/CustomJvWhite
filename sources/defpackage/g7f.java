package defpackage;

import android.app.Application;
import android.content.Context;
import com.vk.push.core.base.AidlException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes.dex */
public final class g7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ g7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new uz5((qfa) h5Var.c(221), (qw2) h5Var.c(131), (b) h5Var.c(481), (t51) h5Var.c(116), (et3) h5Var.c(85));
            case 1:
                return new ygg(h5Var.d(221), h5Var.d(516));
            case 2:
                return ((gih) h5Var.c(156)).a();
            case 3:
                ifh ifhVarD = h5Var.d(5);
                return new gih((umi) h5Var.c(77), (wxb) h5Var.c(82), (gjf) h5Var.c(97), new ifh(new ic1(h5Var, 19)), new ifh(new h7f(ifhVarD, 0)), new ifh(new h7f(ifhVarD, 1)), new ifh(new h7f(ifhVarD, 2)), h5Var.d(4));
            case 4:
                return new hcb((gue) h5Var.c(69), (wxb) h5Var.c(82), (zed) h5Var.c(101), (wd4) h5Var.c(24), (w69) h5Var.c(220));
            case 5:
                return new m40(h5Var.d(538), h5Var.d(221), h5Var.d(318), h5Var.d(116), h5Var.d(294));
            case 6:
                return new qja(h5Var.d(144), h5Var.d(116), h5Var.d(136), h5Var.d(320), h5Var.d(85));
            case 7:
                return new hz3(h5Var.d(144), h5Var.d(647), h5Var.d(228), h5Var.d(320), h5Var.d(85));
            case 8:
                return new i8e(h5Var.d(146), h5Var.d(101), h5Var.d(131), h5Var.d(139), h5Var.d(23), h5Var.d(324), h5Var.d(221), h5Var.d(640), h5Var.d(662), h5Var.d(540));
            case 9:
                return new js3(h5Var.d(131), h5Var.d(662));
            case 10:
                ifh ifhVarD2 = h5Var.d(131);
                ifh ifhVarD3 = h5Var.d(662);
                ifh ifhVarD4 = h5Var.d(541);
                return new sie(ifhVarD2, ifhVarD3, ifhVarD4);
            case 11:
                return new yt2(h5Var.d(144), h5Var.d(226), h5Var.d(85), h5Var.d(97), h5Var.d(377));
            case 12:
                return new tj4(h5Var.d(116), h5Var.d(219), h5Var.d(537), h5Var.d(641), h5Var.d(658));
            case 13:
                return new kz2((qw2) h5Var.c(131), (qfa) h5Var.c(221), (zed) h5Var.c(101), (wzj) h5Var.c(290), (h5c) h5Var.c(662), (t51) h5Var.c(116), (okh) h5Var.c(458));
            case 14:
                return new ika((gu4) h5Var.c(139), h5Var.d(442), h5Var.d(100), h5Var.d(27), h5Var.d(516));
            case 15:
                ifh ifhVarD5 = h5Var.d(24);
                gjf gjfVar = (gjf) h5Var.c(97);
                xe4 xe4Var = new xe4();
                xe4Var.a = gjfVar;
                xe4Var.b = ifhVarD5;
                xe4Var.c = new AtomicInteger(0);
                xe4Var.d = new AtomicReference(we4.TYPE_UNKNOWN);
                xe4Var.e = new ifh(new i94(9));
                xe4Var.f = new ifh(new d2(13, xe4Var));
                lhb lhbVar = kfc.c;
                xe4Var.g = new short[]{6, 17, 18, 19, 23, 101, 107, 108, 112, 113, 115};
                t3a t3aVar = new t3a();
                uih uihVar = (uih) h5Var.c(468);
                tih tihVar = uihVar instanceof tih ? (tih) uihVar : null;
                if (tihVar == null) {
                    tihVar = new tih(uihVar);
                }
                t3aVar.a = tihVar;
                wo6 wo6Var = (wo6) h5Var.c(54);
                hcb hcbVar = (hcb) h5Var.c(460);
                xd5 xd5Var = (xd5) h5Var.c(5);
                vo5 vo5Var = (vo5) h5Var.c(341);
                b5d b5dVar = ((f5d) wo6Var).a.E3;
                zv8[] zv8VarArr = e5d.S6;
                f5d f5dVar = (f5d) wo6Var;
                return new gl6(hcbVar, xd5Var, xe4Var, vo5Var, t3aVar, ((Boolean) f5dVar.a.G3.a(zv8VarArr[242]).i()).booleanValue(), new ic1(h5Var, 20), ((Boolean) b5dVar.a(zv8VarArr[240]).i()).booleanValue(), f5dVar.z());
            case 16:
                return new l8f((Context) h5Var.c(7), h5Var.d(131), h5Var.d(132), h5Var.d(133), h5Var.d(134), h5Var.d(135));
            case 17:
                return new w8f(h5Var.d(114), h5Var.d(87));
            case 18:
                return new d9f(h5Var.d(114), h5Var.d(87));
            case 19:
                return new vca();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new cpf((l7f) h5Var.c(229), (ha9) h5Var.c(30), h5Var.d(101), h5Var.d(343), (xk7) h5Var.c(905), (im7) h5Var.c(175), (kpd) h5Var.c(906), h5Var.d(23), h5Var.d(34), (Application) h5Var.c(70), h5Var.d(179), h5Var.d(146), (utd) h5Var.c(168), h5Var.d(144), h5Var.d(769), h5Var.d(702), h5Var.d(54), h5Var.d(26), h5Var.d(48), h5Var.d(189), h5Var.d(907), h5Var.d(143), h5Var.d(np0.o), h5Var.d(174), h5Var.d(171));
            case 21:
                return new jpf(h5Var.d(23), h5Var.d(161));
            case 22:
                return new hqf(h5Var.d(85), h5Var.d(386), h5Var.d(161));
            case 23:
                return new yqf(h5Var.d(23), h5Var.d(160), h5Var.d(309), h5Var.d(26));
            case 24:
                return new crf(h5Var.d(146), h5Var.d(132), h5Var.d(144), h5Var.d(134), h5Var.d(376), h5Var.d(377), h5Var.d(23));
            case 25:
                return new rrf(h5Var.d(146), h5Var.d(23), h5Var.d(74), h5Var.d(34), h5Var.d(808), h5Var.d(246), h5Var.d(26));
            case 26:
                return new fuf((Context) h5Var.c(7), h5Var.d(23), h5Var.d(159), h5Var.d(160), h5Var.d(26), h5Var.d(315), h5Var.d(85), h5Var.d(34), h5Var.d(81));
            case 27:
                return new hvf((xhh) h5Var.c(23), h5Var.d(160), h5Var.d(85), h5Var.d(54), h5Var.d(26), h5Var.d(146), (da4) h5Var.c(369), h5Var.d(370), h5Var.d(371), h5Var.d(372), h5Var.d(373), h5Var.d(374), h5Var.d(168));
            case 28:
                return new lwf(h5Var.d(23), h5Var.d(315), h5Var.d(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION), h5Var.d(127), (Context) h5Var.c(7));
            default:
                return new owf(h5Var.d(23), h5Var.d(48));
        }
    }
}
