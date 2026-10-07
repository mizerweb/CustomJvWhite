package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class b00 extends y10 {
    public static final /* synthetic */ zv8[] R;
    public final qg7 A;
    public final u50 B;
    public final xhh C;
    public final yt4 D;
    public final w17 E;
    public final ij4 F;
    public final pa4 G;
    public final ifh H;
    public final ny8 I;
    public final ny8 J;
    public final ny8 K;
    public final AtomicReference L;
    public final mjg M;
    public final r8e N;
    public final p3c O;
    public final long P;
    public final int Q;
    public final String z;

    static {
        z8b z8bVar = new z8b(b00.class, "observeEventsJob", "getObserveEventsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        R = new zv8[]{z8bVar};
    }

    public b00(String str, qg7 qg7Var, u50 u50Var, xhh xhhVar, yt4 yt4Var, w17 w17Var, ij4 ij4Var, pa4 pa4Var, ifh ifhVar, v2a v2aVar, ku6 ku6Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        super(yt4Var, "AsyncChatsListLoader#".concat(str), xhhVar, qg7Var, v2aVar, u50Var, ku6Var, 20, 0, false, 1280);
        this.z = str;
        this.A = qg7Var;
        this.B = u50Var;
        this.C = xhhVar;
        this.D = yt4Var;
        this.E = w17Var;
        this.F = ij4Var;
        this.G = pa4Var;
        this.H = ifhVar;
        this.I = ny8Var;
        this.J = ny8Var2;
        this.K = ny8Var4;
        this.L = new AtomicReference(c76.a);
        mjg mjgVarA = p90.a(wh3.c);
        this.M = mjgVarA;
        this.N = new r8e(mjgVarA);
        this.O = qyj.S();
        this.P = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.Q = 1;
        yab.i0(this.l, null, 0, new qn6(this, (lq4) null, 3), 3);
        yab.i0(this.l, null, 0, new gz(ny8Var3, this, (lq4) null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object I(b00 b00Var, dj4 dj4Var, lq4 lq4Var) {
        mz mzVar;
        b00Var.getClass();
        je9 je9Var = je9.d;
        if (lq4Var instanceof mz) {
            mzVar = (mz) lq4Var;
            int i = mzVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mzVar.f = i - Integer.MIN_VALUE;
            } else {
                mzVar = new mz(b00Var, lq4Var);
            }
        } else {
            mzVar = new mz(b00Var, lq4Var);
        }
        Object obj = mzVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = mzVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = (String) b00Var.A.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "handleContactsUpdateEvent ".concat(m8b.k(dj4Var.a, 31)), null);
            }
            List list = ((wh3) b00Var.M.getValue()).a;
            xt4 xt4VarB = ((n0c) b00Var.C).b();
            yt4 yt4Var = b00Var.D;
            xt4VarB.getClass();
            vt4 vt4VarX0 = lvb.x0(xt4VarB, yt4Var);
            if (vt4VarX0 == null) {
                vt4VarX0 = mzVar.getContext();
            }
            dq4 dq4VarA = cqk.a(vt4VarX0);
            ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(yab.h(dq4VarA, null, 0, new gz(it.next(), (lq4) null, b00Var, dj4Var), 3));
            }
            mzVar.f = 1;
            if (ch3.c(arrayList, mzVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        String str2 = (String) b00Var.A.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "handleContactsUpdateEvent finish", null);
        }
        return sbi.a;
    }

    public static final Object J(b00 b00Var, sh3 sh3Var, lq4 lq4Var) {
        boolean z = sh3Var instanceof qh3;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (z) {
            Object objN = b00Var.N((qh3) sh3Var, lq4Var);
            if (objN == hu4Var) {
                return objN;
            }
        } else {
            if (!(sh3Var instanceof rh3)) {
                b00Var.getClass();
                ore.o();
                return null;
            }
            b00Var.A.r("invalidate");
            b00Var.L.set(c76.a);
            b00Var.p.g(new vi2(18));
            Object objO = y10.o(b00Var, BuildConfig.MAX_TIME_TO_UPLOAD, false, false, lq4Var, 14);
            if (objO != hu4Var) {
                objO = sbiVar;
            }
            if (objO == hu4Var) {
                return objO;
            }
        }
        return sbiVar;
    }

    @Override // defpackage.y10
    public final Object B(List list, boolean z, boolean z2, lq4 lq4Var) {
        M(list);
        return sbi.a;
    }

    @Override // defpackage.y10
    public final void C() {
        M(r66.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0208  */
    public final Object K(pw pwVar, nq4 nq4Var) {
        fz fzVar;
        ArrayList arrayList;
        sbi sbiVar;
        long j;
        List list;
        je9 je9Var = je9.d;
        sbi sbiVar2 = sbi.a;
        if (nq4Var instanceof fz) {
            fzVar = (fz) nq4Var;
            int i = fzVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzVar.g = i - Integer.MIN_VALUE;
            } else {
                fzVar = new fz(this, nq4Var);
            }
        } else {
            fzVar = new fz(this, nq4Var);
        }
        Object objJ = fzVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = fzVar.g;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(objJ);
            String str = (String) this.A.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "add: ids - ".concat(ww3.z1(pwVar, null, null, null, null, 63)), null);
            }
            m8b m8bVar = new m8b(this.p.e().size());
            Iterator it = this.p.e().iterator();
            while (it.hasNext()) {
                m8bVar.a(((kw7) it.next()).getA());
            }
            ArrayList arrayList2 = new ArrayList();
            pwVar.getClass();
            hw hwVar = new hw(pwVar);
            while (hwVar.hasNext()) {
                Object next = hwVar.next();
                if (!m8bVar.d(((Number) next).longValue())) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                this.A.r("add: all ids already present, skip extra loads");
                return sbiVar2;
            }
            u50 u50Var = this.B;
            fzVar.d = arrayList2;
            fzVar.g = 1;
            objJ = u50Var.j(arrayList2, fzVar);
            if (objJ == hu4Var) {
                return hu4Var;
            }
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = fzVar.d;
            ch3.d0(objJ);
        }
        List list2 = (List) objJ;
        if (list2.isEmpty()) {
            String str2 = (String) this.A.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "add: no new chats resolved locally for " + arrayList, null);
                return sbiVar2;
            }
        } else {
            List list3 = list2;
            Iterator it2 = list3.iterator();
            if (!it2.hasNext()) {
                qr7.d();
                return null;
            }
            long c = ((kw7) it2.next()).getC();
            while (it2.hasNext()) {
                long c2 = ((kw7) it2.next()).getC();
                if (c < c2) {
                    c = c2;
                }
            }
            boolean z2 = false;
            if (((wh3) this.M.getValue()).a.isEmpty()) {
                H();
                g();
                j(list2, c, true, g().f(), true);
                E(c);
                A(this.s, new c10(c, false));
                return sbiVar2;
            }
            long jF = f();
            boolean z3 = ww3.D1(this.p.e()) instanceof jw7;
            if (c >= jF || jF == BuildConfig.MAX_TIME_TO_UPLOAD || !z3) {
                if (list2.size() <= 1 || jF == BuildConfig.MAX_TIME_TO_UPLOAD || !z3) {
                    sbiVar = sbiVar2;
                    j = c;
                    list = list2;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        kw7 kw7Var = (kw7) next2;
                        boolean z4 = kw7Var.getC() > jF ? z : z2;
                        if (!z4) {
                            String str3 = (String) this.A.b;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                long a = kw7Var.getA();
                                long c3 = kw7Var.getC();
                                StringBuilder sbS = qt4.s(a, "add: ignore chat (id=", ") because time:");
                                sbS.append(c3);
                                a4cVar3.c(je9Var, str3, qt4.k(jF, " lower firstAnchorSortTime:", sbS), null);
                            }
                        }
                        if (z4) {
                            arrayList3.add(next2);
                        }
                        sbiVar2 = sbiVar2;
                        c = c;
                        it3 = it3;
                        z = true;
                        z2 = false;
                    }
                    sbiVar = sbiVar2;
                    j = c;
                    boolean zIsEmpty = arrayList3.isEmpty();
                    list = arrayList3;
                    if (zIsEmpty) {
                        this.A.r("add: ignore, this case can't reach");
                        return sbiVar;
                    }
                }
                H();
                g();
                long j2 = j;
                j(list, j2, true, true, true);
                A(this.s, new c10(j2, true));
                return sbiVar;
            }
            String str4 = (String) this.A.b;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                StringBuilder sbS2 = qt4.s(c, "add: ignore this chats because newestTime:", " lower firstAnchorSortTime:");
                sbS2.append(jF);
                a4cVar4.c(je9Var, str4, sbS2.toString(), null);
            }
        }
        return sbiVar2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public final void L(pw pwVar) {
        pw pwVar2;
        String str = (String) this.A.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            pwVar2 = pwVar;
        } else {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                pwVar2 = pwVar;
                a4cVar.c(je9Var, str, "delete: ids - ".concat(ww3.z1(pwVar2, null, null, null, null, 63)), null);
            } else {
                pwVar2 = pwVar;
            }
        }
        this.p.g(new tc(pwVar2, 4, this));
        H();
    }

    public final void M(List list) {
        je9 je9Var = je9.d;
        ArrayList arrayList = new ArrayList((Collection) this.L.get());
        qg7 qg7Var = this.A;
        String str = (String) qg7Var.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, s5h.y0("emitHistory \n            |favourites chats: " + ww3.z1(arrayList, null, null, null, new c6(12), 31) + "\n            |"), null);
        }
        boolean z = ww3.D1(list) instanceof jw7;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof w73) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        wh3 wh3Var = new wh3(arrayList, z);
        ch3.x(qg7Var, list);
        String str2 = (String) qg7Var.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, s5h.y0("emitHistory \n            |chats:" + wh3Var.a.size() + ", \n            |hasMore:" + z + ", \n            |"), null);
        }
        mjg mjgVar = this.M;
        mjgVar.getClass();
        mjgVar.j(null, wh3Var);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x0230  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        if (r2 == r6) goto L97;
     */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List, pw, qh3] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(defpackage.qh3 r21, defpackage.lq4 r22) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b00.N(qh3, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(nq4 nq4Var) {
        oz ozVar;
        if (nq4Var instanceof oz) {
            ozVar = (oz) nq4Var;
            int i = ozVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozVar.f = i - Integer.MIN_VALUE;
            } else {
                ozVar = new oz(this, nq4Var);
            }
        } else {
            ozVar = new oz(this, nq4Var);
        }
        Object objA = ozVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = ozVar.f;
        if (i2 == 0) {
            ch3.d0(objA);
            cn6 cn6Var = (cn6) this.H.getValue();
            ozVar.f = 1;
            objA = cn6Var.a(ozVar);
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        List list = (List) objA;
        String str = (String) this.A.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "favourites: load new chats: ".concat(ww3.z1(list, null, null, null, new c6(13), 31)), null);
            }
        }
        this.L.updateAndGet(new cz(0, list));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object P(nq4 nq4Var) {
        rz rzVar;
        je9 je9Var = je9.d;
        if (nq4Var instanceof rz) {
            rzVar = (rz) nq4Var;
            int i = rzVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzVar.f = i - Integer.MIN_VALUE;
            } else {
                rzVar = new rz(this, nq4Var);
            }
        } else {
            rzVar = new rz(this, nq4Var);
        }
        Object obj = rzVar.d;
        Object obj2 = hu4.a;
        int i2 = rzVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            this.A.r("reloadFavourites");
            rzVar.f = 1;
            if (O(rzVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        ArrayList arrayList = new ArrayList((Collection) this.L.get());
        String str = (String) this.A.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, s5h.y0("forceEmitHistory \n            |favourites chats: " + ww3.z1(arrayList, null, null, null, new vi2(16), 31) + "\n            |"), null);
        }
        for (Object obj3 : ((wh3) this.M.getValue()).a) {
            if (((w73) obj3).q == 0) {
                arrayList.add(obj3);
            }
        }
        wh3 wh3Var = new wh3(arrayList, ((wh3) this.M.getValue()).b);
        String str2 = (String) this.A.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, s5h.y0("forceEmitHistory \n            |chats:" + arrayList.size() + ", \n            |"), null);
        }
        mjg mjgVar = this.M;
        mjgVar.getClass();
        mjgVar.j(null, wh3Var);
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object Q(pw pwVar, nq4 nq4Var) {
        zz zzVar;
        l8b l8bVar;
        ArrayList arrayList;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof zz) {
            zzVar = (zz) nq4Var;
            int i = zzVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzVar.h = i - Integer.MIN_VALUE;
            } else {
                zzVar = new zz(this, nq4Var);
            }
        } else {
            zzVar = new zz(this, nq4Var);
        }
        Object obj = zzVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = zzVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = (String) this.A.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "update: ids - ".concat(ww3.z1(pwVar, null, null, null, null, 63)), null);
                }
            }
            m8b m8bVar = new m8b(this.p.e().size());
            Iterator it = this.p.e().iterator();
            while (it.hasNext()) {
                m8bVar.a(((kw7) it.next()).getA());
            }
            ArrayList arrayList2 = new ArrayList();
            pwVar.getClass();
            hw hwVar = new hw(pwVar);
            while (hwVar.hasNext()) {
                Object next = hwVar.next();
                if (m8bVar.d(((Number) next).longValue())) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                this.A.r("update: loaded chats does not intersects with updated ids");
                return sbiVar;
            }
            l8b l8bVar2 = new l8b();
            u50 u50Var = this.B;
            zzVar.d = arrayList2;
            zzVar.e = l8bVar2;
            zzVar.h = 1;
            Object objJ = u50Var.j(arrayList2, zzVar);
            if (objJ == hu4Var) {
                return hu4Var;
            }
            l8bVar = l8bVar2;
            obj = objJ;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8bVar = zzVar.e;
            arrayList = zzVar.d;
            ch3.d0(obj);
        }
        for (kw7 kw7Var : (Iterable) obj) {
            l8bVar.l(kw7Var.getA(), kw7Var);
        }
        if (!l8bVar.h()) {
            this.p.g(new ol(this, 1, l8bVar));
            return sbiVar;
        }
        this.A.r("update: not found chats " + arrayList + " in repository");
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        if (P(r2) == r5) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R(defpackage.pw r18, java.util.List r19, java.util.List r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b00.R(pw, java.util.List, java.util.List, nq4):java.lang.Object");
    }

    @Override // defpackage.y10
    public final void d(boolean z) {
    }

    @Override // defpackage.y10
    public final long f() {
        Long lValueOf;
        pu6 pu6Var = new pu6(yhf.m0(new sw(1, ((wh3) this.M.getValue()).a), new vi2(17)));
        if (pu6Var.hasNext()) {
            lValueOf = Long.valueOf(((w73) pu6Var.next()).n);
            while (pu6Var.hasNext()) {
                Long lValueOf2 = Long.valueOf(((w73) pu6Var.next()).n);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    @Override // defpackage.y10
    public final long h() {
        return this.P;
    }

    @Override // defpackage.y10
    public final int i() {
        return this.Q;
    }

    @Override // defpackage.y10
    public final boolean l(kw7 kw7Var) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (defpackage.y10.p(r5, r6, r8, r9, r10, r11) == r4) goto L24;
     */
    @Override // defpackage.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r6, boolean r8, boolean r9, boolean r10, defpackage.lq4 r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof defpackage.nz
            if (r0 == 0) goto L14
            r0 = r11
            nz r0 = (defpackage.nz) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.j = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            nz r0 = new nz
            r0.<init>(r5, r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.h
            int r1 = r11.j
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.ch3.d0(r0)
            goto L79
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L33:
            boolean r10 = r11.g
            boolean r9 = r11.f
            boolean r8 = r11.e
            long r6 = r11.d
            defpackage.ch3.d0(r0)
            goto L68
        L3f:
            defpackage.ch3.d0(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r5.L
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L68
            qg7 r0 = r5.A
            java.lang.String r1 = "load favourites"
            r0.r(r1)
            r11.d = r6
            r11.e = r8
            r11.f = r9
            r11.g = r10
            r11.j = r3
            java.lang.Object r0 = r5.O(r11)
            if (r0 != r4) goto L68
            goto L78
        L68:
            r11.d = r6
            r11.e = r8
            r11.f = r9
            r11.g = r10
            r11.j = r2
            java.lang.Object r5 = defpackage.y10.p(r5, r6, r8, r9, r10, r11)
            if (r5 != r4) goto L79
        L78:
            return r4
        L79:
            sbi r5 = defpackage.sbi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b00.n(long, boolean, boolean, boolean, lq4):java.lang.Object");
    }

    @Override // defpackage.y10
    public final Object u(long j, nq4 nq4Var) {
        String str = (String) this.A.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "process loadEmptyChunksData, "), null);
            }
        }
        return sbi.a;
    }

    @Override // defpackage.y10
    public final void v() {
        wh3 wh3Var = (wh3) this.M.getValue();
        List list = wh3Var.a;
        boolean z = wh3Var.b;
        if (list.isEmpty() && z) {
            m(BuildConfig.MAX_TIME_TO_UPLOAD);
        } else {
            if (wh3Var.a.isEmpty() || !z) {
                return;
            }
            super.v();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (defpackage.y10.x(r8, r2, r4, r5, r6) == r7) goto L24;
     */
    @Override // defpackage.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(long r9, boolean r11, boolean r12, defpackage.lq4 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.pz
            if (r0 == 0) goto L14
            r0 = r13
            pz r0 = (defpackage.pz) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            pz r0 = new pz
            nq4 r13 = (defpackage.nq4) r13
            r0.<init>(r8, r13)
            goto L12
        L1c:
            java.lang.Object r13 = r6.g
            int r0 = r6.i
            r1 = 2
            r2 = 1
            hu4 r7 = defpackage.hu4.a
            if (r0 == 0) goto L3f
            if (r0 == r2) goto L35
            if (r0 != r1) goto L2e
            defpackage.ch3.d0(r13)
            goto L79
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L35:
            boolean r12 = r6.f
            boolean r11 = r6.e
            long r9 = r6.d
            defpackage.ch3.d0(r13)
            goto L66
        L3f:
            defpackage.ch3.d0(r13)
            java.util.concurrent.atomic.AtomicReference r13 = r8.L
            java.lang.Object r13 = r13.get()
            java.util.Set r13 = (java.util.Set) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L66
            qg7 r13 = r8.A
            java.lang.String r0 = "load favourites from loadNextSync"
            r13.r(r0)
            r6.d = r9
            r6.e = r11
            r6.f = r12
            r6.i = r2
            java.lang.Object r13 = r8.O(r6)
            if (r13 != r7) goto L66
            goto L78
        L66:
            r2 = r9
            r4 = r11
            r5 = r12
            r6.d = r2
            r6.e = r4
            r6.f = r5
            r6.i = r1
            r1 = r8
            java.lang.Object r8 = defpackage.y10.x(r1, r2, r4, r5, r6)
            if (r8 != r7) goto L79
        L78:
            return r7
        L79:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b00.w(long, boolean, boolean, lq4):java.lang.Object");
    }
}
