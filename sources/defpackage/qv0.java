package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class qv0 extends qbb {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv0(ny8 ny8Var, int i) {
        super(ny8Var);
        this.b = i;
    }

    @Override // defpackage.qbb
    public final Object a(kcg kcgVar) {
        switch (this.b) {
            case 0:
                ckg ckgVarA = ckg.a(kcgVar.b());
                return new ov0(kcgVar.c(), ckgVarA.a, ckgVarA.b, ckgVarA.c, ckgVarA.d, ckgVarA.e, ckgVarA.m, ckgVarA.f, ckgVarA.g, ckgVarA.h, ckgVarA.i, ckgVarA.j, ckgVarA.k, ckgVarA.p, ckgVarA.q, ckgVarA.l, ckgVarA.n, ckgVarA.o);
            default:
                dkg dkgVarA = dkg.a(kcgVar.b());
                return new pba(kcgVar.c(), fsk.b(dkgVarA.a), new nba(dkgVarA.b, dkgVarA.c, dkgVarA.d, dkgVarA.e, dkgVarA.f, dkgVarA.g, dkgVarA.h, dkgVarA.i, dkgVarA.j), dkgVarA.k, dkgVarA.l, dkgVarA.m, dkgVarA.p, dkgVarA.q, a.n1(dkgVarA.n), dkgVarA.o, dkgVarA.r, dkgVarA.s, dkgVarA.t);
        }
    }

    @Override // defpackage.qbb
    public final jcg c() {
        switch (this.b) {
            case 0:
                return jcg.BATTERY;
            default:
                return jcg.MEMORY;
        }
    }

    @Override // defpackage.qbb
    public final kcg i(Object obj) {
        switch (this.b) {
            case 0:
                ov0 ov0Var = (ov0) obj;
                long jK = ov0Var.k();
                ckg ckgVar = new ckg();
                ckgVar.a = ov0Var.p();
                ckgVar.b = ov0Var.l();
                ckgVar.c = ov0Var.c();
                ckgVar.d = ov0Var.b();
                ckgVar.e = ov0Var.a();
                ckgVar.m = ov0Var.m();
                ckgVar.f = ov0Var.e();
                ckgVar.g = ov0Var.f();
                ckgVar.h = ov0Var.d();
                ckgVar.i = ov0Var.h();
                ckgVar.j = ov0Var.i();
                ckgVar.k = ov0Var.g();
                ckgVar.p = ov0Var.n();
                ckgVar.q = ov0Var.o();
                ckgVar.n = ov0Var.r();
                ckgVar.o = ov0Var.q();
                ckgVar.l = ov0Var.j();
                return new kcg(jK, sia.toByteArray(ckgVar), jcg.BATTERY);
            default:
                pba pbaVar = (pba) obj;
                long jK2 = pbaVar.k();
                dkg dkgVar = new dkg();
                dkgVar.a = pbaVar.h().a();
                dkgVar.b = pbaVar.g().c();
                dkgVar.c = pbaVar.g().d();
                dkgVar.d = pbaVar.g().a();
                dkgVar.e = pbaVar.g().f();
                dkgVar.f = pbaVar.g().b();
                dkgVar.g = pbaVar.g().e();
                dkgVar.h = pbaVar.g().h();
                dkgVar.i = pbaVar.g().g();
                dkgVar.j = pbaVar.g().i();
                dkgVar.k = pbaVar.l();
                dkgVar.l = pbaVar.m();
                dkgVar.m = pbaVar.a();
                dkgVar.n = (String[]) pbaVar.b().toArray(new String[0]);
                dkgVar.o = pbaVar.f();
                dkgVar.p = pbaVar.i();
                dkgVar.q = pbaVar.j();
                dkgVar.r = pbaVar.d();
                dkgVar.s = pbaVar.e();
                dkgVar.t = pbaVar.c();
                return new kcg(jK2, sia.toByteArray(dkgVar), jcg.MEMORY);
        }
    }
}
