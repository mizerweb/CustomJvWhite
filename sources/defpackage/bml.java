package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class bml implements zpb {
    static final bml a = new bml();
    private static final jp6 b;
    private static final jp6 c;
    private static final jp6 d;
    private static final jp6 e;
    private static final jp6 f;
    private static final jp6 g;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("maxMs", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        c = new jp6("minMs", p.h(map2));
        d6l d6lVarK3 = ewi.k(3);
        HashMap map3 = new HashMap();
        map3.put(d6lVarK3.annotationType(), d6lVarK3);
        d = new jp6("avgMs", p.h(map3));
        d6l d6lVarK4 = ewi.k(4);
        HashMap map4 = new HashMap();
        map4.put(d6lVarK4.annotationType(), d6lVarK4);
        e = new jp6("firstQuartileMs", p.h(map4));
        d6l d6lVarK5 = ewi.k(5);
        HashMap map5 = new HashMap();
        map5.put(d6lVarK5.annotationType(), d6lVarK5);
        f = new jp6("medianMs", p.h(map5));
        d6l d6lVarK6 = ewi.k(6);
        HashMap map6 = new HashMap();
        map6.put(d6lVarK6.annotationType(), d6lVarK6);
        g = new jp6("thirdQuartileMs", p.h(map6));
    }

    private bml() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        p1m p1mVar = (p1m) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, p1mVar.c());
        aqbVar.a(c, p1mVar.e());
        aqbVar.a(d, p1mVar.a());
        aqbVar.a(e, p1mVar.b());
        aqbVar.a(f, p1mVar.d());
        aqbVar.a(g, p1mVar.f());
    }
}
