package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes.dex */
public final class hjc {
    public final gu4 a;
    public final xhh b;
    public final long c;
    public final LongSupplier d;
    public final h7f e;
    public final h7f f;
    public final String g;
    public final ny8 h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;

    public hjc(ny8 ny8Var, gu4 gu4Var, xhh xhhVar, h7f h7fVar, h7f h7fVar2) {
        ghb ghbVar = ew5.b;
        long jO = qe7.O(6, lw5.SECONDS);
        td9 td9Var = new td9(1);
        this.a = gu4Var;
        this.b = xhhVar;
        this.c = jO;
        this.d = td9Var;
        this.e = h7fVar;
        this.f = h7fVar2;
        this.g = hjc.class.getName();
        this.h = ny8Var;
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
    }

    public static final boolean a(hjc hjcVar, long j) {
        q7a q7aVarB;
        if (j == 0) {
            hjcVar.getClass();
            return true;
        }
        r7a r7aVar = (r7a) hjcVar.i.get(Long.valueOf(j));
        if (r7aVar == null || (q7aVarB = r7aVar.b()) == null) {
            return false;
        }
        hjcVar.e(j, q7aVarB.a());
        return true;
    }

    public final void b(long j) {
        AtomicReference atomicReferenceA;
        vo8 vo8Var;
        r7a r7aVar = (r7a) this.i.remove(Long.valueOf(j));
        if (r7aVar != null && (atomicReferenceA = r7aVar.a()) != null && (vo8Var = (vo8) atomicReferenceA.getAndSet(null)) != null) {
            vo8Var.b(null);
        }
        this.j.remove(Long.valueOf(j));
    }

    public final void c(long j, long j2) {
        if (j == 0) {
            return;
        }
        this.i.compute(Long.valueOf(j), new mw1(5, new djc(j2)));
    }

    public final void d(long j, Throwable th) {
        String name = hjc.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.j(j, "handleMediaTypingError #"), th);
            }
        }
        this.i.compute(Long.valueOf(j), new mw1(4, new ejc(this, j)));
    }

    public final void e(long j, w50 w50Var) {
        if (j != 0) {
            long asLong = this.d.getAsLong();
            n9i n9iVar = (n9i) this.j.compute(Long.valueOf(j), new mw1(7, new ifa(w50Var, asLong, this, 1)));
            if (n9iVar == null || n9iVar.a() != asLong) {
                return;
            }
            pvb pvbVar = (pvb) this.h.getValue();
            pvb.s(pvbVar, new p01(2, pvbVar.u().a.g(), j, w50Var));
        }
    }

    public final void f(long j, r7a r7aVar) {
        if (j == 0) {
            return;
        }
        vo8 vo8Var = (vo8) r7aVar.a().get();
        if (vo8Var == null || !vo8Var.isActive()) {
            AtomicReference atomicReferenceA = r7aVar.a();
            sgg sggVarI0 = yab.i0(this.a, ((n0c) this.b).b(), 0, new gjc(this, j, r7aVar, (lq4) null), 2);
            sggVarI0.Y(new en3(this, j, 5));
            vo8 vo8Var2 = (vo8) atomicReferenceA.getAndSet(sggVarI0);
            if (vo8Var2 != null) {
                vo8Var2.b(null);
            }
        }
    }

    public final void g(long j, w50 w50Var, long j2) {
        vo8 vo8Var;
        if (j != 0 && ((Boolean) this.e.invoke()).booleanValue() && ((Boolean) this.f.invoke()).booleanValue()) {
            w50 w50Var2 = w50.AUDIO;
            ConcurrentHashMap concurrentHashMap = this.i;
            if (w50Var == w50Var2 || w50Var == w50.VIDEO || w50Var == w50.VIDEO_MSG || w50Var == w50.FILE) {
                concurrentHashMap.compute(Long.valueOf(j), new mw1(6, new fjc(w50Var, j2, this, j)));
                return;
            }
            r7a r7aVar = (r7a) concurrentHashMap.get(Long.valueOf(j));
            if (r7aVar == null || r7aVar.c() || r7aVar.a().get() == null || !((vo8Var = (vo8) r7aVar.a().get()) == null || vo8Var.isActive())) {
                e(j, w50Var);
            }
        }
    }
}
