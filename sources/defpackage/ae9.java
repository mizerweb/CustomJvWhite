package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.LongSupplier;
import ru.ok.tamtam.stats.LogController$AnalyticsDebugException;

/* JADX INFO: loaded from: classes.dex */
public final class ae9 {
    public final gue a;
    public final gu4 b;
    public final LongSupplier c;
    public final List d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final String m;
    public final l9b n;
    public final m31 o;
    public final ConcurrentLinkedQueue p;
    public final ifh q;

    public ae9(gue gueVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ha9 ha9Var, List list) {
        xt4 xt4VarB = ((n0c) xhhVar).b();
        nah nahVarA = wk8.a();
        xt4VarB.getClass();
        dq4 dq4VarA = cqk.a(lvb.x0(xt4VarB, nahVarA).u0(new du4("LogController")));
        td9 td9Var = new td9(0);
        this.a = gueVar;
        this.b = dq4VarA;
        this.c = td9Var;
        this.d = list;
        this.e = ny8Var2;
        this.f = ny8Var;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        String strP = zo5.p(ae9.class.getName(), "#", String.valueOf(ha9Var.a));
        this.m = strP;
        this.n = new l9b();
        ghb ghbVar = ew5.b;
        n0c n0cVar = (n0c) xhhVar;
        this.o = new m31(strP, n0cVar.b(), n0cVar.a(), cqk.a(lvb.x0(wk8.a(), n0cVar.a())), qe7.O(1000, lw5.MILLISECONDS), new ai8(ny8Var, null, 1), new g3(15, this), null, np0.m);
        this.p = new ConcurrentLinkedQueue();
        this.q = new ifh(new d2(28, this));
        gueVar.c(new u67(ny8Var2, 2, this));
    }

    public static final sih b(ae9 ae9Var) {
        return (sih) ae9Var.i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object c(ae9 ae9Var, List list, List list2, Exception exc, nq4 nq4Var) {
        vd9 vd9Var;
        String str = ae9Var.m;
        if (nq4Var instanceof vd9) {
            vd9Var = (vd9) nq4Var;
            int i = vd9Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd9Var.h = i - Integer.MIN_VALUE;
            } else {
                vd9Var = new vd9(ae9Var, nq4Var);
            }
        } else {
            vd9Var = new vd9(ae9Var, nq4Var);
        }
        Object obj = vd9Var.f;
        int i2 = vd9Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            s7f s7fVar = (s7f) ae9Var.e();
            gvb gvbVar = s7fVar.s;
            zv8[] zv8VarArr = s7f.j0;
            s7fVar.M(((Number) gvbVar.m(s7fVar, zv8VarArr[14])).intValue() + 1);
            if (((Number) s7fVar.s.m(s7fVar, zv8VarArr[14])).intValue() > 3) {
                String strD = v0h.d("Could not send logs ", " after 3 retries", list);
                gm0.V(str, strD, new LogController$AnalyticsDebugException(strD, exc));
                mkg mkgVar = (mkg) ae9Var.f.getValue();
                List list3 = list2;
                ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    c0a.t(((sig) it.next()).a, arrayList);
                }
                vd9Var.d = list;
                vd9Var.e = exc;
                vd9Var.h = 1;
                Object objA = ((vse) mkgVar).a(arrayList, vd9Var);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        exc = vd9Var.e;
        list = vd9Var.d;
        ch3.d0(obj);
        ((s7f) ae9Var.e()).M(0);
        gm0.l(str, "Max unexpected log error count exceeded, deleting logs. Entries: " + list, exc);
        return sbi.a;
    }

    public static final kp d(ae9 ae9Var, sig sigVar) {
        ae9Var.getClass();
        ce9 ce9Var = sigVar.c;
        return new kp(ce9Var.f, ce9Var.c, ce9Var.d, ce9Var.a, ce9Var.b, ce9Var.e);
    }

    public static /* synthetic */ void k(ae9 ae9Var, String str, String str2, Map map, int i) {
        if ((i & 4) != 0) {
            map = s66.a;
        }
        ae9Var.j(str, str2, map, false);
    }

    public final et3 e() {
        return (et3) this.e.getValue();
    }

    public final boolean f() {
        return !((Boolean) ((e5d) this.g.getValue()).W1.a(e5d.S6[151]).i()).booleanValue();
    }

    public final void g(String str, Map map) {
        k(this, "ACTION", str, map, 8);
    }

    public final void h(String str, Map map) {
        k(this, "CLICK", str, map, 8);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x018b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0192  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd A[LOOP:1: B:84:0x01b7->B:86:0x01bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d3  */
    public final void j(String str, String str2, Map map, boolean z) {
        Map map2;
        long j;
        Map map3;
        Object poeVar;
        Set set;
        long jA;
        ew5 ew5Var;
        long j2;
        String str3;
        aa6 aa6Var;
        a4c a4cVar;
        je9 je9Var = je9.d;
        if (f()) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (this.d.isEmpty()) {
            gm0.U(this.m, "nothing to enrich");
            map2 = map;
        } else {
            long jC = g1b.c();
            LinkedHashMap linkedHashMap = null;
            for (wcb wcbVar : this.d) {
                long jC2 = g1b.c();
                je9 je9Var3 = je9.c;
                edb edbVar = (edb) wcbVar.a.h().getValue();
                if (edbVar.b.isEmpty() && edbVar.c.isEmpty()) {
                    j = jC;
                } else {
                    j = jC;
                    if (edbVar.b.contains(str) || ((set = (Set) edbVar.c.get(str)) != null && set.contains(str2))) {
                        wcbVar.g.getValue();
                        map3 = (Map) wcbVar.d.get();
                        if (map3 != null) {
                            String str4 = wcbVar.e;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var3)) {
                                a4cVar2.c(je9Var3, str4, qv1.l("reuse cached enrichment for ", str, ":", str2), null);
                            }
                        } else {
                            try {
                                TelephonyManager telephonyManager = (TelephonyManager) ((Context) wcbVar.b.getValue()).getSystemService(TelephonyManager.class);
                                poeVar = telephonyManager != null ? telephonyManager.getNetworkOperator() + ":" + telephonyManager.getNetworkOperatorName() : null;
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            if (poeVar instanceof poe) {
                                poeVar = null;
                            }
                            String str5 = (String) poeVar;
                            if (str5 == null) {
                                str5 = "undefined";
                            }
                            ylc ylcVar = new ylc("operator", str5);
                            wd4 wd4Var = (wd4) wcbVar.c.getValue();
                            Map mapQ0 = wm9.Q0(ylcVar, new ylc("connection_type", Integer.valueOf(wd4Var.h() ? wd4Var.a().a : 1)));
                            AtomicReference atomicReference = wcbVar.d;
                            while (!atomicReference.compareAndSet(null, mapQ0) && atomicReference.get() == null) {
                            }
                            map3 = mapQ0;
                        }
                    }
                    jA = ish.a(jC2);
                    ew5Var = new ew5(jA);
                    if (ew5.g(jA) < 16) {
                        ew5Var = null;
                    }
                    if (ew5Var != null) {
                        j2 = ew5Var.a;
                        str3 = this.m;
                        aa6Var = new aa6(wcb.class.getName());
                        a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var2)) {
                            a4cVar.c(je9Var2, str3, zo5.p(wcb.class.getName(), " has overtimed ", ew5.t(j2)), aa6Var);
                        }
                    }
                    if (map3 == null) {
                        if (map3.isEmpty()) {
                            map3 = null;
                        }
                        if (map3 != null) {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap(map3.size() + map.size());
                                linkedHashMap.putAll(map);
                            }
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            for (Map.Entry entry : map3.entrySet()) {
                                linkedHashMap.putIfAbsent((String) entry.getKey(), entry.getValue());
                            }
                            linkedHashMap = linkedHashMap2;
                        }
                    }
                    jC = j;
                }
                String str6 = wcbVar.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var3)) {
                    a4cVar3.c(je9Var3, str6, qv1.l("skip event ", str, ":", str2), null);
                }
                map3 = null;
                jA = ish.a(jC2);
                ew5Var = new ew5(jA);
                if (ew5.g(jA) < 16) {
                    ew5Var = null;
                }
                if (ew5Var != null) {
                    j2 = ew5Var.a;
                    str3 = this.m;
                    aa6Var = new aa6(wcb.class.getName());
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var2, str3, zo5.p(wcb.class.getName(), " has overtimed ", ew5.t(j2)), aa6Var);
                    }
                }
                if (map3 == null) {
                    if (map3.isEmpty()) {
                        map3 = null;
                    }
                    if (map3 != null) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap(map3.size() + map.size());
                            linkedHashMap.putAll(map);
                        }
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        while (r4.hasNext()) {
                            linkedHashMap.putIfAbsent((String) entry.getKey(), entry.getValue());
                        }
                        linkedHashMap = linkedHashMap3;
                    }
                }
                jC = j;
            }
            long j3 = jC;
            Map map4 = map;
            long jA2 = ish.a(j3);
            if (ew5.s(jA2, lw5.SECONDS) >= 1) {
                String str7 = this.m;
                aa6 aa6Var2 = new aa6("overtime for ".concat(ew5.t(jA2)));
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, str7, "Overtime ".concat(ew5.t(jA2)), aa6Var2);
                }
            }
            if (linkedHashMap != null) {
                map4 = linkedHashMap;
            }
            map2 = map4;
        }
        long asLong = this.c.getAsLong();
        if (!z) {
            sig sigVar = new sig(0L, asLong, new ce9(((s7f) e()).t(), ((xb9) e()).Y(), asLong, str, str2, map2));
            String str8 = this.m;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                StringBuilder sbQ = qv1.q("Store regular event: type=", str, ", event=", str2, ", params=");
                sbQ.append(map2);
                a4cVar5.c(je9Var, str8, sbQ.toString(), null);
            }
            this.o.b(sigVar);
            return;
        }
        kp kpVar = new kp(asLong, ((s7f) e()).t(), ((xb9) e()).Y(), str, str2, map2);
        String str9 = this.m;
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            StringBuilder sbQ2 = qv1.q("Send critical event: type=", str, ", event=", str2, ", params=");
            sbQ2.append(map2);
            a4cVar6.c(je9Var, str9, sbQ2.toString(), null);
        }
        if (((Boolean) ((e5d) this.g.getValue()).A6.a(e5d.S6[392]).i()).booleanValue()) {
            this.p.add(kpVar);
            ((d9b) this.q.getValue()).a(sbi.a);
        } else {
            pvb pvbVar = (pvb) this.h.getValue();
            pvb.t(pvbVar, new bw4(pvbVar.u().a.g(), kpVar));
        }
    }

    public final boolean l(String str, boolean z) {
        String str2 = this.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qt4.n("Try sending logs, reason=", str, ", force=", z), null);
            }
        }
        if (!this.n.f()) {
            gm0.n(this.m, "Log is in progress, skipping.");
            return false;
        }
        if (!((mih) this.j.getValue()).l.add("LOG_DISCONNECTION_BLOCKER")) {
            throw new IllegalStateException("Trying to add already present blocker ".concat("LOG_DISCONNECTION_BLOCKER").toString());
        }
        yab.i0(this.b, null, 0, new zd9(this, z, str, null), 3);
        return true;
    }
}
