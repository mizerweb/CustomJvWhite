package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s86 {
    public static final s86 e = new s86(p86.a, 1, c76.a);
    public final p86 a;
    public final int b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public s86(p86 p86Var, int i, Set set) {
        this.a = p86Var;
        this.b = i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            fx5 fx5Var = (fx5) it.next();
            al2 al2Var = new al2(new vn0(this.a, fx5Var), this.b);
            if (!new ArrayList(al2Var.a.keySet()).isEmpty()) {
                this.c.put(fx5Var, al2Var);
            }
        }
        this.c.keySet();
    }

    public final al2 a(fx5 fx5Var) {
        boolean zB = fx5Var.b();
        LinkedHashMap linkedHashMap = this.c;
        if (zB) {
            return (al2) linkedHashMap.get(fx5Var);
        }
        LinkedHashMap linkedHashMap2 = this.d;
        Object al2Var = linkedHashMap2.get(fx5Var);
        if (al2Var == null) {
            al2Var = mvl.b(fx5Var, linkedHashMap.keySet()) ? new al2(new vn0(this.a, fx5Var), this.b) : null;
            linkedHashMap2.put(fx5Var, al2Var);
        }
        return (al2) al2Var;
    }
}
