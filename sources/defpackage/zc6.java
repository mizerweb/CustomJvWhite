package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zc6 implements Comparator {
    public static final ik4 c = new ik4(4);
    public final /* synthetic */ int a;
    public final Object b;

    public zc6(LinkedHashSet linkedHashSet) {
        this.a = 1;
        rw rwVar = new rw(1, new d2(10, linkedHashSet));
        int iP0 = wm9.P0(yw3.W0(rwVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0 < 16 ? 16 : iP0);
        Iterator it = rwVar.iterator();
        while (true) {
            sv5 sv5Var = (sv5) it;
            if (!sv5Var.b.hasNext()) {
                this.b = linkedHashMap;
                return;
            } else {
                dd8 dd8Var = (dd8) sv5Var.next();
                linkedHashMap.put(dd8Var.b, Integer.valueOf(dd8Var.a));
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                q8b q8bVar = (q8b) obj3;
                return cqk.i(obj != null ? q8bVar.c(Integer.MAX_VALUE, obj) : Integer.MAX_VALUE, obj2 != null ? q8bVar.c(Integer.MAX_VALUE, obj2) : Integer.MAX_VALUE);
            case 1:
                rt2 rt2Var = (rt2) obj;
                rt2 rt2Var2 = (rt2) obj2;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                Integer num = (Integer) linkedHashMap.get(Long.valueOf(rt2Var.A()));
                Integer num2 = (Integer) linkedHashMap.get(Long.valueOf(rt2Var2.A()));
                if (num != null && num2 != null) {
                    return cqk.i(num.intValue(), num2.intValue());
                }
                if (num != null) {
                    return -1;
                }
                if (num2 != null) {
                    return 1;
                }
                return tre.P(rt2Var2.B(), rt2Var.B());
            case 2:
                int iCompare = ((o6) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : e9i.D(Integer.valueOf(((ek4) obj2).p), Integer.valueOf(((ek4) obj).p));
            case 3:
                Comparable comparable = 0;
                int iCompare2 = ((b54) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                return e9i.D(thread != null ? Long.valueOf(thread.getId()) : comparable, thread2 != null ? Long.valueOf(thread2.getId()) : 0);
            case 4:
                int iCompare3 = ((zc6) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : e9i.D(Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(System.identityHashCode(obj2)));
            case 5:
                int iCompare4 = ((o6) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : e9i.D(Long.valueOf(((ge8) obj2).o()), Long.valueOf(((ge8) obj).o()));
            default:
                int iCompare5 = ((o6) obj3).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : e9i.D(((x0c) obj).c, ((x0c) obj2).c);
        }
    }

    public zc6(Collection collection) {
        int i = 0;
        this.a = 0;
        e9i.l(1, c);
        q8b q8bVar = new q8b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i >= 0) {
                q8bVar.e(i, it.next());
                i = i2;
            } else {
                xw3.V0();
                throw null;
            }
        }
        this.b = q8bVar;
    }

    public /* synthetic */ zc6(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }
}
