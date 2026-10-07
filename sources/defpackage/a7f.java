package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class a7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ a7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = 24;
        int i2 = 15;
        int i3 = 26;
        int i4 = 23;
        switch (this.b) {
            case 0:
                return (gl6) h5Var.c(155);
            case 1:
                ifh ifhVarD = h5Var.d(547);
                ifh ifhVarD2 = h5Var.d(548);
                ifh ifhVarD3 = h5Var.d(549);
                ifh ifhVarD4 = h5Var.d(550);
                ifh ifhVarD5 = h5Var.d(551);
                ifh ifhVarD6 = h5Var.d(552);
                ifh ifhVarD7 = h5Var.d(520);
                ifh ifhVarD8 = h5Var.d(553);
                ifh ifhVarD9 = h5Var.d(541);
                ifh ifhVarD10 = h5Var.d(554);
                ifh ifhVarD11 = h5Var.d(555);
                ifh ifhVarD12 = h5Var.d(556);
                ifh ifhVarD13 = h5Var.d(557);
                ifh ifhVarD14 = h5Var.d(625);
                ifh ifhVarD15 = h5Var.d(559);
                ifh ifhVarD16 = h5Var.d(643);
                return new djf(ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6, ifhVarD7, ifhVarD8, h5Var.d(543), ifhVarD9, h5Var.d(542), ifhVarD10, ifhVarD11, ifhVarD12, ifhVarD13, ifhVarD14, ifhVarD15, h5Var.d(226), ifhVarD16, h5Var.d(602));
            case 2:
                return new oc8(h5Var.d(7), h5Var.d(205), h5Var.d(353), new ifh(new ic1(h5Var, 21)), h5Var.d(227), h5Var.d(131), h5Var.d(219), h5Var.d(480), (l7f) h5Var.c(229));
            case 3:
                return new tjb((ed6) h5Var.c(205), np4.h(new u02(h5Var, 13)), np4.h(new u02(h5Var, 14)));
            case 4:
                return new zjb(h5Var.d(290), (zed) h5Var.c(101), (t51) h5Var.c(116), h5Var.d(131), h5Var.d(662), h5Var.d(640));
            case 5:
                return new ckb(np4.h(new u02(h5Var, 25)), np4.h(new q7f(h5Var, 0)), (zed) h5Var.c(101), (t51) h5Var.c(116), np4.h(new q7f(h5Var, 1)), np4.h(new u02(h5Var, i2)), np4.h(new u02(h5Var, 16)), np4.h(new u02(h5Var, 17)), np4.h(new u02(h5Var, 18)), np4.h(new u02(h5Var, 19)), np4.h(new u02(h5Var, 20)), np4.h(new u02(h5Var, 21)), np4.h(new u02(h5Var, 22)), np4.h(new u02(h5Var, i4)), np4.h(new u02(h5Var, i)), np4.h(new u02(h5Var, i3)), np4.h(new u02(h5Var, 27)), np4.h(new u02(h5Var, 28)), np4.h(new u02(h5Var, 29)));
            case 6:
                return new mjb(h5Var.d(85), h5Var.d(647), h5Var.d(144), h5Var.d(228), h5Var.d(489), h5Var.d(481), h5Var.d(227), h5Var.d(26));
            case 7:
                return new pjb((zed) h5Var.c(101), (t51) h5Var.c(116), h5Var.d(131), h5Var.d(369));
            case 8:
                return new cjb(np4.h(new q7f(h5Var, 6)), np4.h(new q7f(h5Var, 7)), (t51) h5Var.c(116), np4.h(new q7f(h5Var, 8)), np4.h(new q7f(h5Var, 2)), np4.h(new q7f(h5Var, 3)), np4.h(new q7f(h5Var, 4)), np4.h(new q7f(h5Var, 5)));
            case 9:
                return new kkb(np4.h(new q7f(h5Var, 9)), np4.h(new q7f(h5Var, 10)));
            case 10:
                return new ajb((t51) h5Var.c(116), np4.h(new q7f(h5Var, 11)));
            case 11:
                return new vo5(((Boolean) ((e5d) h5Var.c(26)).e2.a(e5d.S6[160]).i()).booleanValue() ? new fik(h5Var.d(7), h5Var.d(28)) : null);
            case 12:
                return new oib(np4.h(new q7f(h5Var, 14)), np4.h(new q7f(h5Var, 15)), np4.h(new q7f(h5Var, 16)), np4.h(new q7f(h5Var, 12)), np4.h(new q7f(h5Var, 13)));
            case 13:
                return new mkb(h5Var.d(525), h5Var.d(526), h5Var.d(320), h5Var.d(26));
            case 14:
                return new gkb(h5Var.d(144), h5Var.d(549), h5Var.d(541), h5Var.d(219), h5Var.d(564), h5Var.d(620), (xhh) h5Var.c(23), (yt4) h5Var.c(48));
            case 15:
                return new sib();
            case 16:
                return (sib) h5Var.c(558);
            case 17:
                return new vib(h5Var.d(311), h5Var.d(312), h5Var.d(85), h5Var.d(558));
            case 18:
                return new v45(h5Var.d(681), h5Var.d(161), (wmi) h5Var.c(139));
            case 19:
                return new l01(h5Var.d(138), h5Var.d(23));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new mvi((c2a) h5Var.c(318), (ovi) h5Var.c(443), (tv9) h5Var.c(120), (yt4) h5Var.c(48), h5Var.d(36));
            case 21:
                return new daf(h5Var.d(353));
            case 22:
                ifh ifhVarD17 = h5Var.d(24);
                ed6 ed6Var = (ed6) h5Var.c(205);
                rg9 rg9Var = (rg9) h5Var.c(15);
                return new rnf((gue) h5Var.c(69), ifhVarD17, h5Var.d(626), h5Var.d(76), ed6Var, rg9Var, new ic1(h5Var, 22), ((f5d) ((wo6) h5Var.c(54))).z());
            case 23:
                return new n30((Context) h5Var.c(7), h5Var.d(470), h5Var.d(682), h5Var.d(100), (t51) h5Var.c(116), (xhh) h5Var.c(23), (ite) h5Var.c(90), ((e5d) h5Var.c(26)).w());
            case 24:
                return new azd(h5Var.d(463), h5Var.d(69), h5Var.d(101), h5Var.d(560), h5Var.d(459), h5Var.d(0), h5Var.d(146), h5Var.d(HttpStatus.SC_NOT_ACCEPTABLE), h5Var.d(566), h5Var.d(540), h5Var.d(100), h5Var.d(575), h5Var.d(476), h5Var.d(74), h5Var.d(72));
            case 25:
                return new rw6(h5Var.d(429), h5Var.d(85));
            case 26:
                return new yob(h5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED), h5Var.d(576), h5Var.d(HttpStatus.SC_CONFLICT), (xhh) h5Var.c(23));
            case 27:
                return new es3(h5Var.b(7));
            case 28:
                return new fq6(h5Var.d(290));
            default:
                return new hq6((qw2) h5Var.c(131), (qfa) h5Var.c(221), (qki) h5Var.c(441), (nka) h5Var.c(442), (mvi) h5Var.c(562), (iq6) h5Var.c(570), (kz8) h5Var.c(683), (fq6) h5Var.c(568), (gq6) h5Var.c(684));
        }
    }
}
