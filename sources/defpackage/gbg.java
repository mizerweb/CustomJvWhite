package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class gbg implements baa {
    public final long a;
    public final p63 b;
    public final xhh c;
    public final baa d;
    public final int e;
    public final long f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final AtomicInteger j;
    public final mjg k;
    public final dq4 l;
    public final mjg m;
    public final r8e n;
    public final String o;
    public final r8e p;

    public gbg(long j, p63 p63Var, et3 et3Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, xhh xhhVar, ny8 ny8Var4, bw0 bw0Var, int i) {
        this.a = j;
        this.b = p63Var;
        this.c = xhhVar;
        this.d = bw0Var;
        this.e = i;
        this.f = ((s7f) et3Var).t();
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.j = atomicInteger;
        mjg mjgVarA = p90.a(Integer.valueOf(atomicInteger.get()));
        this.k = mjgVarA;
        n0c n0cVar = (n0c) xhhVar;
        dq4 dq4VarA = cqk.a(n0cVar.a());
        this.l = dq4VarA;
        mjg mjgVarA2 = p90.a(null);
        this.m = mjgVarA2;
        mjg mjgVarA3 = p90.a(null);
        this.n = new r8e(mjgVarA3);
        String name = gbg.class.getName();
        this.o = name;
        this.p = e9i.G0(e9i.M0(mjgVarA, new rgi((lq4) null, this, 12)), dq4VarA, j0g.a, r66.a);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, nbh.s(j, "Init small members loader chat(localId = ", ")"), null);
            }
        }
        yab.i0(dq4VarA, null, 0, new xra(18, (lq4) null, (Object) ny8Var, (Object) this, (Object) ny8Var4, false), 3);
        e9i.j0(e9i.T(new fz6(new q0d(e9i.I(e9i.F(mjgVarA2, 200L)), this, 20), new rea(2, mjgVarA3, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 3), n0cVar.b()), dq4VarA);
    }

    @Override // defpackage.baa
    public final boolean a() {
        return false;
    }

    @Override // defpackage.baa
    public final r8e b() {
        return this.p;
    }

    @Override // defpackage.baa
    public final xx6 c() {
        return this.n;
    }

    @Override // defpackage.baa
    public final void cancel() {
        String str = this.o;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "reset loader", null);
            }
        }
        this.j.set(0);
        baa baaVar = this.d;
        if (baaVar != null) {
            baaVar.cancel();
        }
        vd7.d(this.l.a);
    }

    @Override // defpackage.baa
    public final void d() {
        g();
    }

    @Override // defpackage.baa
    public final void e(String str) {
        String str2 = this.o;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, zo5.s("search. Has query = ", true ^ (str == null || str.length() == 0)), null);
            }
        }
        this.m.setValue(str);
    }

    @Override // defpackage.baa
    public final void g() {
        String str = this.o;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.n(this.k.getValue(), "loadNext with trigger = "), null);
            }
        }
        mjg mjgVar = this.k;
        Integer numValueOf = Integer.valueOf(this.j.incrementAndGet());
        mjgVar.getClass();
        mjgVar.j(null, numValueOf);
    }
}
