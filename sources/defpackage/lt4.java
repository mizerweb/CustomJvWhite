package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lt4 implements vwh {
    public final a7g a = null;
    public final Map b;
    public final int c;

    public lt4(v2a v2aVar) {
        this.b = wm9.X0((LinkedHashMap) v2aVar.b);
        Integer num = (Integer) v2aVar.c;
        this.c = num != null ? num.intValue() : -1;
    }

    @Override // defpackage.vwh
    public final ste a() {
        return cqk.b;
    }

    public final String b() {
        a7g a7gVar = this.a;
        if (a7gVar == null) {
            return "https://0.0.0.0";
        }
        try {
            Object obj = a7gVar.get();
            if (obj != null) {
                return (String) obj;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception unused) {
            return "https://0.0.0.0";
        }
    }
}
