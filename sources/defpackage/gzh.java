package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gzh implements j3d, xf {
    public final qec a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public List c;
    public List d;
    public kc0 e;
    public u4j f;
    public u4j g;
    public poh h;
    public xc7 i;
    public final LinkedHashMap j;
    public b87 k;
    public b87 l;

    public gzh(qec qecVar, int i) {
        this.a = qecVar;
        r66 r66Var = r66.a;
        this.c = r66Var;
        this.d = r66Var;
        this.j = new LinkedHashMap();
    }

    @Override // defpackage.xf
    public final void P0(wf wfVar, b87 b87Var, w55 w55Var) {
        boolean z = nec.a;
        this.k = b87Var;
        b(b87Var);
    }

    public final void a(b87 b87Var) {
        Object next;
        y80 y80VarB = srk.b(b87Var);
        String str = (String) this.j.get(y80VarB.b());
        kc0 kc0Var = this.e;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((kc0) next).a(), str));
        kc0 kc0Var2 = (kc0) next;
        kc0 kc0Var3 = kc0Var2 != null ? new kc0(kc0Var2.b(), kc0Var2.a(), y80VarB) : null;
        if (kc0Var3 != kc0Var) {
            this.e = kc0Var3;
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((hzh) it2.next()).a(kc0Var3);
            }
        }
        boolean z = nec.a;
    }

    public final void b(b87 b87Var) {
        Object next;
        kwi kwiVarE = srk.e(b87Var);
        u4j u4jVar = this.g;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((u4j) next).a(), q3m.e(kwiVarE)));
        u4j u4jVar2 = (u4j) next;
        u4j u4jVar3 = u4jVar2 != null ? new u4j(u4jVar2.d(), u4jVar2.a(), kwiVarE, u4jVar2.c()) : null;
        if (u4jVar3 != u4jVar) {
            this.g = u4jVar3;
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((hzh) it2.next()).b(u4jVar3);
            }
        }
        boolean z = nec.a;
    }

    @Override // defpackage.xf
    public final void m0(wf wfVar, b87 b87Var) {
        boolean z = nec.a;
        this.l = b87Var;
        a(b87Var);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0276  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:125:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2 A[LOOP:6: B:129:0x02cc->B:131:0x02d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x0305  */
    /* JADX WARN: Code duplicated, block: B:150:0x0310 A[LOOP:7: B:148:0x030a->B:150:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0322  */
    /* JADX WARN: Code duplicated, block: B:158:0x0333  */
    /* JADX WARN: Code duplicated, block: B:212:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    @Override // defpackage.j3d
    public final void t0(fzh fzhVar) {
        u4j u4jVar;
        poh pohVar;
        u4j u4jVar2;
        ArrayList arrayList;
        u4j u4jVar3;
        Object objA;
        Object objA2;
        poh pohVar2;
        Object objA3;
        Object objA4;
        Object obj;
        u4j u4jVar4;
        Object objC;
        xc7 xc7Var;
        Object next;
        kwi kwiVarB;
        poh pohVar3;
        boolean z;
        u4j u4jVar5;
        String str;
        poh pohVar4;
        int iIntValue;
        c98 c98Var;
        Integer num;
        String str2;
        boolean z2 = nec.a;
        u4j u4jVar6 = this.f;
        poh pohVar5 = this.h;
        r66 r66Var = r66.a;
        this.c = r66Var;
        this.d = r66Var;
        y80 y80VarA = null;
        this.f = null;
        this.h = null;
        ArrayList<ezh> arrayList2 = new ArrayList();
        ArrayList<ezh> arrayList3 = new ArrayList();
        int i = 0;
        a98 a98VarListIterator = fzhVar.a.listIterator(0);
        ezh ezhVar = null;
        while (a98VarListIterator.hasNext()) {
            ezh ezhVar2 = (ezh) a98VarListIterator.next();
            int iE = ezhVar2.e();
            if (iE == 1) {
                arrayList2.add(ezhVar2);
            } else if (iE != 2) {
                if (iE == 3) {
                    arrayList3.add(ezhVar2);
                }
            } else if (ezhVar2.f() && ezhVar == null) {
                ezhVar = ezhVar2;
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        CopyOnWriteArrayList<hzh> copyOnWriteArrayList = this.b;
        if (zIsEmpty) {
            u4jVar = u4jVar6;
            pohVar = pohVar5;
            boolean z3 = nec.a;
            if (this.e != null) {
                this.e = null;
                this.l = null;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((hzh) it.next()).a(null);
                }
            }
        } else {
            LinkedHashMap linkedHashMap = this.j;
            linkedHashMap.clear();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ezh ezhVar3 = (ezh) it2.next();
                    if (ezhVar3.f()) {
                        int i2 = ezhVar3.a;
                        int i3 = 0;
                        while (true) {
                            if (i3 < i2) {
                                if (ezhVar3.g(i3)) {
                                    str2 = ezhVar3.c(i3).n;
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
                str2 = null;
                break;
            }
            if (str2 == null) {
                boolean z4 = nec.a;
                u4jVar = u4jVar6;
                pohVar = pohVar5;
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (ezh ezhVar4 : arrayList2) {
                    String str3 = ezhVar4.b().b;
                    ArrayList arrayList5 = new ArrayList();
                    int i4 = ezhVar4.a;
                    while (i < i4) {
                        u4j u4jVar7 = u4jVar6;
                        b87 b87Var = ezhVar4.b().d[i];
                        y80 y80VarB = srk.b(b87Var);
                        poh pohVar6 = pohVar5;
                        if (cqk.d(y80VarB.a(), str2)) {
                            linkedHashMap.put(y80VarB.b(), str3);
                            arrayList5.add(Integer.valueOf(i));
                            if (y80VarA == null) {
                                w80 w80Var = new w80();
                                w80Var.e(b87Var.n);
                                w80Var.b(b87Var.k);
                                w80Var.c(b87Var.b);
                                w80Var.d(b87Var.d);
                                y80VarA = w80Var.a();
                            }
                        }
                        i++;
                        u4jVar6 = u4jVar7;
                        pohVar5 = pohVar6;
                    }
                    u4j u4jVar8 = u4jVar6;
                    poh pohVar7 = pohVar5;
                    if (!arrayList5.isEmpty()) {
                        arrayList4.add(new kc0(new ih(ezhVar4.b(), arrayList5), str3, y80VarA));
                    }
                    u4jVar6 = u4jVar8;
                    pohVar5 = pohVar7;
                    y80VarA = null;
                    i = 0;
                }
                u4jVar = u4jVar6;
                pohVar = pohVar5;
                this.c = arrayList4;
                boolean z5 = nec.a;
            }
            b87 b87Var2 = this.l;
            if (this.e == null && b87Var2 != null) {
                a(b87Var2);
            }
        }
        qec qecVar = this.a;
        if (ezhVar == null) {
            if (this.g != null) {
                u4jVar2 = null;
                this.g = null;
                this.k = null;
                Iterator it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    ((hzh) it3.next()).b(null);
                }
            }
            arrayList = new ArrayList();
            for (ezh ezhVar5 : arrayList3) {
                str = ezhVar5.b().b;
                if (ezhVar5.a > 0) {
                    rmh rmhVarD = srk.d(ezhVar5.b().d[0]);
                    Collections.singletonList(0);
                    pohVar4 = new poh(str, rmhVarD);
                    arrayList.add(pohVar4);
                    if (ezhVar5.g(0)) {
                        this.h = pohVar4;
                    }
                }
            }
            boolean z6 = nec.a;
            u4jVar3 = this.f;
            if (u4jVar3 != null) {
                objA = u4jVar3.a();
            } else {
                objA = u4jVar2;
            }
            if (u4jVar != null) {
                objA2 = u4jVar.a();
            } else {
                objA2 = u4jVar2;
            }
            if (!cqk.d(objA, objA2)) {
                u4jVar5 = this.f;
                for (hzh hzhVar : copyOnWriteArrayList) {
                    hzhVar.b.u(hzhVar.a, u4jVar5);
                }
            }
            pohVar2 = this.h;
            if (pohVar2 != null) {
                objA3 = pohVar2.a();
            } else {
                objA3 = u4jVar2;
            }
            if (pohVar != null) {
                objA4 = pohVar.a();
            } else {
                objA4 = u4jVar2;
            }
            if (!cqk.d(objA3, objA4)) {
                pohVar3 = this.h;
                if (pohVar3 == null && pohVar3.b()) {
                    z = true;
                } else {
                    z = false;
                }
                for (hzh hzhVar2 : copyOnWriteArrayList) {
                    hzhVar2.b.t(hzhVar2.a, pohVar3, z);
                }
            }
            obj = this.i;
            if (obj != null) {
                boolean z7 = nec.a;
                u4jVar4 = this.f;
                if (u4jVar4 != null || (kwiVarB = u4jVar4.b()) == null) {
                    objC = u4jVar2;
                } else {
                    objC = kwiVarB.c();
                }
                if (obj != objC || this.d.isEmpty() || (xc7Var = this.i) == null) {
                    return;
                }
                AtomicInteger atomicInteger = xqi.a;
                List list = this.d;
                TreeSet treeSet = new TreeSet(new z70(8, new s81(27, xc7Var)));
                ww3.P1(list, treeSet);
                t4j t4jVar = (t4j) treeSet.first();
                Iterator it4 = this.d.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = u4jVar2;
                        break;
                    }
                    next = it4.next();
                } while (!cqk.d(((t4j) next).a(), t4jVar.a()));
                if (next instanceof u4j) {
                    u4jVar2 = (u4j) next;
                }
                if (u4jVar2 != null) {
                    this.i = t4jVar.b().c();
                    boolean z8 = nec.a;
                    pe5 pe5VarG = qecVar.g();
                    pe5VarG.getClass();
                    oe5 oe5Var = new oe5(pe5VarG);
                    ih ihVarD = u4jVar2.d();
                    oe5Var.j(new nyh(ihVarD.z(), ihVarD.A()));
                    qecVar.c(new pe5(oe5Var));
                }
                this.i = xc7Var;
                return;
            }
        }
        nyh nyhVar = (nyh) qecVar.g().H.get(ezhVar.b());
        if (nyhVar == null) {
            iIntValue = -1;
        } else {
            if (nyhVar.b.size() <= 0) {
                nyhVar = null;
            }
            if (nyhVar == null || (c98Var = nyhVar.b) == null || (num = (Integer) c98Var.get(0)) == null) {
                iIntValue = -1;
            } else {
                iIntValue = num.intValue();
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i5 = ezhVar.a;
        String strA = null;
        for (int i6 = 0; i6 < i5; i6++) {
            boolean zH = ezhVar.h(i6);
            if (zH) {
                kwi kwiVarE = srk.e(ezhVar.b().d[i6]);
                myh myhVar = (myh) qecVar.l.a;
                xc7 xc7Var2 = myhVar.a;
                xc7 xc7Var3 = myhVar.b;
                xc7 xc7VarC = kwiVarE.c();
                if (xc7VarC.compareTo(xc7Var2) >= 0 && xc7VarC.compareTo(xc7Var3) <= 0) {
                    u4j u4jVar9 = new u4j(new ih(ezhVar.b(), Collections.singletonList(Integer.valueOf(i6))), q3m.e(kwiVarE), kwiVarE, zH);
                    arrayList6.add(u4jVar9);
                    boolean z9 = nec.a;
                    if (i6 == iIntValue) {
                        this.f = u4jVar9;
                    }
                    if (ezhVar.g(i6) && strA == null) {
                        strA = kwiVarE.a();
                    }
                }
            } else {
                boolean z10 = nec.a;
            }
        }
        if (strA != null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : arrayList6) {
                if (cqk.d(((u4j) obj2).b().a(), strA)) {
                    arrayList7.add(obj2);
                }
            }
            this.d = ww3.M1(arrayList7, new crg(5));
        }
        boolean z11 = nec.a;
        b87 b87Var3 = this.k;
        if (this.g == null && b87Var3 != null) {
            b(b87Var3);
        }
        u4jVar2 = null;
        arrayList = new ArrayList();
        while (r4.hasNext()) {
            str = ezhVar5.b().b;
            if (ezhVar5.a > 0) {
                rmh rmhVarD2 = srk.d(ezhVar5.b().d[0]);
                Collections.singletonList(0);
                pohVar4 = new poh(str, rmhVarD2);
                arrayList.add(pohVar4);
                if (ezhVar5.g(0)) {
                    this.h = pohVar4;
                }
            }
        }
        boolean z12 = nec.a;
        u4jVar3 = this.f;
        if (u4jVar3 != null) {
            objA = u4jVar3.a();
        } else {
            objA = u4jVar2;
        }
        if (u4jVar != null) {
            objA2 = u4jVar.a();
        } else {
            objA2 = u4jVar2;
        }
        if (!cqk.d(objA, objA2)) {
            u4jVar5 = this.f;
            while (r4.hasNext()) {
                hzhVar.b.u(hzhVar.a, u4jVar5);
            }
        }
        pohVar2 = this.h;
        if (pohVar2 != null) {
            objA3 = pohVar2.a();
        } else {
            objA3 = u4jVar2;
        }
        if (pohVar != null) {
            objA4 = pohVar.a();
        } else {
            objA4 = u4jVar2;
        }
        if (!cqk.d(objA3, objA4)) {
            pohVar3 = this.h;
            if (pohVar3 == null) {
                z = false;
            } else {
                z = false;
            }
            while (r4.hasNext()) {
                hzhVar2.b.t(hzhVar2.a, pohVar3, z);
            }
        }
        obj = this.i;
        if (obj != null) {
            boolean z13 = nec.a;
            u4jVar4 = this.f;
            if (u4jVar4 != null) {
                objC = u4jVar2;
            } else {
                objC = u4jVar2;
            }
            if (obj != objC) {
            }
        }
    }
}
