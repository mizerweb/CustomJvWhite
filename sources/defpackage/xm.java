package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xm {
    public static final /* synthetic */ zv8[] o = {new z8b(xm.class, "warmupJob", "getWarmupJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, xm.class, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;"), new z8b(xm.class, "animojiSetsUpdateJob", "getAnimojiSetsUpdateJob()Lkotlinx/coroutines/Job;")};
    public final pvb a;
    public final ql b;
    public final en c;
    public final j7e d;
    public final et3 e;
    public final xhh f;
    public final jn g;
    public final String h = xm.class.getName();
    public final dq4 i;
    public final p3c j;
    public final p3c k;
    public final p3c l;
    public final ConcurrentHashMap m;
    public final CopyOnWriteArrayList n;

    public xm(pvb pvbVar, ql qlVar, en enVar, j7e j7eVar, et3 et3Var, xhh xhhVar, jn jnVar, yt4 yt4Var) {
        this.a = pvbVar;
        this.b = qlVar;
        this.c = enVar;
        this.d = j7eVar;
        this.e = et3Var;
        this.f = xhhVar;
        this.g = jnVar;
        xt4 xt4VarB = ((n0c) xhhVar).b();
        xt4VarB.getClass();
        this.i = cqk.a(lvb.x0(xt4VarB, yt4Var));
        this.j = qyj.S();
        this.k = qyj.S();
        this.l = qyj.S();
        this.m = new ConcurrentHashMap();
        this.n = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(xm xmVar, Map map, nq4 nq4Var) {
        nm nmVar;
        ArrayList arrayList;
        Object objI;
        Object next;
        if (nq4Var instanceof nm) {
            nmVar = (nm) nq4Var;
            int i = nmVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nmVar.h = i - Integer.MIN_VALUE;
            } else {
                nmVar = new nm(xmVar, nq4Var);
            }
        } else {
            nmVar = new nm(xmVar, nq4Var);
        }
        Object obj = nmVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = nmVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            if (map.isEmpty()) {
                return r66.a;
            }
            arrayList = new ArrayList();
            ql qlVar = xmVar.b;
            nmVar.d = map;
            nmVar.e = arrayList;
            nmVar.h = 1;
            objI = ch3.I(nmVar, qlVar.a, true, false, new c6(10));
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = nmVar.e;
            Map map2 = nmVar.d;
            ch3.d0(obj);
            arrayList = arrayList2;
            map = map2;
            objI = obj;
        }
        List list = (List) objI;
        if (list.isEmpty()) {
            arrayList.addAll(map.keySet());
        } else {
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                long jLongValue2 = ((Number) entry.getValue()).longValue();
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((xl) next).a != jLongValue);
                xl xlVar = (xl) next;
                if (xlVar == null || xlVar.b < jLongValue2) {
                    arrayList.add(new Long(jLongValue));
                }
            }
        }
        String str = xmVar.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, arrayList.size() + " animojis for update", null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(xm xmVar, xy xyVar, nq4 nq4Var) {
        om omVar;
        Map map;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object next;
        if (nq4Var instanceof om) {
            omVar = (om) nq4Var;
            int i = omVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                omVar.i = i - Integer.MIN_VALUE;
            } else {
                omVar = new om(xmVar, nq4Var);
            }
        } else {
            omVar = new om(xmVar, nq4Var);
        }
        Object obj = omVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = omVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            ArrayList arrayList3 = new ArrayList();
            List list = xyVar.d;
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cx3.Z0(((iaf) it.next()).n, arrayList4);
            }
            map = xyVar.i;
            if (arrayList4.isEmpty() && map.isEmpty()) {
                return r66.a;
            }
            en enVar = xmVar.c;
            omVar.d = arrayList3;
            omVar.e = arrayList4;
            omVar.f = map;
            omVar.i = 1;
            Object objI = ch3.I(omVar, enVar.a, true, false, new vi2(14));
            if (objI == hu4Var) {
                return hu4Var;
            }
            arrayList = arrayList3;
            obj = objI;
            arrayList2 = arrayList4;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = omVar.f;
            arrayList2 = omVar.e;
            arrayList = omVar.d;
            ch3.d0(obj);
        }
        List list2 = (List) obj;
        if (list2.isEmpty() && !map.isEmpty()) {
            arrayList.addAll(map.keySet());
        } else if (!list2.isEmpty() || arrayList2.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                Long l2 = (Long) entry.getValue();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    long jD = ((dn) next).d();
                    if (l != null && jD == l.longValue()) {
                        break;
                    }
                }
                dn dnVar = (dn) next;
                if (dnVar == null || dnVar.f() < l2.longValue()) {
                    arrayList.add(l);
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        String str = xmVar.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, arrayList.size() + " animoji sets for update", null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0260  */
    /* JADX WARN: Code duplicated, block: B:106:0x0266  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f A[LOOP:3: B:67:0x0188->B:72:0x019f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x021c  */
    /* JADX WARN: Code duplicated, block: B:92:0x022e A[LOOP:1: B:87:0x0216->B:92:0x022e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x023a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0240  */
    public static final Object c(xm xmVar, List list, Map map, nq4 nq4Var) {
        um umVar;
        wfe wfeVarP;
        Object next;
        Map map2;
        wfe wfeVar;
        Object objI;
        wfe wfeVar2;
        Map map3;
        List list2;
        m8b m8bVar;
        int size;
        int i;
        Object objI2;
        Map map4;
        List list3;
        m8b m8bVar2;
        long jLongValue;
        List list4;
        Iterator it;
        int i2;
        int i3;
        long jLongValue2;
        Iterator it2;
        Object obj;
        Object next2;
        xl xlVar;
        Iterator it3;
        Object obj2;
        wfe wfeVar3;
        vo8 vo8Var;
        i7e i7eVar;
        Throwable thA;
        List list5;
        i7e i7eVar2;
        ql qlVar = xmVar.b;
        j7e j7eVar = xmVar.d;
        String str = xmVar.h;
        if (nq4Var instanceof um) {
            umVar = (um) nq4Var;
            int i4 = umVar.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                umVar.k = i4 - Integer.MIN_VALUE;
            } else {
                umVar = new um(xmVar, nq4Var);
            }
        } else {
            umVar = new um(xmVar, nq4Var);
        }
        Object objA = umVar.i;
        int i5 = umVar.k;
        Object obj3 = hu4.a;
        Object obj4 = sbi.a;
        try {
            switch (i5) {
                case 0:
                    wfeVarP = nbh.p(objA);
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            iaf iafVar = (iaf) next;
                            if (!cqk.d(iafVar.a, ldf.p) || !cqk.d(iafVar.b, "POPULAR")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    iaf iafVar2 = (iaf) next;
                    i7e i7eVar3 = iafVar2 != null ? new i7e(iafVar2.j, iafVar2.b, iafVar2.f) : null;
                    wfeVarP.a = i7eVar3;
                    if (i7eVar3 == null) {
                        gm0.n(str, "Didn't find section with Reactions from backend response");
                        umVar.d = map;
                        umVar.e = wfeVarP;
                        umVar.f = wfeVarP;
                        umVar.k = 1;
                        Object objI3 = ch3.I(umVar, j7eVar.a, true, false, new ik4(27));
                        if (objI3 == obj3) {
                            return obj3;
                        }
                        map2 = map;
                        objA = objI3;
                        wfeVar = wfeVarP;
                        wfeVarP.a = objA;
                        if (wfeVar.a == null) {
                            gm0.n(str, "Didn't find section with Reactions in database");
                            return obj4;
                        }
                        wfeVarP = wfeVar;
                    } else {
                        map2 = map;
                    }
                    i7e i7eVar4 = (i7e) wfeVarP.a;
                    umVar.d = map2;
                    umVar.e = wfeVarP;
                    umVar.f = null;
                    umVar.k = 2;
                    objI = ch3.I(umVar, j7eVar.a, false, true, new ol(j7eVar, 14, i7eVar4));
                    if (objI != obj3) {
                        objI = obj4;
                    }
                    if (objI == obj3) {
                        return obj3;
                    }
                    wfeVar2 = wfeVarP;
                    map3 = map2;
                    List list6 = ((i7e) wfeVar2.a).c;
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.k = 3;
                    objA = qlVar.a(list6, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    list2 = (List) objA;
                    m8bVar = new m8b();
                    size = ((i7e) wfeVar2.a).c.size();
                    i = 0;
                    while (i < size) {
                        jLongValue = ((Number) ((i7e) wfeVar2.a).c.get(i)).longValue();
                        list4 = list2;
                        if ((list4 instanceof Collection) || !list4.isEmpty()) {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        } else {
                            i2 = size;
                            i3 = i;
                            m8bVar.a(jLongValue);
                        }
                        i = i3 + 1;
                        size = i2;
                    }
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.f = list2;
                    umVar.g = m8bVar;
                    umVar.k = 4;
                    objI2 = ch3.I(umVar, qlVar.a, true, false, new c6(9));
                    if (objI2 == obj3) {
                        return obj3;
                    }
                    map4 = map3;
                    list3 = list2;
                    objA = objI2;
                    m8bVar2 = m8bVar;
                    if (((Number) objA).intValue() == 0) {
                        m8bVar2.b(rx8.j0(map4.keySet()));
                    } else {
                        for (Map.Entry entry : map4.entrySet()) {
                            jLongValue2 = ((Number) entry.getKey()).longValue();
                            long jLongValue3 = ((Number) entry.getValue()).longValue();
                            it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    obj = obj4;
                                    it3 = it2;
                                    if (((xl) next2).a != jLongValue2) {
                                        it2 = it3;
                                        obj4 = obj;
                                    }
                                } else {
                                    obj = obj4;
                                    next2 = null;
                                }
                            }
                            xlVar = (xl) next2;
                            if (xlVar != null || xlVar.b < jLongValue3) {
                                m8bVar2.a(jLongValue2);
                            }
                            obj4 = obj;
                        }
                    }
                    obj2 = obj4;
                    if (m8bVar2.i()) {
                        gm0.n(str, "Didn't have reactions for update, fill from db.");
                        vo8Var = (vo8) xmVar.j.m(xmVar, o[0]);
                        if (vo8Var != null || !vo8Var.isActive()) {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        }
                        return obj2;
                    }
                    try {
                        pvb pvbVar = xmVar.a;
                        ky kyVar = new ky(8, rx8.g0(m8bVar2));
                        umVar.d = null;
                        umVar.e = wfeVar2;
                        umVar.f = null;
                        umVar.g = null;
                        umVar.h = null;
                        umVar.k = 6;
                        objA = pvbVar.D(kyVar, umVar);
                        if (objA == obj3) {
                            return obj3;
                        }
                        wfeVar3 = wfeVar2;
                        thA = roe.a(objA);
                        if (thA != null) {
                            gm0.V(str, "Fail request reactions by ids.", thA);
                        }
                        if (!(objA instanceof poe)) {
                            list5 = ((ly) objA).e;
                            i7eVar2 = (i7e) wfeVar3.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = objA;
                            umVar.k = 7;
                            if (xmVar.p(list5, i7eVar2, umVar) == obj3) {
                                return obj3;
                            }
                        }
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        wfeVar3 = wfeVar2;
                        objA = new poe(th);
                    }
                    break;
                case 1:
                    wfeVarP = (wfe) umVar.f;
                    wfeVar = umVar.e;
                    map2 = umVar.d;
                    ch3.d0(objA);
                    wfeVarP.a = objA;
                    if (wfeVar.a == null) {
                        gm0.n(str, "Didn't find section with Reactions in database");
                        return obj4;
                    }
                    wfeVarP = wfeVar;
                    i7e i7eVar5 = (i7e) wfeVarP.a;
                    umVar.d = map2;
                    umVar.e = wfeVarP;
                    umVar.f = null;
                    umVar.k = 2;
                    objI = ch3.I(umVar, j7eVar.a, false, true, new ol(j7eVar, 14, i7eVar5));
                    if (objI != obj3) {
                        objI = obj4;
                    }
                    if (objI == obj3) {
                        return obj3;
                    }
                    wfeVar2 = wfeVarP;
                    map3 = map2;
                    List list7 = ((i7e) wfeVar2.a).c;
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.k = 3;
                    objA = qlVar.a(list7, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    list2 = (List) objA;
                    m8bVar = new m8b();
                    size = ((i7e) wfeVar2.a).c.size();
                    i = 0;
                    while (i < size) {
                        jLongValue = ((Number) ((i7e) wfeVar2.a).c.get(i)).longValue();
                        list4 = list2;
                        if (list4 instanceof Collection) {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        } else {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        }
                        i = i3 + 1;
                        size = i2;
                    }
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.f = list2;
                    umVar.g = m8bVar;
                    umVar.k = 4;
                    objI2 = ch3.I(umVar, qlVar.a, true, false, new c6(9));
                    if (objI2 == obj3) {
                        return obj3;
                    }
                    map4 = map3;
                    list3 = list2;
                    objA = objI2;
                    m8bVar2 = m8bVar;
                    if (((Number) objA).intValue() == 0) {
                        m8bVar2.b(rx8.j0(map4.keySet()));
                    } else {
                        while (r0.hasNext()) {
                            jLongValue2 = ((Number) entry.getKey()).longValue();
                            long jLongValue4 = ((Number) entry.getValue()).longValue();
                            it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    obj = obj4;
                                    it3 = it2;
                                    if (((xl) next2).a != jLongValue2) {
                                        it2 = it3;
                                        obj4 = obj;
                                    }
                                } else {
                                    obj = obj4;
                                    next2 = null;
                                }
                            }
                            xlVar = (xl) next2;
                            if (xlVar != null) {
                                m8bVar2.a(jLongValue2);
                            } else {
                                m8bVar2.a(jLongValue2);
                            }
                            obj4 = obj;
                        }
                    }
                    obj2 = obj4;
                    if (m8bVar2.i()) {
                        gm0.n(str, "Didn't have reactions for update, fill from db.");
                        vo8Var = (vo8) xmVar.j.m(xmVar, o[0]);
                        if (vo8Var != null) {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        } else {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        }
                        return obj2;
                    }
                    pvb pvbVar2 = xmVar.a;
                    ky kyVar2 = new ky(8, rx8.g0(m8bVar2));
                    umVar.d = null;
                    umVar.e = wfeVar2;
                    umVar.f = null;
                    umVar.g = null;
                    umVar.h = null;
                    umVar.k = 6;
                    objA = pvbVar2.D(kyVar2, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    wfeVar3 = wfeVar2;
                    thA = roe.a(objA);
                    if (thA != null) {
                        gm0.V(str, "Fail request reactions by ids.", thA);
                    }
                    if (!(objA instanceof poe)) {
                        list5 = ((ly) objA).e;
                        i7eVar2 = (i7e) wfeVar3.a;
                        umVar.d = null;
                        umVar.e = null;
                        umVar.f = null;
                        umVar.g = null;
                        umVar.h = objA;
                        umVar.k = 7;
                        if (xmVar.p(list5, i7eVar2, umVar) == obj3) {
                            return obj3;
                        }
                    }
                    return obj2;
                case 2:
                    wfeVar2 = umVar.e;
                    map3 = umVar.d;
                    ch3.d0(objA);
                    List list8 = ((i7e) wfeVar2.a).c;
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.k = 3;
                    objA = qlVar.a(list8, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    list2 = (List) objA;
                    m8bVar = new m8b();
                    size = ((i7e) wfeVar2.a).c.size();
                    i = 0;
                    while (i < size) {
                        jLongValue = ((Number) ((i7e) wfeVar2.a).c.get(i)).longValue();
                        list4 = list2;
                        if (list4 instanceof Collection) {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        } else {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        }
                        i = i3 + 1;
                        size = i2;
                    }
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.f = list2;
                    umVar.g = m8bVar;
                    umVar.k = 4;
                    objI2 = ch3.I(umVar, qlVar.a, true, false, new c6(9));
                    if (objI2 == obj3) {
                        return obj3;
                    }
                    map4 = map3;
                    list3 = list2;
                    objA = objI2;
                    m8bVar2 = m8bVar;
                    if (((Number) objA).intValue() == 0) {
                        m8bVar2.b(rx8.j0(map4.keySet()));
                    } else {
                        while (r0.hasNext()) {
                            jLongValue2 = ((Number) entry.getKey()).longValue();
                            long jLongValue5 = ((Number) entry.getValue()).longValue();
                            it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    obj = obj4;
                                    it3 = it2;
                                    if (((xl) next2).a != jLongValue2) {
                                        it2 = it3;
                                        obj4 = obj;
                                    }
                                } else {
                                    obj = obj4;
                                    next2 = null;
                                }
                            }
                            xlVar = (xl) next2;
                            if (xlVar != null) {
                                m8bVar2.a(jLongValue2);
                            } else {
                                m8bVar2.a(jLongValue2);
                            }
                            obj4 = obj;
                        }
                    }
                    obj2 = obj4;
                    if (m8bVar2.i()) {
                        gm0.n(str, "Didn't have reactions for update, fill from db.");
                        vo8Var = (vo8) xmVar.j.m(xmVar, o[0]);
                        if (vo8Var != null) {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        } else {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        }
                        return obj2;
                    }
                    pvb pvbVar3 = xmVar.a;
                    ky kyVar3 = new ky(8, rx8.g0(m8bVar2));
                    umVar.d = null;
                    umVar.e = wfeVar2;
                    umVar.f = null;
                    umVar.g = null;
                    umVar.h = null;
                    umVar.k = 6;
                    objA = pvbVar3.D(kyVar3, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    wfeVar3 = wfeVar2;
                    thA = roe.a(objA);
                    if (thA != null) {
                        gm0.V(str, "Fail request reactions by ids.", thA);
                    }
                    if (!(objA instanceof poe)) {
                        list5 = ((ly) objA).e;
                        i7eVar2 = (i7e) wfeVar3.a;
                        umVar.d = null;
                        umVar.e = null;
                        umVar.f = null;
                        umVar.g = null;
                        umVar.h = objA;
                        umVar.k = 7;
                        if (xmVar.p(list5, i7eVar2, umVar) == obj3) {
                            return obj3;
                        }
                    }
                    return obj2;
                case 3:
                    wfeVar2 = umVar.e;
                    map3 = umVar.d;
                    ch3.d0(objA);
                    list2 = (List) objA;
                    m8bVar = new m8b();
                    size = ((i7e) wfeVar2.a).c.size();
                    i = 0;
                    while (i < size) {
                        jLongValue = ((Number) ((i7e) wfeVar2.a).c.get(i)).longValue();
                        list4 = list2;
                        if (list4 instanceof Collection) {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        } else {
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = size;
                                    i3 = i;
                                    if (((xl) it.next()).a != jLongValue) {
                                        size = i2;
                                        i = i3;
                                    }
                                } else {
                                    i2 = size;
                                    i3 = i;
                                    m8bVar.a(jLongValue);
                                }
                            }
                        }
                        i = i3 + 1;
                        size = i2;
                    }
                    umVar.d = map3;
                    umVar.e = wfeVar2;
                    umVar.f = list2;
                    umVar.g = m8bVar;
                    umVar.k = 4;
                    objI2 = ch3.I(umVar, qlVar.a, true, false, new c6(9));
                    if (objI2 == obj3) {
                        return obj3;
                    }
                    map4 = map3;
                    list3 = list2;
                    objA = objI2;
                    m8bVar2 = m8bVar;
                    if (((Number) objA).intValue() == 0) {
                        m8bVar2.b(rx8.j0(map4.keySet()));
                    } else {
                        while (r0.hasNext()) {
                            jLongValue2 = ((Number) entry.getKey()).longValue();
                            long jLongValue6 = ((Number) entry.getValue()).longValue();
                            it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    obj = obj4;
                                    it3 = it2;
                                    if (((xl) next2).a != jLongValue2) {
                                        it2 = it3;
                                        obj4 = obj;
                                    }
                                } else {
                                    obj = obj4;
                                    next2 = null;
                                }
                            }
                            xlVar = (xl) next2;
                            if (xlVar != null) {
                                m8bVar2.a(jLongValue2);
                            } else {
                                m8bVar2.a(jLongValue2);
                            }
                            obj4 = obj;
                        }
                    }
                    obj2 = obj4;
                    if (m8bVar2.i()) {
                        gm0.n(str, "Didn't have reactions for update, fill from db.");
                        vo8Var = (vo8) xmVar.j.m(xmVar, o[0]);
                        if (vo8Var != null) {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        } else {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        }
                        return obj2;
                    }
                    pvb pvbVar4 = xmVar.a;
                    ky kyVar4 = new ky(8, rx8.g0(m8bVar2));
                    umVar.d = null;
                    umVar.e = wfeVar2;
                    umVar.f = null;
                    umVar.g = null;
                    umVar.h = null;
                    umVar.k = 6;
                    objA = pvbVar4.D(kyVar4, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    wfeVar3 = wfeVar2;
                    thA = roe.a(objA);
                    if (thA != null) {
                        gm0.V(str, "Fail request reactions by ids.", thA);
                    }
                    if (!(objA instanceof poe)) {
                        list5 = ((ly) objA).e;
                        i7eVar2 = (i7e) wfeVar3.a;
                        umVar.d = null;
                        umVar.e = null;
                        umVar.f = null;
                        umVar.g = null;
                        umVar.h = objA;
                        umVar.k = 7;
                        if (xmVar.p(list5, i7eVar2, umVar) == obj3) {
                            return obj3;
                        }
                    }
                    return obj2;
                case 4:
                    m8bVar2 = umVar.g;
                    List list9 = (List) umVar.f;
                    wfe wfeVar4 = umVar.e;
                    map4 = umVar.d;
                    ch3.d0(objA);
                    list3 = list9;
                    wfeVar2 = wfeVar4;
                    if (((Number) objA).intValue() == 0) {
                        m8bVar2.b(rx8.j0(map4.keySet()));
                    } else {
                        while (r0.hasNext()) {
                            jLongValue2 = ((Number) entry.getKey()).longValue();
                            long jLongValue7 = ((Number) entry.getValue()).longValue();
                            it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    obj = obj4;
                                    it3 = it2;
                                    if (((xl) next2).a != jLongValue2) {
                                        it2 = it3;
                                        obj4 = obj;
                                    }
                                } else {
                                    obj = obj4;
                                    next2 = null;
                                }
                            }
                            xlVar = (xl) next2;
                            if (xlVar != null) {
                                m8bVar2.a(jLongValue2);
                            } else {
                                m8bVar2.a(jLongValue2);
                            }
                            obj4 = obj;
                        }
                    }
                    obj2 = obj4;
                    if (m8bVar2.i()) {
                        gm0.n(str, "Didn't have reactions for update, fill from db.");
                        vo8Var = (vo8) xmVar.j.m(xmVar, o[0]);
                        if (vo8Var != null) {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        } else {
                            i7eVar = (i7e) wfeVar2.a;
                            umVar.d = null;
                            umVar.e = null;
                            umVar.f = null;
                            umVar.g = null;
                            umVar.h = null;
                            umVar.k = 5;
                            if (xmVar.f(i7eVar, umVar) == obj3) {
                                return obj3;
                            }
                        }
                        return obj2;
                    }
                    pvb pvbVar5 = xmVar.a;
                    ky kyVar5 = new ky(8, rx8.g0(m8bVar2));
                    umVar.d = null;
                    umVar.e = wfeVar2;
                    umVar.f = null;
                    umVar.g = null;
                    umVar.h = null;
                    umVar.k = 6;
                    objA = pvbVar5.D(kyVar5, umVar);
                    if (objA == obj3) {
                        return obj3;
                    }
                    wfeVar3 = wfeVar2;
                    thA = roe.a(objA);
                    if (thA != null) {
                        gm0.V(str, "Fail request reactions by ids.", thA);
                    }
                    if (!(objA instanceof poe)) {
                        list5 = ((ly) objA).e;
                        i7eVar2 = (i7e) wfeVar3.a;
                        umVar.d = null;
                        umVar.e = null;
                        umVar.f = null;
                        umVar.g = null;
                        umVar.h = objA;
                        umVar.k = 7;
                        if (xmVar.p(list5, i7eVar2, umVar) == obj3) {
                            return obj3;
                        }
                    }
                    return obj2;
                case 5:
                    ch3.d0(objA);
                    return obj4;
                case 6:
                    wfeVar3 = umVar.e;
                    try {
                        ch3.d0(objA);
                        obj2 = obj4;
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = obj4;
                        objA = new poe(th);
                    }
                    thA = roe.a(objA);
                    if (thA != null) {
                        gm0.V(str, "Fail request reactions by ids.", thA);
                    }
                    if (!(objA instanceof poe)) {
                        list5 = ((ly) objA).e;
                        i7eVar2 = (i7e) wfeVar3.a;
                        umVar.d = null;
                        umVar.e = null;
                        umVar.f = null;
                        umVar.g = null;
                        umVar.h = objA;
                        umVar.k = 7;
                        if (xmVar.p(list5, i7eVar2, umVar) == obj3) {
                            return obj3;
                        }
                    }
                    return obj2;
                case 7:
                    ch3.d0(objA);
                    obj2 = obj4;
                    return obj2;
                default:
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }

    public static xl n(kl klVar) {
        return new xl(klVar.c(), klVar.g(), klVar.a(), klVar.e(), klVar.d(), Long.valueOf(klVar.f()), klVar.b());
    }

    public static jl o(xl xlVar) {
        return new jl(xlVar.a, xlVar.c, xlVar.d, xlVar.e, xlVar.g);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) {
        pm pmVar;
        Object objI;
        if (nq4Var instanceof pm) {
            pmVar = (pm) nq4Var;
            int i = pmVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmVar.f = i - Integer.MIN_VALUE;
            } else {
                pmVar = new pm(this, nq4Var);
            }
        } else {
            pmVar = new pm(this, nq4Var);
        }
        Object obj = pmVar.d;
        int i2 = pmVar.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            s7f s7fVar = (s7f) this.e;
            s7fVar.I(0L);
            s7fVar.V.B(s7fVar, s7f.j0[44], 0L);
            pmVar.f = 1;
            Object objI2 = ch3.I(pmVar, this.b.a, false, true, new vi2(10));
            if (objI2 != hu4Var) {
                objI2 = sbiVar;
            }
            if (objI2 != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        pmVar.f = 3;
        objI = ch3.I(pmVar, this.d.a, false, true, new skd(14));
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        pmVar.f = 2;
        Object objI3 = ch3.I(pmVar, this.c.a, false, true, new vi2(15));
        if (objI3 != hu4Var) {
            objI3 = sbiVar;
        }
        if (objI3 != hu4Var) {
            pmVar.f = 3;
            objI = ch3.I(pmVar, this.d.a, false, true, new skd(14));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }

    public final Object e(m8b m8bVar, lq4 lq4Var) {
        boolean zI = m8bVar.i();
        sbi sbiVar = sbi.a;
        if (zI) {
            gm0.Y(xm.class.getName(), "Early return in fetchAnimojis cuz of ids.isEmpty()");
            return sbiVar;
        }
        Object objK0 = yab.K0(((n0c) this.f).a(), new rm(this, m8bVar, (lq4) null), lq4Var);
        return objK0 == hu4.a ? objK0 : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(i7e i7eVar, nq4 nq4Var) {
        sm smVar;
        Object next;
        if (nq4Var instanceof sm) {
            smVar = (sm) nq4Var;
            int i = smVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                smVar.g = i - Integer.MIN_VALUE;
            } else {
                smVar = new sm(this, nq4Var);
            }
        } else {
            smVar = new sm(this, nq4Var);
        }
        Object objA = smVar.e;
        int i2 = smVar.g;
        sbi sbiVar = sbi.a;
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            copyOnWriteArrayList.clear();
            List list = i7eVar.c;
            smVar.d = i7eVar;
            smVar.g = 1;
            objA = this.b.a(list, smVar);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objA);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i7eVar = smVar.d;
        ch3.d0(objA);
        List list2 = (List) objA;
        if (list2.isEmpty()) {
            List list3 = i7eVar.c;
            copyOnWriteArrayList.addAll(list3);
            m8b m8bVarJ0 = rx8.j0(list3);
            smVar.d = null;
            smVar.g = 2;
            if (e(m8bVarJ0, smVar) == obj) {
                return obj;
            }
        } else {
            int size = i7eVar.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                long jLongValue = ((Number) i7eVar.c.get(i3)).longValue();
                copyOnWriteArrayList.add(new Long(jLongValue));
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((xl) next).a != jLongValue);
                xl xlVar = (xl) next;
                if (xlVar != null) {
                    l(o(xlVar));
                }
            }
        }
        return sbiVar;
    }

    public final jl g(String str) {
        Object next;
        jl jlVar;
        if (str.length() == 0) {
            return null;
        }
        Iterator it = this.m.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            jlVar = (jl) ((f9b) next).getValue();
        } while (!cqk.d(jlVar != null ? jlVar.b : null, str));
        f9b f9bVar = (f9b) next;
        if (f9bVar != null) {
            return (jl) f9bVar.getValue();
        }
        return null;
    }

    public final jl h(long j) {
        return (jl) j(j).getValue();
    }

    public final String i(String str) {
        Object next;
        Iterator it = k().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((jl) next).b, str));
        jl jlVar = (jl) next;
        String str2 = jlVar != null ? jlVar.d : null;
        if ((jlVar != null ? jlVar.d : null) != null) {
            return str2;
        }
        String str3 = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, "Reaction effect not exist in picker reactions try find it in all animoji, id:" + (jlVar != null ? Long.valueOf(jlVar.a) : null) + "|" + (jlVar != null ? jlVar.b : null), null);
            }
        }
        jl jlVarG = g(str);
        if (jlVarG != null) {
            return jlVarG.d;
        }
        return null;
    }

    public final f9b j(long j) {
        return (f9b) this.m.computeIfAbsent(Long.valueOf(j), new mm(0, new c6(11)));
    }

    public final List k() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (!copyOnWriteArrayList.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = this.m;
            if (!concurrentHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f9b f9bVar = (f9b) concurrentHashMap.get((Long) it.next());
                    jl jlVar = f9bVar != null ? (jl) f9bVar.getValue() : null;
                    if (jlVar != null) {
                        arrayList.add(jlVar);
                    }
                }
                return arrayList;
            }
        }
        return r66.a;
    }

    public final void l(jl jlVar) {
        Object value;
        f9b f9bVarJ = j(jlVar.a);
        do {
            value = f9bVarJ.getValue();
        } while (!f9bVarJ.h(value, jlVar));
    }

    public final void m() {
        if (this.g.a()) {
            sgg sggVarI0 = yab.i0(this.i, null, 2, new dn0(this, null, 7), 1);
            this.l.B(this, o[2], sggVarI0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object p(List list, i7e i7eVar, nq4 nq4Var) {
        wm wmVar;
        Object value;
        Object obj = sbi.a;
        Object obj2 = hu4.a;
        if (nq4Var instanceof wm) {
            wmVar = (wm) nq4Var;
            int i = wmVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wmVar.h = i - Integer.MIN_VALUE;
            } else {
                wmVar = new wm(this, nq4Var);
            }
        } else {
            wmVar = new wm(this, nq4Var);
        }
        Object obj3 = wmVar.f;
        int i2 = wmVar.h;
        if (i2 != 0) {
            if (i2 == 1) {
                i7eVar = wmVar.e;
                list = wmVar.d;
                ch3.d0(obj3);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = wmVar.d;
                ch3.d0(obj3);
            }
        }
        ch3.d0(obj3);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kl klVar = (kl) it.next();
            xl xlVarN = klVar != null ? n(klVar) : null;
            if (xlVarN != null) {
                arrayList.add(xlVarN);
            }
        }
        if (!arrayList.isEmpty()) {
            ql qlVar = this.b;
            wmVar.d = list;
            wmVar.e = i7eVar;
            wmVar.h = 1;
            Object objI = ch3.I(wmVar, qlVar.a, false, true, new tc(qlVar, 1, arrayList));
            if (objI != obj2) {
                objI = obj;
            }
            if (objI != obj2) {
            }
        }
        vo8 vo8Var = (vo8) this.j.m(this, o[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        gm0.n(this.h, "updateReactions");
        m8b m8bVar = new m8b(list.size());
        for (kl klVar2 : list) {
            if (klVar2 != null) {
                m8bVar.a(klVar2.c());
            }
        }
        for (Map.Entry entry : this.m.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            f9b f9bVar = (f9b) entry.getValue();
            if (m8bVar.d(jLongValue)) {
                String str = this.h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(jLongValue, "set null for #"), null);
                    }
                }
                do {
                    value = f9bVar.getValue();
                } while (!f9bVar.h(value, null));
            }
        }
        wmVar.d = null;
        wmVar.e = null;
        wmVar.h = 2;
        return f(i7eVar, wmVar) == obj2 ? obj2 : obj;
    }
}
