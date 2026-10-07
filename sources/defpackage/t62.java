package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* JADX INFO: loaded from: classes.dex */
public final class t62 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ t62(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new s62(h5Var.d(840), h5Var.d(717), h5Var.d(23));
            case 1:
                return new s91(h5Var.d(56), h5Var.d(107), h5Var.d(34), h5Var.d(236), h5Var.d(734), h5Var.d(1094), (ha9) h5Var.c(30));
            case 2:
                return new so1(h5Var.d(70), (ha9) h5Var.c(30));
            case 3:
                return new ym1((k42) h5Var.c(66), (hk6) h5Var.c(871), (zb1) h5Var.c(56), (l92) h5Var.c(60), (rd1) h5Var.c(55), h5Var.d(233), h5Var.d(64), h5Var.d(107), h5Var.d(23), h5Var.d(1094), h5Var.d(736), h5Var.g(), h5Var.d(874), h5Var.d(26), (ha9) h5Var.c(30));
            case 4:
                return new osc((e5d) h5Var.c(26), (et3) h5Var.c(85), h5Var.d(139));
            case 5:
                return new y82(h5Var.d(23), h5Var.d(48));
            case 6:
                return new pw1(h5Var.d(7));
            case 7:
                return new j12();
            case 8:
                return new b95((y82) h5Var.c(65), (j12) h5Var.c(741), h5Var.d(23), h5Var.d(91), h5Var.d(7), h5Var.d(734));
            case 9:
                return (b95) h5Var.c(747);
            case 10:
                return new c95(h5Var.d(7), h5Var.d(679));
            case 11:
                return new hq2(h5Var.d(23), (mv2) h5Var.c(819), (yh4) h5Var.c(820));
            case 12:
                return new ej9();
            case 13:
                return new i1c();
            case 14:
                return new zxi((gue) h5Var.c(69));
            case 15:
                e5d e5dVar = (e5d) h5Var.c(26);
                ifh ifhVarD = h5Var.d(144);
                ifh ifhVarD2 = h5Var.d(136);
                t51 t51Var = (t51) h5Var.c(116);
                ifh ifhVarD3 = h5Var.d(1002);
                ifh ifhVarD4 = h5Var.d(23);
                ifh ifhVarD5 = h5Var.d(54);
                ifh ifhVarD6 = h5Var.d(26);
                ifh ifhVarD7 = h5Var.d(377);
                ifh ifhVarD8 = h5Var.d(146);
                ifh ifhVarD9 = h5Var.d(85);
                Context context = (Context) h5Var.c(7);
                ifh ifhVarD10 = h5Var.d(376);
                ifh ifhVarD11 = h5Var.d(290);
                wxb wxbVar = (wxb) h5Var.c(82);
                vz8 vz8Var = (vz8) h5Var.c(1001);
                se4 se4Var = (se4) h5Var.c(1009);
                ifh ifhVarD12 = h5Var.d(628);
                no4 no4Var = (no4) h5Var.c(132);
                v99 v99Var = (v99) h5Var.c(186);
                ifh ifhVarD13 = h5Var.d(1059);
                xne xneVar = (xne) h5Var.c(1050);
                wz5 wz5Var = (wz5) h5Var.c(1061);
                oz5 oz5Var = (oz5) h5Var.c(488);
                iva ivaVar = (iva) h5Var.c(UploadConfig.DEFAULT_MAX_EVENT_COUNT);
                os3 os3Var = (os3) h5Var.c(1049);
                ifh ifhVarD14 = h5Var.d(18);
                ifh ifhVarD15 = h5Var.d(621);
                us6 us6Var = (us6) h5Var.c(1047);
                ifh ifhVarD16 = h5Var.d(990);
                lt5 lt5Var = (lt5) h5Var.c(1051);
                ifh ifhVarD17 = h5Var.d(1052);
                ifh ifhVarD18 = h5Var.d(1046);
                ifh ifhVarD19 = h5Var.d(1048);
                ifh ifhVarD20 = h5Var.d(333);
                ifh ifhVarD21 = h5Var.d(495);
                ifh ifhVarD22 = h5Var.d(157);
                ifh ifhVarD23 = h5Var.d(480);
                ifh ifhVarD24 = h5Var.d(261);
                ifh ifhVarD25 = h5Var.d(350);
                i5d i5dVarD = e5dVar.d();
                b5d b5dVar = e5dVar.N;
                zv8[] zv8VarArr = e5d.S6;
                return new yd3(ifhVarD19, ifhVarD20, ifhVarD13, ifhVarD8, ifhVarD9, ifhVarD5, ifhVarD6, ifhVarD7, ifhVarD4, ifhVarD15, se4Var, vz8Var, ifhVarD10, ifhVarD11, ifhVarD18, ifhVarD21, ifhVarD3, ifhVarD12, ifhVarD17, ifhVarD, ifhVarD2, t51Var, us6Var, no4Var, wz5Var, oz5Var, xneVar, os3Var, lt5Var, ivaVar, wxbVar, ifhVarD16, v99Var, context, ifhVarD14, ifhVarD22, ifhVarD23, ifhVarD24, ifhVarD25, i5dVarD, e5dVar.B0.a(zv8VarArr[78]), b5dVar.a(zv8VarArr[32]), e5dVar.G0.a(zv8VarArr[83]), e5dVar.L2.a(zv8VarArr[194]), (ij4) h5Var.c(286), (ite) h5Var.c(90));
            case 16:
                e5d e5dVar2 = (e5d) h5Var.c(26);
                ifh ifhVarD26 = h5Var.d(144);
                return new l7a((Context) h5Var.c(7), h5Var.d(54), ifhVarD26, h5Var.d(23), e5dVar2.O0.a(e5d.S6[91]));
            case 17:
                ifh ifhVarD27 = h5Var.d(7);
                return new g2j((g1j) h5Var.c(790), (xhh) h5Var.c(23), ifhVarD27);
            case 18:
                return new aa3(h5Var.d(530), h5Var.d(23), h5Var.d(527), h5Var.d(131), h5Var.d(85), h5Var.d(48), h5Var.d(1007), h5Var.d(1004), h5Var.d(26));
            case 19:
                return new mv2(h5Var.d(23), h5Var.d(144), h5Var.d(220), h5Var.d(821), h5Var.d(175), h5Var.d(146), h5Var.d(822), h5Var.d(113), h5Var.d(87), h5Var.d(48), h5Var.d(HttpStatus.SC_BAD_GATEWAY), h5Var.d(823), h5Var.d(26), h5Var.d(824), h5Var.d(312), h5Var.d(825));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new iy2(h5Var.d(23), h5Var.d(831), h5Var.d(146), h5Var.d(144), h5Var.d(HttpStatus.SC_GATEWAY_TIMEOUT), h5Var.d(HttpStatus.SC_SERVICE_UNAVAILABLE), h5Var.d(7), h5Var.d(312), h5Var.d(529), h5Var.d(290), h5Var.d(506), h5Var.d(HttpStatus.SC_INSUFFICIENT_STORAGE), h5Var.d(508), h5Var.d(87), h5Var.d(832));
            case 21:
                return new o13(h5Var);
            case 22:
                ifh ifhVarD28 = h5Var.d(144);
                ifh ifhVarD29 = h5Var.d(85);
                return new j6j((sua) h5Var.c(136), (xhh) h5Var.c(23), h5Var.d(132), ifhVarD28, h5Var.d(353), ifhVarD29);
            case 23:
                ifh ifhVarD30 = h5Var.d(144);
                xhh xhhVar = (xhh) h5Var.c(23);
                ifh ifhVarD31 = h5Var.d(353);
                ifh ifhVarD32 = h5Var.d(85);
                pvb pvbVar = (pvb) h5Var.c(146);
                ifh ifhVarD33 = h5Var.d(132);
                sua suaVar = (sua) h5Var.c(136);
                Context context2 = (Context) h5Var.c(7);
                ifh ifhVarD34 = h5Var.d(216);
                ifh ifhVarD35 = h5Var.d(214);
                ifh ifhVarD36 = h5Var.d(116);
                ifh ifhVarD37 = h5Var.d(944);
                ifh ifhVarD38 = h5Var.d(220);
                ifh ifhVarD39 = h5Var.d(218);
                return new m63(context2, ifhVarD30, h5Var.d(926), h5Var.d(915), ifhVarD33, ifhVarD31, h5Var.d(190), h5Var.d(206), h5Var.d(200), ifhVarD37, suaVar, xhhVar, pvbVar, ifhVarD36, ifhVarD34, ifhVarD38, ifhVarD39, ifhVarD32, ifhVarD35, h5Var.d(894), (dg0) h5Var.c(np0.n), (e5d) h5Var.c(26));
            case 24:
                return new z83(h5Var.d(161), h5Var.d(146));
            case 25:
                return new hi3(h5Var);
            case 26:
                return new q2c((sy4) h5Var.c(226), (xhh) h5Var.c(23), (uy2) h5Var.c(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED), (t51) h5Var.c(116), (ite) h5Var.c(90));
            case 27:
                xhh xhhVar2 = (xhh) h5Var.c(23);
                Context context3 = (Context) h5Var.c(7);
                vz8 vz8Var2 = (vz8) h5Var.c(1001);
                ifh ifhVarD40 = h5Var.d(97);
                ifh ifhVarD41 = h5Var.d(54);
                ifh ifhVarD42 = h5Var.d(131);
                ifh ifhVarD43 = h5Var.d(144);
                ifh ifhVarD44 = h5Var.d(1002);
                ifh ifhVarD45 = h5Var.d(996);
                ifh ifhVarD46 = h5Var.d(530);
                ifh ifhVarD47 = h5Var.d(175);
                ifh ifhVarD48 = h5Var.d(1003);
                ifh ifhVarD49 = h5Var.d(376);
                ifh ifhVarD50 = h5Var.d(529);
                ifh ifhVarD51 = h5Var.d(572);
                ifh ifhVarD52 = h5Var.d(622);
                ifh ifhVarD53 = h5Var.d(1004);
                ifh ifhVarD54 = h5Var.d(1005);
                ifh ifhVarD55 = h5Var.d(1006);
                ifh ifhVarD56 = h5Var.d(632);
                ifh ifhVarD57 = h5Var.d(992);
                ifh ifhVarD58 = h5Var.d(226);
                ifh ifhVarD59 = h5Var.d(527);
                ifh ifhVarD60 = h5Var.d(216);
                ifh ifhVarD61 = h5Var.d(984);
                ifh ifhVarD62 = h5Var.d(290);
                ifh ifhVarD63 = h5Var.d(85);
                ifh ifhVarD64 = h5Var.d(1007);
                ifh ifhVarD65 = h5Var.d(227);
                ifh ifhVarD66 = h5Var.d(48);
                return new sl3(context3, xhhVar2, (jk3) h5Var.c(282), vz8Var2, ifhVarD46, ifhVarD50, ifhVarD43, ifhVarD42, ifhVarD51, ifhVarD49, ifhVarD63, ifhVarD41, ifhVarD40, ifhVarD59, ifhVarD58, ifhVarD65, ifhVarD48, ifhVarD60, ifhVarD52, ifhVarD62, ifhVarD47, h5Var.d(510), ifhVarD66, ifhVarD57, h5Var.d(214), ifhVarD64, ifhVarD53, ifhVarD54, ifhVarD55, ifhVarD56, ifhVarD45, ifhVarD44, ifhVarD61, h5Var.d(480), h5Var.d(82), h5Var.d(998), h5Var.d(977), h5Var.d(987), h5Var.d(988), h5Var.d(903), h5Var.d(1008), h5Var.d(633), h5Var.d(139), h5Var.d(24), h5Var.d(986), h5Var.d(26));
            case 28:
                xhh xhhVar3 = (xhh) h5Var.c(23);
                yt4 yt4Var = (yt4) h5Var.c(48);
                i9f i9fVar = (i9f) h5Var.c(994);
                un4 un4Var = (un4) h5Var.c(600);
                yn3 yn3Var = (yn3) h5Var.c(993);
                iae iaeVar = (iae) h5Var.c(590);
                ifh ifhVarD67 = h5Var.d(529);
                ifh ifhVarD68 = h5Var.d(290);
                ifh ifhVarD69 = h5Var.d(85);
                ifh ifhVarD70 = h5Var.d(132);
                ifh ifhVarD71 = h5Var.d(54);
                ifh ifhVarD72 = h5Var.d(530);
                ifh ifhVarD73 = h5Var.d(527);
                ifh ifhVarD74 = h5Var.d(376);
                ifh ifhVarD75 = h5Var.d(97);
                ifh ifhVarD76 = h5Var.d(87);
                ifh ifhVarD77 = h5Var.d(622);
                ifh ifhVarD78 = h5Var.d(572);
                ifh ifhVarD79 = h5Var.d(1004);
                ifh ifhVarD80 = h5Var.d(144);
                ifh ifhVarD81 = h5Var.d(169);
                ifh ifhVarD82 = h5Var.d(1007);
                ifh ifhVarD83 = h5Var.d(124);
                ifh ifhVarD84 = h5Var.d(125);
                ifh ifhVarD85 = h5Var.d(123);
                return new gk3(iaeVar, un4Var, yn3Var, i9fVar, xhhVar3, yt4Var, ifhVarD72, ifhVarD67, ifhVarD80, ifhVarD70, h5Var.d(136), ifhVarD69, ifhVarD75, ifhVarD73, ifhVarD78, ifhVarD74, ifhVarD81, h5Var.d(286), ifhVarD76, ifhVarD77, ifhVarD68, ifhVarD71, ifhVarD85, ifhVarD84, ifhVarD83, h5Var.d(126), ifhVarD82, ifhVarD79, h5Var.d(995), h5Var.d(749), h5Var.d(480), h5Var.d(24), h5Var.d(986));
            default:
                xhh xhhVar4 = (xhh) h5Var.c(23);
                ifh ifhVarD86 = h5Var.d(316);
                ifh ifhVarD87 = h5Var.d(226);
                ifh ifhVarD88 = h5Var.d(144);
                f27 f27Var = (f27) h5Var.c(997);
                a47 a47Var = (a47) h5Var.c(999);
                gue gueVar = (gue) h5Var.c(69);
                l3c l3cVar = (l3c) h5Var.c(677);
                se4 se4Var2 = (se4) h5Var.c(1009);
                return new y67(ifhVarD87, ifhVarD88, (q2c) h5Var.c(981), (qf8) h5Var.c(1010), ifhVarD86, h5Var.d(229), xhhVar4, (r2c) h5Var.c(674), se4Var2, l3cVar, gueVar, f27Var, a47Var);
        }
    }
}
