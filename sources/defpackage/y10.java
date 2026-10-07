package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class y10 {
    public final xhh a;
    public final qg7 b;
    public final iw7 c;
    public final s00 d;
    public final xhe e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final wo8 j;
    public final vt4 k;
    public final dq4 l;
    public final dq4 m;
    public final mjg n;
    public final mjg o;
    public final m3 p;
    public final ConcurrentHashMap.KeySetView q;
    public final ConcurrentHashMap.KeySetView r;
    public final p41 s;
    public final AtomicReference t;
    public final qg7 u;
    public final h81 v;
    public final v56 w;
    public final w4 x;
    public final AtomicBoolean y;

    public y10(yt4 yt4Var, String str, xhh xhhVar, qg7 qg7Var, iw7 iw7Var, s00 s00Var, xhe xheVar, int i, int i2, boolean z, int i3) {
        int i4 = (i3 & np0.n) != 0 ? i : i2;
        boolean z2 = (i3 & np0.o) == 0;
        boolean z3 = (i3 & 1024) != 0 ? true : z;
        this.a = xhhVar;
        this.b = qg7Var;
        this.c = iw7Var;
        this.d = s00Var;
        this.e = xheVar;
        this.f = i;
        this.g = i4;
        this.h = z2;
        this.i = z3;
        wo8 wo8VarA = vd7.a();
        this.j = wo8VarA;
        n0c n0cVar = (n0c) xhhVar;
        xt4 xt4VarA = n0cVar.a();
        xt4VarA.getClass();
        vt4 vt4VarU0 = lvb.x0(xt4VarA, wo8VarA).u0(new zt4(new z00(0, this), yt4Var));
        this.k = vt4VarU0;
        this.l = cqk.a(vt4VarU0.u0(n0cVar.a().R0(1, str)).u0(new wo8(wo8VarA)));
        this.m = cqk.a(vt4VarU0.u0(n0cVar.b()).u0(new nah(wo8VarA)));
        this.n = p90.a(null);
        this.o = p90.a(-1L);
        m3 m3Var = new m3(new i10(0, 0, y10.class, this, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;"));
        this.p = m3Var;
        this.q = ConcurrentHashMap.newKeySet();
        this.r = ConcurrentHashMap.newKeySet();
        this.s = yab.b(80, 1, null, 4);
        this.t = new AtomicReference(b10.a);
        this.u = new qg7(qg7Var, 1, new d2(5, this));
        this.v = new h81(qg7Var, m3Var, z2, new i10(0, 1, y10.class, this, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;"), new g3(2, this));
        this.w = new v56(4, this);
        this.x = new w4(this);
        this.y = new AtomicBoolean(false);
        qg7Var.r("initialized @" + System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        if (r14.u(r1, r6) == r11) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.y10 r14, long r15, boolean r17, boolean r18, defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.b(y10, long, boolean, boolean, nq4):java.lang.Object");
    }

    public static /* synthetic */ Object o(y10 y10Var, long j, boolean z, boolean z2, lq4 lq4Var, int i) {
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            z = false;
        }
        return y10Var.n(j, z3, z, (i & 8) != 0 ? false : z2, lq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x0220  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a2, code lost:
    
        if (r1.u(r29, r10) == r15) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object p(defpackage.y10 r28, long r29, boolean r31, boolean r32, boolean r33, defpackage.lq4 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.p(y10, long, boolean, boolean, boolean, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r15.u(r0, r11) == r13) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object x(defpackage.y10 r15, long r16, boolean r18, boolean r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.x(y10, long, boolean, boolean, nq4):java.lang.Object");
    }

    public final void A(hr2 hr2Var, f10 f10Var) {
        if ((f10Var instanceof c10) || (f10Var instanceof b10)) {
            G(hr2Var, f10Var, (f10) this.t.getAndSet(f10Var));
            return;
        }
        f10 f10Var2 = (f10) this.t.getAndUpdate(new cz(1, f10Var));
        f10 f10Var3 = f10Var2 instanceof c10 ? (c10) f10Var2 : null;
        if (f10Var3 == null) {
            f10Var3 = f10Var;
        }
        if (!this.i || ((!(f10Var3 instanceof e10) && !(f10Var3 instanceof d10)) || !f10Var3.equals(f10Var2))) {
            if (f10Var3 instanceof c10) {
                return;
            }
            G(hr2Var, f10Var, f10Var2);
            return;
        }
        String str = (String) this.b.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Skip pipeline state: " + f10Var + " because it's equals to prev: " + f10Var2, null);
        }
    }

    public abstract Object B(List list, boolean z, boolean z2, lq4 lq4Var);

    public void C() {
    }

    public final void D(long j, long j2, List list) {
        StringBuilder sbS = qt4.s(j, "removeGapsBetween: start:", ", end:");
        sbS.append(j2);
        this.b.r(sbS.toString());
        int size = list.size();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            kw7 kw7Var = (kw7) list.get(i3);
            if (!(kw7Var instanceof jw7)) {
                long c = kw7Var.getC();
                if (c >= j && c <= j2) {
                    if (i == -1) {
                        i = i3;
                    }
                    i2 = i3;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            return;
        }
        while (i <= i2) {
            if (list.get(i) instanceof jw7) {
                int i4 = i + 1;
                while (i4 <= i2 && (list.get(i4) instanceof jw7)) {
                    i4++;
                }
                list.subList(i, i4).clear();
                i2 -= i4 - i;
            } else {
                i++;
            }
        }
    }

    public final void E(long j) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.o;
            value = mjgVar.getValue();
            ((Number) value).longValue();
        } while (!mjgVar.h(value, Long.valueOf(j)));
    }

    public final void F(gw7 gw7Var) {
        mjg mjgVar;
        Object value;
        hw7 hw7Var;
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
            hw7Var = (hw7) value;
            if (hw7Var != null && !cqk.o(gw7Var, hw7Var, this.b)) {
                hw7Var = gw7Var;
            }
        } while (!mjgVar.h(value, hw7Var));
    }

    public final void G(hr2 hr2Var, f10 f10Var, f10 f10Var2) {
        je9 je9Var = je9.d;
        Object objC = hr2Var.c(f10Var);
        if (objC instanceof bs2) {
            String str = (String) this.b.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                Throwable thA = ds2.a(objC);
                a4cVar.c(je9Var, str, "Skip pipeline state: " + f10Var + ", because closed, " + (thA != null ? thA.getMessage() : null), null);
                return;
            }
            return;
        }
        if (objC instanceof cs2) {
            String str2 = (String) this.b.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "Skip pipeline state: " + f10Var + ", because failure", null);
            }
            if (f10Var.equals(f10Var2)) {
                return;
            }
            ((cf7) this.b.c).invoke(new h10(f10Var));
        }
    }

    public final boolean H() {
        hw7 hw7VarG = g();
        hw7 hw7VarG2 = this.c.g();
        hw7VarG2.getClass();
        hw7.a.getClass();
        F(new gw7(hw7VarG2));
        hw7 hw7VarG3 = g();
        boolean zO = cqk.o(hw7VarG, hw7VarG3, this.b);
        final boolean z = !zO;
        String str = (String) this.b.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("updateHistoryBounds, changed: ", z), null);
            }
        }
        final List listL = g().l();
        final long jD = hw7VarG3.d();
        final long jK = hw7VarG3.k();
        this.p.g(new cf7() { // from class: v00
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                List list = (List) obj;
                if (z) {
                    Iterator it = new upe(list).iterator();
                    while (true) {
                        tpe tpeVar = (tpe) it;
                        if (!tpeVar.hasNext()) {
                            break;
                        }
                        kw7 kw7Var = (kw7) tpeVar.next();
                        if (!(kw7Var instanceof jw7) && !this.l(kw7Var) && !qe7.m(kw7Var.getC(), listL) && kw7Var.getA() != jD && kw7Var.getA() != jK) {
                            tpeVar.remove();
                        }
                    }
                }
                return sbi.a;
            }
        });
        if (!zO) {
            qg7 qg7Var = this.b;
            qg7Var.r("bounds↓");
            StringBuilder sb = new StringBuilder("firstId: ");
            sb.append(hw7VarG3.d());
            sb.append(" ║║ lastId: ");
            sb.append(hw7VarG3.k());
            sb.append(" ║║ chunks: ");
            if (hw7VarG3.l().isEmpty()) {
                sb.append("empty");
            } else {
                sb.append("║║");
                for (tq3 tq3Var : ww3.O1(30, hw7VarG3.l())) {
                    sb.append(" ");
                    sb.append(qg7.h(tq3Var.a()));
                    sb.append(" - ");
                    sb.append(qg7.h(tq3Var.c()));
                    sb.append(" ║║");
                }
            }
            qg7Var.r(sb.toString());
        }
        return z;
    }

    public void c() throws IllegalAccessException, InvocationTargetException {
        this.j.b(null);
        this.b.r("cleared @" + System.identityHashCode(this));
    }

    public abstract void d(boolean z);

    public final long e() {
        return ((Number) this.o.getValue()).longValue();
    }

    public abstract long f();

    public final hw7 g() {
        mjg mjgVar = this.n;
        hw7 hw7Var = (hw7) mjgVar.getValue();
        if (hw7Var != null) {
            return hw7Var;
        }
        hw7 hw7VarG = this.c.g();
        hw7VarG.getClass();
        hw7.a.getClass();
        gw7 gw7Var = new gw7(hw7VarG);
        mjgVar.getClass();
        mjgVar.j(null, gw7Var);
        return gw7Var;
    }

    public abstract long h();

    public abstract int i();

    public final void j(List list, final long j, final boolean z, final boolean z2, boolean z3) {
        final List listL = g().l();
        this.b.q(new af7() { // from class: w00
            @Override // defpackage.af7
            public final Object invoke() {
                List list2 = listL;
                tq3 tq3Var = (tq3) ww3.t1(list2);
                tq3 tq3Var2 = (tq3) ww3.D1(list2);
                Long lValueOf = tq3Var != null ? Long.valueOf(tq3Var.a()) : null;
                Long lValueOf2 = tq3Var != null ? Long.valueOf(tq3Var.c()) : null;
                Long lValueOf3 = tq3Var2 != null ? Long.valueOf(tq3Var2.a()) : null;
                Long lValueOf4 = tq3Var2 != null ? Long.valueOf(tq3Var2.c()) : null;
                StringBuilder sbU = qt4.u(j, "insertDataSourceResult: \n                |loadTime: ", ", \n                |forward: ", z);
                sbU.append(", \n                |firstChunk:");
                sbU.append(lValueOf);
                sbU.append("-");
                sbU.append(lValueOf2);
                sbU.append("\n                |lastChunk:");
                sbU.append(lValueOf3);
                sbU.append("-");
                sbU.append(lValueOf4);
                sbU.append("\n                |");
                return s5h.y0(sbU.toString());
            }
        });
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Long.valueOf(((kw7) obj).getA()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            kw7 kw7Var = (kw7) obj2;
            if (qe7.m(kw7Var.getC(), listL) || l(kw7Var) || z3) {
                arrayList2.add(obj2);
            }
        }
        List listM1 = ww3.M1(arrayList2, g().c());
        final ArrayList<List> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = listM1.size();
        for (int i = 0; i < size; i++) {
            kw7 kw7Var2 = (kw7) listM1.get(i);
            arrayList4.add(kw7Var2);
            if (i == xw3.O0(listM1) || !cqk.d(qe7.t(kw7Var2.getC(), listL), qe7.t(((kw7) listM1.get(i + 1)).getC(), listL))) {
                arrayList3.add(arrayList4);
                arrayList4 = new ArrayList();
            }
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        m3 m3Var = this.p;
        if (!zIsEmpty) {
            for (List list2 : arrayList3) {
                list2.add(0, new jw7());
                list2.add(list2.size(), new jw7());
            }
            m3Var.g(new cf7() { // from class: x00
                /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
                @Override // defpackage.cf7
                public final Object invoke(Object obj3) {
                    y10 y10Var;
                    y10 y10Var2;
                    kw7 kw7Var3;
                    Object objPrevious;
                    kw7 kw7Var4;
                    Object objPrevious2;
                    List list3 = (List) obj3;
                    ArrayList arrayList5 = arrayList3;
                    Iterator it = arrayList5.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        y10Var = this;
                        long j2 = 0;
                        if (!zHasNext) {
                            break;
                        }
                        List<kw7> list4 = (List) it.next();
                        y10Var.b.q(new x5(list3, 4, list4));
                        y10Var.u.o(list3, list4);
                        List list5 = list3;
                        long c = 0;
                        boolean z4 = false;
                        for (kw7 kw7Var5 : list4) {
                            if (!(kw7Var5 instanceof jw7)) {
                                c = kw7Var5.getC();
                                if (!z4) {
                                    z4 = true;
                                    j2 = c;
                                }
                            }
                        }
                        if (z4) {
                            y10Var.D(j2, c, list5);
                        }
                        list3 = list5;
                        y10Var.b.q(new y00(0, list3));
                    }
                    if (!list3.isEmpty()) {
                        List list6 = (List) ww3.r1(arrayList5);
                        List list7 = (List) ww3.B1(arrayList5);
                        List listL2 = y10Var.g().l();
                        boolean zIsEmpty2 = list3.isEmpty();
                        long j3 = j;
                        boolean z5 = z;
                        boolean z6 = z2;
                        if (zIsEmpty2) {
                            y10Var2 = y10Var;
                        } else {
                            if (z5) {
                                kw7 kw7VarG = p90.G(list6);
                                long c2 = kw7VarG != null ? kw7VarG.getC() : -1L;
                                if (c2 >= 0) {
                                    tq3 tq3VarT = qe7.t(c2, listL2);
                                    tq3 tq3VarT2 = qe7.t(j3, listL2);
                                    if (tq3VarT == null || !tq3VarT.equals(tq3VarT2)) {
                                        y10Var2 = y10Var;
                                    } else {
                                        y10Var2 = y10Var;
                                        y10Var2.D(j3, c2, list3);
                                    }
                                } else {
                                    y10Var2 = y10Var;
                                }
                            } else {
                                y10Var2 = y10Var;
                            }
                            if (z6) {
                                kw7 kw7VarN = p90.n(list7);
                                long c3 = kw7VarN != null ? kw7VarN.getC() : -1L;
                                if (c3 >= 0) {
                                    tq3 tq3VarT3 = qe7.t(c3, listL2);
                                    tq3 tq3VarT4 = qe7.t(j3, listL2);
                                    if (tq3VarT3 != null && tq3VarT3.equals(tq3VarT4)) {
                                        y10Var2.D(c3, j3, list3);
                                        j3 = j3;
                                    }
                                }
                            }
                        }
                        boolean z7 = y10Var2.h;
                        List listL3 = y10Var2.g().l();
                        tq3 tq3VarT5 = qe7.t(j3, listL3);
                        if (tq3VarT5 != null) {
                            Comparator comparatorH = y10Var2.g().h();
                            Object obj4 = null;
                            if (z5) {
                                if (z7) {
                                    ListIterator listIterator = list3.listIterator(list3.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            objPrevious2 = null;
                                            break;
                                        }
                                        objPrevious2 = listIterator.previous();
                                        kw7 kw7Var6 = (kw7) objPrevious2;
                                        if (!(kw7Var6 instanceof jw7) && cqk.d(qe7.t(kw7Var6.getC(), listL3), tq3VarT5) && comparatorH.compare(Long.valueOf(kw7Var6.getC()), Long.valueOf(j3)) > 0) {
                                            break;
                                        }
                                    }
                                    kw7Var4 = (kw7) objPrevious2;
                                } else {
                                    ListIterator listIterator2 = list3.listIterator(list3.size());
                                    while (true) {
                                        if (!listIterator2.hasPrevious()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = listIterator2.previous();
                                        kw7 kw7Var7 = (kw7) objPrevious;
                                        if (!(kw7Var7 instanceof jw7) && cqk.d(qe7.t(kw7Var7.getC(), listL3), tq3VarT5) && comparatorH.compare(Long.valueOf(kw7Var7.getC()), Long.valueOf(j3)) < 0) {
                                            break;
                                        }
                                    }
                                    kw7Var4 = (kw7) objPrevious;
                                }
                                if (kw7Var4 != null) {
                                    long j4 = j3;
                                    y10Var2.D(kw7Var4.getC(), j4, list3);
                                    j3 = j4;
                                }
                            }
                            if (z6) {
                                if (z7) {
                                    for (Object obj5 : list3) {
                                        kw7 kw7Var8 = (kw7) obj5;
                                        if (!(kw7Var8 instanceof jw7) && cqk.d(qe7.t(kw7Var8.getC(), listL3), tq3VarT5) && comparatorH.compare(Long.valueOf(kw7Var8.getC()), Long.valueOf(j3)) < 0) {
                                            obj4 = obj5;
                                            break;
                                        }
                                    }
                                    kw7Var3 = (kw7) obj4;
                                } else {
                                    for (Object obj6 : list3) {
                                        kw7 kw7Var9 = (kw7) obj6;
                                        if (!(kw7Var9 instanceof jw7) && cqk.d(qe7.t(kw7Var9.getC(), listL3), tq3VarT5) && comparatorH.compare(Long.valueOf(kw7Var9.getC()), Long.valueOf(j3)) > 0) {
                                            obj4 = obj6;
                                            break;
                                        }
                                    }
                                    kw7Var3 = (kw7) obj4;
                                }
                                if (kw7Var3 != null) {
                                    y10Var2.D(j3, kw7Var3.getC(), list3);
                                }
                            }
                        }
                        ch3.x(y10Var2.b, list3);
                    }
                    return sbi.a;
                }
            });
            return;
        }
        List listE = m3Var.e();
        if (!(listE instanceof Collection) || !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                if (!(((kw7) it.next()) instanceof jw7)) {
                    return;
                }
            }
        }
        if (g().k() == 0) {
            m3Var.g(new c6(14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public final boolean k(List list, long j, boolean z) {
        int i;
        if (z) {
            List<kw7> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (kw7 kw7Var : list2) {
                    if (!(kw7Var instanceof jw7) && g().h().compare(Long.valueOf(kw7Var.getC()), Long.valueOf(j)) <= 0 && (i = i + 1) < 0) {
                        xw3.U0();
                        throw null;
                    }
                }
            }
        } else {
            List<kw7> list3 = list;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (kw7 kw7Var2 : list3) {
                    if (!(kw7Var2 instanceof jw7) && g().h().compare(Long.valueOf(kw7Var2.getC()), Long.valueOf(j)) >= 0 && (i = i + 1) < 0) {
                        xw3.U0();
                        throw null;
                    }
                }
            }
        }
        return i < Math.min(this.f, this.g);
    }

    public abstract boolean l(kw7 kw7Var);

    public final void m(long j) {
        if (j == e()) {
            return;
        }
        this.b.r("load around " + j);
        A(this.s, new c10(j, false));
    }

    public Object n(long j, boolean z, boolean z2, boolean z3, lq4 lq4Var) {
        return p(this, j, z, z2, z3, lq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x0194  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object q(s00 s00Var, long j, boolean z, a10 a10Var, nq4 nq4Var) {
        o10 o10Var;
        long c;
        Object obj;
        int i;
        Object next;
        long j2;
        long j3;
        Object obj2;
        a10 a10Var2;
        Object obj3;
        Object objQ;
        long j4;
        a10 a10Var3;
        Object obj4;
        int i2;
        long j5;
        long j6 = j;
        boolean z2 = z;
        if (nq4Var instanceof o10) {
            o10Var = (o10) nq4Var;
            int i3 = o10Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o10Var.l = i3 - Integer.MIN_VALUE;
            } else {
                o10Var = new o10(this, nq4Var);
            }
        } else {
            o10Var = new o10(this, nq4Var);
        }
        o10 o10Var2 = o10Var;
        Object obj5 = o10Var2.j;
        int i4 = o10Var2.l;
        Object obj6 = sbi.a;
        Object obj7 = hu4.a;
        if (i4 == 0) {
            ch3.d0(obj5);
            List listS = this.v.s(i(), j6, false);
            String strH = qg7.h(j6);
            kw7 kw7Var = (kw7) ww3.t1(listS);
            Object obj8 = obj6;
            Long l = kw7Var != null ? new Long(kw7Var.getC()) : null;
            StringBuilder sbA = zo5.A("loadDataBackward with requestTime: ", strH, ", force:", ", firstItemTime: ", z2);
            sbA.append(l);
            String string = sbA.toString();
            qg7 qg7Var = this.b;
            qg7Var.r(string);
            List list = listS;
            long jC = -1;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = this.g;
                obj = obj7;
                c = j6;
                if (i != 0) {
                    String strH2 = qg7.h(c);
                    String strH3 = qg7.h(jC);
                    Object obj9 = obj;
                    StringBuilder sbR = c0a.r(i, "loadDataBackward time: ", strH2, ", count: ", ", limit: ");
                    sbR.append(strH3);
                    qg7Var.r(sbR.toString());
                    o10Var2.d = a10Var;
                    o10Var2.e = j6;
                    o10Var2.h = z2;
                    o10Var2.i = i;
                    o10Var2.f = c;
                    o10Var2.g = jC;
                    o10Var2.l = 2;
                    j2 = c;
                    j3 = jC;
                    obj2 = obj8;
                    a10Var2 = null;
                    obj3 = obj9;
                    objQ = s00Var.q(j2, i, j3, o10Var2);
                    if (objQ == obj3) {
                        return obj3;
                    }
                    j4 = j3;
                    a10Var3 = a10Var;
                    obj4 = objQ;
                    i2 = i;
                    j5 = j2;
                }
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = this.g;
                        obj = obj7;
                        c = j6;
                        if (i != 0) {
                            String strH4 = qg7.h(c);
                            String strH5 = qg7.h(jC);
                            Object obj10 = obj;
                            StringBuilder sbR2 = c0a.r(i, "loadDataBackward time: ", strH4, ", count: ", ", limit: ");
                            sbR2.append(strH5);
                            qg7Var.r(sbR2.toString());
                            o10Var2.d = a10Var;
                            o10Var2.e = j6;
                            o10Var2.h = z2;
                            o10Var2.i = i;
                            o10Var2.f = c;
                            o10Var2.g = jC;
                            o10Var2.l = 2;
                            j2 = c;
                            j3 = jC;
                            obj2 = obj8;
                            a10Var2 = null;
                            obj3 = obj10;
                            objQ = s00Var.q(j2, i, j3, o10Var2);
                            if (objQ == obj3) {
                                return obj3;
                            }
                            j4 = j3;
                            a10Var3 = a10Var;
                            obj4 = objQ;
                            i2 = i;
                            j5 = j2;
                        }
                    } else if (!(((kw7) it.next()) instanceof jw7)) {
                        boolean z3 = ww3.r1(listS) instanceof jw7;
                        int i5 = this.f;
                        if (z3) {
                            if (g().a() && z2) {
                                Iterator it2 = listS.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    kw7 kw7Var2 = (kw7) next;
                                    if (!(kw7Var2 instanceof jw7) && !l(kw7Var2)) {
                                        break;
                                    }
                                }
                                kw7 kw7Var3 = (kw7) next;
                                c = kw7Var3 != null ? kw7Var3.getC() : j6;
                            } else {
                                c = ((kw7) listS.get(1)).getC();
                            }
                            tq3 tq3VarI = g().i(c);
                            if (tq3VarI != null) {
                                jC = tq3VarI.c();
                            }
                        } else if (z2) {
                            c = j6;
                        } else {
                            o10Var2.d = null;
                            o10Var2.e = j6;
                            o10Var2.h = z2;
                            o10Var2.i = 0;
                            o10Var2.f = 0L;
                            o10Var2.g = 0L;
                            o10Var2.l = 1;
                            a10Var.q(j6, r66.a);
                            obj8 = obj8;
                            if (obj8 == obj7) {
                                return obj7;
                            }
                        }
                        obj = obj7;
                        i = i5;
                        if (i != 0) {
                            String strH6 = qg7.h(c);
                            String strH7 = qg7.h(jC);
                            Object obj11 = obj;
                            StringBuilder sbR3 = c0a.r(i, "loadDataBackward time: ", strH6, ", count: ", ", limit: ");
                            sbR3.append(strH7);
                            qg7Var.r(sbR3.toString());
                            o10Var2.d = a10Var;
                            o10Var2.e = j6;
                            o10Var2.h = z2;
                            o10Var2.i = i;
                            o10Var2.f = c;
                            o10Var2.g = jC;
                            o10Var2.l = 2;
                            j2 = c;
                            j3 = jC;
                            obj2 = obj8;
                            a10Var2 = null;
                            obj3 = obj11;
                            objQ = s00Var.q(j2, i, j3, o10Var2);
                            if (objQ == obj3) {
                                return obj3;
                            }
                            j4 = j3;
                            a10Var3 = a10Var;
                            obj4 = objQ;
                            i2 = i;
                            j5 = j2;
                        }
                    }
                }
            }
            return obj8;
        }
        if (i4 == 1) {
            ch3.d0(obj5);
            return obj6;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                ch3.d0(obj5);
                return obj6;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j7 = o10Var2.g;
        long j8 = o10Var2.f;
        i2 = o10Var2.i;
        boolean z4 = o10Var2.h;
        long j9 = o10Var2.e;
        a10Var3 = o10Var2.d;
        ch3.d0(obj5);
        obj4 = obj5;
        a10Var2 = null;
        z2 = z4;
        obj3 = obj7;
        j5 = j8;
        j4 = j7;
        obj2 = obj6;
        j6 = j9;
        long j10 = j4;
        o10Var2.d = a10Var2;
        o10Var2.e = j6;
        o10Var2.h = z2;
        o10Var2.i = i2;
        o10Var2.f = j5;
        o10Var2.g = j10;
        o10Var2.l = 3;
        a10Var3.q(j5, (List) obj4);
        return obj2 == obj3 ? obj3 : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object r(xhe xheVar, long j, boolean z, nq4 nq4Var) {
        p10 p10Var;
        int i;
        long j2;
        g10 g10Var;
        Throwable th;
        int iIntValue;
        Object objS;
        Object obj;
        String str;
        a4c a4cVar;
        Object obj2 = j;
        je9 je9Var = je9.d;
        if (nq4Var instanceof p10) {
            p10Var = (p10) nq4Var;
            int i2 = p10Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p10Var.g = i2 - Integer.MIN_VALUE;
            } else {
                p10Var = new p10(this, nq4Var);
            }
        } else {
            p10Var = new p10(this, nq4Var);
        }
        p10 p10Var2 = p10Var;
        Object obj3 = p10Var2.e;
        Object obj4 = hu4.a;
        int i3 = p10Var2.g;
        try {
            if (i3 == 0) {
                ch3.d0(obj3);
                this.b.r("loadDataBackwardRemote with requestTime: " + qg7.h(obj2));
                List listS = this.v.s(i(), obj2, true);
                List list = listS;
                long jC = -1;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = this.g;
                            j2 = obj2;
                            break;
                        }
                        if (!(((kw7) it.next()) instanceof jw7)) {
                            if (!(ww3.r1(listS) instanceof jw7) || !k(listS, obj2, true)) {
                                String str2 = (String) this.b.b;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                    a4cVar2.c(je9Var, str2, "loadDataBackwardRemote can't request return 0", null);
                                }
                                return new Integer(0);
                            }
                            int i4 = this.f;
                            long c = ((kw7) listS.get(1)).getC();
                            tq3 tq3VarI = g().i(c);
                            jC = tq3VarI != null ? tq3VarI.c() : -1L;
                            i = i4;
                            j2 = c;
                            break;
                        }
                    }
                } else {
                    i = this.g;
                    j2 = obj2;
                    break;
                }
                g10Var = new g10(j2, 2);
                if (!this.q.add(g10Var) && !z) {
                    return new Integer(-1);
                }
                qg7 qg7Var = this.b;
                String strH = qg7.h(j2);
                String strH2 = qg7.h(jC);
                StringBuilder sbR = c0a.r(i, "loadDataBackwardRemote time: ", strH, ", count: ", ", limit: ");
                sbR.append(strH2);
                qg7Var.r(sbR.toString());
                if (j2 != Long.MIN_VALUE) {
                    p10Var2.d = g10Var;
                    p10Var2.g = 1;
                    th = null;
                    objS = xheVar.s(j2, i, 0, jC, -1L, p10Var2);
                    if (objS == obj4) {
                        obj2 = g10Var;
                        return obj4;
                    }
                } else {
                    th = null;
                    iIntValue = 0;
                    obj = g10Var;
                }
                this.q.remove(obj);
                str = (String) this.b.b;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(iIntValue, "loadDataBackwardRemote fetched, count:"), th);
                }
                return new Integer(iIntValue);
            }
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g10 g10Var2 = p10Var2.d;
            ch3.d0(obj3);
            objS = obj3;
            th = null;
            obj2 = g10Var2;
            obj2 = g10Var;
            iIntValue = ((Number) objS).intValue();
            obj = obj2;
            this.q.remove(obj);
            str = (String) this.b.b;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, str, zo5.h(iIntValue, "loadDataBackwardRemote fetched, count:"), th);
            }
            return new Integer(iIntValue);
        } catch (Throwable th2) {
            this.q.remove(obj2);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object s(s00 s00Var, long j, boolean z, a10 a10Var, nq4 nq4Var) {
        q10 q10Var;
        int i;
        long c;
        Object objPrevious;
        a10 a10Var2;
        long j2;
        Object obj;
        a10 a10Var3;
        int i2;
        Object obj2;
        long j3;
        long j4 = j;
        boolean z2 = z;
        if (nq4Var instanceof q10) {
            q10Var = (q10) nq4Var;
            int i3 = q10Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q10Var.l = i3 - Integer.MIN_VALUE;
            } else {
                q10Var = new q10(this, nq4Var);
            }
        } else {
            q10Var = new q10(this, nq4Var);
        }
        q10 q10Var2 = q10Var;
        Object obj3 = q10Var2.j;
        int i4 = q10Var2.l;
        Object obj4 = sbi.a;
        Object obj5 = hu4.a;
        if (i4 == 0) {
            ch3.d0(obj3);
            List listS = this.v.s(i(), j4, false);
            String strH = qg7.h(j4);
            kw7 kw7Var = (kw7) ww3.D1(listS);
            Long l = kw7Var != null ? new Long(kw7Var.getC()) : null;
            StringBuilder sbA = zo5.A("loadDataForward with requestTime: ", strH, ", force:", ", lastItemTime: ", z2);
            sbA.append(l);
            String string = sbA.toString();
            qg7 qg7Var = this.b;
            qg7Var.r(string);
            List list = listS;
            long jA = -1;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = this.g;
                c = j4;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = this.g;
                        c = j4;
                    } else if (!(((kw7) it.next()) instanceof jw7)) {
                        boolean z3 = ww3.B1(listS) instanceof jw7;
                        i = this.f;
                        if (z3) {
                            if (g().a() && z2) {
                                ListIterator listIterator = listS.listIterator(listS.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        objPrevious = null;
                                        break;
                                    }
                                    objPrevious = listIterator.previous();
                                    kw7 kw7Var2 = (kw7) objPrevious;
                                    if (!(kw7Var2 instanceof jw7) && !l(kw7Var2)) {
                                        break;
                                    }
                                }
                                kw7 kw7Var3 = (kw7) objPrevious;
                                c = kw7Var3 != null ? kw7Var3.getC() : j4;
                            } else {
                                c = ((kw7) listS.get(listS.size() - 2)).getC();
                            }
                            tq3 tq3VarG = g().g(c);
                            if (tq3VarG != null) {
                                jA = tq3VarG.a();
                            }
                        } else {
                            if (!z2) {
                                q10Var2.d = null;
                                q10Var2.e = j4;
                                q10Var2.h = z2;
                                q10Var2.i = 0;
                                q10Var2.f = 0L;
                                q10Var2.g = 0L;
                                q10Var2.l = 1;
                                a10Var.q(j4, r66.a);
                                return obj4 == obj5 ? obj5 : obj4;
                            }
                            c = j4;
                        }
                    }
                }
            }
            long j5 = jA;
            String strH2 = qg7.h(c);
            String strH3 = qg7.h(j5);
            StringBuilder sbR = c0a.r(i, "loadDataForward time: ", strH2, ", count: ", ", limit: ");
            sbR.append(strH3);
            qg7Var.r(sbR.toString());
            q10Var2.d = a10Var;
            q10Var2.e = j4;
            q10Var2.h = z2;
            q10Var2.i = i;
            q10Var2.f = c;
            q10Var2.g = j5;
            q10Var2.l = 2;
            int i5 = i;
            a10Var2 = null;
            j2 = c;
            obj = obj5;
            Object objM = s00Var.m(j2, i5, j5, q10Var2);
            if (objM == obj) {
                return obj;
            }
            a10Var3 = a10Var;
            i2 = i5;
            obj2 = objM;
            j3 = j5;
        } else {
            if (i4 == 1) {
                ch3.d0(obj3);
                return obj4;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    ch3.d0(obj3);
                    return obj4;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j6 = q10Var2.g;
            long j7 = q10Var2.f;
            i2 = q10Var2.i;
            boolean z4 = q10Var2.h;
            long j8 = q10Var2.e;
            a10Var3 = q10Var2.d;
            ch3.d0(obj3);
            obj2 = obj3;
            obj = obj5;
            z2 = z4;
            a10Var2 = null;
            j4 = j8;
            j3 = j6;
            j2 = j7;
        }
        q10Var2.d = a10Var2;
        q10Var2.e = j4;
        q10Var2.h = z2;
        q10Var2.i = i2;
        q10Var2.f = j2;
        q10Var2.g = j3;
        q10Var2.l = 3;
        a10Var3.q(j2, (List) obj2);
        return obj4 == obj ? obj : obj4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object t(xhe xheVar, long j, boolean z, nq4 nq4Var) throws Throwable {
        r10 r10Var;
        int iIntValue;
        long j2;
        boolean z2;
        int i;
        long c;
        g10 g10Var;
        Throwable th;
        vfe vfeVar;
        String str;
        a4c a4cVar;
        g10 g10Var2;
        Throwable th2;
        je9 je9Var = je9.d;
        if (nq4Var instanceof r10) {
            r10Var = (r10) nq4Var;
            int i2 = r10Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r10Var.h = i2 - Integer.MIN_VALUE;
            } else {
                r10Var = new r10(this, nq4Var);
            }
        } else {
            r10Var = new r10(this, nq4Var);
        }
        r10 r10Var2 = r10Var;
        Object obj = r10Var2.f;
        Object obj2 = hu4.a;
        int i3 = r10Var2.h;
        if (i3 == 0) {
            ch3.d0(obj);
            this.b.r("loadDataForwardRemote with requestTime: " + qg7.h(j));
            List listS = this.v.s(i(), j, true);
            vfe vfeVar2 = new vfe();
            vfeVar2.a = -1L;
            List list = listS;
            iIntValue = 0;
            if ((list instanceof Collection) && list.isEmpty()) {
                j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                c = j;
                i = this.g;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                        c = j;
                        i = this.g;
                    } else if (!(((kw7) it.next()) instanceof jw7)) {
                        if (!(ww3.B1(listS) instanceof jw7) || !k(listS, j, false)) {
                            j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                            if (j != BuildConfig.MAX_TIME_TO_UPLOAD && !listS.isEmpty()) {
                                kw7 kw7Var = (kw7) ww3.B1(listS);
                                boolean z3 = !(kw7Var instanceof jw7) && kw7Var.getC() < j;
                                List list2 = listS;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z2 = true;
                                            break;
                                        }
                                        if (((kw7) it2.next()).getC() == j) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    z2 = true;
                                    break;
                                }
                                boolean zAdd = this.r.add(Long.valueOf(j));
                                if (z3 && z2 && zAdd) {
                                    int i4 = this.f;
                                    long c2 = ((kw7) listS.get(xw3.O0(listS))).getC();
                                    vfeVar2.a = j;
                                    String str2 = (String) this.b.b;
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                        StringBuilder sbS = qt4.s(j, "loadDataForwardRemote request missed time, rT:", ", t:");
                                        sbS.append(c2);
                                        a4cVar2.c(je9Var, str2, sbS.toString(), null);
                                    }
                                    i = i4;
                                    c = c2;
                                }
                            }
                            String str3 = (String) this.b.b;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                a4cVar3.c(je9Var, str3, "loadDataForwardRemote can't request return 0", null);
                            }
                            return new Integer(0);
                        }
                        i = this.f;
                        c = ((kw7) listS.get(listS.size() - 2)).getC();
                        tq3 tq3VarG = g().g(c);
                        long jA = tq3VarG != null ? tq3VarG.a() : -1L;
                        j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                        vfeVar2.a = jA;
                    }
                }
            }
            g10Var = new g10(c, 1);
            if (!this.q.add(g10Var) && !z) {
                return new Integer(-1);
            }
            qg7 qg7Var = this.b;
            String strH = qg7.h(c);
            String strH2 = qg7.h(vfeVar2.a);
            StringBuilder sbR = c0a.r(i, "loadDataForwardRemote fTime: ", strH, ", fCount: ", ", fLimit: ");
            sbR.append(strH2);
            qg7Var.r(sbR.toString());
            if (c != j2) {
                try {
                    long j3 = vfeVar2.a;
                    r10Var2.d = vfeVar2;
                    r10Var2.e = g10Var;
                    r10Var2.h = 1;
                    long j4 = c;
                    int i5 = i;
                    th = null;
                    Object objS = xheVar.s(j4, 0, i5, -1L, j3, r10Var2);
                    if (objS == obj2) {
                        return obj2;
                    }
                    vfeVar = vfeVar2;
                    obj = objS;
                } catch (Throwable th3) {
                    th2 = th3;
                    g10Var2 = g10Var;
                    this.q.remove(g10Var2);
                    throw th2;
                }
            } else {
                th = null;
            }
            this.q.remove(g10Var);
            str = (String) this.b.b;
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(iIntValue, "loadDataForwardRemote fetched, count:"), th);
            }
            return new Integer(iIntValue);
        }
        if (i3 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g10Var2 = r10Var2.e;
        vfe vfeVar3 = r10Var2.d;
        try {
            ch3.d0(obj);
            vfeVar = vfeVar3;
            g10Var = g10Var2;
            th = null;
        } catch (Throwable th4) {
            th2 = th4;
            this.q.remove(g10Var2);
            throw th2;
        }
        iIntValue = ((Number) obj).intValue();
        if (iIntValue == this.f) {
            this.r.remove(new Long(vfeVar.a));
        }
        this.q.remove(g10Var);
        str = (String) this.b.b;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            a4cVar.c(je9Var, str, zo5.h(iIntValue, "loadDataForwardRemote fetched, count:"), th);
        }
        return new Integer(iIntValue);
    }

    public abstract Object u(long j, nq4 nq4Var);

    public void v() {
        A(this.s, new d10(f()));
    }

    public Object w(long j, boolean z, boolean z2, lq4 lq4Var) {
        return x(this, j, z, z2, (nq4) lq4Var);
    }

    public final void y() {
        A(this.s, new e10(h()));
    }

    public final void z() {
        e9i.j0(new fz6(e9i.I(e9i.E(this.s)), new x10(this, null, 0), 3), this.l);
        e9i.j0(new fz6(e9i.I(e9i.C(this.p, new jz(this.o, 1), this.n, new w10(this, null))), new qob(this, (lq4) null, 6), 3), cqk.a(this.k));
    }
}
