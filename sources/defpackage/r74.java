package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r74 implements h74 {
    public static final p74 h = new p74();
    public final gc6 e;
    public final n74 g;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public r74(Executor executor, ArrayList arrayList, List list, n74 n74Var) {
        gc6 gc6Var = new gc6(executor);
        this.e = gc6Var;
        this.g = n74Var;
        ArrayList<v64> arrayList2 = new ArrayList();
        arrayList2.add(v64.c(gc6Var, gc6.class, q7h.class, ryd.class));
        arrayList2.add(v64.c(this, r74.class, new Class[0]));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v64 v64Var = (v64) it.next();
            if (v64Var != null) {
                arrayList2.add(v64Var);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next());
        }
        ArrayList arrayList4 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((xwd) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList2.addAll(this.g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((v64) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.d.add(obj.toString());
                    }
                }
            }
            if (this.a.isEmpty()) {
                gm0.o(arrayList2);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList2);
                gm0.o(arrayList5);
            }
            for (final v64 v64Var2 : arrayList2) {
                this.a.put(v64Var2, new oy8(new xwd() { // from class: q74
                    @Override // defpackage.xwd
                    public final Object get() {
                        v64 v64Var3 = v64Var2;
                        return v64Var3.f.B(new g85(v64Var3, this.a));
                    }
                }));
            }
            arrayList4.addAll(f(arrayList2));
            arrayList4.addAll(h());
            e();
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            b(this.a, bool.booleanValue());
        }
    }

    public final void b(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            v64 v64Var = (v64) entry.getKey();
            xwd xwdVar = (xwd) entry.getValue();
            int i = v64Var.d;
            if (i == 1 || (i == 2 && z)) {
                xwdVar.get();
            }
        }
        gc6 gc6Var = this.e;
        synchronized (gc6Var) {
            try {
                arrayDeque = gc6Var.b;
                if (arrayDeque != null) {
                    gc6Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
        }
    }

    public final void c(boolean z) {
        HashMap map;
        AtomicReference atomicReference = this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.a);
        }
        b(map, z);
    }

    @Override // defpackage.h74
    public final synchronized xwd d(x0e x0eVar) {
        vy8 vy8Var = (vy8) this.c.get(x0eVar);
        if (vy8Var != null) {
            return vy8Var;
        }
        return h;
    }

    public final void e() {
        HashMap map = this.b;
        HashMap map2 = this.c;
        for (v64 v64Var : this.a.keySet()) {
            for (ph5 ph5Var : v64Var.c) {
                boolean z = ph5Var.b == 2;
                x0e x0eVar = ph5Var.a;
                if (z && !map2.containsKey(x0eVar)) {
                    Set set = Collections.EMPTY_SET;
                    vy8 vy8Var = new vy8();
                    vy8Var.b = null;
                    vy8Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    vy8Var.a.addAll(set);
                    map2.put(x0eVar, vy8Var);
                } else if (map.containsKey(x0eVar)) {
                    continue;
                } else {
                    int i = ph5Var.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + v64Var + ": " + x0eVar);
                    }
                    if (i != 2) {
                        map.put(x0eVar, bhc.a());
                    }
                }
            }
        }
    }

    public final ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v64 v64Var = (v64) it.next();
            if (v64Var.e == 0) {
                xwd xwdVar = (xwd) this.a.get(v64Var);
                for (x0e x0eVar : v64Var.b) {
                    HashMap map = this.b;
                    if (map.containsKey(x0eVar)) {
                        arrayList2.add(new o90((bhc) ((xwd) map.get(x0eVar)), 4, xwdVar));
                    } else {
                        map.put(x0eVar, xwdVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // defpackage.h74
    public final synchronized xwd g(x0e x0eVar) {
        tre.L(x0eVar, "Null interface requested.");
        return (xwd) this.b.get(x0eVar);
    }

    public final ArrayList h() {
        HashMap map = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            v64 v64Var = (v64) entry.getKey();
            if (v64Var.e != 0) {
                xwd xwdVar = (xwd) entry.getValue();
                for (x0e x0eVar : v64Var.b) {
                    if (!map2.containsKey(x0eVar)) {
                        map2.put(x0eVar, new HashSet());
                    }
                    ((Set) map2.get(x0eVar)).add(xwdVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                vy8 vy8Var = (vy8) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new o90(vy8Var, 5, (xwd) it.next()));
                }
            } else {
                x0e x0eVar2 = (x0e) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                vy8 vy8Var2 = new vy8();
                vy8Var2.b = null;
                vy8Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                vy8Var2.a.addAll(set);
                map.put(x0eVar2, vy8Var2);
            }
        }
        return arrayList;
    }
}
