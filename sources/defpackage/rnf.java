package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class rnf implements onf {
    public final gue a;
    public final ed6 b;
    public final rg9 c;
    public final ic1 d;
    public final long e;
    public final String f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ArrayList j;
    public final Object k;
    public final ArrayList l;
    public final CopyOnWriteArraySet m;
    public final String[] n;
    public final String[] o;
    public final Handler p;
    public volatile int q;
    public final mjg r;
    public final r8e s;
    public volatile int t;
    public final e8b u;
    public final pfh v;
    public e2 w;

    public rnf(gue gueVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ed6 ed6Var, rg9 rg9Var, ic1 ic1Var, boolean z) {
        ghb ghbVar = ew5.b;
        long jO = qe7.O(5, lw5.MINUTES);
        this.a = gueVar;
        this.b = ed6Var;
        this.c = rg9Var;
        this.d = ic1Var;
        this.e = jO;
        String name = rnf.class.getName();
        this.f = name;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = new ArrayList(4);
        this.k = z ? new rfe() : new ReentrantLock();
        this.l = new ArrayList(1);
        this.m = new CopyOnWriteArraySet();
        this.n = new String[]{"no_net", "disconnected", "connected", "logged_in"};
        this.o = new String[]{"disconnected", "connected", "logged_in"};
        mjg mjgVarA = p90.a(Integer.valueOf(this.q));
        this.r = mjgVarA;
        this.s = new r8e(mjgVarA);
        this.u = new e8b(kfc.Z3.getSize());
        this.v = new pfh(0);
        HandlerThread handlerThread = new HandlerThread("session-state");
        handlerThread.start();
        this.p = new Handler(handlerThread.getLooper(), new q89(2, this));
        ((wd4) ny8Var.getValue()).f(new vcb(1, this));
        gueVar.c(new pu(3, this));
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "ctor, " + this, null);
        }
    }

    public final void b(String str, om5 om5Var) {
        String str2 = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "onDisconnected for sessionId=" + str + " with reason=" + om5Var, null);
            }
        }
        this.p.obtainMessage(0, new qnf(str, om5Var)).sendToTarget();
    }

    public final void c(nnf nnfVar) {
        f(new hd4(this, nnfVar, true, 1));
        this.p.obtainMessage(10).sendToTarget();
    }

    public final void d(nnf nnfVar) {
        f(new hd4(this, nnfVar, false, 1));
        this.p.obtainMessage(11).sendToTarget();
    }

    public final void e() {
        int i;
        int i2 = 0;
        if (((wd4) this.g.getValue()).h()) {
            i = 1;
            if (this.t != 0) {
                if (this.t == 1) {
                    i = 2;
                } else {
                    if (this.t != 2) {
                        ore.k(nbh.q(this.t, "Unknown connection status="));
                        return;
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        if (i != this.q) {
            this.q = i;
            String str = this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "updateState, " + this, null);
                }
            }
            while (i2 < this.j.size()) {
                int i3 = i2 + 1;
                nnf nnfVar = (nnf) this.j.get(i2);
                sfe sfeVar = new sfe();
                f(new z5(this, nnfVar, sfeVar, 11));
                if (!sfeVar.a) {
                    nnfVar.b(this.q);
                }
                i2 = i3;
            }
            mjg mjgVar = this.r;
            Integer numValueOf = Integer.valueOf(this.q);
            mjgVar.getClass();
            mjgVar.j(null, numValueOf);
            String str2 = this.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.c;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, qv1.k("notifyListeners, sent ", this.n[this.q]), null);
            }
        }
    }

    public final void f(af7 af7Var) {
        Object obj = this.k;
        if (obj instanceof rfe) {
            ((rfe) obj).a(af7Var);
            return;
        }
        if (!(obj instanceof ReentrantLock)) {
            ore.k("Unexpected lock type");
            return;
        }
        Lock lock = (Lock) obj;
        lock.lock();
        try {
            af7Var.invoke();
        } finally {
            lock.unlock();
        }
    }

    public final String toString() {
        return "SessionStateInfoImpl@" + Integer.toHexString(hashCode()) + "(connStatus=" + this.o[this.t] + ") -> " + this.n[this.q];
    }
}
