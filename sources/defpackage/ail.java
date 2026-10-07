package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class ail implements zpb {
    static final ail a = new ail();
    private static final jp6 b;

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        b = new jp6("format", p.h(map));
    }

    private ail() {
    }

    @Override // defpackage.v76
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws IOException {
        ((aqb) obj2).a(b, ((fam) obj).a());
    }
}
