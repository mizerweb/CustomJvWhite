package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class af0 implements zpb {
    public static final af0 a = new af0();
    public static final jp6 b = jp6.c("requestTimeMs");
    public static final jp6 c = jp6.c("requestUptimeMs");
    public static final jp6 d = jp6.c("clientInfo");
    public static final jp6 e = jp6.c("logSource");
    public static final jp6 f = jp6.c("logSourceName");
    public static final jp6 g = jp6.c("logEvent");
    public static final jp6 h = jp6.c("qosTier");

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        le9 le9Var = (le9) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.e(b, ((zh0) le9Var).a);
        zh0 zh0Var = (zh0) le9Var;
        aqbVar.e(c, zh0Var.b);
        aqbVar.a(d, zh0Var.c);
        aqbVar.a(e, zh0Var.d);
        aqbVar.a(f, zh0Var.e);
        aqbVar.a(g, zh0Var.f);
        aqbVar.a(h, rzd.a);
    }
}
