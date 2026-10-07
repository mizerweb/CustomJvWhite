package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qc2 {
    public final Map a;
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ya2 d;

    public qc2(String str, Map map, Context context, zqh zqhVar, qg2 qg2Var) {
        this.a = map;
        qg2Var.a(new c3(27, this), 1);
        ya2 ya2VarA = a(str);
        if (ya2VarA != null) {
            this.d = ya2VarA;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) pc2.a(str));
        qr7.n(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final ya2 a(String str) {
        synchronized (this.b) {
            try {
                ya2 ya2Var = (ya2) this.c.get(new pc2(str));
                if (ya2Var != null) {
                    return ya2Var;
                }
                rg2 rg2Var = (rg2) this.a.get(new pc2(str));
                ya2 ya2Var2 = rg2Var != null ? rg2Var.a : null;
                if (ya2Var2 != null) {
                    if (!str.equals("CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) pc2.a(str)) + " but it was actually " + ((Object) pc2.a("CXCP-Camera2"))).toString());
                    }
                    this.c.put(new pc2(str), ya2Var2);
                }
                return ya2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
