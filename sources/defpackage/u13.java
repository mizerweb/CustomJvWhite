package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class u13 implements hw7 {
    public final long b;
    public final long c;
    public final long d;
    public final Set e;
    public final String f = u13.class.getName();
    public final ny8 g;
    public final AtomicReference h;
    public final AtomicReference i;
    public final AtomicReference j;

    public u13(long j, long j2, long j3, Set set, ny8 ny8Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = set;
        this.g = ny8Var;
        r66 r66Var = r66.a;
        this.h = new AtomicReference(r66Var);
        this.i = new AtomicReference(r66Var);
        this.j = new AtomicReference(r66Var);
    }

    @Override // defpackage.hw7
    public final long d() {
        return ((ww2) yab.A0(k66.a, new t13(this, null, 1))).c;
    }

    @Override // defpackage.hw7
    public final long k() {
        t13 t13Var = new t13(this, null, 1);
        k66 k66Var = k66.a;
        ww2 ww2Var = (ww2) yab.A0(k66Var, t13Var);
        if (ww2Var.d == 0) {
            long j = ((rt2) yab.A0(k66Var, new t13(this, null, 0))).b.j;
            long j2 = this.c;
            if (j == j2) {
                return j2;
            }
        }
        return ww2Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    @Override // defpackage.hw7
    public final List l() {
        ArrayList arrayList;
        long j;
        List list;
        t13 t13Var = new t13(this, null, 1);
        k66 k66Var = k66.a;
        ww2 ww2Var = (ww2) yab.A0(k66Var, t13Var);
        int i = 0;
        ArrayList arrayListE = ((rt2) yab.A0(k66Var, new t13(this, null, 0))).b.n.e(mg5.REGULAR);
        List list2 = ww2Var.e;
        AtomicReference atomicReference = this.j;
        List list3 = (List) atomicReference.get();
        String str = this.f;
        AtomicReference atomicReference2 = this.i;
        AtomicReference atomicReference3 = this.h;
        if (list3 == null || list3.isEmpty()) {
            arrayList = new ArrayList(ww2Var.e);
            arrayList.addAll(arrayListE);
            gm0.n(str, "getChunks: merge media chunks");
            sb8.T(arrayList);
            j = this.d;
            if (((ex2) sb8.w(j, arrayList).b) == null) {
                arrayList.add(new ex2(j, j));
            }
            list = arrayList;
        } else {
            List list4 = (List) atomicReference3.get();
            if (list4.size() != list2.size()) {
                arrayList = new ArrayList(ww2Var.e);
                arrayList.addAll(arrayListE);
                gm0.n(str, "getChunks: merge media chunks");
                sb8.T(arrayList);
                j = this.d;
                if (((ex2) sb8.w(j, arrayList).b) == null) {
                    arrayList.add(new ex2(j, j));
                }
                list = arrayList;
            } else {
                List list5 = (List) atomicReference2.get();
                if (list5.size() != arrayListE.size()) {
                    arrayList = new ArrayList(ww2Var.e);
                    arrayList.addAll(arrayListE);
                    gm0.n(str, "getChunks: merge media chunks");
                    sb8.T(arrayList);
                    j = this.d;
                    if (((ex2) sb8.w(j, arrayList).b) == null) {
                        arrayList.add(new ex2(j, j));
                    }
                    list = arrayList;
                } else {
                    try {
                        int size = list4.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                int size2 = list5.size();
                                while (true) {
                                    if (i >= size2) {
                                        list = (List) atomicReference.get();
                                    } else {
                                        if (!qe7.s((tq3) list5.get(i), (tq3) arrayListE.get(i))) {
                                            break;
                                        }
                                        i++;
                                    }
                                }
                            } else {
                                if (!qe7.s((tq3) list4.get(i2), (tq3) list2.get(i2))) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        gm0.Y(str, "shouldMerge: Can't compare chunks because indexes changed");
                    }
                    arrayList = new ArrayList(ww2Var.e);
                    arrayList.addAll(arrayListE);
                    gm0.n(str, "getChunks: merge media chunks");
                    sb8.T(arrayList);
                    j = this.d;
                    if (((ex2) sb8.w(j, arrayList).b) == null) {
                        arrayList.add(new ex2(j, j));
                    }
                    list = arrayList;
                }
            }
        }
        atomicReference3.updateAndGet(new ea1(2, ww2Var));
        atomicReference2.updateAndGet(new ha1(1, arrayListE));
        atomicReference.updateAndGet(new ha1(2, list));
        return list;
    }
}
