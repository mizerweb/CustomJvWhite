package defpackage;

import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class bbl implements zpb {
    public static final bbl a = new bbl();
    public static final jp6 b = new jp6(SdkMetricStatEvent.NAME_KEY, p.h(ewi.g(xqk.class, new ppk(1))));
    public static final jp6 c = new jp6("version", p.h(ewi.g(xqk.class, new ppk(2))));
    public static final jp6 d = new jp6("source", p.h(ewi.g(xqk.class, new ppk(3))));
    public static final jp6 e = new jp6("uri", p.h(ewi.g(xqk.class, new ppk(4))));
    public static final jp6 f = new jp6("hash", p.h(ewi.g(xqk.class, new ppk(5))));
    public static final jp6 g = new jp6("modelType", p.h(ewi.g(xqk.class, new ppk(6))));
    public static final jp6 h = new jp6("size", p.h(ewi.g(xqk.class, new ppk(7))));
    public static final jp6 i = new jp6("hasLabelMap", p.h(ewi.g(xqk.class, new ppk(8))));
    public static final jp6 j = new jp6("isManifestModel", p.h(ewi.g(xqk.class, new ppk(9))));

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        evl evlVar = (evl) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, evlVar.a);
        aqbVar.a(c, null);
        aqbVar.a(d, evlVar.b);
        aqbVar.a(e, null);
        aqbVar.a(f, evlVar.c);
        aqbVar.a(g, evlVar.d);
        aqbVar.a(h, null);
        aqbVar.a(i, null);
        aqbVar.a(j, null);
    }
}
