package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class utd {
    public final xhh a;
    public final ite b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap(1);
    public final AtomicReference h;

    public utd(ny8 ny8Var, xhh xhhVar, ny8 ny8Var2, ite iteVar, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = xhhVar;
        this.b = iteVar;
        this.c = ny8Var2;
        this.d = ny8Var;
        this.e = ny8Var3;
        this.f = ny8Var4;
        AtomicReference atomicReference = new AtomicReference(null);
        this.h = atomicReference;
        atomicReference.set(yab.i0(iteVar, ((n0c) xhhVar).b(), 0, new ai8(this, null, 20), 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        qtd qtdVar;
        if (nq4Var instanceof qtd) {
            qtdVar = (qtd) nq4Var;
            int i = qtdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qtdVar.f = i - Integer.MIN_VALUE;
            } else {
                qtdVar = new qtd(this, nq4Var);
            }
        } else {
            qtdVar = new qtd(this, nq4Var);
        }
        Object obj = qtdVar.d;
        int i2 = qtdVar.f;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gmd gmdVar = (gmd) this.d.getValue();
            qtdVar.f = 1;
            Object objI = ch3.I(qtdVar, gmdVar.a, false, true, new skd(1));
            hu4 hu4Var = hu4.a;
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        dol.a(this.g, new skd(6));
        this.h.set(null);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, nq4 nq4Var) {
        rtd rtdVar;
        if (nq4Var instanceof rtd) {
            rtdVar = (rtd) nq4Var;
            int i = rtdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtdVar.g = i - Integer.MIN_VALUE;
            } else {
                rtdVar = new rtd(this, nq4Var);
            }
        } else {
            rtdVar = new rtd(this, nq4Var);
        }
        Object obj = rtdVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = rtdVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            vo8 vo8Var = (vo8) this.h.updateAndGet(new cz(5, this));
            if (vo8Var != null) {
                rtdVar.d = j;
                rtdVar.g = 1;
                if (vo8Var.g(rtdVar) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = rtdVar.d;
            ch3.d0(obj);
        }
        long j2 = j;
        f9b f9bVar = (f9b) this.g.get(new Long(j2));
        vjd vjdVar = f9bVar != null ? (vjd) f9bVar.getValue() : null;
        if (vjdVar != null) {
            return vjdVar;
        }
        String name = utd.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "getProfile: return stubProfile", null);
            }
        }
        return new vjd(j2, s66.a, r66.a, ((no4) this.c.getValue()).g(j2));
    }

    public final gjg c(long j) {
        return (gjg) this.g.computeIfAbsent(Long.valueOf(j), new am(18, new skd(5)));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fe A[LOOP:0: B:44:0x00f8->B:46:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object d(ujd ujdVar, String str, nq4 nq4Var) {
        std stdVar;
        LinkedHashMap linkedHashMap;
        cpd cpdVar;
        Object objI;
        cpd cpdVar2;
        ujd ujdVar2 = ujdVar;
        Object obj = sbi.a;
        Object obj2 = hu4.a;
        if (nq4Var instanceof std) {
            stdVar = (std) nq4Var;
            int i = stdVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                stdVar.h = i - Integer.MIN_VALUE;
            } else {
                stdVar = new std(this, nq4Var);
            }
        } else {
            stdVar = new std(this, nq4Var);
        }
        Object obj3 = stdVar.f;
        int i2 = stdVar.h;
        if (i2 == 0) {
            ch3.d0(obj3);
            String name = utd.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "putProfile: " + ujdVar2 + "; token=" + ((str == null || r5h.X0(str)) ? "null" : "***"), null);
                }
            }
            if (str != null && str.length() != 0) {
                z5 z5Var = new z5(this, ujdVar2, str, 9);
                stdVar.d = ujdVar2;
                stdVar.h = 1;
                if (qyj.V(k66.a, z5Var, stdVar) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            ujdVar2 = stdVar.d;
            ch3.d0(obj3);
        } else {
            if (i2 == 2) {
                ujdVar2 = stdVar.d;
                ch3.d0(obj3);
                long j = ujdVar2.a.a;
                LinkedHashMap linkedHashMap2 = ujdVar2.b;
                linkedHashMap = new LinkedHashMap(wm9.P0(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new loe(((moe) entry.getValue()).a()));
                }
                cpdVar = new cpd(0L, j, new f68(linkedHashMap, ujdVar2.c));
                gmd gmdVar = (gmd) this.d.getValue();
                stdVar.d = null;
                stdVar.e = cpdVar;
                stdVar.h = 3;
                objI = ch3.I(stdVar, gmdVar.a, false, true, new ol(gmdVar, 13, cpdVar));
                if (objI != obj2) {
                    objI = obj;
                }
                if (objI != obj2) {
                    cpdVar2 = cpdVar;
                }
                return obj2;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ch3.d0(obj3);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cpdVar2 = stdVar.e;
            ch3.d0(obj3);
        }
        stdVar.d = null;
        stdVar.e = null;
        stdVar.h = 4;
        if (e(cpdVar2, stdVar) != obj2) {
            return obj2;
        }
        return obj;
        ((s7f) ((et3) this.e.getValue())).N(ujdVar2.a.a);
        pj4 pj4Var = ujdVar2.a;
        no4 no4Var = (no4) this.c.getValue();
        List listSingletonList = Collections.singletonList(pj4Var);
        ji4 ji4Var = ji4.a;
        stdVar.d = ujdVar2;
        stdVar.h = 2;
        if (no4Var.m(listSingletonList, ji4Var, stdVar) != obj2) {
            long j2 = ujdVar2.a.a;
            LinkedHashMap linkedHashMap3 = ujdVar2.b;
            linkedHashMap = new LinkedHashMap(wm9.P0(linkedHashMap3.size()));
            while (r7.hasNext()) {
                linkedHashMap.put(entry.getKey(), new loe(((moe) entry.getValue()).a()));
            }
            cpdVar = new cpd(0L, j2, new f68(linkedHashMap, ujdVar2.c));
            gmd gmdVar2 = (gmd) this.d.getValue();
            stdVar.d = null;
            stdVar.e = cpdVar;
            stdVar.h = 3;
            objI = ch3.I(stdVar, gmdVar2.a, false, true, new ol(gmdVar2, 13, cpdVar));
            if (objI != obj2) {
                objI = obj;
            }
            if (objI != obj2) {
                cpdVar2 = cpdVar;
                stdVar.d = null;
                stdVar.e = null;
                stdVar.h = 4;
                if (e(cpdVar2, stdVar) != obj2) {
                    return obj;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(cpd cpdVar, nq4 nq4Var) {
        ttd ttdVar;
        Object next;
        if (nq4Var instanceof ttd) {
            ttdVar = (ttd) nq4Var;
            int i = ttdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttdVar.g = i - Integer.MIN_VALUE;
            } else {
                ttdVar = new ttd(this, nq4Var);
            }
        } else {
            ttdVar = new ttd(this, nq4Var);
        }
        Object objI = ttdVar.e;
        int i2 = ttdVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            no4 no4Var = (no4) this.c.getValue();
            long j = cpdVar.b;
            ttdVar.d = cpdVar;
            ttdVar.g = 1;
            objI = no4Var.i(j);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cpdVar = ttdVar.d;
            ch3.d0(objI);
        }
        vg4 vg4Var = (vg4) objI;
        sbi sbiVar = sbi.a;
        if (vg4Var == null) {
            return sbiVar;
        }
        HashMap map = cpdVar.c.a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            loe loeVar = (loe) entry.getValue();
            Iterator it = noe.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ((noe) next).getClass();
            } while (1 != iIntValue);
            noe noeVar = (noe) next;
            ylc ylcVar = noeVar == null ? null : new ylc(noeVar, new loe(loeVar.a()));
            if (ylcVar != null) {
                arrayList.add(ylcVar);
            }
        }
        EnumMap enumMap = new EnumMap(noe.class);
        wm9.V0(enumMap, arrayList);
        ArrayList arrayList2 = cpdVar.c.b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            tsd tsdVarB = sll.b(((Number) it2.next()).intValue());
            if (tsdVarB != null) {
                arrayList3.add(tsdVarB);
            }
        }
        long j2 = cpdVar.b;
        this.g.compute(new Long(j2), new he7(new z00(5, new vjd(j2, enumMap, arrayList3, vg4Var)), 4));
        return sbiVar;
    }
}
