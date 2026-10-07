package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class yg2 {
    public final Executor a;
    public final us7 b;
    public ScheduledFuture e;
    public jj0 f;
    public dh2 g;
    public x70 h;
    public n11 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final xg2 j = new xg2(0, this);
    public volatile List k = r66.a;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public yg2(Executor executor, us7 us7Var) {
        this.a = executor;
        this.b = us7Var;
    }

    public final void a(String str) {
        dh2 dh2Var = this.g;
        if (dh2Var == null) {
            return;
        }
        try {
            e(dh2Var.b(str).j());
        } catch (IllegalArgumentException unused) {
            tvj.g("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        int i = 5;
        CopyOnWriteArrayList<wg2> copyOnWriteArrayList = this.n;
        if (!zIsEmpty) {
            tvj.e("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            for (wg2 wg2Var : copyOnWriteArrayList) {
                wg2Var.b.execute(new ff(wg2Var, i, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        tvj.e("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        for (wg2 wg2Var2 : copyOnWriteArrayList) {
            wg2Var2.b.execute(new f92(wg2Var2, i, set2));
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            srb srbVar = (srb) this.o.remove(str);
            dh2 dh2Var = this.g;
            if (srbVar != null && dh2Var != null) {
                try {
                    zjl.d().execute(new f92(dh2Var.b(str), 6, srbVar));
                    tvj.a("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i, List list) {
        if (i > 0 && this.l.get()) {
            this.e = this.b.schedule(new ug2(this, list, i, 1), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            tvj.g("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void e(nf2 nf2Var) {
        final String strG = nf2Var.g();
        if (this.l.get()) {
            synchronized (this.c) {
                if (this.o.containsKey(strG)) {
                    return;
                }
                srb srbVar = new srb() { // from class: vg2
                    @Override // defpackage.srb
                    public final void a(Object obj) {
                        wg0 wg0Var = (wg0) obj;
                        yg2 yg2Var = this.a;
                        if (!yg2Var.l.get()) {
                            tvj.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                            return;
                        }
                        if (wg0Var.b != null) {
                            StringBuilder sbV = qt4.v("Camera ", strG, " state changed to ");
                            sbV.append(wg0Var.a);
                            sbV.append(" with error: ");
                            xg0 xg0Var = wg0Var.b;
                            sbV.append(xg0Var != null ? Integer.valueOf(xg0Var.a) : null);
                            sbV.append(". Triggering refresh.");
                            tvj.g("CameraPresencePrvdr", sbV.toString());
                            yg2Var.a.execute(new tg2(yg2Var, 2));
                        }
                    }
                };
                zjl.d().execute(new f92(nf2Var, 7, srbVar));
                this.o.put(strG, srbVar);
                tvj.a("CameraPresencePrvdr", "Registered state observer for camera: ".concat(strG));
            }
        }
    }

    public final void f() {
        if (!this.l.getAndSet(false)) {
            tvj.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        tvj.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.d) {
            try {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        x70 x70Var = this.h;
        if (x70Var != null) {
            x70Var.j(this.j);
        }
        synchronized (this.c) {
            if (!this.o.isEmpty()) {
                Map mapX0 = wm9.X0(this.o);
                this.o.clear();
                dh2 dh2Var = this.g;
                if (dh2Var != null) {
                    LinkedHashSet<pf2> linkedHashSetC = dh2Var.c();
                    ArrayList arrayList = new ArrayList();
                    for (pf2 pf2Var : linkedHashSetC) {
                        nf2 nf2VarJ = pf2Var != null ? pf2Var.j() : null;
                        if (nf2VarJ != null) {
                            arrayList.add(nf2VarJ);
                        }
                    }
                    tvj.a("CameraPresencePrvdr", "Clearing all " + mapX0.size() + " state observers.");
                    for (Map.Entry entry : mapX0.entrySet()) {
                        zjl.d().execute(new i0(arrayList, (srb) entry.getValue(), (String) entry.getKey(), 13));
                    }
                }
            }
        }
        this.i = null;
        this.m.clear();
        this.n.clear();
        this.k = r66.a;
        this.f = null;
        this.g = null;
    }

    public final void g(n11 n11Var, jj0 jj0Var, dh2 dh2Var) {
        if (this.l.compareAndSet(false, true)) {
            tvj.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.i = n11Var;
            Set setD = jj0Var.d();
            ArrayList arrayList = new ArrayList(yw3.W0(setD, 10));
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(ejl.a((String) it.next(), null, null));
            }
            this.k = arrayList;
            this.f = jj0Var;
            this.g = dh2Var;
            this.h = (x70) jj0Var.f;
            this.a.execute(new tg2(this, 0));
            x70 x70Var = this.h;
            if (x70Var != null) {
                x70Var.n(new eif(this.a), this.j);
            }
        }
    }
}
