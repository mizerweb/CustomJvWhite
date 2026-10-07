package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.messages.a;
import ru.ok.tamtam.nano.Protos;

/* JADX INFO: loaded from: classes.dex */
public final class i92 implements hh9 {
    public boolean a;
    public volatile boolean b;
    public volatile h92 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public long g;
    public long h;
    public long i;
    public final a2c j;
    public final gb9 k;
    public final pvb l;
    public final qfa m;
    public final qw2 n;
    public final lk9 o;
    public final rs6 p;
    public final t51 q;
    public final zed r;
    public final a s;

    public i92(pvb pvbVar, qfa qfaVar, qw2 qw2Var, lk9 lk9Var, rs6 rs6Var, t51 t51Var, zed zedVar, a2c a2cVar, gb9 gb9Var, a aVar) {
        this.l = pvbVar;
        this.m = qfaVar;
        this.n = qw2Var;
        this.o = lk9Var;
        this.p = rs6Var;
        this.q = t51Var;
        this.r = zedVar;
        this.j = a2cVar;
        this.k = gb9Var;
        this.s = aVar;
    }

    public final void a(int i, List list) {
        HashSet hashSet;
        int size = list.size();
        while (true) {
            size--;
            hashSet = this.e;
            if (size < 0) {
                break;
            } else if (hashSet.contains(Long.valueOf(((fda) list.get(size)).a.a))) {
                list.remove(size);
            }
        }
        this.d.addAll(i, list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Long.valueOf(((fda) it.next()).a.a));
            } catch (Throwable th) {
                qr7.o(th);
                return;
            }
        }
        hashSet.addAll(arrayList);
    }

    public final void b() {
        if (this.i != 0 || this.c.f.b() <= 0) {
            return;
        }
        for (Long l : ((LinkedHashMap) this.c.f.a).keySet()) {
            if (this.n.K(l.longValue()) != null) {
                List listSubList = (List) ((LinkedHashMap) this.c.f.a).get(l);
                if (listSubList != null && !listSubList.isEmpty()) {
                    if (listSubList.size() > 100) {
                        listSubList = listSubList.subList(0, 100);
                    }
                    gm0.n("i92", "loadMissedMessages: for chat: " + l + " messages size: " + listSubList.size());
                    this.i = this.l.y(l.longValue(), new ArrayList(listSubList));
                    return;
                }
            } else {
                gm0.n("i92", "loadMissedMessages: chat not found: " + l);
            }
        }
    }

    @Override // defpackage.hh9
    public final void c() {
        g(new e92(this, 0));
    }

    public final void d() {
        if (this.h == 0) {
            gm0.n("i92", "loadNext: loading from network from: " + this.c.c + " backward");
            pvb pvbVar = this.l;
            this.h = pvb.s(pvbVar, new eui(pvbVar.u().a.g(), this.c.c, false));
        }
    }

    public final void e() {
        if (this.c != null) {
            return;
        }
        this.c = new h92();
        try {
            byte[] bArrA = oxl.a(new File(((ju6) this.p).b(), "call_history_state"));
            Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
            sia.mergeFrom(callHistoryState, bArrA);
            this.c.a = ru.ok.tamtam.nano.a.i(callHistoryState.chunk);
            this.c.b = callHistoryState.forwardMarker;
            this.c.c = callHistoryState.backwardMarker;
            this.c.d = callHistoryState.hasNext;
            this.c.e = callHistoryState.hasPrev;
            Map<Long, Protos.CallHistoryState.MissedMessagesItem> map = callHistoryState.missedMessagesIds;
            if (map != null) {
                for (Map.Entry<Long, Protos.CallHistoryState.MissedMessagesItem> entry : map.entrySet()) {
                    lw8 lw8Var = this.c.f;
                    Long key = entry.getKey();
                    ArrayList arrayListH = p90.h(entry.getValue().ids);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) lw8Var.a;
                    List list = (List) linkedHashMap.get(key);
                    if (list != null) {
                        list.addAll(arrayListH);
                    } else {
                        linkedHashMap.put(key, arrayListH);
                    }
                }
            }
        } catch (Exception e) {
            gm0.n("i92", "loadState error, set default state " + e.getMessage());
        }
    }

    public final void f() {
        this.o.S0().D0(k66.a, new e92(this, 4));
    }

    public final void g(Runnable runnable) {
        this.j.c().execute(runnable);
    }

    public final void h() {
        Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
        callHistoryState.chunk = ru.ok.tamtam.nano.a.j(this.c.a);
        callHistoryState.forwardMarker = this.c.b;
        callHistoryState.backwardMarker = this.c.c;
        callHistoryState.hasNext = this.c.d;
        callHistoryState.hasPrev = this.c.e;
        if (this.c.f != null) {
            callHistoryState.missedMessagesIds = new HashMap();
            for (Long l : ((LinkedHashMap) this.c.f.a).keySet()) {
                Protos.CallHistoryState.MissedMessagesItem missedMessagesItem = new Protos.CallHistoryState.MissedMessagesItem();
                missedMessagesItem.ids = p90.i((List) ((LinkedHashMap) this.c.f.a).get(l));
                callHistoryState.missedMessagesIds.put(l, missedMessagesItem);
            }
        }
        try {
            oxl.b(new File(((ju6) this.p).b(), "call_history_state"), sia.toByteArray(callHistoryState));
        } catch (IOException e) {
            gm0.W("i92", "failed to save state: " + e.getMessage(), new Object[0]);
        }
    }

    public final void i() {
        zed zedVar = this.r;
        long jI = zedVar.a.i();
        xb9 xb9Var = zedVar.a;
        long jX = xb9Var.x();
        StringBuilder sbS = qt4.s(jI, "setCallsLastSync: from: ", " to: ");
        sbS.append(jX);
        gm0.n("i92", sbS.toString());
        xb9Var.o.B(xb9Var, s7f.j0[9], Long.valueOf(jX));
    }

    @l7h
    public void onEvent(gui guiVar) {
        g(new qe(this, 26, guiVar));
    }

    @l7h
    public void onEvent(so4 so4Var) {
        g(new f92(this, 1, so4Var));
    }

    @l7h
    public void onEvent(wo3 wo3Var) {
        g(new o90(this, 2, wo3Var));
    }

    @l7h
    public void onEvent(bg9 bg9Var) {
        g(new qe(this, 29, bg9Var));
    }

    @l7h
    public void onEvent(lc8 lc8Var) {
        g(new qe(this, 28, lc8Var));
    }

    @l7h
    public void onEvent(j3b j3bVar) {
        g(new f92(this, 2, j3bVar));
    }

    @l7h
    public void onEvent(t3b t3bVar) {
        g(new f92(this, 0, t3bVar));
    }

    @l7h
    public void onEvent(yq0 yq0Var) {
        g(new qe(this, 25, yq0Var));
    }

    @l7h
    public void onEvent(s3b s3bVar) {
        g(new qe(this, 27, s3bVar));
    }
}
