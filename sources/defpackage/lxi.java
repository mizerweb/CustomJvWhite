package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class lxi {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();
    public final pzf c;
    public final ny8 d;
    public final fz6 e;

    public lxi(ny8 ny8Var) {
        int i = 2;
        pzf pzfVarA = e9i.a(1, 1, 2);
        this.c = pzfVarA;
        this.d = ny8Var;
        int i2 = 3;
        lq4 lq4Var = null;
        this.e = new fz6(new doh(new r07(pzfVarA, new yh1(e9i.M0(((b95) ny8Var.getValue()).i, new sh1(i2, lq4Var, 16)), i), new rx1(i2, lq4Var, 5), 0), 1), new c9(i, lq4Var, 26), i2);
    }

    public final void a(View view, p4j p4jVar) {
        je9 je9Var = je9.d;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = this.b;
            go5 go5Var = (!view.isAttachedToWindow() || p4jVar == null || !p4jVar.a || view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) ? null : new go5(p4jVar.b, view.getMeasuredWidth(), view.getMeasuredHeight());
            if (go5Var == null) {
                boolean zC = c(view);
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallVideoDisplayLayoutUpdater", hashCode() + " display layout " + view.hashCode() + " is empty, skip. old value from cache was removed = " + zC + ". total = " + this.b.size(), null);
                }
                reentrantLock.unlock();
                return;
            }
            if (cqk.d(linkedHashMap.get(view), go5Var)) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "CallVideoDisplayLayoutUpdater", hashCode() + " display layout " + view.hashCode() + ", already added with params = " + go5Var + ", simple update. total = " + this.b.size(), null);
                }
                this.c.a(linkedHashMap);
                reentrantLock.unlock();
                return;
            }
            ul9 ul9Var = new ul9();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!cqk.d(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ul9Var.putAll(linkedHashMap2);
            ul9Var.put(view, go5Var);
            ul9 ul9VarB = ul9Var.b();
            this.b.clear();
            this.b.putAll(ul9VarB);
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallVideoDisplayLayoutUpdater", hashCode() + " add display layout " + view.hashCode() + ", params = " + go5Var + ", total = " + this.b.size(), null);
            }
            this.c.a(ul9VarB);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallVideoDisplayLayoutUpdater", hashCode() + " clear cached states", null);
            }
        }
        this.b.clear();
        this.c.a(s66.a);
    }

    public final boolean c(View view) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = this.b;
            if (!linkedHashMap.containsKey(view)) {
                return false;
            }
            ul9 ul9Var = new ul9();
            ul9Var.clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object value = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (cqk.d(entry.getKey(), view)) {
                    value = entry.getValue();
                }
                if (!cqk.d(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ul9Var.putAll(linkedHashMap2);
            ul9 ul9VarB = ul9Var.b();
            this.b.clear();
            this.b.putAll(ul9VarB);
            this.c.a(ul9VarB);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallVideoDisplayLayoutUpdater", hashCode() + " remove display layout participantId=" + value + " for " + view.hashCode() + ", total = " + this.b.size(), null);
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
