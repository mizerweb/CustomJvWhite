package defpackage;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gbb {
    public static final AtomicReference a = new AtomicReference(new HashMap());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ny8 c;
    public static final ny8 d;
    public static final ny8 e;
    public static final ny8 f;
    public static final ny8 g;
    public static final iz8 h;
    public static final ifh i;
    public static final ifh j;

    static {
        abb abbVar = cqk.e;
        c = (abbVar != null ? abbVar : null).a;
        d = (abbVar != null ? abbVar : null).b;
        e = (abbVar != null ? abbVar : null).c;
        f = (abbVar != null ? abbVar : null).d;
        g = (abbVar != null ? abbVar : null).e;
        if (abbVar == null) {
            abbVar = null;
        }
        h = abbVar.g;
        i = new ifh(new cka(4));
        j = new ifh(new cka(5));
    }

    public static final dbb a(String str, int i2, boolean z) {
        String str2;
        boolean z2;
        pc5 pc5Var;
        if (((Boolean) g.getValue()).booleanValue()) {
            dbb dbbVar = (dbb) b.computeIfAbsent(str, new am(13, new fbb(str, i2, z)));
            if (z) {
                dbbVar.a();
            }
            return dbbVar;
        }
        while (true) {
            AtomicReference atomicReference = a;
            HashMap map = (HashMap) atomicReference.get();
            HashMap map2 = new HashMap(map);
            dbb dbbVar2 = (dbb) map2.get(str);
            if (dbbVar2 == null) {
                abb abbVar = cqk.e;
                if (abbVar == null) {
                    abbVar = null;
                }
                qg7 qg7Var = abbVar.f;
                int iD = qt4.D(i2);
                if (iD == 0) {
                    pc5Var = (pc5) i.getValue();
                } else {
                    if (iD != 1) {
                        ore.o();
                        return null;
                    }
                    pc5Var = (pc5) j.getValue();
                }
                str2 = str;
                z2 = z;
                nz0 nz0Var = new nz0(qg7Var, pc5Var, (ExecutorService) c.getValue(), str2, z2);
                map2.put(str2, nz0Var);
                nz0Var.f();
                map2.put(str2, nz0Var);
                dbbVar2 = nz0Var;
            } else {
                str2 = str;
                z2 = z;
            }
            do {
                if (atomicReference.compareAndSet(map, map2)) {
                    if (z2) {
                        dbbVar2.a();
                    }
                    return dbbVar2;
                }
            } while (atomicReference.get() == map);
            str = str2;
            z = z2;
        }
    }
}
