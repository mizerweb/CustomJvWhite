package defpackage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class id4 {
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public Object h;
    public Object i;
    public Object j;
    public Comparable k;

    public id4(hcb hcbVar, pfh pfhVar, long j, long j2, long j3, boolean z) {
        this.h = hcbVar;
        this.i = pfhVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.j = z ? new rfe() : new ReentrantLock();
        this.f = hcbVar.a.e();
        this.k = pfhVar.a();
        ghb ghbVar = ew5.b;
        this.e = 0L;
    }

    public boolean a() {
        if (this.f == ((hcb) this.h).a.e()) {
            return false;
        }
        this.f = ((hcb) this.h).a.e();
        int i = this.g;
        long j = this.e;
        this.g = 0;
        ghb ghbVar = ew5.b;
        this.e = 0L;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return true;
        }
        je9 je9Var = je9.c;
        if (!a4cVar.b(je9Var)) {
            return true;
        }
        String strT = ew5.t(j);
        StringBuilder sb = new StringBuilder("maybeInvalidate, invalidated ");
        sb.append(this);
        sb.append(", old=(e=");
        sb.append(i);
        sb.append("|b=");
        a4cVar.c(je9Var, "ConnectionBackoff", zo5.w(sb, strT, ")"), null);
        return true;
    }

    public void b() {
        d(new pe3(9, this));
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "ConnectionBackoff", "onConnectionFailure, " + this, null);
        }
    }

    public void c() {
        d(new d2(11, this));
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.c;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "ConnectionBackoff", "onConnectionSuccessful, " + this, null);
        }
    }

    public void d(af7 af7Var) {
        Object obj = this.j;
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

    public String toString() {
        switch (this.a) {
            case 0:
                boolean z = this.f;
                int i = this.g;
                String strT = ew5.t(this.e);
                StringBuilder sb = new StringBuilder("ConnectionBackoff(f=");
                sb.append(z);
                sb.append("|e=");
                sb.append(i);
                sb.append("|b=");
                return zo5.w(sb, strT, ")");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ id4() {
    }
}
