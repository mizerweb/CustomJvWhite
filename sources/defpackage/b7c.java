package defpackage;

import android.app.Application;
import android.content.Context;
import com.vk.push.core.base.AidlException;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class b7c extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ b7c(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return (iv4) h5Var.c(1133);
            case 1:
                return bu.a;
            case 2:
                return new xic(h5Var.d(161), h5Var.d(146), h5Var.d(23));
            case 3:
                return new xq(h5Var.d(69), (xhh) h5Var.c(23), (u9c) h5Var.c(92));
            case 4:
                return (xq) h5Var.c(1134);
            case 5:
                return new y9g((rrc) h5Var.c(8));
            case 6:
                xhh xhhVar = (xhh) h5Var.c(23);
                String str = krc.b;
                return new krc(cqk.a(lvb.x0(wk8.a(), ((n0c) xhhVar).a()).u0(new k94(nhb.f, 1))));
            case 7:
                return new asc((exb) h5Var.c(10), ((krc) h5Var.c(9)).a);
            case 8:
                return new icb((rrc) h5Var.c(8), (rg9) h5Var.c(15));
            case 9:
                rg9 rg9Var = rg9.i;
                rg9Var.v(new gi3(h5Var, 3));
                wd4 wd4Var = (wd4) h5Var.c(24);
                String str2 = rg9Var.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "Setting connectionInfo", null);
                    }
                }
                rg9.l = wd4Var;
                rg9Var.E(wd4Var);
                return rg9Var;
            case 10:
                drc drcVar = new drc();
                drcVar.e = (rrc) h5Var.c(8);
                krc krcVar = (krc) h5Var.c(9);
                drcVar.d = krcVar != null ? krcVar.a : null;
                drcVar.f = (exb) h5Var.c(10);
                drcVar.e((zqc) h5Var.c(11));
                drcVar.b("upload");
                drcVar.g = true;
                drcVar.h = (ftc) h5Var.c(12);
                drcVar.c();
                drcVar.i = new ms5(2);
                drcVar.k.b((zqc) h5Var.c(14));
                drcVar.f(h5Var.a(0));
                return new mii(drcVar.a());
            case 11:
                drc drcVar2 = new drc();
                drcVar2.e = (rrc) h5Var.c(8);
                krc krcVar2 = (krc) h5Var.c(9);
                drcVar2.d = krcVar2 != null ? krcVar2.a : null;
                drcVar2.f = (exb) h5Var.c(10);
                drcVar2.e((zqc) h5Var.c(11));
                drcVar2.b("download");
                drcVar2.c();
                drcVar2.i = new ms5(0);
                drcVar2.k.b((zqc) h5Var.c(14));
                drcVar2.f(h5Var.a(0));
                return new os5(drcVar2.a());
            case 12:
                drc drcVar3 = new drc();
                drcVar3.e = (rrc) h5Var.c(8);
                krc krcVar3 = (krc) h5Var.c(9);
                drcVar3.d = krcVar3 != null ? krcVar3.a : null;
                drcVar3.f = (exb) h5Var.c(10);
                drcVar3.e((zqc) h5Var.c(11));
                drcVar3.a = new arc(xw3.P0("msg_round_trip", "comment_round_trip"));
                drcVar3.c();
                drcVar3.i = new ms5(1);
                drcVar3.k.b((zqc) h5Var.c(14));
                drcVar3.f(h5Var.a(0));
                return new h4b(drcVar3.a());
            case 13:
                u03 u03Var = u03.i;
                u03Var.v(new gi3(h5Var, 4));
                return u03Var;
            case 14:
                e93 e93Var = e93.i;
                e93Var.v(new gi3(h5Var, 2));
                return e93Var;
            case 15:
                return new rrc(h5Var.d(88), h5Var.d(24), h5Var.d(69), h5Var.d(54), h5Var.d(26), h5Var.d(157));
            case 16:
                return new src(h5Var.d(157), h5Var.d(54));
            case 17:
                return new trc((gue) h5Var.c(69), (xq) h5Var.c(1138), h5Var.d(157));
            case 18:
                return new wsc((Context) h5Var.c(7), (lsi) h5Var.c(35));
            case 19:
                return new pdf((xhh) h5Var.c(23), (wge) h5Var.c(344));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ozc((ite) h5Var.c(90), (xhh) h5Var.c(23), h5Var.d(670), h5Var.d(499), h5Var.d(500), h5Var.d(132), h5Var.d(572), h5Var.d(306), h5Var.d(HttpStatus.SC_NOT_IMPLEMENTED), h5Var.d(107), h5Var.d(227), h5Var.d(26), h5Var.d(85), h5Var.d(54), (w7b) h5Var.c(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION), h5Var.d(316), h5Var.d(916), h5Var.d(311), h5Var.d(312), h5Var.d(243), h5Var.d(94), h5Var.d(7), h5Var.d(244), h5Var.d(245), h5Var.d(144), h5Var.d(377), (p3d) h5Var.c(930), (sib) h5Var.c(313), (gue) h5Var.c(69), (w8g) h5Var.c(193), (apa) h5Var.c(646), h5Var.d(596), h5Var.d(229), h5Var.d(157), h5Var.d(900), h5Var.d(486), h5Var.d(136), (t51) h5Var.c(116));
            case 21:
                return new j1d((l92) h5Var.c(60), (io5) h5Var.c(58), h5Var.d(65), h5Var.d(840), h5Var.d(839), h5Var.d(23), h5Var.d(107));
            case 22:
                return new pvi(h5Var.d(23), h5Var.d(48));
            case 23:
                return new s4j(h5Var.d(85), h5Var.d(82), h5Var.d(114), h5Var.d(100));
            case 24:
                return new i70(h5Var.d(130), h5Var.d(206), h5Var.d(26), h5Var.d(85), h5Var.d(207));
            case 25:
                return new n5j((Context) h5Var.c(7), (ite) h5Var.c(90), (et3) h5Var.c(85), (pvb) h5Var.c(146), (rs6) h5Var.c(138), (tui) h5Var.c(198), h5Var.d(144), h5Var.d(136), h5Var.d(26));
            case 26:
                Application application = (Application) h5Var.c(70);
                return new k4d((ed6) h5Var.c(205), (df6) h5Var.c(196), h5Var.d(85), h5Var.d(50), h5Var.d(26), h5Var.d(54), h5Var.d(69), (d4d) h5Var.c(201), h5Var.e(194), h5Var.e(195), application);
            case 27:
                Application application2 = (Application) h5Var.c(70);
                return new w8g((ed6) h5Var.c(205), (df6) h5Var.c(196), h5Var.d(85), h5Var.d(26), h5Var.d(54), h5Var.d(69), h5Var.d(50), (d4d) h5Var.c(201), h5Var.e(194), h5Var.e(195), application2);
            case 28:
                Application application3 = (Application) h5Var.c(70);
                return new w8g((ed6) h5Var.c(205), (df6) h5Var.c(196), h5Var.d(85), h5Var.d(26), h5Var.d(54), h5Var.d(69), h5Var.d(50), (d4d) h5Var.c(201), h5Var.e(194), h5Var.e(195), application3);
            default:
                return new df6(h5Var.d(197), h5Var.d(156));
        }
    }
}
