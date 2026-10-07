package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class i4h implements AutoCloseable {
    public static final g40 i = gvk.b(0);
    public static final g40 j = gvk.b(0);
    public static final g40 k = gvk.b(0);
    public static final g40 l = gvk.b(0);
    public static final g40 m = gvk.b(0);
    public static final List n = xw3.P0(l6m.l, l6m.m);
    public static final crg o = new crg(1);
    public static final List p = xw3.P0(new d4h(0), new d4h(34));
    public static final crg q = new crg(2);
    public final se2 a;
    public final LinkedHashMap b;
    public final List c;
    public final LinkedHashMap d;
    public final ul9 e;
    public final List f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [vjc] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [r66] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    public i4h(bg2 bg2Var, se2 se2Var, er3 er3Var, rg5 rg5Var) {
        boolean z;
        se2 se2Var2;
        ?? arrayList;
        l6m l6mVar;
        ?? r15;
        vjc vjcVar;
        Integer num;
        this.a = se2Var;
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (se2Var.h == 0) {
            bg2.U.getClass();
            if (ag2.b(bg2Var)) {
                z = false;
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                qb2 qb2Var = (qb2) bg2Var;
                Integer num2 = (Integer) qb2Var.c(key);
                if ((num2 != null && num2.intValue() == 0) || (Build.VERSION.SDK_INT >= 28 && (num = (Integer) qb2Var.c(key)) != null && num.intValue() == 4)) {
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = se2Var.c.iterator();
        while (true) {
            l6m l6mVar2 = null;
            if (!it.hasNext()) {
                Iterator it2 = this.a.b.iterator();
                while (it2.hasNext()) {
                    ai2 ai2Var = (ai2) it2.next();
                    for (xjc xjcVar : ai2Var.a) {
                        if (!linkedHashMap.containsKey(xjcVar)) {
                            g40 g40Var = l;
                            g40Var.getClass();
                            int iIncrementAndGet = g40.b.incrementAndGet(g40Var);
                            Size size = xjcVar.a;
                            int i2 = xjcVar.b;
                            String str = xjcVar.c;
                            String str2 = str == null ? this.a.a : str;
                            Integer num3 = (Integer) linkedHashMap3.get(ai2Var);
                            if (z) {
                                if (xjcVar instanceof vjc) {
                                    vjcVar = (vjc) xjcVar;
                                } else {
                                    r15 = l6mVar2;
                                }
                                if (r15 != 0) {
                                    r15 = vjcVar;
                                    l6mVar = r15.i;
                                } else {
                                    r15 = vjcVar;
                                    l6mVar = l6mVar2;
                                }
                            } else {
                                r15 = vjcVar;
                                l6mVar = l6mVar2;
                            }
                            g4h g4hVar = new g4h(iIncrementAndGet, size, i2, str2, num3, l6mVar, xjcVar.d, xjcVar.e, xjcVar.f, xjcVar.g, xjcVar.h);
                            linkedHashMap.put(xjcVar, g4hVar);
                            arrayList2.add(g4hVar);
                            it2 = it2;
                            l6mVar2 = null;
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                int size2 = this.a.b.size();
                int i3 = 0;
                while (true) {
                    se2Var2 = this.a;
                    if (i3 >= size2) {
                        break;
                    }
                    ai2 ai2Var2 = (ai2) se2Var2.b.get(i3);
                    List list = ai2Var2.a;
                    ArrayList arrayList4 = new ArrayList(yw3.W0(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        g4h g4hVar2 = (g4h) linkedHashMap.get((xjc) it3.next());
                        g40 g40Var2 = j;
                        g40Var2.getClass();
                        h4h h4hVar = new h4h(g40.b.incrementAndGet(g40Var2), g4hVar2.c, g4hVar2.h, g4hVar2.g, g4hVar2.i, g4hVar2.j, g4hVar2.b, g4hVar2.d, g4hVar2.f);
                        linkedHashMap4.put(h4hVar, g4hVar2);
                        arrayList4.add(h4hVar);
                        size2 = size2;
                    }
                    int i4 = size2;
                    g40 g40Var3 = i;
                    g40Var3.getClass();
                    bi2 bi2Var = new bi2(g40.b.incrementAndGet(g40Var3), arrayList4);
                    linkedHashMap2.put(ai2Var2, bi2Var);
                    arrayList3.add(bi2Var);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((h4h) it4.next()).j = bi2Var;
                    }
                    Iterator it5 = ai2Var2.a.iterator();
                    while (it5.hasNext()) {
                        ((g4h) linkedHashMap.get((xjc) it5.next())).l.add(bi2Var);
                    }
                    i3++;
                    size2 = i4;
                }
                ArrayList<fi8> arrayList5 = se2Var2.d;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(yw3.W0(arrayList5, 10));
                    for (fi8 fi8Var : arrayList5) {
                        g40 g40Var4 = k;
                        g40Var4.getClass();
                        int iIncrementAndGet2 = g40.b.incrementAndGet(g40Var4);
                        fi8Var.getClass();
                        arrayList.add(new f4h(iIncrementAndGet2, fi8Var.b));
                    }
                } else {
                    arrayList = r66.a;
                }
                this.f = arrayList;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj : arrayList3) {
                    ArrayList arrayList8 = ((bi2) obj).b;
                    if (!arrayList8.isEmpty()) {
                        Iterator it6 = arrayList8.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                akc akcVar = ((h4h) it6.next()).g;
                                if (akcVar == null ? false : akc.a(akcVar.a, 1L)) {
                                    arrayList6.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                    arrayList7.add(obj);
                }
                if (arrayList6.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        ArrayList arrayList11 = ((bi2) obj2).b;
                        if (!arrayList11.isEmpty()) {
                            Iterator it7 = arrayList11.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (ww3.j1(n, ((h4h) it7.next()).h)) {
                                        arrayList9.add(obj2);
                                        break;
                                    }
                                }
                            }
                        }
                        arrayList10.add(obj2);
                    }
                    if (arrayList9.isEmpty()) {
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj3 : arrayList3) {
                            ArrayList arrayList14 = ((bi2) obj3).b;
                            if (!arrayList14.isEmpty()) {
                                Iterator it8 = arrayList14.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        if (p.contains(new d4h(((h4h) it8.next()).c))) {
                                            arrayList12.add(obj3);
                                            break;
                                        }
                                    }
                                }
                            }
                            arrayList13.add(obj3);
                        }
                        if (!arrayList12.isEmpty()) {
                            arrayList3 = ww3.G1(arrayList13, ww3.M1(arrayList12, q));
                        }
                    } else {
                        arrayList3 = ww3.G1(arrayList10, ww3.M1(arrayList9, o));
                    }
                } else {
                    arrayList3 = ww3.G1(arrayList7, arrayList6);
                }
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    ArrayList arrayList17 = ((bi2) obj4).b;
                    if (arrayList17.isEmpty()) {
                        arrayList16.add(obj4);
                        break;
                    }
                    Iterator it9 = arrayList17.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            akc akcVar2 = ((h4h) it9.next()).g;
                            if (akcVar2 == null ? false : akc.a(akcVar2.a, 3L)) {
                                arrayList15.add(obj4);
                                break;
                            }
                        } else {
                            arrayList16.add(obj4);
                            break;
                            break;
                        }
                    }
                }
                if (arrayList15.isEmpty()) {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj5 : arrayList3) {
                        ArrayList arrayList20 = ((bi2) obj5).b;
                        if (!arrayList20.isEmpty()) {
                            Iterator it10 = arrayList20.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    bkc bkcVar = ((h4h) it10.next()).i;
                                    if (bkcVar == null ? false : bkc.a(bkcVar.a, 1L)) {
                                        arrayList18.add(obj5);
                                    }
                                }
                            }
                        }
                        arrayList19.add(obj5);
                    }
                    if (!arrayList18.isEmpty()) {
                        arrayList3 = ww3.G1(arrayList18, arrayList19);
                    }
                } else {
                    arrayList3 = ww3.G1(arrayList15, arrayList16);
                }
                this.g = arrayList3;
                ArrayList arrayList21 = new ArrayList(yw3.W0(arrayList3, 10));
                Iterator it11 = arrayList3.iterator();
                while (it11.hasNext()) {
                    arrayList21.add(new j4h(((bi2) it11.next()).a));
                }
                ww3.X1(arrayList21);
                this.b = linkedHashMap2;
                this.c = ww3.M1(arrayList2, new mu1(10, this));
                this.d = linkedHashMap4;
                ArrayList arrayList22 = this.g;
                ArrayList arrayList23 = new ArrayList();
                Iterator it12 = arrayList22.iterator();
                while (it12.hasNext()) {
                    cx3.Z0(((bi2) it12.next()).b, arrayList23);
                }
                this.h = arrayList23;
                ul9 ul9Var = new ul9();
                Iterator it13 = this.a.b.iterator();
                while (it13.hasNext()) {
                    ((ai2) it13.next()).getClass();
                }
                this.e = ul9Var.b();
                return;
            }
            List<ai2> list2 = (List) it.next();
            if (list2.isEmpty()) {
                ore.k("Check failed.");
                throw null;
            }
            List list3 = this.a.b;
            ArrayList arrayList24 = new ArrayList();
            Iterator it14 = list3.iterator();
            while (it14.hasNext()) {
                cx3.Z0(((ai2) it14.next()).a, arrayList24);
            }
            ArrayList arrayList25 = new ArrayList();
            Iterator it15 = arrayList24.iterator();
            while (it15.hasNext()) {
                it15.next();
            }
            ArrayList arrayList26 = new ArrayList();
            Iterator it16 = arrayList25.iterator();
            if (it16.hasNext()) {
                throw qt4.h(it16);
            }
            g40 g40Var5 = m;
            g40Var5.getClass();
            int iIncrementAndGet3 = g40.b.incrementAndGet(g40Var5);
            while (arrayList26.contains(Integer.valueOf(iIncrementAndGet3))) {
                iIncrementAndGet3 = g40.b.incrementAndGet(g40Var5);
            }
            for (ai2 ai2Var3 : list2) {
                if (linkedHashMap3.containsKey(ai2Var3)) {
                    ore.k("Check failed.");
                    throw null;
                }
                linkedHashMap3.put(ai2Var3, Integer.valueOf(iIncrementAndGet3));
            }
        }
    }

    public final bi2 b(int i2) {
        Object next;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((bi2) next).a == i2) {
                return (bi2) next;
            }
        }
        next = null;
        return (bi2) next;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        for (AutoCloseable autoCloseable : (wl9) this.e.values()) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    ore.a();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public final ai2 g(int i2) {
        Object next;
        Iterator it = this.b.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bi2) ((Map.Entry) next).getValue()).a != i2);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (ai2) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this.b + ')';
    }
}
