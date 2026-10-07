package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ec7 implements AutoCloseable, cle {
    public final i4h a;
    public final zb7 b;
    public final njc c = new njc(du3.c, qjc.b);
    public final LinkedHashMap d;
    public final Set e;
    public final eu6 f;

    public ec7(i4h i4hVar, zb7 zb7Var, boolean z) {
        qjc qjcVar;
        this.a = i4hVar;
        this.b = zb7Var;
        ul9 ul9Var = i4hVar.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wm9.P0(ul9Var.i));
        Iterator it = ((vl9) ul9Var.entrySet()).iterator();
        if (!it.hasNext()) {
            this.d = linkedHashMap;
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(yw3.W0(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                bi2 bi2VarB = this.a.b(((j4h) it2.next()).a);
                if (bi2VarB == null) {
                    ore.k("Required value was null.");
                    throw null;
                }
                arrayList.add(bi2VarB);
            }
            this.e = ww3.X1(arrayList);
            this.f = new eu6(11);
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        int i = ((j4h) entry.getKey()).a;
        m78 m78Var = (m78) entry.getValue();
        bi2 bi2VarB2 = this.a.b(i);
        if (bi2VarB2 == null) {
            ore.k("Required value was null.");
            throw null;
        }
        ai2 ai2VarG = this.a.g(i);
        ai2VarG.getClass();
        List list = ai2VarG.a;
        if (z) {
            if (Build.VERSION.SDK_INT >= 33) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((xjc) it3.next()).getClass();
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 || i2 >= 33) {
                throw null;
            }
            qjcVar = qjc.b;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        ((xjc) it4.next()).getClass();
                    }
                }
            }
            qjcVar = qjc.b;
        }
        ul9 ul9Var2 = new ul9();
        for (h4h h4hVar : bi2VarB2.b) {
            ul9Var2.put(new ojc(h4hVar.a), new njc(du3.b, qjcVar));
        }
        ul9Var2.b();
        m78Var.getClass();
        throw null;
    }

    @Override // defpackage.cle
    public final void P(jme jmeVar, long j, long j2) throws Exception {
        bd7 bd7Var = new bd7(jmeVar, j, j2, this.e);
        this.c.l(j, j2, j, bd7Var.d);
        c79 c79Var = bd7Var.e;
        int size = c79Var.getSize();
        for (int i = 0; i < size; i++) {
            zc7 zc7Var = (zc7) c79Var.get(i);
            Object obj = this.d.get(new j4h(zc7Var.c));
            if (obj == null) {
                ore.k("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new ojc(zc7Var.d));
            if (obj2 == null) {
                ore.k("Required value was null.");
                return;
            }
            njc njcVar = (njc) obj2;
            njcVar.l(j, j2, j2, zc7Var);
            if (!jmeVar.t0().keySet().contains(new j4h(zc7Var.c))) {
                njcVar.b(bd7Var.a);
            }
        }
        nc7 nc7Var = new nc7(bd7Var);
        this.f.getClass();
        if (!jmeVar.x0()) {
            this.b.l();
        }
        nc7Var.l();
    }

    @Override // defpackage.cle
    public final void Y(jme jmeVar, long j, eme emeVar) throws Exception {
        this.c.g(j, new tjc(10));
        if (emeVar.l()) {
            return;
        }
        Iterator it = jmeVar.t0().keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.d.get(new j4h(((j4h) it.next()).a));
            if (map != null) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((njc) it2.next()).b(j);
                }
            }
        }
    }

    @Override // defpackage.cle
    public final void b(jme jmeVar, long j, int i, int i2) {
        Map map = (Map) this.d.get(new j4h(i));
        if (map == null) {
            return;
        }
        if (this.a.g(i) == null) {
            ore.k("Required value was null.");
        } else {
            if (!map.containsKey(new ojc(i2))) {
                ore.k("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((njc) it.next()).b(j);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.c.close();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((njc) it2.next()).close();
            }
        }
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) throws Exception {
        this.c.g(j, wgVar);
    }

    @Override // defpackage.cle
    public final void o0(fle fleVar) {
        this.b.l();
    }
}
