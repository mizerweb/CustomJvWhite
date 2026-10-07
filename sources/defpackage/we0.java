package defpackage;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class we0 implements zpb {
    public static final we0 a = new we0();
    public static final jp6 b = jp6.c(ApiProtocol.PARAM_SDK_VERSION);
    public static final jp6 c = jp6.c("model");
    public static final jp6 d = jp6.c("hardware");
    public static final jp6 e = jp6.c("device");
    public static final jp6 f = jp6.c("product");
    public static final jp6 g = jp6.c("osBuild");
    public static final jp6 h = jp6.c(AnalyticsBaseParamsConstantsKt.MANUFACTURER);
    public static final jp6 i = jp6.c("fingerprint");
    public static final jp6 j = jp6.c("locale");
    public static final jp6 k = jp6.c("country");
    public static final jp6 l = jp6.c("mccMnc");
    public static final jp6 m = jp6.c("applicationBuild");

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        pg pgVar = (pg) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, ((ng0) pgVar).a);
        ng0 ng0Var = (ng0) pgVar;
        aqbVar.a(c, ng0Var.b);
        aqbVar.a(d, ng0Var.c);
        aqbVar.a(e, ng0Var.d);
        aqbVar.a(f, ng0Var.e);
        aqbVar.a(g, ng0Var.f);
        aqbVar.a(h, ng0Var.g);
        aqbVar.a(i, ng0Var.h);
        aqbVar.a(j, ng0Var.i);
        aqbVar.a(k, ng0Var.j);
        aqbVar.a(l, ng0Var.k);
        aqbVar.a(m, ng0Var.l);
    }
}
