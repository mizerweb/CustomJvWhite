package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ru.ok.tamtam.search.DuplicateDetectException;

/* JADX INFO: loaded from: classes2.dex */
public final class r53 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;
    public Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r53(fk3 fk3Var, String str, ArrayList arrayList, List list, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = fk3Var;
        this.i = str;
        this.m = arrayList;
        this.n = list;
        this.j = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                r53 r53Var = new r53((l63) obj2, this.f, this.i, this.j, lq4Var);
                r53Var.h = obj;
                return r53Var;
            default:
                boolean z = this.j;
                r53 r53Var2 = new r53((fk3) this.l, this.i, (ArrayList) this.m, (List) obj2, z, lq4Var);
                r53Var2.h = obj;
                return r53Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((r53) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:155:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:158:0x0400  */
    /* JADX WARN: Code duplicated, block: B:160:0x040e  */
    /* JADX WARN: Code duplicated, block: B:161:0x041e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0422  */
    /* JADX WARN: Code duplicated, block: B:167:0x0451  */
    /* JADX WARN: Code duplicated, block: B:169:0x0459  */
    /* JADX WARN: Code duplicated, block: B:172:0x047a  */
    /* JADX WARN: Code duplicated, block: B:176:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:177:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:180:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:182:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:183:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:184:0x0526  */
    /* JADX WARN: Code duplicated, block: B:186:0x0530  */
    /* JADX WARN: Code duplicated, block: B:76:0x020b  */
    /* JADX WARN: Code duplicated, block: B:79:0x023b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0243  */
    /* JADX WARN: Code duplicated, block: B:87:0x026c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0288  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object next;
        py9 py9Var;
        o53 o53Var;
        Object objV;
        rt2 rt2Var;
        Object objF;
        o53 o53Var2;
        py9 py9Var2;
        sfa sfaVar;
        e70 e70VarK;
        l63 l63Var;
        o53 o53Var3;
        py9 py9Var3;
        Object objC;
        c46 c46Var;
        Object poeVar;
        rui ruiVar;
        String str;
        long j;
        String str2;
        a4c a4cVar;
        qy9 qy9VarL;
        l63 l63Var2;
        String str3;
        mjg mjgVar;
        rui ruiVar2;
        je9 je9Var;
        ij3 ij3Var;
        Object objC2;
        long j2;
        boolean z;
        boolean z2;
        DuplicateDetectException duplicateDetectException;
        String str4;
        a4c a4cVar2;
        je9 je9Var2;
        int iNextIndex;
        int i = 3;
        lq4 lq4Var = null;
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.h;
                hu4 hu4Var = hu4.a;
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    List list = ((m53) ((l63) this.n).n1.getValue()).a;
                    long j3 = this.f;
                    String str5 = this.i;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            qy9 qy9Var = (qy9) next;
                            if (qy9Var.l() != j3 || !cqk.d(str5, qy9Var.B())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    py9Var = next instanceof py9 ? (py9) next : null;
                    o53Var = new o53(py9Var, 2);
                    if (l63.C((l63) this.n, this.f, this.i)) {
                        mjg mjgVar2 = ((l63) this.n).t1;
                        mjgVar2.getClass();
                        mjgVar2.j(null, o53Var);
                    }
                    xn3 xn3VarK = ((l63) this.n).K();
                    long j4 = ((l63) this.n).c;
                    this.h = gu4Var;
                    this.k = py9Var;
                    this.l = o53Var;
                    this.g = 1;
                    objV = xn3VarK.v(j4, this);
                    if (objV != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o53Var3 = (o53) this.l;
                        py9Var3 = (py9) this.k;
                        try {
                            ch3.d0(obj);
                            objC = obj;
                            poeVar = (rui) objC;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            poeVar = new poe(th);
                        }
                        if (poeVar instanceof poe) {
                            poeVar = null;
                        }
                        ruiVar = (rui) poeVar;
                        if (ruiVar == null) {
                            if (l63.C((l63) this.n, this.f, this.i)) {
                                a8j.x(((l63) this.n).Y, new jb6(5, true));
                            }
                        } else if (this.j) {
                            ((tyi) ((l63) this.n).v.getValue()).b(((l63) this.n).c, Collections.singletonList(new Long(this.f)));
                        }
                        str = ((l63) this.n).p;
                        j = this.f;
                        str2 = this.i;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                StringBuilder sbT = qt4.t(j, "Media viewer. Get video content msg:", ", attach:", str2);
                                sbT.append(", content:");
                                sbT.append(ruiVar);
                                a4cVar.c(je9Var, str, sbT.toString(), null);
                            }
                        }
                        qy9VarL = ((l63) this.n).L();
                        if (qy9VarL != null && qy9VarL.equals(py9Var3)) {
                            mjg mjgVar3 = ((l63) this.n).t1;
                            o53 o53Var4 = new o53(o53Var3.a, ruiVar);
                            mjgVar3.getClass();
                            mjgVar3.j(null, o53Var4);
                            l63Var2 = (l63) this.n;
                            str3 = l63Var2.p;
                            mjgVar = l63Var2.p1;
                            ruiVar2 = ((o53) l63Var2.u1.a.getValue()).b;
                            if (ruiVar2 == null) {
                                mjgVar.j(null, k53.a((k53) mjgVar.getValue(), new j53(null, 7)));
                                gm0.n(str3, "Can't prepare frame loading for preview because videoContent is null");
                            } else if (!cqk.d(((lc7) l63Var2.x.getValue()).getData().a, ruiVar2)) {
                                ((lc7) l63Var2.x.getValue()).c(new jc7(ruiVar2, 6));
                                if (((lc7) l63Var2.x.getValue()).a()) {
                                    mjgVar.j(null, k53.a((k53) mjgVar.getValue(), new j53(null, 7)));
                                    ((lc7) l63Var2.x.getValue()).prepare();
                                    l63Var2.X.updateAndGet(new h53(0));
                                } else {
                                    gm0.n(str3, "Can't load frame for preview because can't extract frame");
                                }
                            }
                        }
                        return sbi.a;
                    }
                    rt2 rt2Var2 = (rt2) this.m;
                    o53Var = (o53) this.l;
                    py9Var = (py9) this.k;
                    ch3.d0(obj);
                    rt2Var = rt2Var2;
                    objF = obj;
                    o53Var2 = o53Var;
                    py9Var2 = py9Var;
                    sfaVar = (sfa) objF;
                    if (sfaVar != null || (c46Var = sfaVar.n) == null) {
                        e70VarK = null;
                    } else {
                        e70VarK = c46Var.k(this.i);
                    }
                    l63Var = (l63) this.n;
                    if (e70VarK != null) {
                        boolean z3 = this.j;
                        try {
                            n5j n5jVar = (n5j) l63Var.u.getValue();
                            long jA = rt2Var.A();
                            long j5 = sfaVar.b;
                            this.h = null;
                            this.k = py9Var2;
                            this.l = o53Var2;
                            this.m = null;
                            this.g = 3;
                            objC = n5jVar.c(e70VarK, jA, j5, z3, this);
                            if (objC != hu4Var) {
                                o53Var3 = o53Var2;
                                py9Var3 = py9Var2;
                                poeVar = (rui) objC;
                                if (poeVar instanceof poe) {
                                    poeVar = null;
                                }
                                ruiVar = (rui) poeVar;
                                if (ruiVar == null) {
                                    if (l63.C((l63) this.n, this.f, this.i)) {
                                        a8j.x(((l63) this.n).Y, new jb6(5, true));
                                    }
                                } else if (this.j) {
                                    ((tyi) ((l63) this.n).v.getValue()).b(((l63) this.n).c, Collections.singletonList(new Long(this.f)));
                                }
                                str = ((l63) this.n).p;
                                j = this.f;
                                str2 = this.i;
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        StringBuilder sbT2 = qt4.t(j, "Media viewer. Get video content msg:", ", attach:", str2);
                                        sbT2.append(", content:");
                                        sbT2.append(ruiVar);
                                        a4cVar.c(je9Var, str, sbT2.toString(), null);
                                    }
                                }
                                qy9VarL = ((l63) this.n).L();
                                if (qy9VarL != null) {
                                    mjg mjgVar4 = ((l63) this.n).t1;
                                    o53 o53Var5 = new o53(o53Var3.a, ruiVar);
                                    mjgVar4.getClass();
                                    mjgVar4.j(null, o53Var5);
                                    l63Var2 = (l63) this.n;
                                    str3 = l63Var2.p;
                                    mjgVar = l63Var2.p1;
                                    ruiVar2 = ((o53) l63Var2.u1.a.getValue()).b;
                                    if (ruiVar2 == null) {
                                        mjgVar.j(null, k53.a((k53) mjgVar.getValue(), new j53(null, 7)));
                                        gm0.n(str3, "Can't prepare frame loading for preview because videoContent is null");
                                    } else if (!cqk.d(((lc7) l63Var2.x.getValue()).getData().a, ruiVar2)) {
                                        ((lc7) l63Var2.x.getValue()).c(new jc7(ruiVar2, 6));
                                        if (((lc7) l63Var2.x.getValue()).a()) {
                                            gm0.n(str3, "Can't load frame for preview because can't extract frame");
                                        } else {
                                            mjgVar.j(null, k53.a((k53) mjgVar.getValue(), new j53(null, 7)));
                                            ((lc7) l63Var2.x.getValue()).prepare();
                                            l63Var2.X.updateAndGet(new h53(0));
                                        }
                                    }
                                }
                            }
                            return hu4Var;
                        } catch (Throwable th2) {
                            th = th2;
                            o53Var3 = o53Var2;
                            py9Var3 = py9Var2;
                            poeVar = new poe(th);
                        }
                    } else if (l63.C(l63Var, this.f, this.i)) {
                        a8j.x(((l63) this.n).Y, new jb6(5, true));
                    }
                    return sbi.a;
                }
                o53Var = (o53) this.l;
                py9Var = (py9) this.k;
                ch3.d0(obj);
                objV = obj;
                rt2Var = (rt2) objV;
                sua suaVar = ((l63) this.n).k;
                long j6 = this.f;
                this.h = gu4Var;
                this.k = py9Var;
                this.l = o53Var;
                this.m = rt2Var;
                this.g = 2;
                objF = suaVar.f(j6, this);
                if (objF != hu4Var) {
                    o53Var2 = o53Var;
                    py9Var2 = py9Var;
                    sfaVar = (sfa) objF;
                    if (sfaVar != null) {
                        e70VarK = null;
                    } else {
                        e70VarK = null;
                    }
                    l63Var = (l63) this.n;
                    if (e70VarK != null) {
                        boolean z4 = this.j;
                        n5j n5jVar2 = (n5j) l63Var.u.getValue();
                        long jA2 = rt2Var.A();
                        long j7 = sfaVar.b;
                        this.h = null;
                        this.k = py9Var2;
                        this.l = o53Var2;
                        this.m = null;
                        this.g = 3;
                        objC = n5jVar2.c(e70VarK, jA2, j7, z4, this);
                        if (objC != hu4Var) {
                            o53Var3 = o53Var2;
                            py9Var3 = py9Var2;
                            poeVar = (rui) objC;
                            if (poeVar instanceof poe) {
                                poeVar = null;
                            }
                            ruiVar = (rui) poeVar;
                            if (ruiVar == null) {
                                if (l63.C((l63) this.n, this.f, this.i)) {
                                    a8j.x(((l63) this.n).Y, new jb6(5, true));
                                }
                            } else if (this.j) {
                                ((tyi) ((l63) this.n).v.getValue()).b(((l63) this.n).c, Collections.singletonList(new Long(this.f)));
                            }
                            str = ((l63) this.n).p;
                            j = this.f;
                            str2 = this.i;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    StringBuilder sbT3 = qt4.t(j, "Media viewer. Get video content msg:", ", attach:", str2);
                                    sbT3.append(", content:");
                                    sbT3.append(ruiVar);
                                    a4cVar.c(je9Var, str, sbT3.toString(), null);
                                }
                            }
                            qy9VarL = ((l63) this.n).L();
                            if (qy9VarL != null) {
                                mjg mjgVar5 = ((l63) this.n).t1;
                                o53 o53Var6 = new o53(o53Var3.a, ruiVar);
                                mjgVar5.getClass();
                                mjgVar5.j(null, o53Var6);
                                l63Var2 = (l63) this.n;
                                str3 = l63Var2.p;
                                mjgVar = l63Var2.p1;
                                ruiVar2 = ((o53) l63Var2.u1.a.getValue()).b;
                                if (ruiVar2 == null) {
                                    mjgVar.j(null, k53.a((k53) mjgVar.getValue(), new j53(null, 7)));
                                    gm0.n(str3, "Can't prepare frame loading for preview because videoContent is null");
                                } else if (!cqk.d(((lc7) l63Var2.x.getValue()).getData().a, ruiVar2)) {
                                    ((lc7) l63Var2.x.getValue()).c(new jc7(ruiVar2, 6));
                                    if (((lc7) l63Var2.x.getValue()).a()) {
                                        gm0.n(str3, "Can't load frame for preview because can't extract frame");
                                    } else {
                                        mjgVar.j(null, k53.a((k53) mjgVar.getValue(), new j53(null, 7)));
                                        ((lc7) l63Var2.x.getValue()).prepare();
                                        l63Var2.X.updateAndGet(new h53(0));
                                    }
                                }
                            }
                        }
                    } else if (l63.C(l63Var, this.f, this.i)) {
                        a8j.x(((l63) this.n).Y, new jb6(5, true));
                    }
                    return sbi.a;
                }
                return hu4Var;
            default:
                sbi sbiVar = sbi.a;
                gu4 gu4Var2 = (gu4) this.h;
                hu4 hu4Var2 = hu4.a;
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    if (((jj3) ((fk3) this.l).E.getValue()).b.equals(this.i)) {
                        ij3Var = !((ArrayList) this.m).isEmpty() ? ij3.d : ij3.e;
                        long jNanoTime = System.nanoTime();
                        gm0.x(((fk3) this.l).Z, "chats search: start UI mapping", null);
                        xt4 xt4VarA = ((n0c) ((fk3) this.l).g).a();
                        vt4 vt4VarK = gu4Var2.k();
                        xt4VarA.getClass();
                        yab.i0(gu4Var2, lvb.x0(xt4VarA, vt4VarK), 0, new jd3((ArrayList) this.m, (fk3) this.l, lq4Var, i), 2);
                        ArrayList arrayList = (ArrayList) this.m;
                        fk3 fk3Var = (fk3) this.l;
                        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(yab.h(gu4Var2, null, 0, new vj3(it2.next(), null, fk3Var), 3));
                        }
                        this.h = gu4Var2;
                        this.k = ij3Var;
                        this.f = jNanoTime;
                        this.g = 1;
                        objC2 = ch3.c(arrayList2, this);
                        if (objC2 == hu4Var2) {
                            return hu4Var2;
                        }
                        j2 = jNanoTime;
                    }
                    return sbiVar;
                }
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.f;
                ij3Var = (ij3) this.k;
                ch3.d0(obj);
                objC2 = obj;
                ij3 ij3Var2 = ij3Var;
                List<y8f> list2 = (List) objC2;
                if (!((List) this.n).isEmpty()) {
                    ListIterator listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            int i4 = ((y8f) listIterator.previous()).a;
                            if (i4 == 2 || i4 == 4) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex > -1) {
                        ArrayList arrayList3 = new ArrayList(list2);
                        arrayList3.add(iNextIndex + 1, b3g.c);
                        list2 = arrayList3;
                    }
                }
                String str6 = ((fk3) this.l).Z;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.e;
                    if (a4cVar3.b(je9Var3)) {
                        ghb ghbVar = ew5.b;
                        a4cVar3.c(je9Var3, str6, "chats search: UI mapping finish: ".concat(ew5.t(qe7.P(System.nanoTime() - j2, lw5.NANOSECONDS))), null);
                    }
                }
                if (((jj3) ((fk3) this.l).E.getValue()).b.equals(this.i)) {
                    gm0.x(((fk3) this.l).Z, "chats search: update_search_state", null);
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    m8b m8bVar = new m8b();
                    m8b m8bVar2 = new m8b();
                    m8b m8bVar3 = new m8b();
                    for (y8f y8fVar : list2) {
                        if (cqk.x(gu4Var2)) {
                            if (y8fVar instanceof be3) {
                                be3 be3Var = (be3) y8fVar;
                                if (!m8bVar.d(be3Var.c)) {
                                    m8bVar.a(be3Var.c);
                                    arrayList4.add(y8fVar);
                                }
                            }
                            if (y8fVar instanceof fm4) {
                                fm4 fm4Var = (fm4) y8fVar;
                                if (!m8bVar2.d(fm4Var.c)) {
                                    m8bVar2.a(fm4Var.c);
                                    arrayList4.add(y8fVar);
                                }
                            }
                            if (y8fVar instanceof sja) {
                                sja sjaVar = (sja) y8fVar;
                                if (!m8bVar3.d(sjaVar.e.a)) {
                                    m8bVar3.a(sjaVar.e.a);
                                    arrayList4.add(y8fVar);
                                }
                            }
                            arrayList4.add(y8fVar);
                        } else if (cqk.x(gu4Var2) && ((jj3) ((fk3) this.l).E.getValue()).b.equals(this.i)) {
                            if (arrayList4.size() != list2.size()) {
                                duplicateDetectException = new DuplicateDetectException(zo5.h(list2.size() - arrayList4.size(), "diff="));
                                ((iv4) ((fk3) this.l).t.getValue()).a("ONEME-15837", duplicateDetectException);
                                str4 = ((fk3) this.l).Z;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9Var2 = je9.f;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, str4, qv1.k("found duplicates for ONEME-15837! ", duplicateDetectException.getMessage()), null);
                                    }
                                }
                            }
                            if (((jj3) ((fk3) this.l).E.getValue()).g || !((List) this.n).isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!this.j || ((jj3) ((fk3) this.l).E.getValue()).a == ij3.b || z) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            mjg mjgVar6 = ((fk3) this.l).E;
                            jj3 jj3VarA = jj3.a((jj3) mjgVar6.getValue(), ij3Var2, l48.d, arrayList4, z2, ((fk3) this.l).F(), !((List) this.n).isEmpty(), 2);
                            mjgVar6.getClass();
                            mjgVar6.j(null, jj3VarA);
                        }
                    }
                    if (cqk.x(gu4Var2)) {
                        if (arrayList4.size() != list2.size()) {
                            duplicateDetectException = new DuplicateDetectException(zo5.h(list2.size() - arrayList4.size(), "diff="));
                            ((iv4) ((fk3) this.l).t.getValue()).a("ONEME-15837", duplicateDetectException);
                            str4 = ((fk3) this.l).Z;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9Var2 = je9.f;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str4, qv1.k("found duplicates for ONEME-15837! ", duplicateDetectException.getMessage()), null);
                                }
                            }
                        }
                        if (((jj3) ((fk3) this.l).E.getValue()).g) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (this.j) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        mjg mjgVar7 = ((fk3) this.l).E;
                        jj3 jj3VarA2 = jj3.a((jj3) mjgVar7.getValue(), ij3Var2, l48.d, arrayList4, z2, ((fk3) this.l).F(), !((List) this.n).isEmpty(), 2);
                        mjgVar7.getClass();
                        mjgVar7.j(null, jj3VarA2);
                    }
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r53(l63 l63Var, long j, String str, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = l63Var;
        this.f = j;
        this.i = str;
        this.j = z;
    }
}
