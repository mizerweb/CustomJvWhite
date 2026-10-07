package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class txl implements zpb {
    static final txl a = new txl();
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
    private static final jp6 l;
    private static final jp6 m;
    private static final jp6 n;
    private static final jp6 o;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("appId", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        c = new jp6("appVersion", p.h(map2));
        d6l d6lVarK3 = ewi.k(3);
        HashMap map3 = new HashMap();
        map3.put(d6lVarK3.annotationType(), d6lVarK3);
        d = new jp6("firebaseProjectId", p.h(map3));
        d6l d6lVarK4 = ewi.k(4);
        HashMap map4 = new HashMap();
        map4.put(d6lVarK4.annotationType(), d6lVarK4);
        e = new jp6("mlSdkVersion", p.h(map4));
        d6l d6lVarK5 = ewi.k(5);
        HashMap map5 = new HashMap();
        map5.put(d6lVarK5.annotationType(), d6lVarK5);
        f = new jp6("tfliteSchemaVersion", p.h(map5));
        d6l d6lVarK6 = ewi.k(6);
        HashMap map6 = new HashMap();
        map6.put(d6lVarK6.annotationType(), d6lVarK6);
        g = new jp6("gcmSenderId", p.h(map6));
        d6l d6lVarK7 = ewi.k(7);
        HashMap map7 = new HashMap();
        map7.put(d6lVarK7.annotationType(), d6lVarK7);
        h = new jp6("apiKey", p.h(map7));
        d6l d6lVarK8 = ewi.k(8);
        HashMap map8 = new HashMap();
        map8.put(d6lVarK8.annotationType(), d6lVarK8);
        i = new jp6("languages", p.h(map8));
        d6l d6lVarK9 = ewi.k(9);
        HashMap map9 = new HashMap();
        map9.put(d6lVarK9.annotationType(), d6lVarK9);
        j = new jp6("mlSdkInstanceId", p.h(map9));
        d6l d6lVarK10 = ewi.k(10);
        HashMap map10 = new HashMap();
        map10.put(d6lVarK10.annotationType(), d6lVarK10);
        k = new jp6("isClearcutClient", p.h(map10));
        d6l d6lVarK11 = ewi.k(11);
        HashMap map11 = new HashMap();
        map11.put(d6lVarK11.annotationType(), d6lVarK11);
        l = new jp6("isStandaloneMlkit", p.h(map11));
        d6l d6lVarK12 = ewi.k(12);
        HashMap map12 = new HashMap();
        map12.put(d6lVarK12.annotationType(), d6lVarK12);
        m = new jp6("isJsonLogging", p.h(map12));
        d6l d6lVarK13 = ewi.k(13);
        HashMap map13 = new HashMap();
        map13.put(d6lVarK13.annotationType(), d6lVarK13);
        n = new jp6("buildLevel", p.h(map13));
        d6l d6lVarK14 = ewi.k(14);
        HashMap map14 = new HashMap();
        map14.put(d6lVarK14.annotationType(), d6lVarK14);
        o = new jp6("optionalModuleVersion", p.h(map14));
    }

    private txl() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        j9m j9mVar = (j9m) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, j9mVar.g());
        aqbVar.a(c, j9mVar.h());
        aqbVar.a(d, null);
        aqbVar.a(e, j9mVar.j());
        aqbVar.a(f, j9mVar.k());
        aqbVar.a(g, null);
        aqbVar.a(h, null);
        aqbVar.a(i, j9mVar.a());
        aqbVar.a(j, j9mVar.i());
        aqbVar.a(k, j9mVar.b());
        aqbVar.a(l, j9mVar.d());
        aqbVar.a(m, j9mVar.c());
        aqbVar.a(n, j9mVar.e());
        aqbVar.a(o, j9mVar.f());
    }
}
