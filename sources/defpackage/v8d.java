package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class v8d extends c2f {
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final int q;
    public final ConcurrentHashMap r;
    public final ConcurrentHashMap s;
    public final AtomicReference t;

    public v8d(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ite iteVar) {
        super(iteVar, 14);
        this.l = ny8Var;
        this.m = ny8Var2;
        this.n = ny8Var3;
        this.o = ny8Var4;
        this.p = rx8.P(3, new w40(ny8Var5, 27));
        this.q = 40;
        this.r = new ConcurrentHashMap();
        this.s = new ConcurrentHashMap();
        this.t = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object A(rt2 rt2Var, String str, nq4 nq4Var) {
        t8d t8dVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof t8d) {
            t8dVar = (t8d) nq4Var;
            int i = t8dVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8dVar.h = i - Integer.MIN_VALUE;
            } else {
                t8dVar = new t8d(this, nq4Var);
            }
        } else {
            t8dVar = new t8d(this, nq4Var);
        }
        Object objW = t8dVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = t8dVar.h;
        if (i2 == 0) {
            ch3.d0(objW);
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.s.get(new Long(rt2Var.A()));
            List listT1 = copyOnWriteArraySet != null ? ww3.T1(copyOnWriteArraySet) : null;
            List list = listT1;
            if (list == null || list.isEmpty()) {
                String str2 = this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, nbh.s(rt2Var.A(), "can't restartPrefetching for chat#", " cuz messagesServerIds is isNullOrEmpty"), null);
                    }
                }
                return sbiVar;
            }
            sua suaVar = (sua) this.n.getValue();
            long j = rt2Var.a;
            t8dVar.d = rt2Var;
            t8dVar.e = str;
            t8dVar.h = 1;
            objW = ((ose) suaVar.a).w(j, t8dVar, listT1);
            if (objW == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = t8dVar.e;
            rt2Var = t8dVar.d;
            ch3.d0(objW);
        }
        z(rt2Var.A(), str, (List) objW);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object B(rt2 rt2Var, Set set, String str, nq4 nq4Var) {
        u8d u8dVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof u8d) {
            u8dVar = (u8d) nq4Var;
            int i = u8dVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8dVar.h = i - Integer.MIN_VALUE;
            } else {
                u8dVar = new u8d(this, nq4Var);
            }
        } else {
            u8dVar = new u8d(this, nq4Var);
        }
        Object objW = u8dVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = u8dVar.h;
        if (i2 == 0) {
            ch3.d0(objW);
            if (set.isEmpty() || !rt2Var.b.g()) {
                String str2 = this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, nbh.s(rt2Var.A(), "Early return in execute for chat#", " cuz of messageServerIds.isEmpty() || !chat.syncedWithServer()"), null);
                    }
                }
                return sbiVar;
            }
            this.t.set(set);
            sua suaVar = (sua) this.n.getValue();
            long j = rt2Var.a;
            List listT1 = ww3.T1(set);
            u8dVar.d = rt2Var;
            u8dVar.e = str;
            u8dVar.h = 1;
            objW = ((ose) suaVar.a).w(j, u8dVar, listT1);
            if (objW == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = u8dVar.e;
            rt2Var = u8dVar.d;
            ch3.d0(objW);
        }
        z(rt2Var.A(), str, (List) objW);
        return sbiVar;
    }

    @Override // defpackage.wed
    public final void f(LinkedHashSet linkedHashSet) {
        linkedHashSet.removeIf(new u6(13, new r8d((Set) this.t.get())));
    }

    @Override // defpackage.wed
    public final int j() {
        return this.q;
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return y(((Number) obj).longValue(), list, (v3b) obj2, qedVar);
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        return ((sih) this.l.getValue()).a.g(new u3b(((Number) obj).longValue(), list), gzVar);
    }

    @Override // defpackage.c2f, defpackage.wed
    public final void p(Object obj) {
        super.p(Long.valueOf(((Number) obj).longValue()));
        x();
    }

    @Override // defpackage.c2f
    public final /* bridge */ /* synthetic */ boolean u(Object obj) {
        return false;
    }

    @Override // defpackage.c2f
    public final long w(Long l) {
        rt2 rt2Var = (rt2) ((xn3) this.m.getValue()).l(l.longValue()).a.getValue();
        ny8 ny8Var = this.p;
        lw5 lw5Var = lw5.MILLISECONDS;
        if (rt2Var != null && rt2Var.d0()) {
            ghb ghbVar = ew5.b;
            return qe7.P(((pad) ny8Var.getValue()).c, lw5Var);
        }
        if (rt2Var == null || rt2Var.b.b() <= 99) {
            ghb ghbVar2 = ew5.b;
            return qe7.P(((pad) ny8Var.getValue()).a, lw5Var);
        }
        ghb ghbVar3 = ew5.b;
        return qe7.P(((pad) ny8Var.getValue()).b, lw5Var);
    }

    public final void x() {
        ConcurrentHashMap concurrentHashMap = this.r;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((a2f) ((Map.Entry) it.next()).getValue()).a();
        }
        concurrentHashMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:47:0x014d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:55:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x0207  */
    /* JADX WARN: Code duplicated, block: B:70:0x0240  */
    /* JADX WARN: Code duplicated, block: B:72:0x0246  */
    /* JADX WARN: Code duplicated, block: B:73:0x024d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0255  */
    /* JADX WARN: Code duplicated, block: B:76:0x026f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0277  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01c3 -> B:59:0x01cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object y(long r38, java.util.List r40, defpackage.v3b r41, defpackage.nq4 r42) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8d.y(long, java.util.List, v3b, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public final void z(long j, String str, List list) {
        p93 p93Var;
        je9 je9Var = je9.f;
        if (list.isEmpty()) {
            String str2 = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, nbh.s(j, "Early return in execute for chat#", " cuz of messages.isEmpty()"), null);
                return;
            }
            return;
        }
        ArrayList<p93> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sfa sfaVar = (sfa) it.next();
            o5d o5dVarU = sfaVar.u();
            if (o5dVarU == null) {
                p93Var = null;
            } else {
                long j2 = sfaVar.b;
                if (j2 <= 0 || this.r.get(Long.valueOf(j2)) != null || yil.b(o5dVarU.d)) {
                    p93Var = null;
                } else {
                    p93Var = new p93(sfaVar.b, o5dVarU.a);
                }
            }
            if (p93Var != null) {
                arrayList.add(p93Var);
            }
        }
        if (arrayList.isEmpty()) {
            String str3 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, nbh.s(j, "cancel PollUpdates prefetch for chat#", " cuz list of ChatPollUpdate is empty"), null);
                return;
            }
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.s.computeIfAbsent(Long.valueOf(j), new am(14, new pyb(24)));
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((p93) it2.next()).a));
        }
        copyOnWriteArraySet.addAll(arrayList2);
        for (p93 p93Var2 : arrayList) {
            a2f a2fVarV = v(Long.valueOf(j), str, p93Var2);
            if (a2fVarV != null) {
                this.r.put(Long.valueOf(p93Var2.a), a2fVarV);
            }
        }
    }
}
