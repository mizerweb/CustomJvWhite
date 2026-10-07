package defpackage;

import android.content.Context;
import one.me.sdk.database.OneMeRoomDatabase;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class ci3 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ ci3(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new vi3();
            case 1:
                return new zt0(h5Var.d(131), h5Var.d(144), h5Var.d(146));
            case 2:
                return new wt0((wzj) h5Var.c(290), (et3) h5Var.c(85));
            case 3:
                return new yt0((wzj) h5Var.c(290), (et3) h5Var.c(85), (xn3) h5Var.c(144), (lei) h5Var.c(640), (h5c) h5Var.c(662), (xhh) h5Var.c(23));
            case 4:
                ifh ifhVarD = h5Var.d(353);
                ifh ifhVarD2 = h5Var.d(546);
                ifh ifhVarD3 = h5Var.d(924);
                ifh ifhVarD4 = h5Var.d(583);
                ifh ifhVarD5 = h5Var.d(87);
                ifh ifhVarD6 = h5Var.d(377);
                Context context = (Context) h5Var.c(7);
                xhh xhhVar = (xhh) h5Var.c(23);
                return new e13(ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6, h5Var.d(669), h5Var.d(85), h5Var.d(26), h5Var.d(78), context, xhhVar, new ic1(h5Var, 3));
            case 5:
                return (e13) h5Var.c(989);
            case 6:
                return (e13) h5Var.c(989);
            case 7:
                return new su2((Context) h5Var.c(7));
            case 8:
                return new o9i((Context) h5Var.c(7), (ky8) h5Var.c(178), (wmi) h5Var.c(139), (su2) h5Var.c(991), (pa4) h5Var.c(738), h5Var.d(1000));
            case 9:
                return new v24(h5Var.d(592), h5Var.d(647), h5Var.d(144), (i6e) h5Var.c(321), (Context) h5Var.c(7), h5Var.d(687), h5Var.d(490), h5Var.d(491), h5Var.d(320), h5Var.d(312), h5Var.d(26), h5Var.d(90), h5Var.d(324), h5Var.d(325), h5Var.d(136));
            case 10:
                return new g64(h5Var.d(146), h5Var.d(23), h5Var.d(144), h5Var.d(HttpStatus.SC_SEE_OTHER), h5Var.d(HttpStatus.SC_NOT_MODIFIED));
            case 11:
                return (a2c) m94.i.getValue();
            case 12:
                return (xhh) m94.l.getValue();
            case 13:
                return new wm8(((n0c) ((xhh) m94.l.getValue())).b());
            case 14:
                ((n0c) ((xhh) m94.l.getValue())).b();
                return new ldf(29);
            case 15:
                ((n0c) ((xhh) m94.l.getValue())).c();
                return new lu8();
            case 16:
                return new ft0(((n0c) ((xhh) m94.l.getValue())).f());
            case 17:
                return new w95(((n0c) ((xhh) m94.l.getValue())).a());
            case 18:
                return new tv9(new qd6(a2c.f((a2c) m94.i.getValue(), "media-conv-helper", 0, 2, false, true, 0, 96)));
            case 19:
                return new ya4((k42) h5Var.c(66), h5Var.d(85), h5Var.d(23));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new wb4(h5Var.d(85), h5Var.d(370), h5Var.d(23), h5Var.d(48));
            case 21:
                return new zb4((w82) h5Var.c(839), (u42) h5Var.c(844));
            case 22:
                return new gh4((no4) h5Var.c(132), (xhh) h5Var.c(23), h5Var.d(306));
            case 23:
                return new yh4(h5Var.d(23), h5Var.d(132), h5Var.d(821), h5Var.d(146), h5Var.d(822), h5Var.d(113), h5Var.d(823));
            case 24:
                return new wi4(h5Var.d(132), h5Var.d(144), h5Var.d(23), h5Var.d(831), h5Var.d(85), h5Var.d(160), h5Var.d(100), h5Var.d(66), h5Var.d(574), h5Var.d(573), h5Var.d(306), h5Var.d(833), h5Var.d(146), h5Var.d(834), h5Var.d(835));
            case 25:
                ite iteVar = (ite) h5Var.c(90);
                wsc wscVar = (wsc) h5Var.c(34);
                ifh ifhVarD7 = h5Var.d(23);
                ifh ifhVarD8 = h5Var.d(132);
                ifh ifhVarD9 = h5Var.d(479);
                ifh ifhVarD10 = h5Var.d(480);
                ifh ifhVarD11 = h5Var.d(134);
                ifh ifhVarD12 = h5Var.d(478);
                ij4 ij4Var = (ij4) h5Var.c(286);
                return new pk4(iteVar, wscVar, ifhVarD7, ifhVarD8, ifhVarD12, ifhVarD9, ifhVarD10, ifhVarD11, h5Var.d(168), h5Var.d(85), h5Var.d(377), ij4Var, (pa4) h5Var.c(738));
            case 26:
                return new zk4((Context) h5Var.c(7), h5Var.d(125), h5Var.d(23), h5Var.d(133), h5Var.d(571), h5Var.d(132), h5Var.d(144), h5Var.d(572), h5Var.d(376), h5Var.d(306), h5Var.d(573), h5Var.d(622), h5Var.d(175), h5Var.d(85), h5Var.d(97), h5Var.d(54), h5Var.d(769), h5Var.d(48), h5Var.d(749), h5Var.d(377), h5Var.d(751), h5Var.d(353), h5Var.d(480), h5Var.d(350));
            case 27:
                return new sm8(h5Var.d(85), h5Var.d(231), h5Var.d(157));
            case 28:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).N();
            default:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).C();
        }
    }
}
