package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0b implements hh9 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final m8b h = new m8b();
    public final vza i;
    public final c46 j;

    public a0b(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var5;
        this.e = ny8Var7;
        this.f = ny8Var8;
        this.g = ny8Var6;
        this.i = new vza(ny8Var, 0);
        c46 c46Var = new c46(ny8Var6, ny8Var8, ny8Var7);
        this.j = c46Var;
        ((bib) c46Var.c).d = new ai8(this, null, 7);
    }

    public static void e(gda gdaVar, m8b m8bVar, m8b m8bVar2, int i, boolean z) {
        gda gdaVar2;
        ed7 ed7Var;
        m8bVar.a(gdaVar.d);
        b50<l40> b50Var = gdaVar.h;
        if (!b50Var.isEmpty()) {
            for (l40 l40Var : b50Var) {
                w50 w50Var = l40Var.a;
                int i2 = w50Var == null ? -1 : wza.$EnumSwitchMapping$0[w50Var.ordinal()];
                if (i2 == 1) {
                    oq4 oq4Var = (oq4) l40Var;
                    Long l = oq4Var.e;
                    if (l != null) {
                        m8bVar.a(l.longValue());
                    }
                    List<Long> list = oq4Var.f;
                    if (list != null) {
                        for (Long l2 : list) {
                            if (l2 != null) {
                                m8bVar.a(l2.longValue());
                            }
                        }
                    }
                } else if (i2 == 2) {
                    List list2 = ((xb1) l40Var).i;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            m8bVar.a(((Long) it.next()).longValue());
                        }
                    }
                } else if (i2 == 3) {
                    m8bVar.a(((hh4) l40Var).e);
                } else if (i2 == 4 && (ed7Var = ((q6d) l40Var).h) != null) {
                    u8b u8bVar = (u8b) ed7Var.c;
                    Object[] objArr = u8bVar.a;
                    int i3 = u8bVar.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        u8b u8bVar2 = ((aad) objArr[i4]).c;
                        Object[] objArr2 = u8bVar2.a;
                        int i5 = u8bVar2.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            m8bVar.a(((b6d) objArr2[i6]).a);
                        }
                    }
                    LinkedHashSet linkedHashSet = (LinkedHashSet) ed7Var.d;
                    if (linkedHashSet != null) {
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            m8bVar.a(((Number) it2.next()).longValue());
                        }
                    }
                }
            }
        }
        dia diaVar = gdaVar.i;
        if (diaVar == null || (gdaVar2 = diaVar.c) == null || i <= 0) {
            return;
        }
        if (z) {
            e(gdaVar2, m8bVar2, m8bVar2, i - 1, true);
        } else {
            e(gdaVar2, m8bVar, m8bVar2, i - 1, true);
        }
    }

    public static void f(sfa sfaVar, m8b m8bVar, m8b m8bVar2, int i, boolean z) {
        List listB;
        o5d o5dVar;
        n5d n5dVarE;
        m8bVar.a(sfaVar.e);
        c46 c46Var = sfaVar.n;
        if (c46Var != null) {
            int i2 = c46Var.i();
            for (int i3 = 0; i3 < i2; i3++) {
                e70 e70VarH = c46Var.h(i3);
                if (e70VarH != null) {
                    y60 y60Var = e70VarH.a;
                    int i4 = y60Var == null ? -1 : wza.$EnumSwitchMapping$1[y60Var.ordinal()];
                    if (i4 == 1) {
                        h60 h60Var = e70VarH.c;
                        if (h60Var != null) {
                            m8bVar.a(h60Var.b);
                            Iterator it = h60Var.c.iterator();
                            while (it.hasNext()) {
                                m8bVar.a(((Number) it.next()).longValue());
                            }
                        }
                    } else if (i4 == 2) {
                        e60 e60Var = e70VarH.i;
                        if (e60Var != null && (listB = e60Var.b()) != null) {
                            Iterator it2 = listB.iterator();
                            while (it2.hasNext()) {
                                m8bVar.a(((Number) it2.next()).longValue());
                            }
                        }
                    } else if (i4 == 3) {
                        f60 f60Var = e70VarH.k;
                        if (f60Var != null) {
                            m8bVar.a(f60Var.a());
                        }
                    } else if (i4 == 4 && (o5dVar = e70VarH.o) != null && (n5dVarE = o5dVar.e()) != null) {
                        u8b u8bVarA = n5dVarE.a();
                        Object[] objArr = u8bVarA.a;
                        int i5 = u8bVarA.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            u8b u8bVarF = ((m5d) objArr[i6]).f();
                            Object[] objArr2 = u8bVarF.a;
                            int i7 = u8bVarF.b;
                            for (int i8 = 0; i8 < i7; i8++) {
                                m8bVar2.a(((l5d) objArr2[i8]).b());
                            }
                        }
                    }
                }
            }
        }
        sfa sfaVar2 = sfaVar.q;
        if (sfaVar2 != null && i > 0) {
            if (z) {
                f(sfaVar2, m8bVar2, m8bVar2, i - 1, true);
            } else {
                f(sfaVar2, m8bVar, m8bVar2, i - 1, true);
            }
        }
    }

    public static Object i(a0b a0bVar, List list, long j, lq4 lq4Var) {
        a0bVar.getClass();
        return cqk.k(new xza(list, a0bVar, j, null, null), lq4Var);
    }

    public static Object p(a0b a0bVar, sfa sfaVar, nq4 nq4Var) {
        Object objI;
        ghb ghbVar = ew5.b;
        long jO = qe7.O(2, lw5.SECONDS);
        a0bVar.getClass();
        m8b m8bVar = new m8b();
        m8b m8bVar2 = new m8b();
        f(sfaVar, m8bVar, m8bVar2, 5, false);
        a0bVar.a(m8bVar);
        a0bVar.a(m8bVar2);
        a0bVar.j.b(m8bVar2);
        List listA = a0bVar.a(m8bVar);
        return (listA.isEmpty() || (objI = i(a0bVar, listA, jO, nq4Var)) != hu4.a) ? sbi.a : objI;
    }

    public static void u(a0b a0bVar, m8b m8bVar) {
        ghb ghbVar = ew5.b;
        long jO = qe7.O(5, lw5.SECONDS);
        a0bVar.getClass();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", "requestWithRetry " + m8bVar, null);
            }
        }
        if (m8bVar.i()) {
            return;
        }
        yab.i0((wmi) a0bVar.g.getValue(), null, 0, new ue0(m8bVar, a0bVar, jO, (lq4) null), 3);
    }

    public final List a(m8b m8bVar) {
        if (h() && !m8bVar.i()) {
            rx8.Y(m8bVar, this.i);
            if (h() && !m8bVar.i()) {
                return rx8.i0(m8bVar);
            }
        }
        return r66.a;
    }

    public final void b(m8b m8bVar, st2 st2Var, m8b m8bVar2) {
        boolean z = st2Var.u1 == 2;
        Iterator it = st2Var.d.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (z) {
                m8bVar.a(jLongValue);
            } else {
                m8bVar2.a(jLongValue);
            }
        }
        LinkedHashMap linkedHashMap = st2Var.E;
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Long l = (Long) entry.getKey();
                pc pcVar = (pc) entry.getValue();
                m8bVar2.a(l.longValue());
                m8bVar2.a(pcVar.c);
            }
        }
        gda gdaVar = st2Var.i;
        if (gdaVar != null) {
            e(gdaVar, m8bVar, m8bVar2, 5, false);
        }
        gda gdaVar2 = st2Var.x;
        if (gdaVar2 != null) {
            e(gdaVar2, m8bVar, m8bVar2, 5, false);
        }
        m8bVar2.a(st2Var.c);
    }

    @Override // defpackage.hh9
    public final void c() {
        synchronized (this) {
            this.h.c();
        }
        ((bib) ((ifh) this.j.b).getValue()).a();
    }

    public final m8b d(List list, m8b m8bVar) {
        m8b m8bVar2 = new m8b(list.size());
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b(m8bVar2, (st2) it.next(), m8bVar);
            }
        }
        return m8bVar2;
    }

    public final void g(List list, m8b m8bVar, m8b m8bVar2) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((gda) it.next(), m8bVar, m8bVar2, 5, false);
        }
    }

    public final boolean h() {
        return ((rnf) ((onf) this.d.getValue())).q != 1;
    }

    public final void j(st2 st2Var) throws Throwable {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", "requestForChat: chat=" + st2Var, null);
            }
        }
        m8b m8bVar = new m8b();
        m8b m8bVarD = d(Collections.singletonList(st2Var), m8bVar);
        this.j.b(m8bVar);
        if (m8bVarD.i()) {
            return;
        }
        List listA = a(m8bVarD);
        if (listA.isEmpty()) {
            return;
        }
        yab.A0(k66.a, new yza(this, listA, null, 0));
    }

    public final Object k(fz2 fz2Var, long j, nq4 nq4Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                st2 st2VarH = fz2Var.h();
                a4cVar.c(je9Var, "MissedContactsController", "requestForChatHistory: response=" + (st2VarH != null ? new Long(st2VarH.a) : null), null);
            }
        }
        m8b m8bVar = new m8b();
        m8b m8bVar2 = new m8b();
        g(fz2Var.i(), m8bVar, m8bVar2);
        st2 st2VarH2 = fz2Var.h();
        if (st2VarH2 != null) {
            b(m8bVar, st2VarH2, m8bVar2);
        }
        this.j.b(m8bVar2);
        List listA = a(m8bVar);
        return listA.isEmpty() ? ui9.a : i(this, listA, j, nq4Var);
    }

    public final void l(nz2 nz2Var) throws Throwable {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", "requestForChatInfo: response=" + nz2Var, null);
            }
        }
        m8b m8bVar = new m8b();
        m8b m8bVarD = d(nz2Var.c, m8bVar);
        st2 st2Var = nz2Var.d;
        if (st2Var != null) {
            b(m8bVarD, st2Var, m8bVar);
        }
        this.j.b(m8bVar);
        if (m8bVarD.i()) {
            return;
        }
        List listA = a(m8bVarD);
        if (listA.isEmpty()) {
            return;
        }
        yab.A0(k66.a, new yza(this, listA, null, 1));
    }

    public final void m(List list) throws Throwable {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", "requestForChats: chats=".concat(ww3.z1(list, null, null, null, null, 63)), null);
            }
        }
        m8b m8bVar = new m8b();
        m8b m8bVarD = d(list, m8bVar);
        this.j.b(m8bVar);
        if (m8bVarD.i()) {
            return;
        }
        List listA = a(m8bVarD);
        if (listA.isEmpty()) {
            return;
        }
        yab.A0(k66.a, new yza(this, listA, null, 2));
    }

    public final Object n(rt2 rt2Var, boolean z, mdh mdhVar) {
        sbi sbiVar = sbi.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", "requestForCoreChat: chat=" + rt2Var, null);
            }
        }
        m8b m8bVar = new m8b();
        m8b m8bVar2 = new m8b();
        boolean zH0 = rt2Var.h0();
        Iterator it = rt2Var.b.e.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (zH0) {
                m8bVar2.a(jLongValue);
            } else {
                m8bVar.a(jLongValue);
            }
        }
        mw mwVar = rt2Var.b.T;
        if (mwVar != null) {
            for (Map.Entry entry : (gw) mwVar.entrySet()) {
                Long l = (Long) entry.getKey();
                sw2 sw2Var = (sw2) entry.getValue();
                m8bVar.a(l.longValue());
                m8bVar.a(sw2Var.c);
            }
        }
        fda fdaVar = rt2Var.c;
        if (fdaVar != null) {
            f(fdaVar.a, m8bVar2, m8bVar, 5, false);
        }
        fda fdaVar2 = rt2Var.e;
        if (fdaVar2 != null) {
            f(fdaVar2.a, m8bVar2, m8bVar, 5, false);
        }
        m8bVar.a(rt2Var.b.d);
        this.j.b(m8bVar);
        if (!m8bVar2.i()) {
            List listA = a(m8bVar2);
            if (!listA.isEmpty()) {
                ghb ghbVar = ew5.b;
                Object objK = cqk.k(new xza(listA, this, qe7.O(10, lw5.SECONDS), z ? new Long(rt2Var.A()) : null, null), mdhVar);
                if (objK == hu4.a) {
                    return objK;
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(nf9 nf9Var, long j, nq4 nq4Var) {
        zza zzaVar;
        m8b m8bVar;
        if (nq4Var instanceof zza) {
            zzaVar = (zza) nq4Var;
            int i = zzaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaVar.g = i - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, nq4Var);
            }
        } else {
            zzaVar = new zza(this, nq4Var);
        }
        Object obj = zzaVar.e;
        int i2 = zzaVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n("MissedContactsController", "requestForLogin");
            ArrayList arrayListI = nf9Var.i();
            ArrayList arrayList = new ArrayList(yw3.W0(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                c0a.t(((pj4) it.next()).a, arrayList);
            }
            m8b m8bVarJ0 = rx8.j0(arrayList);
            m8b m8bVar2 = new m8b();
            m8b m8bVarD = d(nf9Var.d, m8bVar2);
            Iterator it2 = nf9Var.i.values().iterator();
            while (it2.hasNext()) {
                g((List) it2.next(), m8bVarD, m8bVar2);
            }
            m8bVarD.o(m8bVarJ0);
            ujd ujdVar = nf9Var.c;
            if (ujdVar != null) {
                m8bVarD.n(ujdVar.a.a);
            }
            m8bVar2.o(m8bVarJ0);
            List listA = a(m8bVarD);
            zzaVar.d = m8bVar2;
            zzaVar.g = 1;
            Object objI = i(this, listA, j, zzaVar);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
            m8bVar = m8bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m8bVar = zzaVar.d;
            ch3.d0(obj);
        }
        this.j.b(m8bVar);
        return sbi.a;
    }

    public final void q(akb akbVar) throws Throwable {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", "requestForNotifMessage: response=" + akbVar, null);
            }
        }
        m8b m8bVar = new m8b();
        m8b m8bVar2 = new m8b();
        e(akbVar.k(), m8bVar, m8bVar2, 5, false);
        st2 st2VarH = akbVar.h();
        if (st2VarH != null) {
            b(m8bVar, st2VarH, m8bVar2);
        }
        this.j.b(m8bVar2);
        if (m8bVar.i()) {
            return;
        }
        List listA = a(m8bVar);
        if (listA.isEmpty()) {
            return;
        }
        yab.A0(k66.a, new yza(this, listA, null, 3));
    }

    public final void r(zkb zkbVar) {
        List listA = a(ui9.a(zkbVar.h()));
        if (listA.isEmpty()) {
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", c0a.n(ww3.r1(listA), "requestForTyping: id=#"), null);
            }
        }
        this.j.c(listA);
    }

    public final Object s(long j, long j2, mdh mdhVar) {
        Object objI;
        sbi sbiVar = sbi.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MissedContactsController", zo5.j(j, "requestForUser: id=#"), null);
            }
        }
        List listA = a(ui9.a(j));
        return (!listA.isEmpty() && (objI = i(this, listA, j2, mdhVar)) == hu4.a) ? objI : sbiVar;
    }

    public final Object t(m8b m8bVar, long j, nq4 nq4Var) {
        sbi sbiVar = sbi.a;
        List listA = a(m8bVar);
        if (!listA.isEmpty()) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "MissedContactsController", c0a.o("requestForUsers: ids=[", ww3.z1(listA, null, null, null, null, 63), "]"), null);
                }
            }
            Object objI = i(this, listA, j, nq4Var);
            if (objI == hu4.a) {
                return objI;
            }
        }
        return sbiVar;
    }
}
