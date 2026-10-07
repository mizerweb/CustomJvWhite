package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class fnl implements zpb {
    static final fnl a = new fnl();
    private static final jp6 b;
    private static final jp6 c;
    private static final jp6 d;
    private static final jp6 e;
    private static final jp6 f;
    private static final jp6 g;
    private static final jp6 h;
    private static final jp6 i;
    private static final jp6 j;
    private static final jp6 k;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("durationMs", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        c = new jp6("errorCode", p.h(map2));
        d6l d6lVarK3 = ewi.k(3);
        HashMap map3 = new HashMap();
        map3.put(d6lVarK3.annotationType(), d6lVarK3);
        d = new jp6("isColdCall", p.h(map3));
        d6l d6lVarK4 = ewi.k(4);
        HashMap map4 = new HashMap();
        map4.put(d6lVarK4.annotationType(), d6lVarK4);
        e = new jp6("autoManageModelOnBackground", p.h(map4));
        d6l d6lVarK5 = ewi.k(5);
        HashMap map5 = new HashMap();
        map5.put(d6lVarK5.annotationType(), d6lVarK5);
        f = new jp6("autoManageModelOnLowMemory", p.h(map5));
        d6l d6lVarK6 = ewi.k(6);
        HashMap map6 = new HashMap();
        map6.put(d6lVarK6.annotationType(), d6lVarK6);
        g = new jp6("isNnApiEnabled", p.h(map6));
        d6l d6lVarK7 = ewi.k(7);
        HashMap map7 = new HashMap();
        map7.put(d6lVarK7.annotationType(), d6lVarK7);
        h = new jp6("eventsCount", p.h(map7));
        d6l d6lVarK8 = ewi.k(8);
        HashMap map8 = new HashMap();
        map8.put(d6lVarK8.annotationType(), d6lVarK8);
        i = new jp6("otherErrors", p.h(map8));
        d6l d6lVarK9 = ewi.k(9);
        HashMap map9 = new HashMap();
        map9.put(d6lVarK9.annotationType(), d6lVarK9);
        j = new jp6("remoteConfigValueForAcceleration", p.h(map9));
        d6l d6lVarK10 = ewi.k(10);
        HashMap map10 = new HashMap();
        map10.put(d6lVarK10.annotationType(), d6lVarK10);
        k = new jp6("isAccelerated", p.h(map10));
    }

    private fnl() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        o2m o2mVar = (o2m) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, o2mVar.e());
        aqbVar.a(c, o2mVar.a());
        aqbVar.a(d, o2mVar.d());
        aqbVar.a(e, o2mVar.b());
        aqbVar.a(f, o2mVar.c());
        aqbVar.a(g, null);
        aqbVar.a(h, null);
        aqbVar.a(i, null);
        aqbVar.a(j, null);
        aqbVar.a(k, null);
    }
}
