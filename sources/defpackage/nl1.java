package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nl1 {
    public final kfb a;
    public final e5d b;
    public final et3 c;
    public final svb d;
    public final ite e;
    public final String f = nl1.class.getName();
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(null);

    public nl1(kfb kfbVar, e5d e5dVar, xb9 xb9Var, svb svbVar, ite iteVar, cg9 cg9Var, eh9 eh9Var) {
        this.a = kfbVar;
        this.b = e5dVar;
        this.c = xb9Var;
        this.d = svbVar;
        this.e = iteVar;
        lq4 lq4Var = null;
        new fh9(iteVar, eh9Var, new ym0(this, lq4Var, 1)).a();
        e9i.j0(new fz6(cg9Var.stream(), new wyj(this, lq4Var, 5), 3), iteVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r13.e(r2) == r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (r13 == r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.nl1 r12, defpackage.nq4 r13) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl1.a(nl1, nq4):java.lang.Object");
    }

    public final void b() {
        lq4 lq4Var = null;
        if (this.d.b()) {
            AtomicReference atomicReference = this.h;
            sgg sggVarI0 = yab.i0(this.e, null, 0, new qn6(this, lq4Var, 8), 3);
            while (!atomicReference.compareAndSet(null, sggVarI0) && atomicReference.get() == null) {
            }
            return;
        }
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "prefetchAsync: not authorized, skip", null);
        }
    }
}
