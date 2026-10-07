package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class bib {
    public static final /* synthetic */ zv8[] i;
    public final gu4 a;
    public final ny8 b;
    public sgg c;
    public ai8 d;
    public final m8b e = new m8b();
    public final ReentrantLock f = new ReentrantLock();
    public final p3c g = qyj.S();
    public long h;

    static {
        z8b z8bVar = new z8b(bib.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
    }

    public bib(gu4 gu4Var, ny8 ny8Var) {
        this.a = gu4Var;
        this.b = ny8Var;
        ghb ghbVar = ew5.b;
        this.h = 0L;
        a();
        this.c = yab.i0(gu4Var, null, 0, new ai8(this, null, 8), 3);
    }

    public final void a() {
        sgg sggVar = this.c;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.c = null;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.e.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        m8b m8bVar = this.e;
        if (e()) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                if (m8bVar.d < d()) {
                    return;
                }
                ghb ghbVar = ew5.b;
                long jP = qe7.P(System.nanoTime(), lw5.NANOSECONDS);
                if (ew5.d(ew5.o(jP, this.h), c()) <= 0) {
                    return;
                }
                this.h = jP;
                m8b m8bVarR = rx8.r(m8bVar);
                m8bVar.c();
                this.g.B(this, i[0], yab.i0(this.a, null, 2, new awa(this, m8bVarR, (lq4) null, 8), 1));
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final long c() {
        ghb ghbVar = ew5.b;
        return qe7.P(((Number) ((zed) this.b.getValue()).b.b().a.E0.a(e5d.S6[81]).i()).longValue(), lw5.MILLISECONDS);
    }

    public final int d() {
        return ((Number) ((zed) this.b.getValue()).b.b().a.D0.a(e5d.S6[80]).i()).intValue();
    }

    public final boolean e() {
        long jC = c();
        ghb ghbVar = ew5.b;
        return ew5.d(jC, 0L) > 0 && d() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(m8b m8bVar, nq4 nq4Var) {
        cib cibVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof cib) {
            cibVar = (cib) nq4Var;
            int i2 = cibVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cibVar.f = i2 - Integer.MIN_VALUE;
            } else {
                cibVar = new cib(this, nq4Var);
            }
        } else {
            cibVar = new cib(this, nq4Var);
        }
        Object obj = cibVar.d;
        hu4 hu4Var = hu4.a;
        int i3 = cibVar.f;
        lq4 lq4Var = null;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            String name = bib.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "request ids ".concat(m8b.k(m8bVar, 31)), null);
                }
            }
            if (m8bVar.i()) {
                gm0.Y(bib.class.getName(), "Early return in request cuz of ids.isEmpty()");
                return sbiVar;
            }
            ai8 ai8Var = this.d;
            if (ai8Var != null) {
                cibVar.f = 1;
                if (ai8Var.invoke(m8bVar, cibVar) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        } catch (Error e) {
            throw e;
        } catch (Throwable th) {
            a();
            if (!(th instanceof CancellationException)) {
                a();
                this.c = yab.i0(this.a, null, 0, new ai8(this, lq4Var, 8), 3);
                return sbiVar;
            }
        }
    }
}
