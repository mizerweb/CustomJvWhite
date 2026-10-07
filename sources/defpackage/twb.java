package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class twb extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ twb(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new wr8(h5Var.d(1002), h5Var.d(144), h5Var.d(23));
            case 1:
                return new gl8(h5Var.d(85), h5Var.d(97), h5Var.d(1125));
            case 2:
                return ((Application) h5Var.c(70)).getResources();
            case 3:
                return new a1c(h5Var.d(101), h5Var.d(100), h5Var.d(326), h5Var.d(82));
            case 4:
                return new lac(h5Var.d(922), (Context) h5Var.c(7), (zed) h5Var.c(166), h5Var.d(582));
            case 5:
                return new kzd(new ifh(new u02(h5Var, 3)), h5Var.d(157), h5Var.d(85), h5Var.d(26), h5Var.d(100), h5Var.d(146), h5Var.d(225), h5Var.d(219), h5Var.d(84), (ha9) h5Var.c(30));
            case 6:
                return (u7f) h5Var.c(1131);
            case 7:
                return new u7f((Context) h5Var.c(7), h5Var.d(166), (d95) h5Var.c(679), h5Var.d(735), h5Var.d(678), h5Var.d(662), h5Var.d(681));
            case 8:
                wmi wmiVar = (wmi) h5Var.c(139);
                wo6 wo6Var = (wo6) h5Var.c(54);
                xhh xhhVar = (xhh) h5Var.c(23);
                ifh ifhVarD = h5Var.d(138);
                u50 u50Var = new u50();
                u50Var.a = ifhVarD;
                dq4 dq4VarD = cqk.D(cqk.D(wmiVar, wk8.a()), ((n0c) xhhVar).b());
                u50Var.b = new mj9(200);
                u50Var.c = u50.class.getName();
                yab.i0(dq4VarD, null, 0, new wyj(u50Var, null, 2), 3);
                return new t75(wo6Var, u50Var, (m7f) h5Var.c(300), wmiVar);
            case 9:
                return new w7b((xte) h5Var.c(1137), (xhh) h5Var.c(23), (yt4) h5Var.c(48), h5Var.d(129), h5Var.d(130), h5Var.d(153));
            case 10:
                return new vxb((pa4) h5Var.c(738), (Context) h5Var.c(7), h5Var.d(806));
            case 11:
                return new hxb(new ifh(new u02(h5Var, 4)));
            case 12:
                return new qu((gue) h5Var.c(69), h5Var.d(477), h5Var.d(685), ((n0c) ((xhh) h5Var.c(23))).b().R0(1, "app-visibility-logic"), h5Var.d(34));
            case 13:
                return new vz4(h5Var.d(567), h5Var.d(101), h5Var.d(458), h5Var.d(290), h5Var.d(457), h5Var.d(234), (ubb) h5Var.c(656), (r77) h5Var.c(75), h5Var.d(144), h5Var.d(586), h5Var.d(450), h5Var.d(446), h5Var.d(205), h5Var.d(HttpStatus.SC_UNPROCESSABLE_ENTITY), h5Var.d(138), h5Var.d(136), h5Var.d(317), h5Var.d(318), h5Var.d(146), h5Var.d(116), h5Var.d(587), h5Var.d(23), h5Var.d(24), h5Var.d(295), h5Var.d(263), h5Var.d(262), h5Var.d(17), h5Var.d(296), h5Var.d(26), h5Var.d(132), h5Var.d(17), h5Var.d(442), h5Var.d(221), h5Var.d(516), h5Var.d(131), h5Var.d(495), h5Var.d(696), h5Var.b(5), h5Var.d(16), h5Var.d(179), h5Var.d(292), h5Var.d(127), h5Var.d(274), h5Var.d(275), h5Var.d(276), h5Var.d(267), h5Var.d(268), h5Var.d(279), h5Var.d(280));
            case 14:
                lte lteVar = (lte) h5Var.c(1132);
                int iIntValue = ((Number) ((e5d) h5Var.c(26)).O3.a(e5d.S6[250]).i()).intValue();
                ExecutorService executorServiceC = iIntValue <= 0 ? ((a2c) h5Var.c(27)).c() : a2c.f((a2c) h5Var.c(27), "wm-db-", iIntValue, iIntValue, false, true, 0, 96);
                ga4 ga4Var = new ga4();
                ga4Var.a = Math.min(100, 50);
                ga4Var.c = executorServiceC;
                ga4Var.b = ((a2c) h5Var.c(27)).a();
                ga4Var.d = lteVar;
                return new ja4(ga4Var);
            case 15:
                return new d1c(new ei3(13, (svb) h5Var.c(100)));
            case 16:
                return new gxb(h5Var);
            case 17:
                return new p4c((Context) h5Var.c(7), (zed) h5Var.c(101), (b56) h5Var.c(322), new p3c(0), (gxb) h5Var.c(1109), (ed6) h5Var.c(205), h5Var.d(219), (woh) h5Var.c(583), (o4c) h5Var.c(673), h5Var.d(309), (pa4) h5Var.c(738), (jc9) h5Var.c(78));
            case 18:
                w4 w4Var = new w4();
                w4Var.a = h5Var.d(87);
                return new c1c(w4Var);
            case 19:
                return (c1c) h5Var.c(1094);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zte zteVar = (zte) h5Var.c(91);
                aue aueVar = (aue) zteVar;
                return new cx5(e9i.G0(e9i.T(e9i.I(new jz(aueVar.f(), 21)), ((n0c) ((xhh) h5Var.c(23))).c().S0()), cqk.a(lvb.x0(vd7.a(), (yt4) h5Var.c(48))), j0g.a, rx8.c(((Number) aueVar.f().f()).intValue())));
            case 21:
                return new o1c((gjg) h5Var.c(1000));
            case 22:
                return new lte();
            case 23:
                return new v6h();
            case 24:
                return (ed6) m94.j.getValue();
            case 25:
                return (yt4) m94.k.getValue();
            case 26:
                return new ite(((n0c) ((xhh) h5Var.c(23))).a(), (yt4) h5Var.c(48));
            case 27:
                return lvb.w0((Context) h5Var.c(7));
            case 28:
                return new xte((Context) h5Var.c(7), (xhh) h5Var.c(23), (gue) h5Var.c(69), (yt4) h5Var.c(48));
            default:
                return new cue((xhh) h5Var.c(23), (yt4) h5Var.c(48));
        }
    }
}
