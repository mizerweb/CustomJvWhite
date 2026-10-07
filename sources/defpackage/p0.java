package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import ru.ok.tamtam.api.SessionSendLimitException;
import ru.ok.tamtam.api.SessionTamErrorException;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ p0(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public void a() {
        String strC;
        hih hihVar;
        ArrayList arrayList;
        jlc jlcVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        agb agbVar = (agb) this.c;
        int size = agbVar.v.size();
        int i = 0;
        int i2 = 1;
        boolean z = agbVar.z > 0 && agbVar.n();
        if (z && !agbVar.A && agbVar.z < size) {
            gm0.W(agbVar.a, "amount of send_tasks=%d has exceeded the specified limit=%d", Integer.valueOf(size), Integer.valueOf(agbVar.z));
            agbVar.t(new SessionSendLimitException(agbVar.z, size), false);
            agbVar.A = true;
        }
        if (z) {
            gm0.m(((agb) this.c).a, "!==! invalidate start time for cmds, tasks=%d, limit=%d", Integer.valueOf(((agb) this.c).v.size()), Integer.valueOf(((agb) this.c).z));
        }
        int i3 = ((agb) this.c).l.get();
        synchronized (((agb) this.c).w) {
            try {
                if (((agb) this.c).v.size() > 0) {
                    for (klc klcVar : ((agb) this.c).v) {
                        if (klcVar != null && klcVar.a == i2 && (jlcVar = klcVar.b) != null) {
                            if (z) {
                                ghb ghbVar = ew5.b;
                                jlcVar.d = qe7.P(System.currentTimeMillis(), lw5.MILLISECONDS);
                            } else {
                                long jG = jCurrentTimeMillis - (((agb) this.c).D ? ew5.g(klcVar.c) : ew5.g(jlcVar.d));
                                long jB = b(klcVar);
                                if (jG > jB) {
                                    ((agb) this.c).p(sd9.d, klcVar.b.c.g(), (short) 0, klcVar.b.a.k(), true, "send timeout: diff=" + jG + " requestTimeout=" + jB);
                                    ((agb) this.c).p.c();
                                    if (((ArrayList) this.b) == null) {
                                        this.b = new ArrayList(16);
                                    }
                                    ((ArrayList) this.b).add(klcVar);
                                }
                            }
                        }
                        i2 = 1;
                    }
                    if (!p90.D((ArrayList) this.b)) {
                        ((agb) this.c).v.removeAll((ArrayList) this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!p90.D((ArrayList) this.b)) {
            thh thhVar = new thh("send_timeout");
            int i4 = 0;
            while (true) {
                int size2 = ((ArrayList) this.b).size();
                arrayList = (ArrayList) this.b;
                if (i4 >= size2) {
                    break;
                }
                try {
                    ((klc) arrayList.get(i4)).b.c.f(thhVar);
                } catch (Exception e) {
                    String str = ((agb) this.c).a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "error in sender task fail callback", e);
                        }
                    }
                }
                i4++;
            }
            if (arrayList.size() > 64) {
                this.b = new ArrayList(16);
            } else {
                ((ArrayList) this.b).clear();
            }
        }
        if (((agb) this.c).u.size() > 0) {
            for (Map.Entry entry : ((agb) this.c).u.entrySet()) {
                long jB2 = b(((ilc) entry.getValue()).b);
                if (jCurrentTimeMillis - ((ilc) entry.getValue()).c > jB2 && jCurrentTimeMillis - ((agb) this.c).e.get() > jB2) {
                    short sK = ((ilc) entry.getValue()).b.b.a.k();
                    ((agb) this.c).p(sd9.d, ((ilc) entry.getValue()).a.g(), ((Short) entry.getKey()).shortValue(), sK, false, "read timeout");
                    ((agb) this.c).p.c();
                    gm0.W(((agb) this.c).a, "session timeout", new Object[i]);
                    agb agbVar2 = (agb) this.c;
                    thh thhVar2 = new thh(zo5.g(sK, jB2, "read_timeout=", ", code="));
                    om5 om5Var = om5.f;
                    je9 je9Var2 = je9.d;
                    String str2 = agbVar2.a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                        boolean z2 = agbVar2.B;
                        StringBuilder sb = new StringBuilder("handleSessionTimeout(error:");
                        sb.append(thhVar2);
                        sb.append(", conn=");
                        sb.append(i3);
                        sb.append(", checkStateBeforeDisconnect=");
                        a4cVar2.c(je9Var2, str2, qt4.r(sb, z2, ")"), null);
                    }
                    boolean z3 = agbVar2.B;
                    ConcurrentHashMap concurrentHashMap = agbVar2.u;
                    if (!z3) {
                        Iterator it = concurrentHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((ilc) it.next()).a.f(thhVar2);
                        }
                        concurrentHashMap.clear();
                        agbVar2.u(i);
                        agbVar2.s(om5Var);
                        return;
                    }
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        Short sh = (Short) entry2.getKey();
                        ilc ilcVar = (ilc) entry2.getValue();
                        String str3 = agbVar2.a;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                            jlc jlcVar2 = ilcVar.b.b;
                            if (jlcVar2 == null || (hihVar = jlcVar2.a) == null) {
                                strC = null;
                            } else {
                                short sK2 = hihVar.k();
                                kfc.c.getClass();
                                strC = lhb.c(sK2);
                            }
                            StringBuilder sbT = qt4.t(ilcVar.a.g(), "handleSessionTimeout(): fail requestId = ", ", opcode = ", strC);
                            sbT.append(", seq=");
                            sbT.append(sh);
                            a4cVar3.c(je9Var2, str3, sbT.toString(), null);
                        }
                        ilcVar.a.f(thhVar2);
                    }
                    agbVar2.u.clear();
                    if (i3 == agbVar2.l.get() && agbVar2.u(0)) {
                        agbVar2.s(om5Var);
                        agbVar2.t(new SessionTamErrorException(thhVar2), false);
                        return;
                    }
                    String str4 = agbVar2.a;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 == null) {
                        return;
                    }
                    je9 je9Var3 = je9.f;
                    if (a4cVar4.b(je9Var3)) {
                        a4cVar4.c(je9Var3, str4, "handleSessionTimeout, skip DISCONNECTED status, isDisconnected=" + agbVar2.n() + ", curr_conn=" + agbVar2.l.get() + ", expected_conn=" + i3, null);
                        return;
                    }
                    return;
                }
                i = i;
            }
        }
    }

    public long b(klc klcVar) {
        jlc jlcVar = klcVar.b;
        agb agbVar = (agb) this.c;
        if (jlcVar == null) {
            return agbVar.p.b.c();
        }
        xe4 xe4Var = agbVar.p.b;
        short sK = jlcVar.a.k();
        short[] sArr = (short[]) xe4Var.g;
        if (Arrays.binarySearch(sArr, 0, sArr.length, sK) < 0) {
            return xe4Var.c();
        }
        String name = xe4.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "use TYPE_MOBILE_SLOW timeout", null);
            }
        }
        return xe4Var.b(we4.TYPE_MOBILE_SLOW);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((d35) this.b).b((q0) this.c);
                return;
            case 1:
                b20 b20Var = (b20) this.c;
                d20 d20Var = b20Var.e;
                if (d20Var.g == b20Var.c) {
                    List list = b20Var.b;
                    nl5 nl5Var = (nl5) this.b;
                    Runnable runnable = b20Var.d;
                    List list2 = d20Var.f;
                    d20Var.e = list;
                    d20Var.f = Collections.unmodifiableList(list);
                    nl5Var.a(d20Var.a);
                    d20Var.a(list2, runnable);
                    return;
                }
                return;
            case 2:
                rb5 rb5Var = (rb5) this.c;
                ArrayList<lfe> arrayList = (ArrayList) this.b;
                for (lfe lfeVar : arrayList) {
                    View view = lfeVar.a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    rb5Var.o.add(lfeVar);
                    viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(rb5Var.c).setListener(new mb5(rb5Var, lfeVar, view, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                rb5Var.l.remove(arrayList);
                return;
            case 3:
                n1g n1gVarX = n1g.x();
                String str = qg5.e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                mzj mzjVar = (mzj) this.b;
                sb.append(mzjVar.a);
                n1gVarX.p(str, sb.toString());
                ((qg5) this.c).a.c(mzjVar);
                return;
            case 4:
                break;
            case 5:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((iif) this.b).e) {
                        ((iif) this.b).a();
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((iif) this.b).e) {
                        ((iif) this.b).a();
                        throw th;
                    }
                }
            case 6:
                agb agbVar = (agb) this.c;
                String str2 = agbVar.a;
                while (agbVar.o()) {
                    try {
                        try {
                            a();
                        } catch (Exception e) {
                            gm0.V(str2, "exception in timeout handler", e);
                            agbVar.t(e, false);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException unused) {
                            gm0.W(str2, "waiting in timeout_handler was interrupted, EXIT", new Object[0]);
                            agb.b(agbVar);
                            agb.f(agbVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        agb.b(agbVar);
                        agb.f(agbVar);
                        throw th2;
                    }
                    break;
                }
                agb.b(agbVar);
                agb.f(agbVar);
                return;
            case 7:
                e89 e89Var = (e89) this.b;
                boolean zIsCancelled = e89Var.isCancelled();
                ek2 ek2Var = (ek2) this.c;
                if (zIsCancelled) {
                    ek2Var.n(null);
                    return;
                }
                while (true) {
                    try {
                        try {
                            Object obj = e89Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            ek2Var.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused2) {
                            i = 1;
                        } catch (Throwable th3) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th3;
                        }
                    } catch (ExecutionException e2) {
                        ek2Var.resumeWith(new poe(e2.getCause()));
                        return;
                    }
                }
                break;
            case 8:
                u72 u72Var = (u72) this.b;
                boolean zIsCancelled2 = u72Var.isCancelled();
                ek2 ek2Var2 = (ek2) this.c;
                if (zIsCancelled2) {
                    ek2Var2.n(null);
                    return;
                }
                try {
                    ek2Var2.resumeWith(vd7.C(u72Var));
                    return;
                } catch (ExecutionException e3) {
                    ek2Var2.resumeWith(new poe(e3.getCause()));
                    return;
                }
            default:
                synchronized (((cpl) this.c).b) {
                    try {
                        ttb ttbVar = ((cpl) this.c).c;
                        if (ttbVar != null) {
                            Exception excG = ((Task) this.b).g();
                            yab.s(excG);
                            ttbVar.onFailure(excG);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.b).run();
            } catch (Throwable th5) {
                e9i.f0(k66.a, th5);
            }
            try {
                Runnable runnableS0 = ((l19) this.c).S0();
                if (runnableS0 == null) {
                    return;
                }
                this.b = runnableS0;
                i++;
                if (i >= 16) {
                    l19 l19Var = (l19) this.c;
                    if (e9i.A0(l19Var.d, l19Var)) {
                        l19 l19Var2 = (l19) this.c;
                        e9i.z0(l19Var2.d, l19Var2, this);
                        return;
                    }
                }
            } catch (Throwable th6) {
                l19 l19Var3 = (l19) this.c;
                synchronized (l19Var3.h) {
                    l19.i.decrementAndGet(l19Var3);
                    throw th6;
                }
            }
        }
    }

    public /* synthetic */ p0(Object obj, int i, Runnable runnable) {
        this.a = i;
        this.b = obj;
        this.c = runnable;
    }

    public p0(agb agbVar) {
        this.a = 6;
        this.c = agbVar;
    }
}
