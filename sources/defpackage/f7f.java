package defpackage;

import android.content.Context;
import com.vk.push.core.base.AidlException;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes.dex */
public final class f7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ f7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new qp2(h5Var.d(146), h5Var.d(116), h5Var.d(144));
            case 1:
                return new xyj((Context) h5Var.c(7), (gu4) h5Var.c(90), (xhh) h5Var.c(23), h5Var.d(431), (e5d) h5Var.c(26), (ha9) h5Var.c(30));
            case 2:
                return new ip2(h5Var.d(146), h5Var.d(116), h5Var.d(144));
            case 3:
                return new rie(h5Var.d(146), h5Var.d(116), h5Var.d(144));
            case 4:
                return new dfh(h5Var.d(139), h5Var.d(23), h5Var.d(146), h5Var.d(144), h5Var.d(136), h5Var.d(169));
            case 5:
                return new a0b(h5Var.d(219), h5Var.d(146), h5Var.d(531), h5Var.d(480), h5Var.d(325), h5Var.d(139), h5Var.d(23), h5Var.d(101));
            case 6:
                return new vdi(h5Var.d(146), h5Var.d(144), h5Var.d(131), h5Var.d(136), h5Var.d(77), h5Var.d(534), h5Var.d(481));
            case 7:
                return new jm4(h5Var.d(101), h5Var.d(138));
            case 8:
                return (rs6) h5Var.c(179);
            case 9:
                return new xw4(h5Var.d(179), h5Var.d(97), h5Var.d(7), h5Var.d(23), h5Var.d(26));
            case 10:
                ifh ifhVarD = h5Var.d(138);
                ifh ifhVarD2 = h5Var.d(85);
                ks6 ks6Var = new ks6();
                ks6Var.a = ks6.class.getName();
                ks6Var.b = ifhVarD;
                ks6Var.c = ifhVarD2;
                return new vdh(h5Var.d(451), h5Var.d(146), h5Var.d(356), ks6Var, (gu4) h5Var.c(139), (xhh) h5Var.c(23));
            case 11:
                return new ing(h5Var.d(355), h5Var.d(146));
            case 12:
                return new okh(h5Var.d(449));
            case 13:
                return (vdh) h5Var.c(355);
            case 14:
                ifh ifhVarD3 = h5Var.d(356);
                ifh ifhVarD4 = h5Var.d(516);
                ifh ifhVarD5 = h5Var.d(116);
                ifh ifhVarD6 = h5Var.d(101);
                ifh ifhVarD7 = h5Var.d(97);
                ifh ifhVarD8 = h5Var.d(85);
                ifh ifhVarD9 = h5Var.d(100);
                ifh ifhVarD10 = h5Var.d(290);
                ifh ifhVarD11 = h5Var.d(114);
                ifh ifhVarD12 = h5Var.d(454);
                ifh ifhVarD13 = h5Var.d(219);
                ifh ifhVarD14 = h5Var.d(355);
                ifh ifhVarD15 = h5Var.d(131);
                ifh ifhVarD16 = h5Var.d(458);
                ifh ifhVarD17 = h5Var.d(205);
                ifh ifhVarD18 = h5Var.d(48);
                ifh ifhVarD19 = h5Var.d(221);
                ifh ifhVarD20 = h5Var.d(146);
                ifh ifhVarD21 = h5Var.d(495);
                ifh ifhVarD22 = h5Var.d(522);
                ifh ifhVarD23 = h5Var.d(523);
                ifh ifhVarD24 = h5Var.d(222);
                ifh ifhVarD25 = h5Var.d(528);
                ifh ifhVarD26 = h5Var.d(529);
                ifh ifhVarD27 = h5Var.d(324);
                ifh ifhVarD28 = h5Var.d(662);
                ifh ifhVarD29 = h5Var.d(672);
                ifh ifhVarD30 = h5Var.d(533);
                ifh ifhVarD31 = h5Var.d(318);
                ifh ifhVarD32 = h5Var.d(535);
                ifh ifhVarD33 = h5Var.d(448);
                ifh ifhVarD34 = h5Var.d(463);
                ifh ifhVarD35 = h5Var.d(73);
                ifh ifhVarD36 = h5Var.d(481);
                ifh ifhVarD37 = h5Var.d(144);
                ifh ifhVarD38 = h5Var.d(139);
                ifh ifhVarD39 = h5Var.d(23);
                ifh ifhVarD40 = h5Var.d(18);
                ifh ifhVarD41 = h5Var.d(289);
                ifh ifhVarD42 = h5Var.d(21);
                ifh ifhVarD43 = h5Var.d(635);
                ifh ifhVarD44 = h5Var.d(76);
                ifh ifhVarD45 = h5Var.d(602);
                return new njf(ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6, ifhVarD7, ifhVarD8, ifhVarD9, ifhVarD10, ifhVarD11, ifhVarD12, ifhVarD13, ifhVarD14, ifhVarD15, ifhVarD16, ifhVarD17, ifhVarD18, ifhVarD19, h5Var.d(228), h5Var.d(489), h5Var.d(494), h5Var.d(647), ifhVarD20, ifhVarD21, ifhVarD22, ifhVarD23, ifhVarD24, ifhVarD25, ifhVarD26, ifhVarD27, ifhVarD28, ifhVarD29, ifhVarD30, ifhVarD31, ifhVarD32, ifhVarD33, ifhVarD34, ifhVarD35, ifhVarD36, ifhVarD37, ifhVarD38, ifhVarD39, ifhVarD40, ifhVarD41, ifhVarD42, ifhVarD43, ifhVarD44, ifhVarD45, h5Var.d(655));
            case 15:
                ifh ifhVarD46 = h5Var.d(116);
                ifh ifhVarD47 = h5Var.d(101);
                ifh ifhVarD48 = h5Var.d(26);
                ifh ifhVarD49 = h5Var.d(85);
                ifh ifhVarD50 = h5Var.d(100);
                ifh ifhVarD51 = h5Var.d(290);
                ifh ifhVarD52 = h5Var.d(466);
                ifh ifhVarD53 = h5Var.d(225);
                ifh ifhVarD54 = h5Var.d(454);
                ifh ifhVarD55 = h5Var.d(AidlException.HOST_IS_NOT_MASTER);
                ifh ifhVarD56 = h5Var.d(219);
                ifh ifhVarD57 = h5Var.d(517);
                ifh ifhVarD58 = h5Var.d(227);
                ifh ifhVarD59 = h5Var.d(355);
                ifh ifhVarD60 = h5Var.d(362);
                ifh ifhVarD61 = h5Var.d(357);
                ifh ifhVarD62 = h5Var.d(358);
                ifh ifhVarD63 = h5Var.d(131);
                ifh ifhVarD64 = h5Var.d(518);
                ifh ifhVarD65 = h5Var.d(458);
                ifh ifhVarD66 = h5Var.d(205);
                ifh ifhVarD67 = h5Var.d(221);
                ifh ifhVarD68 = h5Var.d(136);
                ifh ifhVarD69 = h5Var.d(146);
                ifh ifhVarD70 = h5Var.d(495);
                ifh ifhVarD71 = h5Var.d(441);
                ifh ifhVarD72 = h5Var.d(519);
                ifh ifhVarD73 = h5Var.d(520);
                ifh ifhVarD74 = h5Var.d(521);
                ifh ifhVarD75 = h5Var.d(522);
                ifh ifhVarD76 = h5Var.d(300);
                ifh ifhVarD77 = h5Var.d(294);
                ifh ifhVarD78 = h5Var.d(527);
                ifh ifhVarD79 = h5Var.d(528);
                ifh ifhVarD80 = h5Var.d(480);
                ifh ifhVarD81 = h5Var.d(531);
                ifh ifhVarD82 = h5Var.d(324);
                ifh ifhVarD83 = h5Var.d(470);
                ifh ifhVarD84 = h5Var.d(532);
                ifh ifhVarD85 = h5Var.d(54);
                ifh ifhVarD86 = h5Var.d(168);
                ifh ifhVarD87 = h5Var.d(534);
                ifh ifhVarD88 = h5Var.d(144);
                ifh ifhVarD89 = h5Var.d(23);
                ifh ifhVarD90 = h5Var.d(139);
                ifh ifhVarD91 = h5Var.d(347);
                rg9 rg9Var = (rg9) h5Var.c(15);
                ifh ifhVarD92 = h5Var.d(631);
                ifh ifhVarD93 = h5Var.d(18);
                ifh ifhVarD94 = h5Var.d(637);
                ifh ifhVarD95 = h5Var.d(640);
                ifh ifhVarD96 = h5Var.d(350);
                ifh ifhVarD97 = h5Var.d(76);
                ifh ifhVarD98 = h5Var.d(77);
                ifh ifhVarD99 = h5Var.d(82);
                ifh ifhVarD100 = h5Var.d(74);
                ifh ifhVarD101 = h5Var.d(228);
                ifh ifhVarD102 = h5Var.d(647);
                ifh ifhVarD103 = h5Var.d(489);
                ifh ifhVarD104 = h5Var.d(492);
                ifh ifhVarD105 = h5Var.d(481);
                return new bq(ifhVarD46, ifhVarD47, ifhVarD48, ifhVarD49, ifhVarD50, ifhVarD51, ifhVarD52, ifhVarD53, ifhVarD54, ifhVarD55, ifhVarD56, ifhVarD57, ifhVarD58, ifhVarD59, ifhVarD60, ifhVarD61, ifhVarD62, ifhVarD63, ifhVarD64, ifhVarD65, ifhVarD66, ifhVarD67, ifhVarD68, ifhVarD101, ifhVarD103, h5Var.d(494), ifhVarD104, h5Var.d(594), ifhVarD102, ifhVarD105, ifhVarD69, ifhVarD70, ifhVarD71, ifhVarD72, ifhVarD73, ifhVarD74, ifhVarD75, ifhVarD76, ifhVarD77, ifhVarD78, ifhVarD79, ifhVarD80, ifhVarD81, ifhVarD82, ifhVarD83, ifhVarD84, ifhVarD85, ifhVarD86, ifhVarD87, ifhVarD88, ifhVarD89, ifhVarD90, ifhVarD91, ifhVarD93, ifhVarD92, rg9Var, ifhVarD94, ifhVarD95, ifhVarD96, ifhVarD97, ifhVarD98, ifhVarD99, ifhVarD100, h5Var.d(649), h5Var.d(650), h5Var.d(651), h5Var.d(652), h5Var.d(654), h5Var.d(653), h5Var.d(286), h5Var.d(657), h5Var.d(658), h5Var.d(np0.m), h5Var.d(467));
            case 16:
                return new wmi(((n0c) ((xhh) h5Var.c(23))).a(), (yt4) h5Var.c(48));
            case 17:
                return new wae(h5Var.d(428), h5Var.d(85), h5Var.d(353), h5Var.d(146), h5Var.d(300), h5Var.d(139));
            case 18:
                return new cq6((xyj) h5Var.c(292), (ha9) h5Var.c(30), h5Var.d(442), h5Var.d(16));
            case 19:
                return new eg9(h5Var.d(85), h5Var.d(100), h5Var.d(326), (rg9) h5Var.c(15));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ceh(h5Var.d(426), h5Var.d(513), h5Var.d(146), h5Var.d(139), (gu4) h5Var.c(90), (eh9) h5Var.c(342));
            case 21:
                return new um6(h5Var.d(HttpStatus.SC_LENGTH_REQUIRED), h5Var.d(355), h5Var.d(85), h5Var.d(97), h5Var.d(146), h5Var.d(139), h5Var.d(90), h5Var.d(458));
            case 22:
                return new ldh(h5Var.d(427), h5Var.d(362), h5Var.d(146), h5Var.d(458), h5Var.d(85), h5Var.d(97), (eh9) h5Var.c(342), (ite) h5Var.c(90), (wmi) h5Var.c(139));
            case 23:
                return new dkh(h5Var.d(292), (ha9) h5Var.c(30));
            case 24:
                return new yy((vdh) h5Var.c(355), (zed) h5Var.c(101), (qw2) h5Var.c(131), (pvb) h5Var.c(146), (ldh) h5Var.c(358), (um6) h5Var.c(357), (m7f) h5Var.c(300), (xm) h5Var.c(312));
            case 25:
                ifh ifhVarD106 = h5Var.d(85);
                ifh ifhVarD107 = h5Var.d(673);
                ifh ifhVarD108 = h5Var.d(HttpStatus.SC_REQUEST_TOO_LONG);
                r2c r2cVar = (r2c) h5Var.c(674);
                ifh ifhVarD109 = h5Var.d(205);
                mzb mzbVar = (mzb) h5Var.c(675);
                return new sy4(ifhVarD106, h5Var.d(97), ifhVarD107, ifhVarD109, h5Var.d(676), ifhVarD108, h5Var.d(54), mzbVar, r2cVar, (ite) h5Var.c(90));
            case 26:
                return new u4b(h5Var.d(221), h5Var.d(300), h5Var.d(481), h5Var.d(116), h5Var.d(146), h5Var.d(294), h5Var.d(637));
            case 27:
                return new l70(h5Var.d(221), (t51) h5Var.c(116), h5Var.d(290), h5Var.d(18));
            case 28:
                return new wp6(h5Var.d(292), h5Var.d(138), h5Var.d(136), h5Var.d(317), h5Var.d(318), h5Var.d(116), h5Var.d(587), h5Var.d(23), h5Var.d(24), h5Var.d(295), h5Var.d(17), (ha9) h5Var.c(30), h5Var.d(26), h5Var.d(127));
            default:
                return new bze((qfa) h5Var.c(221), (b) h5Var.c(481), (t51) h5Var.c(116), (zed) h5Var.c(101), (m40) h5Var.c(524), h5Var.d(639));
        }
    }
}
