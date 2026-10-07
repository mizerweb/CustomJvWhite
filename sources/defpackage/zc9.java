package defpackage;

import android.content.Context;
import com.vk.push.core.base.AidlException;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* JADX INFO: loaded from: classes.dex */
public final class zc9 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ zc9(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                ifh ifhVarD = h5Var.d(760);
                ifh ifhVarD2 = h5Var.d(316);
                ifh ifhVarD3 = h5Var.d(34);
                ifh ifhVarD4 = h5Var.d(121);
                ifh ifhVarD5 = h5Var.d(23);
                ifh ifhVarD6 = h5Var.d(7);
                ifh ifhVarD7 = h5Var.d(85);
                ifh ifhVarD8 = h5Var.d(353);
                return new z2g(ifhVarD6, ifhVarD7, ifhVarD, ifhVarD4, ifhVarD3, h5Var.d(132), h5Var.d(136), h5Var.d(157), ifhVarD8, ifhVarD5, ifhVarD2);
            case 1:
                return new rb4(h5Var.d(26), h5Var.d(397), h5Var.d(816), h5Var.d(817), h5Var.d(23), h5Var.d(24), h5Var.d(87), h5Var.d(95), h5Var.d(345));
            case 2:
                nh8 nh8Var = (nh8) h5Var.c(345);
                ifh ifhVarD9 = h5Var.d(87);
                ifh ifhVarD10 = h5Var.d(7);
                return new ci8(h5Var.d(817), nh8Var, h5Var.d(23), h5Var.d(24), ifhVarD9, ifhVarD10, h5Var.d(327), h5Var.d(174));
            case 3:
                ifh ifhVarD11 = h5Var.d(24);
                ifh ifhVarD12 = h5Var.d(397);
                ifh ifhVarD13 = h5Var.d(815);
                ifh ifhVarB = h5Var.b(8);
                ifh ifhVarD14 = h5Var.d(132);
                ifh ifhVarD15 = h5Var.d(809);
                ifh ifhVarD16 = h5Var.d(7);
                ifh ifhVarD17 = h5Var.d(23);
                ifh ifhVarD18 = h5Var.d(34);
                ifh ifhVarD19 = h5Var.d(97);
                ifh ifhVarD20 = h5Var.d(316);
                return new yeb(ifhVarD13, ifhVarD12, ifhVarD17, ifhVarD11, ifhVarD18, h5Var.d(179), ifhVarD16, ifhVarD19, h5Var.d(146), ifhVarD20, ifhVarD14, ifhVarD15, ifhVarB, h5Var.d(26), h5Var.d(np0.o));
            case 4:
                return new eeb(h5Var.d(108), h5Var.d(23));
            case 5:
                return new foe(h5Var.d(26), h5Var.d(157), h5Var.d(231));
            case 6:
                return new ld0(h5Var.d(108), h5Var.d(168));
            case 7:
                return new vd0(h5Var.d(108), h5Var.d(168));
            case 8:
                return new le0(h5Var.d(108), h5Var.d(326), h5Var.d(AidlException.HOST_IS_NOT_MASTER));
            case 9:
                return pk9.c;
            case 10:
                return new lec(((Context) h5Var.c(7)).getApplicationContext(), "exoplayer_internal.db", null, 1, 1);
            case 11:
                return new t90(h5Var.d(157), h5Var.d(24), h5Var.d(81), (xhh) h5Var.c(23), (ite) h5Var.c(90));
            case 12:
                return new ct9(h5Var.d(136), h5Var.d(137));
            case 13:
                return new tr6(h5Var.d(127), h5Var.d(138), h5Var.d(139), h5Var.d(23));
            case 14:
                return new wa0(h5Var.d(85), h5Var.d(54));
            case 15:
                return new m80(h5Var.d(129), h5Var.d(136), h5Var.d(144), h5Var.d(145), h5Var.d(146), h5Var.d(54), h5Var.d(139));
            case 16:
                ifh ifhVarD21 = h5Var.d(26);
                ifh ifhVarD22 = h5Var.d(161);
                ifh ifhVarD23 = h5Var.d(138);
                ifh ifhVarD24 = h5Var.d(260);
                ifh ifhVarD25 = h5Var.d(136);
                xhh xhhVar = (xhh) h5Var.c(23);
                wmi wmiVar = (wmi) h5Var.c(139);
                e9 e9Var = (e9) h5Var.c(261);
                return new dg0(h5Var.d(85), ifhVarD22, ifhVarD21, ifhVarD23, ifhVarD24, ifhVarD25, h5Var.d(144), h5Var.d(257), h5Var.d(258), e9Var, h5Var.d(259), wmiVar, xhhVar);
            case 17:
                return new fz9(h5Var.d(161), h5Var.d(312), (b56) h5Var.c(322));
            case 18:
                return new h1e(h5Var.d(53), h5Var.d(54));
            case 19:
                return new xv9(h5Var.e(51), h5Var.d(23));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new x2j(h5Var.e(51));
            case 21:
                return new o9a();
            case 22:
                ifh ifhVarD26 = h5Var.d(132);
                return new w9a((z8a) h5Var.c(755), h5Var.d(23), ifhVarD26);
            case 23:
                return new raa((gjf) h5Var.c(97), (et3) h5Var.c(85), (xhh) h5Var.c(23), h5Var.d(144), h5Var.d(136), h5Var.d(168), h5Var.d(480), h5Var.d(588), h5Var.d(585), h5Var.d(479), h5Var.d(227), (yt) h5Var.c(870));
            case 24:
                return new ksa((xhh) h5Var.c(23), (u3d) h5Var.c(878), (xn3) h5Var.c(144), (evj) h5Var.c(879), (cn9) h5Var.c(880), (jt4) h5Var.c(881), (qgf) h5Var.c(882), (et3) h5Var.c(85), (nni) h5Var.c(161), (wo6) h5Var.c(54), (o50) h5Var.c(883), (k76) h5Var.c(884), (gva) h5Var.c(885), h5Var.d(146), h5Var.d(316), h5Var.d(70), h5Var.d(97), h5Var.d(132), h5Var.d(377), h5Var.d(484), h5Var.d(136), h5Var.d(612), h5Var.d(613), h5Var.d(614), h5Var.d(499), h5Var.d(616), h5Var.d(615), h5Var.d(610), h5Var.d(500), h5Var.d(UploadConfig.DEFAULT_MAX_EVENT_COUNT), h5Var.d(611), h5Var.d(525), h5Var.d(296), h5Var.d(618), h5Var.d(290), h5Var.d(213), h5Var.d(216), h5Var.d(312), h5Var.d(218), h5Var.d(538), h5Var.d(236), h5Var.d(886), h5Var.d(48), h5Var.d(116), h5Var.d(239), h5Var.d(510), h5Var.d(887), h5Var.d(888), h5Var.d(889), h5Var.d(214), h5Var.d(18), h5Var.d(617), h5Var.d(139), h5Var.d(157), h5Var.d(890), h5Var.d(891), h5Var.d(892), h5Var.d(597), h5Var.d(594), h5Var.d(595), h5Var.d(714), h5Var.g(), h5Var.d(645), h5Var.d(662), h5Var.d(540), h5Var.d(893), h5Var.d(344), h5Var.d(348), h5Var.d(894), h5Var.d(250), h5Var.d(641), h5Var.d(895), h5Var.d(896), h5Var.d(273), h5Var.d(26), h5Var.d(np0.n), h5Var.d(897), h5Var.d(647), h5Var.d(116), h5Var.d(898));
            case 25:
                return new lua(h5Var.d(116), h5Var.d(144), (gjf) h5Var.c(97), (i6e) h5Var.c(321), (Context) h5Var.c(7), h5Var.d(687), h5Var.d(324), h5Var.d(325), h5Var.d(599), h5Var.d(598), h5Var.d(591), h5Var.d(320), h5Var.d(312), h5Var.d(48), h5Var.d(90));
            case 26:
                return new gva((cm7) h5Var.c(900), h5Var.d(85), h5Var.d(509));
            case 27:
                return new l6b((Context) h5Var.c(7));
            case 28:
                return new lob((u7f) h5Var.c(343), h5Var.d(161), h5Var.d(26), h5Var.d(146), h5Var.d(23), h5Var.d(662), h5Var.d(162), h5Var.d(143), h5Var.d(339), h5Var.d(34));
            default:
                return new kub();
        }
    }
}
