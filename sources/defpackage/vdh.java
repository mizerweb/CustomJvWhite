package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vdh {
    public static final /* synthetic */ zv8[] n = {new z8b(vdh.class, "replaceRecentsJob", "getReplaceRecentsJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, vdh.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;")};
    public final ks6 a;
    public final gu4 b;
    public final xhh c;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg l;
    public final r8e m;
    public final String d = vdh.class.getName();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final p3c j = qyj.S();
    public final p3c k = qyj.S();

    public vdh(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ks6 ks6Var, gu4 gu4Var, xhh xhhVar) {
        this.a = ks6Var;
        this.b = gu4Var;
        this.c = xhhVar;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        mjg mjgVarA = p90.a(r66.a);
        this.l = mjgVarA;
        this.m = new r8e(mjgVarA);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Serializable a(vdh vdhVar, List list, nq4 nq4Var) {
        udh udhVar;
        List list2;
        String str = vdhVar.d;
        if (nq4Var instanceof udh) {
            udhVar = (udh) nq4Var;
            int i = udhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                udhVar.f = i - Integer.MIN_VALUE;
            } else {
                udhVar = new udh(vdhVar, nq4Var);
            }
        } else {
            udhVar = new udh(vdhVar, nq4Var);
        }
        udh udhVar2 = udhVar;
        Object objE = udhVar2.d;
        int i2 = udhVar2.f;
        r66 r66Var = r66.a;
        try {
            if (i2 == 0) {
                ch3.d0(objE);
                gm0.m(str, "suspendLoadNetworkStickers: ids=%s", list);
                ky kyVar = new ky(2, p90.i(list));
                pvb pvbVar = (pvb) vdhVar.f.getValue();
                ghb ghbVar = ew5.b;
                long jO = qe7.O(2, lw5.SECONDS);
                udhVar2.f = 1;
                objE = qe7.E(pvbVar, kyVar, str, jO, 0, null, null, udhVar2, 120);
                hu4 hu4Var = hu4.a;
                if (objE == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objE);
            }
            ly lyVar = (ly) objE;
            if (lyVar == null || (list2 = lyVar.c) == null) {
                list2 = r66Var;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(pm9.o((dlg) it.next()));
            }
            vdhVar.f(arrayList);
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(str, "Can't load stickers from network", th);
            return r66Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        qdh qdhVar;
        Object poeVar;
        vo8 vo8Var;
        if (nq4Var instanceof qdh) {
            qdhVar = (qdh) nq4Var;
            int i = qdhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qdhVar.f = i - Integer.MIN_VALUE;
            } else {
                qdhVar = new qdh(this, nq4Var);
            }
        } else {
            qdhVar = new qdh(this, nq4Var);
        }
        Object obj = qdhVar.d;
        int i2 = qdhVar.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n(this.d, "Clear");
            this.h.clear();
            this.i.clear();
            qdhVar.f = 1;
            ks6 ks6Var = this.a;
            ((s7f) ((et3) ((ny8) ks6Var.c).getValue())).K(0L);
            try {
                poeVar = Boolean.valueOf(((ju6) ((rs6) ((ny8) ks6Var.b).getValue())).r().delete());
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V((String) ks6Var.a, "Can't delete stickers showcase", thA);
            }
            if (sbiVar != hu4Var) {
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
        vo8Var = (vo8) this.j.m(this, n[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        qdhVar.f = 3;
        mjg mjgVar = this.l;
        mjgVar.getClass();
        mjgVar.j(null, r66.a);
        if (sbiVar != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        wae waeVar = (wae) this.g.getValue();
        qdhVar.f = 2;
        if (waeVar.e(qdhVar) != hu4Var) {
            vo8Var = (vo8) this.j.m(this, n[0]);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            qdhVar.f = 3;
            mjg mjgVar2 = this.l;
            mjgVar2.getClass();
            mjgVar2.j(null, r66.a);
            if (sbiVar != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }

    public final clg c(long j) {
        return (clg) this.h.get(Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List list, nq4 nq4Var) {
        sdh sdhVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (nq4Var instanceof sdh) {
            sdhVar = (sdh) nq4Var;
            int i = sdhVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdhVar.h = i - Integer.MIN_VALUE;
            } else {
                sdhVar = new sdh(this, nq4Var);
            }
        } else {
            sdhVar = new sdh(this, nq4Var);
        }
        Object objP = sdhVar.f;
        int i2 = sdhVar.h;
        if (i2 == 0) {
            ch3.d0(objP);
            List list2 = list;
            arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                clg clgVarC = c(((Number) it.next()).longValue());
                if (clgVarC != null) {
                    arrayList.add(clgVarC);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list2) {
                long jLongValue = ((Number) obj).longValue();
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (it2.hasNext()) {
                        }
                    } while (((clg) it2.next()).a != jLongValue);
                }
                arrayList3.add(obj);
            }
            if (!arrayList3.isEmpty()) {
                bye byeVar = new bye(new cke(this, arrayList3, null));
                sdhVar.d = list;
                sdhVar.e = arrayList;
                sdhVar.h = 1;
                objP = e9i.P(byeVar, sdhVar);
                hu4 hu4Var = hu4.a;
                if (objP == hu4Var) {
                    return hu4Var;
                }
                arrayList2 = arrayList;
            }
            return ww3.M1(arrayList, new lm4(list, 1, new ore(7)));
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList2 = sdhVar.e;
        list = sdhVar.d;
        ch3.d0(objP);
        Iterable iterable = (List) objP;
        if (iterable == null) {
            iterable = r66.a;
        }
        arrayList = ww3.G1(iterable, arrayList2);
        return ww3.M1(arrayList, new lm4(list, 1, new ore(7)));
    }

    public final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (c(jLongValue) == null) {
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
        return arrayList;
    }

    public final void f(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clg clgVar = (clg) it.next();
            this.h.put(Long.valueOf(clgVar.a), clgVar);
        }
        yab.i0(this.b, ((n0c) this.c).b(), 0, new ai8(this, arrayList, null, 29), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(clg clgVar, nq4 nq4Var) {
        tdh tdhVar;
        if (nq4Var instanceof tdh) {
            tdhVar = (tdh) nq4Var;
            int i = tdhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tdhVar.f = i - Integer.MIN_VALUE;
            } else {
                tdhVar = new tdh(this, nq4Var);
            }
        } else {
            tdhVar = new tdh(this, nq4Var);
        }
        Object obj = tdhVar.d;
        int i2 = tdhVar.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            this.h.put(new Long(clgVar.a), clgVar);
            xse xseVar = (xse) this.e.getValue();
            List listSingletonList = Collections.singletonList(clgVar);
            tdhVar.f = 1;
            Object objB = ((j35) xseVar.b.getValue()).b(new vy6(xseVar, listSingletonList, null, 3), tdhVar);
            if (objB != hu4Var) {
                objB = sbiVar;
            }
            if (objB != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        tdhVar.f = 2;
        this.a.e(this.i);
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }
}
