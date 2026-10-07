package defpackage;

import android.content.Context;
import java.util.logging.Logger;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class swb extends o8g {
    public final /* synthetic */ int b;

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i = 20;
        int i2 = 17;
        switch (this.b) {
            case 0:
                return new o4c((Context) h5Var.c(7), h5Var.d(312), h5Var.d(23), h5Var.d(254), h5Var.d(132), h5Var.d(97), h5Var.d(26), h5Var.d(806));
            case 1:
                return new r2c((Context) h5Var.c(7));
            case 2:
                return new h5c(h5Var.d(672), h5Var.d(1118), h5Var.d(560));
            case 3:
                return new ju6((Context) h5Var.c(7));
            case 4:
                return new h4c((Context) h5Var.c(7), (ed6) h5Var.c(205), (ju6) h5Var.c(179), (gjf) h5Var.c(97), (wwb) h5Var.c(682), (v3f) h5Var.c(33), (xhh) h5Var.c(23), (wmi) h5Var.c(139), h5Var.d(26), h5Var.d(50));
            case 5:
                return (c2a) h5Var.c(1110);
            case 6:
                return (h4c) h5Var.c(1110);
            case 7:
                return new wwb(h5Var);
            case 8:
                return new gq6();
            case 9:
                qsb qsbVar = (qsb) h5Var.c(122);
                ((wxb) h5Var.c(82)).getClass();
                gjf gjfVar = (gjf) h5Var.c(97);
                psb psbVarA = qsbVar.a();
                psbVarA.c.clear();
                if (a55.a(((Number) ((g5d) gjfVar).a.d().i()).intValue()) != a55.DISABLED) {
                    psbVarA.d.add(new bf9("h5e"));
                }
                return new h5e(new qsb(psbVarA));
            case 10:
                return new uwb(h5Var);
            case 11:
                return new b56(h5Var.d(254), h5Var.d(360));
            case 12:
                Context context = (Context) h5Var.c(7);
                wxb wxbVar = wxb.a;
                return new RLottie.Config(context, true, 0.0f, new khb(i), 4, null);
            case 13:
                return new WebmConfig.Config(null, new lhb(i), 1, null);
            case 14:
                return new abb((Context) h5Var.c(7), new ifh(new ic1(h5Var, 11)), new ifh(new ic1(h5Var, 12)), new ifh(new ic1(h5Var, 13)), h5Var.d(90), new ifh(new ic1(h5Var, 14)), new qg7(h5Var.d(22), i2, h5Var.d(122)), new iz8(h5Var), Runtime.getRuntime().availableProcessors(), new en8(h5Var), new ic1(h5Var, 16));
            case 15:
                return new ss3(h5Var.d(677), h5Var.d(702), h5Var.d(1019));
            case 16:
                Context context2 = (Context) h5Var.c(7);
                Logger logger = vtc.h;
                if (context2 == null) {
                    ore.p("context could not be null.");
                    return null;
                }
                p3c p3cVar = new p3c(3, context2.getAssets());
                lc5 lc5Var = new lc5(p3cVar);
                return new vtc(new qg7(lc5Var.b, p3cVar, lc5Var.a), p90.r());
            case 17:
                return new p1g((Context) h5Var.c(7), h5Var.d(100), h5Var.d(144), h5Var.d(48), h5Var.d(85), h5Var.d(23), h5Var.d(213), h5Var.d(737), h5Var.d(26));
            case 18:
                return new flb(h5Var.d(702), new ifh(new ic1(h5Var, i2)));
            case 19:
                return new eo0((Context) h5Var.c(7), (xn3) h5Var.c(144), (gq0) h5Var.c(169), (xhh) h5Var.c(23), (yt4) h5Var.c(48));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new se4((xhh) h5Var.c(23), (onf) h5Var.c(325));
            case 21:
                return wxb.a;
            case 22:
                return new vz8((oc8) h5Var.c(546), h5Var.d(670), (xhh) h5Var.c(23));
            case 23:
                return new cxb(h5Var);
            case 24:
                return new zne(h5Var.d(290), h5Var.d(533), (xhh) h5Var.c(23), (yt4) h5Var.c(48));
            case 25:
                return new dd6((Context) h5Var.c(7), (ite) h5Var.c(90), ((n0c) ((xhh) h5Var.c(23))).b());
            case 26:
                qig qigVar = qig.g;
                qigVar.v(new gi3(h5Var, 1));
                return qigVar;
            case 27:
                return new ce7((Context) h5Var.c(7));
            case 28:
                return new tu4();
            default:
                return new exb();
        }
    }
}
