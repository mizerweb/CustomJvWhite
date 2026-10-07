package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class tml implements zpb {
    static final tml a = new tml();
    private static final jp6 b;
    private static final jp6 c;
    private static final jp6 d;
    private static final jp6 e;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("imageFormat", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        c = new jp6("originalImageSize", p.h(map2));
        d6l d6lVarK3 = ewi.k(3);
        HashMap map3 = new HashMap();
        map3.put(d6lVarK3.annotationType(), d6lVarK3);
        d = new jp6("compressedImageSize", p.h(map3));
        d6l d6lVarK4 = ewi.k(4);
        HashMap map4 = new HashMap();
        map4.put(d6lVarK4.annotationType(), d6lVarK4);
        e = new jp6("isOdmlImage", p.h(map4));
    }

    private tml() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        d2m d2mVar = (d2m) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, d2mVar.a());
        aqbVar.a(c, d2mVar.b());
        aqbVar.a(d, null);
        aqbVar.a(e, null);
    }
}
