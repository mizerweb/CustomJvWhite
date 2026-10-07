package defpackage;

import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class d7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ d7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = 27;
        int i2 = 26;
        switch (this.b) {
            case 0:
                return new mic(h5Var.d(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE));
            case 1:
                return new jh9(h5Var.d(90), h5Var.d(687), h5Var.d(536), h5Var.d(342));
            case 2:
                return new lfc(h5Var.d(0), h5Var.d(54), h5Var.d(92), (wmi) h5Var.c(139));
            case 3:
                return new dn3(h5Var.d(628), h5Var.d(229), (wmi) h5Var.c(139));
            case 4:
                return new ov2(h5Var.d(146), h5Var.d(144));
            case 5:
                return new sa8();
            case 6:
                return new rjf(h5Var.d(27), h5Var.d(88));
            case 7:
                return new x90(h5Var.d(136), h5Var.d(294), h5Var.d(23), h5Var.d(296), h5Var.d(26));
            case 8:
                return new apa((ite) h5Var.c(90), (et3) h5Var.c(85), (t51) h5Var.c(116));
            case 9:
                return new dme(h5Var.d(458), h5Var.d(449), h5Var.d(85), new ifh(new ic1(h5Var, i2)), new ifh(new ic1(h5Var, i)), new ifh(new h7f(h5Var.d(23), 3)), h5Var.d(290), h5Var.d(459), (rc5) h5Var.c(539), h5Var.d(326), (onf) h5Var.c(325), h5Var.d(515), (ite) h5Var.c(90), new fi3(h5Var.d(26), 2, h5Var.d(74)));
            case 10:
                return new if9(h5Var.d(114), h5Var.d(551), h5Var.d(132), h5Var.d(97), h5Var.d(85), h5Var.d(517), h5Var.d(168), h5Var.d(146), ((e5d) h5Var.c(26)).M.a(e5d.S6[31]));
            case 11:
                return new p24((ite) h5Var.c(90));
            case 12:
                return new gbj(h5Var.d(24), h5Var.d(97));
            case 13:
                return new ubb(h5Var.d(26));
            case 14:
                return new rjb(h5Var.d(219), h5Var.d(685));
            case 15:
                a2c a2cVar = (a2c) h5Var.c(27);
                v1c v1cVarB = a2cVar.b();
                v1cVarB.getClass();
                return new twe(a2cVar.i(v1cVarB.a(new od6("pend_tsk", 1, 1, 0L, true, false, 10, false, true)), "pend_tsk"));
            case 16:
                return new dxe((gu4) h5Var.c(90), new ifh(new ic1(h5Var, 28)), h5Var.d(85), h5Var.d(24), h5Var.d(458), h5Var.d(324), h5Var.d(290), h5Var.d(514), h5Var.d(515), ((Number) ((e5d) h5Var.c(26)).y6.a(e5d.S6[390]).i()).intValue());
            case 17:
                return new tci((xn3) h5Var.c(144), (et3) h5Var.c(85), (gq0) h5Var.c(169), (xhh) h5Var.c(23));
            case 18:
                return new tmf(h5Var.d(205), h5Var.d(325), h5Var.d(146), h5Var.d(326), (rg9) h5Var.c(15));
            case 19:
                return new sih((dme) h5Var.c(324));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new xxe();
            case 21:
                return new a64();
            case 22:
                wzj jgbVar = ((Boolean) ((e5d) h5Var.c(26)).O6.a(e5d.S6[407]).i()).booleanValue() ? new jgb(h5Var.d(90), h5Var.d(458), h5Var.d(23), h5Var.d(514)) : new yz8(h5Var.d(458), h5Var.d(27), h5Var.d(514));
                jgbVar.a(new p3c(h5Var));
                return jgbVar;
            case 23:
                return new tz4();
            case 24:
                return new n25(h5Var.d(HttpStatus.SC_NOT_FOUND), h5Var.d(445), h5Var.d(446), h5Var.d(447), h5Var.d(448), h5Var.d(449), h5Var.d(451), h5Var.d(441), h5Var.d(312), h5Var.d(HttpStatus.SC_SEE_OTHER), h5Var.d(311), h5Var.d(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE), h5Var.d(434));
            case 25:
                return (n25) h5Var.c(469);
            case 26:
                return m7f.a;
            case 27:
                return new ae9((gue) h5Var.c(69), (xhh) h5Var.c(23), h5Var.d(450), h5Var.d(85), h5Var.d(26), h5Var.d(146), h5Var.d(114), h5Var.d(326), h5Var.d(324), h5Var.d(325), (ha9) h5Var.c(30), h5Var.a(6));
            case 28:
                return new n7f(h5Var);
            default:
                return (ae9) h5Var.c(252);
        }
    }
}
