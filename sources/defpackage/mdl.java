package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class mdl implements zpb {
    static final mdl a = new mdl();
    private static final jp6 b;
    private static final jp6 c;
    private static final jp6 d;
    private static final jp6 e;
    private static final jp6 f;
    private static final jp6 g;
    private static final jp6 h;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("errorCode", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        c = new jp6("hasResult", p.h(map2));
        d6l d6lVarK3 = ewi.k(3);
        HashMap map3 = new HashMap();
        map3.put(d6lVarK3.annotationType(), d6lVarK3);
        d = new jp6("isColdCall", p.h(map3));
        d6l d6lVarK4 = ewi.k(4);
        HashMap map4 = new HashMap();
        map4.put(d6lVarK4.annotationType(), d6lVarK4);
        e = new jp6("imageInfo", p.h(map4));
        d6l d6lVarK5 = ewi.k(5);
        HashMap map5 = new HashMap();
        map5.put(d6lVarK5.annotationType(), d6lVarK5);
        f = new jp6("options", p.h(map5));
        d6l d6lVarK6 = ewi.k(6);
        HashMap map6 = new HashMap();
        map6.put(d6lVarK6.annotationType(), d6lVarK6);
        g = new jp6("detectedBarcodeFormats", p.h(map6));
        d6l d6lVarK7 = ewi.k(7);
        HashMap map7 = new HashMap();
        map7.put(d6lVarK7.annotationType(), d6lVarK7);
        h = new jp6("detectedBarcodeValueTypes", p.h(map7));
    }

    private mdl() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        w7l w7lVar = (w7l) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, w7lVar.c());
        aqbVar.a(c, null);
        aqbVar.a(d, w7lVar.e());
        aqbVar.a(e, null);
        aqbVar.a(f, w7lVar.d());
        aqbVar.a(g, w7lVar.a());
        aqbVar.a(h, w7lVar.b());
    }
}
