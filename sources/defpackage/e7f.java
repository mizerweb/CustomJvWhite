package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.messages.a;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes.dex */
public final class e7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ e7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                ifh ifhVarD = h5Var.d(131);
                ifh ifhVarD2 = h5Var.d(343);
                ifh ifhVarD3 = h5Var.d(101);
                ifh ifhVarD4 = h5Var.d(470);
                ifh ifhVarD5 = h5Var.d(18);
                ifh ifhVarD6 = h5Var.d(290);
                return new gnb(ifhVarD3, h5Var.d(662), ifhVarD, ifhVarD4, h5Var.d(527), ifhVarD2, ifhVarD5, ifhVarD6, h5Var.d(139));
            case 1:
                ifh ifhVarD7 = h5Var.d(146);
                ifh ifhVarD8 = h5Var.d(290);
                ifh ifhVarD9 = h5Var.d(23);
                ifh ifhVarD10 = h5Var.d(90);
                ifh ifhVarD11 = h5Var.d(463);
                ghb ghbVar = ew5.b;
                long jP = qe7.P(((Number) ((e5d) h5Var.c(26)).E4.a(e5d.S6[292]).i()).longValue(), lw5.SECONDS);
                return new j0d(ifhVarD7, ifhVarD8, ifhVarD10, ifhVarD9, ifhVarD11, h5Var.d(107), new ic1(h5Var, 29), h5Var.d(657), jP);
            case 2:
                return new naj(h5Var.d(100), h5Var.d(476), h5Var.d(480), h5Var.d(563), h5Var.d(495), h5Var.d(324), h5Var.d(315), h5Var.d(24), h5Var.d(107), h5Var.d(326));
            case 3:
                return new no4((bi4) h5Var.c(219), h5Var.d(353), h5Var.d(101), h5Var.d(23), (wmi) h5Var.c(139));
            case 4:
                return new nv7(h5Var.d(132), h5Var.d(146));
            case 5:
                return new vc5(h5Var.d(448));
            case 6:
                e5d e5dVar = (e5d) h5Var.c(26);
                ifh ifhVarD12 = h5Var.d(353);
                xhh xhhVar = (xhh) h5Var.c(23);
                ite iteVar = (ite) h5Var.c(90);
                wmi wmiVar = (wmi) h5Var.c(139);
                ifh ifhVarD13 = h5Var.d(85);
                ifh ifhVarD14 = h5Var.d(286);
                ifh ifhVarD15 = h5Var.d(114);
                ifh ifhVarD16 = h5Var.d(132);
                l7f l7fVar = (l7f) h5Var.c(229);
                Context context = (Context) h5Var.c(7);
                ifh ifhVarD17 = h5Var.d(261);
                ifh ifhVarD18 = h5Var.d(157);
                ifh ifhVarD19 = h5Var.d(69);
                ifh ifhVarD20 = h5Var.d(325);
                b5d b5dVar = e5dVar.m4;
                zv8[] zv8VarArr = e5d.S6;
                yfd yfdVar = new yfd(context, ifhVarD12, xhhVar, iteVar, wmiVar, ifhVarD13, ifhVarD14, ifhVarD15, ifhVarD16, l7fVar, ifhVarD17, ifhVarD18, ifhVarD19, ifhVarD20, b5dVar.a(zv8VarArr[274]), e5dVar.n4.a(zv8VarArr[275]), e5dVar.l4.a(zv8VarArr[273]), e5dVar.j4.a(zv8VarArr[271]), e5dVar.p4.a(zv8VarArr[277]), e5dVar.o4.a(zv8VarArr[276]), e5dVar.q4.a(zv8VarArr[278]), (b95) h5Var.c(107));
                ((rnf) ((onf) h5Var.c(325))).c(yfdVar);
                return yfdVar;
            case 7:
                return new bi4(np4.h(new r7f(h5Var, 0)), (t51) h5Var.c(116), (zed) h5Var.c(101), np4.h(new r7f(h5Var, 1)), (pwh) h5Var.c(668), np4.h(new r7f(h5Var, 2)));
            case 8:
                return new b((t51) h5Var.c(116), h5Var.d(353), h5Var.d(219), h5Var.d(101), h5Var.d(309), h5Var.d(647));
            case 9:
                return new pvb(h5Var.d(114), h5Var.d(101), h5Var.d(290), new ifh(new h7f(h5Var.d(82), 6)));
            case 10:
                return new zja(np4.h(new r7f(h5Var, 3)));
            case 11:
                return new uia(np4.h(new r7f(h5Var, 4)));
            case 12:
                return new o7f(h5Var);
            case 13:
                dp5 dp5VarH = np4.h(new r7f(h5Var, 8));
                dp5 dp5VarH2 = np4.h(new r7f(h5Var, 9));
                dp5 dp5VarH3 = np4.h(new r7f(h5Var, 10));
                dp5 dp5VarH4 = np4.h(new r7f(h5Var, 5));
                np4.h(new r7f(h5Var, 6));
                return new ef3(dp5VarH, dp5VarH2, dp5VarH3, dp5VarH4, np4.h(new r7f(h5Var, 7)));
            case 14:
                return new a(h5Var.d(219), h5Var.d(481), h5Var.d(483), h5Var.d(482), h5Var.d(670));
            case 15:
                return new sua((uoa) h5Var.c(446), new ifh(new u02(h5Var, 6)), h5Var.d(300), h5Var.d(77), h5Var.d(23), h5Var.d(221));
            case 16:
                return new mz5(h5Var.d(228), h5Var.d(144), h5Var.d(481), h5Var.d(647), h5Var.d(85));
            case 17:
                return new l34(h5Var.d(434), h5Var.d(HttpStatus.SC_NOT_FOUND), h5Var.d(HttpStatus.SC_METHOD_NOT_ALLOWED), h5Var.d(489));
            case 18:
                return new hjc(h5Var.d(146), (gu4) h5Var.c(139), (xhh) h5Var.c(23), new h7f(h5Var.d(26), 7), new h7f(h5Var.d(161), 8));
            case 19:
                n25 n25Var = (n25) h5Var.c(470);
                t51 t51Var = (t51) h5Var.c(116);
                zed zedVar = (zed) h5Var.c(101);
                hjc hjcVar = (hjc) h5Var.c(495);
                return new qfa(n25Var, t51Var, zedVar, hjcVar, (b) h5Var.c(481), np4.h(new r7f(h5Var, 11)), ((umi) h5Var.c(77)).a().b, ((a2c) h5Var.c(27)).c());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new su7(h5Var.d(100), h5Var.d(101), h5Var.d(459), h5Var.d(290), h5Var.d(252), h5Var.d(476));
            case 21:
                return new ny2(h5Var.d(485), h5Var.d(219), h5Var.d(101), h5Var.d(221), h5Var.d(486), h5Var.d(671));
            case 22:
                return (et3) h5Var.c(85);
            case 23:
                return new iz2(h5Var.d(115), h5Var.d(114));
            case 24:
                return new e9();
            case 25:
                return new qw2(np4.h(new r7f(h5Var, 19)), (t51) h5Var.c(116), (zed) h5Var.c(101), np4.h(new r7f(h5Var, 20)), np4.h(new r7f(h5Var, 21)), np4.h(new r7f(h5Var, 12)), np4.h(new r7f(h5Var, 13)), np4.h(new r7f(h5Var, 14)), np4.h(new r7f(h5Var, 15)), np4.h(new r7f(h5Var, 16)), np4.h(new r7f(h5Var, 17)), np4.h(new r7f(h5Var, 18)), h5Var.d(629), h5Var.d(226), h5Var.d(100), (xhh) h5Var.c(23), h5Var.d(136), h5Var.d(509), (wmi) h5Var.c(139));
            case 26:
                return new xn3(h5Var.d(146), h5Var.d(131), h5Var.d(229), h5Var.d(662), (xhh) h5Var.c(23), (ite) h5Var.c(90), new p7f(h5Var.d(85)), h5Var.d(169));
            case 27:
                return (xn3) h5Var.c(497);
            case 28:
                return new r0f((xn3) h5Var.c(144));
            default:
                return new uy2(h5Var.d(85), h5Var.d(131), h5Var.d(144), h5Var.d(226));
        }
    }
}
