package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class r1i extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ r1i(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        boolean z = false;
        switch (this.b) {
            case 0:
                return new wji(a2c.f((a2c) h5Var.c(27), "upload-video", 1, 2, true, true, 0, 96));
            case 1:
                return new kii((u1i) h5Var.c(689), h5Var.d(27), h5Var.d(23), h5Var.d(697), h5Var.d(700), h5Var.d(26), h5Var.d(54), h5Var.d(101), h5Var.d(0), h5Var.d(139), h5Var.d(29), h5Var.d(690));
            case 2:
                return new j3i((u1i) h5Var.c(689), h5Var.d(693), h5Var.d(26));
            case 3:
                ifh ifhVarD = h5Var.d(146);
                u1i u1iVar = (u1i) h5Var.c(689);
                return new zgi(ifhVarD, h5Var.d(85), h5Var.d(26), h5Var.d(325), h5Var.d(441), h5Var.d(691), h5Var.d(692), h5Var.d(16), h5Var.d(22), h5Var.d(0), h5Var.d(36), u1iVar, h5Var.d(4));
            case 4:
                return new wec((Context) h5Var.c(7), h5Var.d(0), h5Var.d(139), h5Var.d(101), h5Var.d(36), h5Var.d(690), h5Var.d(26), (u1i) h5Var.c(689));
            case 5:
                return new j0j();
            case 6:
                return new n0j(h5Var.d(7), h5Var.d(16), h5Var.d(23), h5Var.d(694), h5Var.d(444));
            case 7:
                return new cii(h5Var.d(54), h5Var.d(23), h5Var.d(26), h5Var.d(605), h5Var.d(562), h5Var.d(695), h5Var.d(289), h5Var.d(16), h5Var.d(88), h5Var.d(295), h5Var.d(608), h5Var.d(609), h5Var.d(606), h5Var.d(607));
            case 8:
                Context context = (Context) h5Var.c(7);
                ifh ifhVarD2 = h5Var.d(136);
                ifh ifhVarD3 = h5Var.d(144);
                ifh ifhVarD4 = h5Var.d(325);
                ifh ifhVarD5 = h5Var.d(69);
                ifh ifhVarD6 = h5Var.d(162);
                ifh ifhVarD7 = h5Var.d(146);
                ifh ifhVarD8 = h5Var.d(116);
                ifh ifhVarD9 = h5Var.d(179);
                ghb ghbVar = ew5.b;
                return new x3i(context, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6, ifhVarD7, ifhVarD8, ifhVarD9, ew5.g(qe7.O(12, lw5.HOURS)), h5Var.d(352), h5Var.d(23), h5Var.d(26), (gu4) h5Var.c(90), h5Var.d(82), h5Var.d(310), h5Var.d(30), h5Var.d(35));
            case 9:
                return new l8i(h5Var.d(23), h5Var.d(85), h5Var.d(146), h5Var.d(168));
            case 10:
                return new c7i(h5Var.d(23), h5Var.d(26), h5Var.d(146), h5Var.d(397), h5Var.d(168));
            case 11:
                ifh ifhVarD10 = h5Var.d(23);
                ifh ifhVarD11 = h5Var.d(26);
                return new k6i(h5Var.d(85), ifhVarD10, h5Var.d(146), h5Var.d(397), ifhVarD11, h5Var.d(168));
            case 12:
                return new y7i(h5Var.d(146), h5Var.d(23));
            case 13:
                ifh ifhVarD12 = h5Var.d(146);
                return new q8i(h5Var.d(85), h5Var.d(23), ifhVarD12);
            case 14:
                ifh ifhVarD13 = h5Var.d(23);
                return new smd(h5Var.d(85), h5Var.d(146), ifhVarD13);
            case 15:
                return new kci(h5Var.d(572), h5Var.d(306), h5Var.d(218), h5Var.d(54), h5Var.d(23), h5Var.d(236), h5Var.d(146), h5Var.d(HttpStatus.SC_SEE_OTHER), h5Var.d(HttpStatus.SC_NOT_MODIFIED));
            case 16:
                return new hpi((xhh) h5Var.c(23), (aj5) h5Var.c(269), (et3) h5Var.c(85), (e5d) h5Var.c(26), (vzg) h5Var.c(270), (wmi) h5Var.c(139), (t3h) h5Var.c(953), (r29) h5Var.c(215), (w69) h5Var.c(220), (dcj) h5Var.c(242), (Context) h5Var.c(7), h5Var.d(281), h5Var.d(287), (p4c) h5Var.c(353), (no4) h5Var.c(132), (ij4) h5Var.c(286), h5Var.d(273), h5Var.d(788), h5Var.d(325), h5Var.d(292), h5Var.d(318), h5Var.d(278), h5Var.d(467), h5Var.d(955));
            case 17:
                return new cjg((u9c) h5Var.c(92));
            case 18:
                return (wxb) h5Var.c(82);
            case 19:
                return new zb5(h5Var.d(83), h5Var.d(34));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Context context2 = (Context) h5Var.c(7);
                ifh ifhVarD14 = h5Var.d(84);
                ifh ifhVarD15 = h5Var.d(85);
                ifh ifhVarD16 = h5Var.d(82);
                ifh ifhVarD17 = h5Var.d(86);
                ifh ifhVarD18 = h5Var.d(87);
                ifh ifhVarD19 = h5Var.d(88);
                return new hgh(context2, ifhVarD14, h5Var.d(89), ifhVarD15, ifhVarD16, ifhVarD17, ifhVarD18, h5Var.d(26), ifhVarD19, (ite) h5Var.c(90));
            case 21:
                Context context3 = (Context) h5Var.c(7);
                NotificationManager notificationManager = (NotificationManager) context3.getSystemService("notification");
                return new lsi(((Boolean) msi.a.getValue()).booleanValue(), new c1k(context3, z), notificationManager);
            case 22:
                return (r77) h5Var.c(68);
            case 23:
                return new ek5(h5Var.d(91), h5Var.d(85), h5Var.d(84), (Context) h5Var.c(7));
            case 24:
                return new umi(h5Var.d(84), h5Var.d(82), h5Var.d(78), (Context) h5Var.c(7));
            case 25:
                return new jc9(h5Var.d(85));
            case 26:
                return ch3.o((Context) h5Var.c(7));
            case 27:
                return new ibj((w82) h5Var.c(839));
            case 28:
                return sb8.a(qs8.d, ba.i);
            default:
                return new l44((qs8) h5Var.c(29), h5Var.d(238));
        }
    }
}
