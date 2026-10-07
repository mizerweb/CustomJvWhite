package defpackage;

import android.content.Context;
import android.os.Build;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class ko7 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ ko7(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new gp7((Context) h5Var.c(7), h5Var.d(27), h5Var.d(97), (ite) h5Var.c(90), (xhh) h5Var.c(23));
            case 1:
                return new ma8();
            case 2:
                return new khd(new ku(h5Var.d(84), h5Var.d(82), (Context) h5Var.c(7)));
            case 3:
                Context context = (Context) h5Var.c(7);
                ifh ifhVarD = h5Var.d(85);
                ifh ifhVarD2 = h5Var.d(157);
                ifh ifhVarD3 = h5Var.d(93);
                return new oa8(context, h5Var.d(100), h5Var.d(82), h5Var.d(97), ifhVarD, h5Var.d(84), h5Var.d(332), ifhVarD3, ifhVarD2, h5Var.d(231));
            case 4:
                return na8.a;
            case 5:
                return new bf8((ite) h5Var.c(90), (wd8) h5Var.c(311), (xm) h5Var.c(312), h5Var.d(85), h5Var.d(26), h5Var.d(243), h5Var.d(294), h5Var.d(116), h5Var.d(23), (sib) h5Var.c(313), (Context) h5Var.c(7));
            case 6:
                return new l3c(h5Var.d(23), h5Var.d(138), h5Var.d(702), h5Var.d(927), h5Var.d(1018), h5Var.d(1017), (ha9) h5Var.c(30));
            case 7:
                return new gza((l3c) h5Var.c(677), (xhh) h5Var.c(23), (qf8) h5Var.c(1010), (eh9) h5Var.c(342), h5Var.d(1018), h5Var.d(1017));
            case 8:
                return new rza((xhh) h5Var.c(23), (l3c) h5Var.c(677), (eh9) h5Var.c(342));
            case 9:
                return new pf8(h5Var);
            case 10:
                return new lwd(h5Var.d(1019), h5Var.d(1017), h5Var.d(312), h5Var.d(1010), (Context) h5Var.c(7));
            case 11:
                return new rm8(h5Var.d(97), h5Var.d(85), h5Var.d(769));
            case 12:
                return new nm8(h5Var.d(175), h5Var.d(23), h5Var.d(48));
            case 13:
                e5d e5dVar = (e5d) h5Var.c(26);
                return new mta((Context) h5Var.c(7), (wo6) h5Var.c(54), h5Var.d(69), h5Var.d(577), h5Var.d(678), h5Var.d(735), h5Var.d(544), h5Var.d(168), h5Var.d(318), (l7f) h5Var.c(229), h5Var.d(23), h5Var.d(139), h5Var.d(342), (ha9) h5Var.c(30), e5dVar.X5.a(e5d.S6[363]), h5Var.d(564), h5Var.d(540), h5Var.d(566));
            case 14:
                return new kz8(h5Var.d(157));
            case 15:
                return new guc(h5Var.d(470), h5Var.d(146), (t51) h5Var.c(116), h5Var.d(101), new ifh(new ic1(h5Var, 9)), h5Var.d(219), h5Var.d(685), (ed6) h5Var.c(205), h5Var.d(480), h5Var.d(648), h5Var.d(26), h5Var.d(563));
            case 16:
                return new pa4((Context) h5Var.c(7));
            case 17:
                return new bxd(h5Var.d(7));
            case 18:
                return new wmb(h5Var.d(90), h5Var.d(34), h5Var.d(146), h5Var.d(100), h5Var.d(85));
            case 19:
                return new hz8(h5Var, (Context) h5Var.c(7), ((a2c) h5Var.c(27)).c(), new iz8(h5Var), new ifh(new ic1(h5Var, 8)), h5Var.d(341));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new poc((Context) h5Var.c(7));
            case 21:
                Context context2 = (Context) h5Var.c(7);
                lz8 lz8Var = (lz8) h5Var.c(1104);
                poc pocVar = (poc) h5Var.c(319);
                return Build.VERSION.SDK_INT >= 29 ? new ph(context2, pocVar, lz8Var) : new rz8(context2, pocVar, lz8Var);
            case 22:
                return new lz8();
            case 23:
                return new ib9((yt4) h5Var.c(48), (zed) h5Var.c(166), (rb8) h5Var.c(782), (xhh) h5Var.c(23), ((Context) h5Var.c(7)).getContentResolver(), (rs6) h5Var.c(138));
            case 24:
                return ((ib9) h5Var.c(783)).a;
            case 25:
                return new u58((Context) h5Var.c(7));
            case 26:
                return new rb8((Context) h5Var.c(7), (yt4) h5Var.c(48), (xhh) h5Var.c(23), h5Var.d(34));
            case 27:
                Context context3 = (Context) h5Var.c(7);
                ifh ifhVarD4 = h5Var.d(219);
                a2c a2cVar = (a2c) h5Var.c(27);
                od6 od6Var = a2cVar.n;
                zv8 zv8Var = a2c.t[3];
                return new whh(context3, ifhVarD4, a2cVar.e(od6Var), (svb) h5Var.c(100), (wwb) h5Var.c(682), (n25) h5Var.c(470), (zed) h5Var.c(101), (ed6) h5Var.c(205), (n30) h5Var.c(563), ((e5d) h5Var.c(26)).w());
            case 28:
                return new am7(h5Var.d(73));
            default:
                return new xwc(h5Var.d(760), h5Var.d(121), h5Var.d(34), h5Var.d(23), h5Var.d(316), h5Var.d(26), h5Var.d(144));
        }
    }
}
