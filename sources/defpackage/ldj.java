package defpackage;

import android.content.Context;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ldj extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ ldj(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new ttj(((s7f) ((et3) h5Var.c(85))).t(), (Context) h5Var.c(7), (gjf) h5Var.c(97), (iv4) h5Var.c(87));
            case 1:
                return new joj((et3) h5Var.c(85), (iv4) h5Var.c(87), (zl7) h5Var.c(1033), (wo6) h5Var.c(54), h5Var.d(23), h5Var.d(144), h5Var.d(132), h5Var.d(237), h5Var.d(294), h5Var.d(1039), h5Var.d(168), h5Var.d(161), h5Var.d(34), h5Var.d(179), h5Var.d(7), h5Var.d(374), h5Var.d(249), h5Var.d(1041), h5Var.d(1043), (wd4) h5Var.c(24), h5Var.d(209), h5Var.d(1045), h5Var.d(146));
            case 2:
                return new dpj(((s7f) ((et3) h5Var.c(85))).t(), h5Var.d(374), h5Var.d(1034), h5Var.d(23), h5Var.d(249), h5Var.d(1044));
            case 3:
                return new etj(((s7f) ((et3) h5Var.c(85))).t(), h5Var.d(374), h5Var.d(1034), h5Var.d(23));
            case 4:
                drc drcVar = new drc();
                drcVar.e = (rrc) h5Var.c(8);
                krc krcVar = (krc) h5Var.c(9);
                drcVar.d = krcVar != null ? krcVar.a : null;
                drcVar.f = (exb) h5Var.c(10);
                drcVar.e((zqc) h5Var.c(11));
                drcVar.b("web_app");
                drcVar.d(new do1(h5Var.d(0), (rrc) h5Var.c(8), 3));
                return new qsj(drcVar.a());
            case 5:
                return new voj();
            case 6:
                return new tgb((Context) h5Var.c(7));
            case 7:
                return new u1j((Context) h5Var.c(7));
            case 8:
                return new kce((zb1) h5Var.c(56), h5Var.d(23), h5Var.d(7), h5Var.d(18), h5Var.d(54), h5Var.d(26));
            case 9:
                return new oma(h5Var.d(85), h5Var.d(54), h5Var.d(23), h5Var.d(132), h5Var.d(144), h5Var.d(UploadConfig.DEFAULT_MAX_EVENT_COUNT), h5Var.d(801), h5Var.d(802), h5Var.d(803), h5Var.d(353), h5Var.d(804), h5Var.d(805), h5Var.d(495), h5Var.d(18), h5Var.d(350));
            default:
                return new y9h(h5Var.d(134), h5Var.d(146), h5Var.d(144), h5Var.d(219), h5Var.d(561), h5Var.d(23), h5Var.d(101), h5Var.d(325), h5Var.d(353), h5Var.d(133), (t51) h5Var.c(116));
        }
    }
}
