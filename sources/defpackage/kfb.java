package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class kfb {
    public static final List j = xw3.P0("MISSED", "CANCELED", "REJECTED");
    public final pvb a;
    public final xj1 b;
    public final et3 c;
    public final e5d d;
    public final xhh e;
    public final qk7 f;
    public final wzj g;
    public final String h = kfb.class.getName();
    public final l9b i = new l9b();

    public kfb(pvb pvbVar, xj1 xj1Var, xb9 xb9Var, e5d e5dVar, xhh xhhVar, ite iteVar, qk7 qk7Var, eh9 eh9Var, wzj wzjVar) {
        this.a = pvbVar;
        this.b = xj1Var;
        this.c = xb9Var;
        this.d = e5dVar;
        this.e = xhhVar;
        this.f = qk7Var;
        this.g = wzjVar;
        new fh9(iteVar, eh9Var, new oo3(1, this, kfb.class, "onLogout", "onLogout(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5)).a();
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211 A[Catch: all -> 0x0048, LOOP:0: B:91:0x020b->B:93:0x0211, LOOP_END, TryCatch #0 {all -> 0x0048, blocks: (B:16:0x0041, B:98:0x0237, B:23:0x0055, B:90:0x01fc, B:91:0x020b, B:93:0x0211, B:94:0x0224, B:31:0x0072), top: B:105:0x0031 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [kfb] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [hu4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [j9b] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    public final Object a(xib xibVar, nq4 nq4Var) throws Throwable {
        zeb zebVar;
        j9b j9bVar;
        xib xibVar2;
        int i;
        j9b j9bVar2;
        int i2;
        xib xibVar3;
        ?? r2;
        LinkedHashSet linkedHashSet;
        Iterator it;
        sbi sbiVar = sbi.a;
        ?? r3 = hu4.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof zeb) {
            zebVar = (zeb) nq4Var;
            int i3 = zebVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zebVar.j = i3 - Integer.MIN_VALUE;
            } else {
                zebVar = new zeb(this, nq4Var);
            }
        } else {
            zebVar = new zeb(this, nq4Var);
        }
        Object obj = zebVar.h;
        int i4 = zebVar.j;
        try {
            try {
                if (i4 == 0) {
                    ch3.d0(obj);
                    j9bVar = this.i;
                    xibVar2 = xibVar;
                    zebVar.d = xibVar2;
                    zebVar.e = j9bVar;
                    zebVar.f = 0;
                    zebVar.j = 1;
                    if (j9bVar.b(zebVar) == r3) {
                        return r3;
                    }
                    i = 0;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    j9bVar2 = zebVar.e;
                                    xibVar3 = zebVar.d;
                                    ch3.d0(obj);
                                } else {
                                    if (i4 != 5) {
                                        ore.k("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    j9bVar2 = zebVar.e;
                                    xibVar3 = zebVar.d;
                                    ch3.d0(obj);
                                }
                                sbiVar = sbiVar;
                            } else {
                                i2 = zebVar.g;
                                int i5 = zebVar.f;
                                j9b j9bVar3 = zebVar.e;
                                xib xibVar4 = zebVar.d;
                                try {
                                    ch3.d0(obj);
                                    sbiVar = sbiVar;
                                    r2 = r3;
                                    i = i5;
                                    j9bVar2 = j9bVar3;
                                    xibVar3 = xibVar4;
                                    List listI = xibVar3.i();
                                    linkedHashSet = new LinkedHashSet();
                                    it = listI.iterator();
                                    while (it.hasNext()) {
                                        linkedHashSet.add(new Long(((kk1) it.next()).a()));
                                    }
                                    zebVar.d = xibVar3;
                                    zebVar.e = j9bVar2;
                                    zebVar.f = i;
                                    zebVar.g = i2;
                                    zebVar.j = 4;
                                    if (d(linkedHashSet, zebVar) == r2) {
                                        return r2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r3 = j9bVar3;
                                    r3.g(null);
                                    throw th;
                                }
                            }
                            xibVar2 = xibVar3;
                            ((s7f) this.c).H(xibVar2.k());
                        } else {
                            j9bVar2 = zebVar.e;
                            ch3.d0(obj);
                            sbiVar = sbiVar;
                        }
                        j9bVar = j9bVar2;
                        j9bVar.g(null);
                        return sbiVar;
                    }
                    int i6 = zebVar.f;
                    j9b j9bVar4 = zebVar.e;
                    xib xibVar5 = zebVar.d;
                    ch3.d0(obj);
                    j9bVar = j9bVar4;
                    i = i6;
                    xibVar2 = xibVar5;
                }
                if (((Boolean) this.d.c().i()).booleanValue()) {
                    if (xibVar2.k() >= ((s7f) this.c).n()) {
                        if (xibVar2.n() != ((s7f) this.c).n()) {
                            String str = this.h;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "applyNotif: sync gap, prev=" + xibVar2.n() + ", cached=" + ((s7f) this.c).n() + ", reload diff", null);
                            }
                            zebVar.d = null;
                            zebVar.e = j9bVar;
                            zebVar.f = i;
                            zebVar.g = 0;
                            zebVar.j = 2;
                            if (f(zebVar) == r3) {
                                return r3;
                            }
                            j9bVar2 = j9bVar;
                        } else {
                            sbiVar = sbiVar;
                            ?? r4 = r3;
                            int iOrdinal = xibVar2.h().ordinal();
                            if (iOrdinal == 0) {
                                if (!xibVar2.i().isEmpty()) {
                                    xj1 xj1Var = this.b;
                                    List listI2 = xibVar2.i();
                                    ArrayList arrayList = new ArrayList(yw3.W0(listI2, 10));
                                    Iterator it2 = listI2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(zwk.a((kk1) it2.next()));
                                    }
                                    zebVar.d = xibVar2;
                                    zebVar.e = j9bVar;
                                    zebVar.f = i;
                                    zebVar.g = 0;
                                    zebVar.j = 3;
                                    Object objH = ch3.H(zebVar, new wj1(xj1Var, arrayList, null, 0), xj1Var.a);
                                    if (objH != r4) {
                                        objH = sbiVar;
                                    }
                                    if (objH == r4) {
                                        return r4;
                                    }
                                    j9bVar2 = j9bVar;
                                    i2 = 0;
                                    xibVar3 = xibVar2;
                                    r2 = r4;
                                    List listI3 = xibVar3.i();
                                    linkedHashSet = new LinkedHashSet();
                                    it = listI3.iterator();
                                    while (it.hasNext()) {
                                        linkedHashSet.add(new Long(((kk1) it.next()).a()));
                                    }
                                    zebVar.d = xibVar3;
                                    zebVar.e = j9bVar2;
                                    zebVar.f = i;
                                    zebVar.g = i2;
                                    zebVar.j = 4;
                                    if (d(linkedHashSet, zebVar) == r2) {
                                        return r2;
                                    }
                                    xibVar2 = xibVar3;
                                }
                                ((s7f) this.c).H(xibVar2.k());
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (xibVar2.m().length != 0) {
                                    xj1 xj1Var2 = this.b;
                                    List listM1 = a.m1(xibVar2.m());
                                    zebVar.d = xibVar2;
                                    zebVar.e = j9bVar;
                                    zebVar.f = i;
                                    zebVar.g = 0;
                                    zebVar.j = 5;
                                    if (xj1Var2.b(listM1, zebVar) == r4) {
                                        return r4;
                                    }
                                    j9bVar2 = j9bVar;
                                    xibVar3 = xibVar2;
                                    xibVar2 = xibVar3;
                                    ((s7f) this.c).H(xibVar2.k());
                                }
                            }
                            j9bVar2 = j9bVar;
                            ((s7f) this.c).H(xibVar2.k());
                        }
                        j9bVar = j9bVar2;
                        j9bVar.g(null);
                        return sbiVar;
                    }
                    String str2 = this.h;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "applyNotif: prev=" + xibVar2.n() + ", cached=" + ((s7f) this.c).n() + ", ignor notif", null);
                    }
                }
                sbiVar = sbiVar;
                j9bVar.g(null);
                return sbiVar;
            } catch (Throwable th2) {
                th = th2;
                r3 = j9bVar;
                r3.g(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(nq4 nq4Var) throws Throwable {
        afb afbVar;
        j9b j9bVar;
        int i;
        j9b j9bVar2;
        et3 et3Var = this.c;
        if (nq4Var instanceof afb) {
            afbVar = (afb) nq4Var;
            int i2 = afbVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                afbVar.h = i2 - Integer.MIN_VALUE;
            } else {
                afbVar = new afb(this, nq4Var);
            }
        } else {
            afbVar = new afb(this, nq4Var);
        }
        Object obj = afbVar.f;
        int i3 = afbVar.h;
        hu4 hu4Var = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                j9bVar = this.i;
                afbVar.d = j9bVar;
                afbVar.e = 0;
                afbVar.h = 1;
                if (j9bVar.b(afbVar) != hu4Var) {
                    i = 0;
                }
                return hu4Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar2 = afbVar.d;
                try {
                    ch3.d0(obj);
                    ((s7f) et3Var).H(0L);
                    int i4 = qjf.h;
                    ojf.a(this.g, ((s7f) et3Var).g(), new long[0]);
                    sbi sbiVar = sbi.a;
                    j9bVar2.g(null);
                    return sbiVar;
                } catch (Throwable th) {
                    th = th;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            i = afbVar.e;
            j9b j9bVar3 = afbVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar3;
            xj1 xj1Var = this.b;
            afbVar.d = j9bVar;
            afbVar.e = i;
            afbVar.h = 2;
            if (xj1Var.a(afbVar) != hu4Var) {
                j9bVar2 = j9bVar;
                ((s7f) et3Var).H(0L);
                int i5 = qjf.h;
                ojf.a(this.g, ((s7f) et3Var).g(), new long[0]);
                sbi sbiVar2 = sbi.a;
                j9bVar2.g(null);
                return sbiVar2;
            }
            return hu4Var;
        } catch (Throwable th2) {
            th = th2;
            j9bVar2 = j9bVar;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(nq4 nq4Var) throws Throwable {
        bfb bfbVar;
        j9b j9bVar;
        int i;
        Throwable th;
        j9b j9bVar2;
        if (nq4Var instanceof bfb) {
            bfbVar = (bfb) nq4Var;
            int i2 = bfbVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bfbVar.i = i2 - Integer.MIN_VALUE;
            } else {
                bfbVar = new bfb(this, nq4Var);
            }
        } else {
            bfbVar = new bfb(this, nq4Var);
        }
        Object obj = bfbVar.g;
        int i3 = bfbVar.i;
        int i4 = 0;
        Object obj2 = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                j9bVar = this.i;
                bfbVar.d = j9bVar;
                bfbVar.e = 0;
                bfbVar.i = 1;
                if (j9bVar.b(bfbVar) != obj2) {
                    i = 0;
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j9bVar2 = bfbVar.d;
                    try {
                        ch3.d0(obj);
                        sbi sbiVar = sbi.a;
                        j9bVar2.g(null);
                        return sbiVar;
                    } catch (Throwable th2) {
                        th = th2;
                        j9bVar2.g(null);
                        throw th;
                    }
                }
                i4 = bfbVar.f;
                i = bfbVar.e;
                j9b j9bVar3 = bfbVar.d;
                try {
                    ch3.d0(obj);
                    j9bVar = j9bVar3;
                    ((s7f) this.c).H(0L);
                    bfbVar.d = j9bVar;
                    bfbVar.e = i;
                    bfbVar.f = i4;
                    bfbVar.i = 3;
                    if (f(bfbVar) != obj2) {
                        j9bVar2 = j9bVar;
                        sbi sbiVar2 = sbi.a;
                        j9bVar2.g(null);
                        return sbiVar2;
                    }
                    return obj2;
                } catch (Throwable th3) {
                    th = th3;
                    j9bVar2 = j9bVar3;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            i = bfbVar.e;
            j9b j9bVar4 = bfbVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar4;
            xj1 xj1Var = this.b;
            bfbVar.d = j9bVar;
            bfbVar.e = i;
            bfbVar.f = 0;
            bfbVar.i = 2;
            if (xj1Var.a(bfbVar) != obj2) {
                ((s7f) this.c).H(0L);
                bfbVar.d = j9bVar;
                bfbVar.e = i;
                bfbVar.f = i4;
                bfbVar.i = 3;
                if (f(bfbVar) != obj2) {
                    j9bVar2 = j9bVar;
                    sbi sbiVar3 = sbi.a;
                    j9bVar2.g(null);
                    return sbiVar3;
                }
            }
            return obj2;
        } catch (Throwable th4) {
            j9b j9bVar5 = j9bVar;
            th = th4;
            j9bVar2 = j9bVar5;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(LinkedHashSet linkedHashSet, nq4 nq4Var) {
        cfb cfbVar;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof cfb) {
            cfbVar = (cfb) nq4Var;
            int i = cfbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfbVar.g = i - Integer.MIN_VALUE;
            } else {
                cfbVar = new cfb(this, nq4Var);
            }
        } else {
            cfbVar = new cfb(this, nq4Var);
        }
        Object obj = cfbVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = cfbVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (linkedHashSet.isEmpty()) {
                    String str = this.h;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "ensureChatsLoaded: empty chatIds, skip", null);
                            return sbiVar;
                        }
                    }
                } else {
                    qk7 qk7Var = this.f;
                    cfbVar.d = linkedHashSet;
                    cfbVar.g = 1;
                    if (qk7Var.b(linkedHashSet, cfbVar) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashSet = cfbVar.d;
            ch3.d0(obj);
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            String str2 = this.h;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, c0a.k(linkedHashSet.size(), "ensureChatsLoaded: fail for ", " chats"), null);
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(nq4 nq4Var) throws Throwable {
        dfb dfbVar;
        j9b j9bVar;
        int i;
        Throwable th;
        j9b j9bVar2;
        if (nq4Var instanceof dfb) {
            dfbVar = (dfb) nq4Var;
            int i2 = dfbVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dfbVar.h = i2 - Integer.MIN_VALUE;
            } else {
                dfbVar = new dfb(this, nq4Var);
            }
        } else {
            dfbVar = new dfb(this, nq4Var);
        }
        Object obj = dfbVar.f;
        int i3 = dfbVar.h;
        Object obj2 = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                j9bVar = this.i;
                dfbVar.d = j9bVar;
                i = 0;
                dfbVar.e = 0;
                dfbVar.h = 1;
                if (j9bVar.b(dfbVar) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar2 = dfbVar.d;
                try {
                    ch3.d0(obj);
                    sbi sbiVar = sbi.a;
                    j9bVar2.g(null);
                    return sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            i = dfbVar.e;
            j9b j9bVar3 = dfbVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar3;
            dfbVar.d = j9bVar;
            dfbVar.e = i;
            dfbVar.h = 2;
            if (f(dfbVar) != obj2) {
                j9bVar2 = j9bVar;
                sbi sbiVar2 = sbi.a;
                j9bVar2.g(null);
                return sbiVar2;
            }
            return obj2;
        } catch (Throwable th3) {
            j9b j9bVar4 = j9bVar;
            th = th3;
            j9bVar2 = j9bVar4;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b A[LOOP:1: B:69:0x0125->B:71:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x014f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153 A[PHI: r0 r6
  0x0153: PHI (r0v21 rj1) = (r0v19 rj1), (r0v25 rj1) binds: [B:76:0x0150, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0153: PHI (r6v3 long) = (r6v2 long), (r6v4 long) binds: [B:76:0x0150, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0168 A[LOOP:0: B:79:0x0162->B:81:0x0168, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0189  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object f(nq4 nq4Var) {
        efb efbVar;
        int i;
        long j2;
        long j3;
        long j4;
        rj1 rj1Var;
        rj1 rj1Var2;
        long j5;
        ArrayList arrayList;
        Iterator it;
        Object objH;
        LinkedHashSet linkedHashSet;
        Iterator it2;
        rj1 rj1Var3;
        Object obj = hu4.a;
        Object obj2 = sbi.a;
        if (nq4Var instanceof efb) {
            efbVar = (efb) nq4Var;
            int i2 = efbVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                efbVar.h = i2 - Integer.MIN_VALUE;
            } else {
                efbVar = new efb(this, nq4Var);
            }
        } else {
            efbVar = new efb(this, nq4Var);
        }
        efb efbVar2 = efbVar;
        Object objE = efbVar2.f;
        int i3 = efbVar2.h;
        try {
            if (i3 == 0) {
                ch3.d0(objE);
                long jN = ((s7f) this.c).n();
                String str = this.h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(jN, "loadInitial: sync="), null);
                    }
                }
                try {
                    pvb pvbVar = this.a;
                    try {
                        String str2 = this.h;
                        vsb vsbVar = new vsb(jN);
                        efbVar2.e = null;
                        efbVar2.d = jN;
                        efbVar2.h = 1;
                        j2 = jN;
                        i = 2;
                        try {
                            objE = qe7.E(pvbVar, vsbVar, str2, 0L, 0, null, null, efbVar2, 124);
                            if (objE != obj) {
                                j3 = j2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            j3 = j2;
                            objE = new poe(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j2 = jN;
                        i = 2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 2;
                    j2 = jN;
                }
                return obj;
            }
            if (i3 == 1) {
                j3 = efbVar2.d;
                try {
                    ch3.d0(objE);
                    i = 2;
                } catch (Throwable th4) {
                    th = th4;
                    i = 2;
                    objE = new poe(th);
                }
            } else {
                if (i3 == 2) {
                    j4 = efbVar2.d;
                    rj1Var2 = efbVar2.e;
                    ch3.d0(objE);
                    rj1Var = rj1Var2;
                    j5 = j4;
                    if (!rj1Var.h().isEmpty()) {
                        xj1 xj1Var = this.b;
                        List listH = rj1Var.h();
                        arrayList = new ArrayList(yw3.W0(listH, 10));
                        it = listH.iterator();
                        while (it.hasNext()) {
                            arrayList.add(zwk.a((kk1) it.next()));
                        }
                        efbVar2.e = rj1Var;
                        efbVar2.d = j5;
                        efbVar2.h = 3;
                        objH = ch3.H(efbVar2, new wj1(xj1Var, arrayList, null, 0), xj1Var.a);
                        if (objH != obj) {
                            objH = obj2;
                        }
                        if (objH != obj) {
                            List listH2 = rj1Var.h();
                            linkedHashSet = new LinkedHashSet();
                            it2 = listH2.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(new Long(((kk1) it2.next()).a()));
                            }
                            efbVar2.e = rj1Var;
                            efbVar2.d = j5;
                            efbVar2.h = 4;
                            if (d(linkedHashSet, efbVar2) != obj) {
                                rj1Var3 = rj1Var;
                            }
                        }
                        return obj;
                    }
                    ((s7f) this.c).H(rj1Var.i());
                    return obj2;
                }
                if (i3 == 3) {
                    j5 = efbVar2.d;
                    rj1 rj1Var4 = efbVar2.e;
                    ch3.d0(objE);
                    rj1Var = rj1Var4;
                    List listH3 = rj1Var.h();
                    linkedHashSet = new LinkedHashSet();
                    it2 = listH3.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(new Long(((kk1) it2.next()).a()));
                    }
                    efbVar2.e = rj1Var;
                    efbVar2.d = j5;
                    efbVar2.h = 4;
                    if (d(linkedHashSet, efbVar2) != obj) {
                        rj1Var3 = rj1Var;
                    }
                    return obj;
                }
                if (i3 != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rj1Var3 = efbVar2.e;
                ch3.d0(objE);
            }
            rj1Var = rj1Var3;
            ((s7f) this.c).H(rj1Var.i());
            return obj2;
            j4 = j3;
            if (objE instanceof poe) {
                objE = null;
            }
            rj1Var = (rj1) objE;
            if (rj1Var == null) {
                String str3 = this.h;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str3, "loadInitial: empty response, skip", null);
                    }
                }
                return obj2;
            }
            if (!rj1Var.k()) {
                j5 = j4;
                if (!rj1Var.h().isEmpty()) {
                    xj1 xj1Var2 = this.b;
                    List listH4 = rj1Var.h();
                    arrayList = new ArrayList(yw3.W0(listH4, 10));
                    it = listH4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zwk.a((kk1) it.next()));
                    }
                    efbVar2.e = rj1Var;
                    efbVar2.d = j5;
                    efbVar2.h = 3;
                    objH = ch3.H(efbVar2, new wj1(xj1Var2, arrayList, null, 0), xj1Var2.a);
                    if (objH != obj) {
                        objH = obj2;
                    }
                    if (objH != obj) {
                        List listH5 = rj1Var.h();
                        linkedHashSet = new LinkedHashSet();
                        it2 = listH5.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.add(new Long(((kk1) it2.next()).a()));
                        }
                        efbVar2.e = rj1Var;
                        efbVar2.d = j5;
                        efbVar2.h = 4;
                        if (d(linkedHashSet, efbVar2) != obj) {
                            rj1Var3 = rj1Var;
                            rj1Var = rj1Var3;
                        }
                    }
                }
                ((s7f) this.c).H(rj1Var.i());
                return obj2;
            }
            xj1 xj1Var3 = this.b;
            efbVar2.e = rj1Var;
            efbVar2.d = j4;
            efbVar2.h = i;
            if (xj1Var3.a(efbVar2) != obj) {
                rj1Var2 = rj1Var;
                rj1Var = rj1Var2;
                j5 = j4;
                if (!rj1Var.h().isEmpty()) {
                    xj1 xj1Var4 = this.b;
                    List listH6 = rj1Var.h();
                    arrayList = new ArrayList(yw3.W0(listH6, 10));
                    it = listH6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zwk.a((kk1) it.next()));
                    }
                    efbVar2.e = rj1Var;
                    efbVar2.d = j5;
                    efbVar2.h = 3;
                    objH = ch3.H(efbVar2, new wj1(xj1Var4, arrayList, null, 0), xj1Var4.a);
                    if (objH != obj) {
                        objH = obj2;
                    }
                    if (objH != obj) {
                        List listH7 = rj1Var.h();
                        linkedHashSet = new LinkedHashSet();
                        it2 = listH7.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.add(new Long(((kk1) it2.next()).a()));
                        }
                        efbVar2.e = rj1Var;
                        efbVar2.d = j5;
                        efbVar2.h = 4;
                        if (d(linkedHashSet, efbVar2) != obj) {
                            rj1Var3 = rj1Var;
                            rj1Var = rj1Var3;
                        }
                    }
                }
                ((s7f) this.c).H(rj1Var.i());
                return obj2;
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(ArrayList arrayList, nq4 nq4Var) {
        ifb ifbVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ifb) {
            ifbVar = (ifb) nq4Var;
            int i = ifbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifbVar.g = i - Integer.MIN_VALUE;
            } else {
                ifbVar = new ifb(this, nq4Var);
            }
        } else {
            ifbVar = new ifb(this, nq4Var);
        }
        Object obj = ifbVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ifbVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (arrayList.isEmpty()) {
                String str = this.h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "removeByIds: empty historyIds, skip", null);
                    }
                }
                return sbiVar;
            }
            xj1 xj1Var = this.b;
            ifbVar.d = arrayList;
            ifbVar.g = 1;
            if (xj1Var.b(arrayList, ifbVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = ifbVar.d;
            ch3.d0(obj);
        }
        int i3 = qjf.h;
        ojf.a(this.g, ((s7f) this.c).g(), ww3.U1(arrayList));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable h(nq4 nq4Var) {
        jfb jfbVar;
        if (nq4Var instanceof jfb) {
            jfbVar = (jfb) nq4Var;
            int i = jfbVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfbVar.f = i - Integer.MIN_VALUE;
            } else {
                jfbVar = new jfb(this, nq4Var);
            }
        } else {
            jfbVar = new jfb(this, nq4Var);
        }
        Object objI = jfbVar.d;
        int i2 = jfbVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            jfbVar.f = 1;
            objI = ch3.I(jfbVar, this.b.a, true, false, new c6(17));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        Iterable iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(zwk.b((dk1) it.next()));
        }
        return arrayList;
    }
}
