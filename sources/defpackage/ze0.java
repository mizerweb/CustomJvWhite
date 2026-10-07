package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ze0 implements zpb {
    public static final ze0 a = new ze0();
    public static final jp6 b = jp6.c("eventTimeMs");
    public static final jp6 c = jp6.c("eventCode");
    public static final jp6 d = jp6.c("eventUptimeMs");
    public static final jp6 e = jp6.c("sourceExtension");
    public static final jp6 f = jp6.c("sourceExtensionJsonProto3");
    public static final jp6 g = jp6.c("timezoneOffsetSeconds");
    public static final jp6 h = jp6.c("networkConnectionInfo");

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        ge9 ge9Var = (ge9) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.e(b, ((yh0) ge9Var).a);
        yh0 yh0Var = (yh0) ge9Var;
        aqbVar.a(c, yh0Var.b);
        aqbVar.e(d, yh0Var.c);
        aqbVar.a(e, yh0Var.d);
        aqbVar.a(f, yh0Var.e);
        aqbVar.e(g, yh0Var.f);
        aqbVar.a(h, yh0Var.g);
    }
}
