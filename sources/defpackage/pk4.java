package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class pk4 implements hk4 {
    public static final /* synthetic */ zv8[] r;
    public final ite b;
    public final wsc c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final mjg m;
    public final r8e n;
    public final String o;
    public final p3c p;
    public final pzf q;

    static {
        z8b z8bVar = new z8b(pk4.class, "reloadJob", "getReloadJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        r = new zv8[]{z8bVar};
    }

    public pk4(ite iteVar, wsc wscVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ij4 ij4Var, pa4 pa4Var) {
        this.b = iteVar;
        this.c = wscVar;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var3;
        this.h = ny8Var6;
        this.i = ny8Var7;
        this.j = ny8Var8;
        this.k = ny8Var9;
        this.l = ny8Var;
        mjg mjgVarA = p90.a(vj4.d);
        this.m = mjgVarA;
        this.n = new r8e(mjgVarA);
        this.o = pk4.class.getName();
        this.p = qyj.S();
        pzf pzfVarB = e9i.b(0, 0, 6);
        this.q = pzfVarB;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(e9i.T(new fz6(pzfVarB, new jk4(this, lq4Var, 0), i), ((n0c) ((xhh) ny8Var.getValue())).b()), iteVar);
        e9i.j0(new fz6(new q8e(ij4Var.c), new jk4(this, lq4Var, 1), i), iteVar);
        String[] strArr = wsc.f;
        String[] strArr2 = strArr;
        if (strArr2.length != 0) {
            strArr2 = (Comparable[]) Arrays.copyOf(strArr2, strArr2.length);
            if (strArr2.length > 1) {
                Arrays.sort(strArr2);
            }
        }
        e9i.j0(new fz6(wscVar.g(Arrays.toString(strArr2), new ap9(18, strArr)), new kk4(this, null), i), iteVar);
        pa4Var.a(pa4.d | pa4.e, new qz(1, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object c(pk4 pk4Var, m8b m8bVar, nq4 nq4Var) {
        lk4 lk4Var;
        ArrayList arrayList;
        m8b m8bVar2;
        Object value;
        ek4 ek4Var;
        mjg mjgVar = pk4Var.m;
        if (nq4Var instanceof lk4) {
            lk4Var = (lk4) nq4Var;
            int i = lk4Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk4Var.h = i - Integer.MIN_VALUE;
            } else {
                lk4Var = new lk4(pk4Var, nq4Var);
            }
        } else {
            lk4Var = new lk4(pk4Var, nq4Var);
        }
        Object objC = lk4Var.f;
        int i2 = lk4Var.h;
        if (i2 == 0) {
            ch3.d0(objC);
            List<ek4> list = ((vj4) mjgVar.getValue()).a;
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                m8b m8bVar3 = new m8b();
                for (ek4 ek4Var2 : list) {
                    if (m8bVar.d(ek4Var2.a)) {
                        m8bVar3.a(ek4Var2.a);
                    }
                }
                if (!m8bVar3.i()) {
                    ArrayList arrayList2 = new ArrayList(list2);
                    Set setL0 = rx8.l0(m8bVar3);
                    bi4 bi4Var = ((no4) pk4Var.d.getValue()).a;
                    bi4Var.a();
                    mw mwVar = new mw(0);
                    bi4Var.a.forEach(new kw2(setL0, mwVar, 1));
                    dq4 dq4VarA = cqk.a(lk4Var.getContext());
                    ArrayList arrayList3 = new ArrayList(yw3.W0(setL0, 10));
                    Iterator it = setL0.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(yab.h(dq4VarA, null, 0, new o83(it.next(), (lq4) null, mwVar, pk4Var), 3));
                    }
                    lk4Var.d = m8bVar3;
                    lk4Var.e = arrayList2;
                    lk4Var.h = 1;
                    objC = ch3.c(arrayList3, lk4Var);
                    hu4 hu4Var = hu4.a;
                    if (objC == hu4Var) {
                        return hu4Var;
                    }
                    arrayList = arrayList2;
                    m8bVar2 = m8bVar3;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = lk4Var.e;
        m8bVar2 = lk4Var.d;
        ch3.d0(objC);
        List<ek4> listO1 = ww3.o1((Iterable) objC);
        l8b l8bVar = ki9.a;
        l8b l8bVar2 = new l8b();
        for (ek4 ek4Var3 : listO1) {
            l8bVar2.i(ek4Var3.a, ek4Var3);
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            ek4 ek4Var4 = (ek4) listIterator.next();
            if (m8bVar2.d(ek4Var4.a) && (ek4Var = (ek4) l8bVar2.f(ek4Var4.a)) != null) {
                listIterator.set(ek4Var);
            }
        }
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, vj4.a((vj4) value, arrayList, 6)));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r8 == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable d(defpackage.pk4 r7, defpackage.nq4 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.mk4
            if (r0 == 0) goto L13
            r0 = r8
            mk4 r0 = (defpackage.mk4) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            mk4 r0 = new mk4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Iterable r1 = r0.d
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            defpackage.ch3.d0(r8)
            goto L77
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r2
        L35:
            defpackage.ch3.d0(r8)
            goto L4f
        L39:
            defpackage.ch3.d0(r8)
            ny8 r8 = r7.d
            java.lang.Object r8 = r8.getValue()
            no4 r8 = (defpackage.no4) r8
            r0.g = r4
            bi4 r8 = r8.a
            java.util.List r8 = r8.h()
            if (r8 != r5) goto L4f
            goto L76
        L4f:
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            ny8 r8 = r7.h
            java.lang.Object r8 = r8.getValue()
            mm4 r8 = (defpackage.mm4) r8
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0.d = r4
            r0.g = r3
            ifh r3 = r8.c
            java.lang.Object r3 = r3.getValue()
            xt4 r3 = (defpackage.xt4) r3
            qn6 r4 = new qn6
            r6 = 13
            r4.<init>(r8, r2, r6)
            java.lang.Object r8 = defpackage.yab.K0(r3, r4, r0)
            if (r8 != r5) goto L77
        L76:
            return r5
        L77:
            java.util.Comparator r8 = (java.util.Comparator) r8
            java.util.List r8 = defpackage.ww3.M1(r1, r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            vt4 r0 = r0.getContext()
            dq4 r0 = defpackage.cqk.a(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.yw3.W0(r8, r3)
            r1.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
        L96:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r8.next()
            kk4 r4 = new kk4
            r4.<init>(r3, r2, r7)
            r3 = 3
            r5 = 0
            yf5 r3 = defpackage.yab.h(r0, r2, r5, r4, r3)
            r1.add(r3)
            goto L96
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk4.d(pk4, nq4):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd A[LOOP:1: B:35:0x00d7->B:37:0x00dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168 A[LOOP:5: B:60:0x0162->B:62:0x0168, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0216 A[LOOP:0: B:82:0x0210->B:84:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0133 A[EDGE_INSN: B:88:0x0133->B:53:0x0133 BREAK  A[LOOP:2: B:39:0x00f4->B:91:0x00f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x013e A[SYNTHETIC] */
    public static final Serializable e(pk4 pk4Var, nq4 nq4Var) {
        nk4 nk4Var;
        List list;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        ListIterator listIterator;
        b79 b79Var;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        Iterator it2;
        LinkedHashSet linkedHashSet2;
        ArrayList arrayList4;
        mm4 mm4Var;
        ik4 ik4Var;
        ArrayList arrayList5;
        ktc ktcVar;
        List listB;
        Iterator it3;
        tnh tnhVar;
        dq4 dq4VarA;
        ArrayList arrayList6;
        Iterator it4;
        if (nq4Var instanceof nk4) {
            nk4Var = (nk4) nq4Var;
            int i = nk4Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nk4Var.h = i - Integer.MIN_VALUE;
            } else {
                nk4Var = new nk4(pk4Var, nq4Var);
            }
        } else {
            nk4Var = new nk4(pk4Var, nq4Var);
        }
        Object objH = nk4Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = nk4Var.h;
        int i3 = 0;
        if (i2 == 0) {
            ch3.d0(objH);
            if (pk4Var.c.c(wsc.g)) {
                no4 no4Var = (no4) pk4Var.d.getValue();
                nk4Var.h = 1;
                objH = no4Var.a.h();
                if (objH != hu4Var) {
                }
                return hu4Var;
            }
            String str = pk4Var.o;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Can't load phones because don't have a permission", null);
                }
            }
            return r66.a;
        }
        if (i2 == 1) {
            ch3.d0(objH);
        } else {
            if (i2 == 2) {
                list = nk4Var.d;
                ch3.d0(objH);
                vg4 vg4Var = ((vjd) objH).d;
                c79 c79VarA = ((vc5) pk4Var.g.getValue()).a();
                List listG = ((no4) pk4Var.d.getValue()).a.g(bi4.l, bi4.p);
                arrayList = new ArrayList(yw3.W0(listG, 10));
                it = listG.iterator();
                while (it.hasNext()) {
                    c0a.t(((vg4) it.next()).w(), arrayList);
                }
                arrayList2 = new ArrayList();
                listIterator = c79VarA.listIterator(0);
                while (true) {
                    b79Var = (b79) listIterator;
                    if (b79Var.hasNext()) {
                        break;
                    }
                    Object next = b79Var.next();
                    listB = ((ktc) next).b();
                    if ((listB instanceof Collection) || !listB.isEmpty()) {
                        it3 = listB.iterator();
                        do {
                            if (it3.hasNext()) {
                            }
                        } while (!arrayList.contains((Long) it3.next()));
                    }
                    arrayList2.add(next);
                    break;
                }
                arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (((vg4) obj).w() != 0) {
                        arrayList3.add(obj);
                    }
                }
                linkedHashSet = new LinkedHashSet();
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((vg4) it2.next()).w()));
                }
                linkedHashSet2 = new LinkedHashSet();
                for (Object obj2 : arrayList2) {
                    if (linkedHashSet.containsAll(((ktc) obj2).b())) {
                        linkedHashSet2.add(obj2);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    ktcVar = (ktc) obj3;
                    if (linkedHashSet2.contains(ktcVar) && !sol.f(ktcVar).contains(new Long(vg4Var.w()))) {
                        arrayList7.add(obj3);
                    }
                }
                arrayList4 = new ArrayList(arrayList7);
                mm4Var = (mm4) pk4Var.h.getValue();
                ik4Var = new ik4(i3);
                nk4Var.d = null;
                nk4Var.e = arrayList4;
                nk4Var.h = 3;
                if (mm4Var.b(arrayList4, ik4Var, nk4Var) != hu4Var) {
                    arrayList5 = arrayList4;
                }
                return hu4Var;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList5 = nk4Var.e;
            ch3.d0(objH);
        }
        tnhVar = new tnh(R.string.oneme_invite);
        dq4VarA = cqk.a(nk4Var.getContext());
        arrayList6 = new ArrayList(yw3.W0(arrayList5, 10));
        it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(yab.h(dq4VarA, null, 0, new ke3(it4.next(), (lq4) null, tnhVar), 3));
        }
        return arrayList6;
        list = (List) objH;
        utd utdVar = (utd) pk4Var.i.getValue();
        long jT = ((s7f) ((et3) pk4Var.j.getValue())).t();
        nk4Var.d = list;
        nk4Var.h = 2;
        objH = utdVar.b(jT, nk4Var);
        if (objH != hu4Var) {
            vg4 vg4Var2 = ((vjd) objH).d;
            c79 c79VarA2 = ((vc5) pk4Var.g.getValue()).a();
            List listG2 = ((no4) pk4Var.d.getValue()).a.g(bi4.l, bi4.p);
            arrayList = new ArrayList(yw3.W0(listG2, 10));
            it = listG2.iterator();
            while (it.hasNext()) {
                c0a.t(((vg4) it.next()).w(), arrayList);
            }
            arrayList2 = new ArrayList();
            listIterator = c79VarA2.listIterator(0);
            while (true) {
                b79Var = (b79) listIterator;
                if (b79Var.hasNext()) {
                    break;
                    break;
                }
                Object next2 = b79Var.next();
                listB = ((ktc) next2).b();
                if (listB instanceof Collection) {
                    it3 = listB.iterator();
                    do {
                        if (it3.hasNext()) {
                            arrayList2.add(next2);
                            break;
                        }
                    } while (!arrayList.contains((Long) it3.next()));
                } else {
                    it3 = listB.iterator();
                    do {
                        if (it3.hasNext()) {
                            arrayList2.add(next2);
                            break;
                            break;
                        }
                    } while (!arrayList.contains((Long) it3.next()));
                }
            }
            arrayList3 = new ArrayList();
            while (r2.hasNext()) {
                if (((vg4) obj).w() != 0) {
                    arrayList3.add(obj);
                }
            }
            linkedHashSet = new LinkedHashSet();
            it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(Long.valueOf(((vg4) it2.next()).w()));
            }
            linkedHashSet2 = new LinkedHashSet();
            while (r9.hasNext()) {
                if (linkedHashSet.containsAll(((ktc) obj2).b())) {
                    linkedHashSet2.add(obj2);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            while (r7.hasNext()) {
                ktcVar = (ktc) obj3;
                if (linkedHashSet2.contains(ktcVar)) {
                }
            }
            arrayList4 = new ArrayList(arrayList8);
            mm4Var = (mm4) pk4Var.h.getValue();
            ik4Var = new ik4(i3);
            nk4Var.d = null;
            nk4Var.e = arrayList4;
            nk4Var.h = 3;
            if (mm4Var.b(arrayList4, ik4Var, nk4Var) != hu4Var) {
                arrayList5 = arrayList4;
                tnhVar = new tnh(R.string.oneme_invite);
                dq4VarA = cqk.a(nk4Var.getContext());
                arrayList6 = new ArrayList(yw3.W0(arrayList5, 10));
                it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(yab.h(dq4VarA, null, 0, new ke3(it4.next(), (lq4) null, tnhVar), 3));
                }
                return arrayList6;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    public static final ek4 f(pk4 pk4Var, vg4 vg4Var) {
        ynh ynhVar;
        ynh tnhVar;
        long jV;
        String strK;
        boolean z;
        ny8 ny8Var = pk4Var.k;
        boolean zD = jcd.d((jcd) ny8Var.getValue(), vg4Var, null, 2);
        ny8 ny8Var2 = pk4Var.e;
        qfd qfdVarB = ((yfd) ny8Var2.getValue()).B(vg4Var.v());
        boolean z2 = !zD && ((yfd) ny8Var2.getValue()).B(vg4Var.v()).b == agd.ONLINE;
        String string = zD ? ((jcd) ny8Var.getValue()).a().toString() : vg4Var.z(us0.b);
        if (!zD) {
            if (!vg4Var.B() || vg4Var.I()) {
                ynhVar = null;
            } else if (vg4Var.f) {
                tnhVar = new tnh(R.string.tt_you_in_subtitle);
            } else if (vg4Var.E() && vg4Var.H()) {
                tnhVar = new tnh(R.string.service_notifications);
            } else {
                tnhVar = vg4Var.E() ? new tnh(R.string.bot) : new xnh(((yfd) pk4Var.f.getValue()).y(vg4Var));
            }
            jV = vg4Var.v();
            strK = vg4Var.k();
            if (strK != null) {
                ore.p("Required value was null.");
                return null;
            }
            String strA = xoh.a(vg4Var.o());
            List listSingletonList = Collections.singletonList(Long.valueOf(vg4Var.w()));
            Uri uri = string != null ? Uri.parse(string) : null;
            boolean zG = vg4Var.G();
            boolean z3 = vg4Var.f;
            int i = qfdVarB.a;
            CharSequence charSequenceU = vg4Var.u();
            boolean zE = vg4Var.E();
            if ((vg4Var.a.b.z.b & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ek4(jV, strK, strA, listSingletonList, ynhVar, null, uri, z2, zG, charSequenceU, z3, null, i, zE, z, vg4Var.F(), zD, vg4Var.B(), 30720);
        }
        tnhVar = new tnh(jcd.b((jcd) ny8Var.getValue(), null, 1));
        ynhVar = tnhVar;
        jV = vg4Var.v();
        strK = vg4Var.k();
        if (strK != null) {
            ore.p("Required value was null.");
            return null;
        }
        String strA2 = xoh.a(vg4Var.o());
        List listSingletonList2 = Collections.singletonList(Long.valueOf(vg4Var.w()));
        Uri uri2 = string != null ? Uri.parse(string) : null;
        boolean zG2 = vg4Var.G();
        boolean z4 = vg4Var.f;
        int i2 = qfdVarB.a;
        CharSequence charSequenceU2 = vg4Var.u();
        boolean zE2 = vg4Var.E();
        if ((vg4Var.a.b.z.b & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ek4(jV, strK, strA2, listSingletonList2, ynhVar, null, uri2, z2, zG2, charSequenceU2, z4, null, i2, zE2, z, vg4Var.F(), zD, vg4Var.B(), 30720);
    }

    @Override // defpackage.hk4
    public final void a() {
        zv8[] zv8VarArr = r;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.p;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var == null || !vo8Var.isActive()) {
            p3cVar.B(this, zv8VarArr[0], yab.i0(this.b, ((n0c) ((xhh) this.l.getValue())).b(), 0, new ok4(this, null), 2));
        }
    }

    @Override // defpackage.hk4
    public final gjg b() {
        return this.n;
    }
}
