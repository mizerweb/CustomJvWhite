package defpackage;

import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class kf0 implements zpb {
    public static final kf0 a = new kf0();
    public static final jp6 b = new jp6("projectNumber", p.h(p.g(owd.class, new z30(1))));
    public static final jp6 c = new jp6("messageId", p.h(p.g(owd.class, new z30(2))));
    public static final jp6 d = new jp6("instanceId", p.h(p.g(owd.class, new z30(3))));
    public static final jp6 e = new jp6("messageType", p.h(p.g(owd.class, new z30(4))));
    public static final jp6 f = new jp6("sdkPlatform", p.h(p.g(owd.class, new z30(5))));
    public static final jp6 g = new jp6("packageName", p.h(p.g(owd.class, new z30(6))));
    public static final jp6 h = new jp6("collapseKey", p.h(p.g(owd.class, new z30(7))));
    public static final jp6 i = new jp6(LogFactory.PRIORITY_KEY, p.h(p.g(owd.class, new z30(8))));
    public static final jp6 j = new jp6("ttl", p.h(p.g(owd.class, new z30(9))));
    public static final jp6 k = new jp6("topic", p.h(p.g(owd.class, new z30(10))));
    public static final jp6 l = new jp6("bulkId", p.h(p.g(owd.class, new z30(11))));
    public static final jp6 m = new jp6("event", p.h(p.g(owd.class, new z30(12))));
    public static final jp6 n = new jp6("analyticsLabel", p.h(p.g(owd.class, new z30(13))));
    public static final jp6 o = new jp6("campaignId", p.h(p.g(owd.class, new z30(14))));
    public static final jp6 p = new jp6("composerLabel", p.h(p.g(owd.class, new z30(15))));

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        hwa hwaVar = (hwa) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.e(b, hwaVar.a);
        aqbVar.a(c, hwaVar.b);
        aqbVar.a(d, hwaVar.c);
        aqbVar.a(e, hwaVar.d);
        aqbVar.a(f, gwa.ANDROID);
        aqbVar.a(g, hwaVar.e);
        aqbVar.a(h, hwaVar.f);
        aqbVar.d(i, 0);
        aqbVar.d(j, hwaVar.g);
        aqbVar.a(k, hwaVar.h);
        aqbVar.e(l, 0L);
        aqbVar.a(m, ewa.MESSAGE_DELIVERED);
        aqbVar.a(n, hwaVar.i);
        aqbVar.e(o, 0L);
        aqbVar.a(p, hwaVar.j);
    }
}
