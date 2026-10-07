package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import ru.ok.tamtam.contacts.BrokenContactException;

/* JADX INFO: loaded from: classes.dex */
public final class guc implements xtc {
    public static final /* synthetic */ int q = 0;
    public final ny8 a;
    public final ny8 b;
    public final t51 c;
    public final ny8 d;
    public final ifh e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ed6 l;
    public volatile long m;
    public volatile boolean n;
    public volatile int o;
    public final ConcurrentHashMap p = new ConcurrentHashMap();

    public guc(ny8 ny8Var, ny8 ny8Var2, t51 t51Var, ny8 ny8Var3, ifh ifhVar, ny8 ny8Var4, ny8 ny8Var5, ed6 ed6Var, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = t51Var;
        this.d = ny8Var3;
        this.e = ifhVar;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.l = ed6Var;
        this.h = ny8Var6;
        this.i = ny8Var7;
        this.j = ny8Var8;
        this.k = ny8Var9;
        t51Var.d(this);
    }

    public static String c(String str) {
        return (str == null || str.length() <= 4) ? str : "..".concat(str.substring(str.length() - 4));
    }

    @Override // defpackage.xtc
    public final void a(List list) {
        Boolean bool = (Boolean) ((e5d) this.j.getValue()).w().i();
        boolean zBooleanValue = bool.booleanValue();
        boolean andSet = ((n30) this.k.getValue()).l.getAndSet(false);
        gm0.m("guc", "onPhonebookUpdated: phones=%s, isSyncLoopFixEnabled=%s, selfWriteInProgress=%s", Integer.valueOf(list.size()), bool, Boolean.valueOf(andSet));
        if (zBooleanValue && andSet) {
            gm0.n("guc", "onPhonebookUpdated: skipping self-inflicted update");
        } else {
            e();
        }
    }

    public final void b(Map map) {
        boolean z = false;
        for (String str : map.keySet()) {
            Integer num = (Integer) this.p.compute(str, new BiFunction() { // from class: fuc
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Integer num2 = (Integer) obj2;
                    if (num2 != null) {
                        return Integer.valueOf(num2.intValue() + 1);
                    }
                    return 1;
                }
            });
            gm0.W("guc", "checkSyncCycle: phone=%s, syncTimes=%s", c(str), num);
            if (!z && num.intValue() >= 10) {
                ((t1c) this.l).a(new IllegalStateException("Contacts sync cycle"));
                z = true;
            }
        }
    }

    public final void d(List list, Map map, Map map2, boolean z) {
        gm0.m("guc", "onSyncSuccess: contacts=%s, phones=%s, requested=%s, fromOurSync=%s", Integer.valueOf(list.size()), Integer.valueOf(map.size()), Integer.valueOf(map2.size()), Boolean.valueOf(z));
        Boolean bool = (Boolean) ((e5d) this.j.getValue()).w().i();
        boolean zBooleanValue = bool.booleanValue();
        gm0.m("guc", "onSyncSuccess: isSyncLoopFixEnabled=%s, syncedPhonesTimes.size=%s", bool, Integer.valueOf(this.p.size()));
        int i = 1;
        if (zBooleanValue) {
            b(map);
            sse sseVarD = ((n25) this.a.getValue()).d();
            ((j35) sseVarD.b.getValue()).a(new xre(map, i, sseVarD));
        }
        if (list.size() > 0) {
            if (((Boolean) ((zed) this.d.getValue()).b.a().a.K3.a(e5d.S6[246]).i()).booleanValue()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    pj4 pj4Var = (pj4) it.next();
                    long j = pj4Var.g;
                    List list2 = pj4Var.e;
                    if (j == 0) {
                        i2++;
                        long j2 = pj4Var.a;
                        int i3 = pj4Var.h;
                        StringBuilder sbS = qt4.s(j2, "id=", ",status=");
                        sbS.append(qv1.z(i3));
                        sbS.append(",");
                        sb.append(sbS.toString());
                        if (list2 != null && list2.size() > 0) {
                            sb.append("types=");
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                sb.append(((ll4) it2.next()).b);
                                sb.append(',');
                            }
                        }
                        sb.append(';');
                    }
                }
                if (i2 > 0) {
                    ((t1c) this.l).a(new BrokenContactException(sb.insert(0, String.format("phone book contacts[%d]: ", Integer.valueOf(i2))).toString()));
                }
            }
            long jT = ((zed) this.d.getValue()).a.t();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                pj4 pj4Var2 = (pj4) it3.next();
                if (pj4Var2.a == jT) {
                    list.remove(pj4Var2);
                    break;
                }
            }
            gm0.m("guc", "onSyncSuccess: contactInfos after self-filter=%s", Integer.valueOf(list.size()));
            yfd yfdVar = (yfd) this.h.getValue();
            yab.i0(yfdVar.m, null, 0, new l0d(yfdVar, (Collection) list.stream().map(new f05(9)).collect(Collectors.toList()), null, 8), 3);
            ((bi4) this.f.getValue()).n(list, ji4.a);
        }
        if (!zBooleanValue) {
            b(map);
            sse sseVarD2 = ((n25) this.a.getValue()).d();
            ((j35) sseVarD2.b.getValue()).a(new xre(map, 1, sseVarD2));
        }
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            map2.remove((String) it4.next());
        }
        gm0.m("guc", "markInvalidPhones: invalid phones: %s", Integer.valueOf(map2.size()));
        Iterator it5 = map2.keySet().iterator();
        while (it5.hasNext()) {
            gm0.W("guc", "markInvalidPhones: invalid phone=%s", c((String) it5.next()));
        }
        if (!map2.isEmpty()) {
            sse sseVarD3 = ((n25) this.a.getValue()).d();
            Set setKeySet = map2.keySet();
            nuc nucVarB = sseVarD3.b();
            nucVarB.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE phones SET type = ? WHERE type = ? AND phone in (");
            vd7.b(sb2, setKeySet.size());
            sb2.append(")");
            ch3.G(nucVarB.a, false, true, new iaa(sb2.toString(), 24, setKeySet));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            sse sseVarD4 = ((n25) this.a.getValue()).d();
            Long l = (Long) entry.getValue();
            l.getClass();
            sseVarD4.getClass();
            rtc rtcVar = (rtc) ww3.t1(sseVarD4.d(Collections.singletonList(l)));
            if (rtcVar != null) {
                arrayList.add(rtcVar);
            }
        }
        gm0.m("guc", "onSyncSuccess: updatedPhones.size=%s, fromOurSync=%s, isSyncLoopFixEnabled=%s", Integer.valueOf(arrayList.size()), Boolean.valueOf(z), bool);
        Set setA = ((vei) this.i.getValue()).a(arrayList);
        gm0.m("guc", "onSyncSuccess: updatedContacts.size=%s", Integer.valueOf(setA.size()));
        if (!setA.isEmpty()) {
            if (!zBooleanValue || z) {
                gm0.m("guc", "onSyncSuccess: calling contactsSyncService.sync count=%s (isSyncLoopFixEnabled=%s, fromOurSync=%s)", Integer.valueOf(setA.size()), bool, Boolean.valueOf(z));
                ((whh) this.g.getValue()).f(setA);
            } else {
                gm0.m("guc", "onSyncSuccess: skipping contactsSyncService.sync (isSyncLoopFixEnabled=%s, fromOurSync=%s)", bool, Boolean.valueOf(z));
            }
        }
        this.c.c(new ouc());
        if (!zBooleanValue) {
            ((ScheduledExecutorService) this.e.getValue()).schedule(new h7b(5, this), 1L, TimeUnit.SECONDS);
            return;
        }
        this.n = false;
        if (this.o >= 100) {
            e();
        }
    }

    public final void e() {
        gm0.n("guc", "sync");
        if (this.n) {
            gm0.n("guc", "sync: isSyncing=true, return");
        } else {
            this.n = true;
            ((ScheduledExecutorService) this.e.getValue()).execute(new e6(29, this));
        }
    }

    public final void f() {
        Integer num;
        gm0.n("guc", "syncInternal");
        gm0.n("guc", "select unsynced phones");
        HashMap map = new HashMap();
        List list = (List) ch3.G(((n25) this.a.getValue()).d().b().a, true, false, new ik4(25));
        ArrayList<rtc> arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(sse.c((stc) it.next()));
        }
        gm0.m("guc", "selectUnsyncedPhones: unknownPhones in DB=%s", Integer.valueOf(arrayList.size()));
        for (rtc rtcVar : arrayList) {
            if (!ch3.r(rtcVar.p())) {
                map.put(rtcVar.p(), new ml4(!ch3.r(rtcVar.m()) ? rtcVar.m() : rtcVar.p(), rtcVar.o()));
                if (map.size() == 100) {
                    break;
                }
            } else {
                gm0.W("guc", "selectUnsyncedPhones: skip phone with empty number", new Object[0]);
            }
        }
        gm0.m("guc", "selectUnsyncedPhones: count=%s", Integer.valueOf(map.size()));
        if (!map.isEmpty()) {
            for (Map.Entry entry : this.p.entrySet()) {
                if (map.containsKey(entry.getKey()) && (num = (Integer) entry.getValue()) != null && num.intValue() >= 10) {
                    gm0.W("guc", "syncInternal: filtered by MAX_SYNC_TIMES: phone=%s, syncTimes=%s", c((String) entry.getKey()), num);
                    map.remove(entry.getKey());
                }
            }
        }
        gm0.m("guc", "syncInternal: unsyncedPhones size=%s", Integer.valueOf(map.size()));
        this.o = map.size();
        if (map.size() != 0) {
            pvb pvbVar = (pvb) this.b.getValue();
            this.m = pvb.s(pvbVar, new z22(pvbVar.u().a.g(), map, 3));
        } else {
            this.n = false;
            if (((Boolean) ((e5d) this.j.getValue()).w().i()).booleanValue()) {
                this.p.clear();
            }
            gm0.n("guc", "syncInternal: everything synced, return");
        }
    }

    @l7h
    public void onEvent(gfh gfhVar) {
        gm0.m("guc", "SyncResultEvent: contacts=%s, phones=%s, requested=%s", Integer.valueOf(gfhVar.b.size()), Integer.valueOf(gfhVar.c.size()), Integer.valueOf(gfhVar.d.size()));
        ((ScheduledExecutorService) this.e.getValue()).execute(new jm(this, gfhVar, this.n, 3));
    }

    @l7h
    public void onEvent(yq0 yq0Var) {
        if (yq0Var.a == this.m) {
            gm0.m("guc", "BaseErrorEvent :%s", yq0Var);
            this.n = false;
        }
    }
}
