package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a5f {
    public final fi1 a;
    public final esh b;
    public final LinkedHashMap c;
    public final LinkedHashSet d;

    public a5f(fi1 fi1Var, esh eshVar) {
        fi1Var.getClass();
        eshVar.getClass();
        this.a = fi1Var;
        this.b = eshVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
    }

    public final void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x52 x52Var = ((mg1) it.next()).a;
            if (x52Var.a == v4j.b) {
                yt1 yt1Var = x52Var.b;
                yt1Var.getClass();
                linkedHashSet.add(yt1Var);
            }
        }
        Iterator it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            yt1 yt1Var2 = (yt1) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(yt1Var2)) {
                this.d.add(yt1Var2);
                it2.remove();
            }
        }
    }
}
