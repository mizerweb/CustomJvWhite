package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class kdl implements zpb {
    static final kdl a = new kdl();
    private static final jp6 b;
    private static final jp6 c;
    private static final jp6 d;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("logEventKey", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        c = new jp6("eventCount", p.h(map2));
        d6l d6lVarK3 = ewi.k(3);
        HashMap map3 = new HashMap();
        map3.put(d6lVarK3.annotationType(), d6lVarK3);
        d = new jp6("inferenceDurationStats", p.h(map3));
    }

    private kdl() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        c8l c8lVar = (c8l) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, c8lVar.a());
        aqbVar.a(c, c8lVar.c());
        aqbVar.a(d, c8lVar.b());
    }
}
