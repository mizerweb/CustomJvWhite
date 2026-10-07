package defpackage;

import android.os.SystemClock;
import java.util.Set;
import one.video.exo.error.OneVideoExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class zjg implements u66 {
    public final /* synthetic */ ivb a;

    public zjg(ivb ivbVar) {
        this.a = ivbVar;
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void b(aec aecVar) {
        ivb ivbVar = this.a;
        h4d h4dVar = ivbVar.c;
        if (h4dVar == null || !((Set) ivbVar.f.a).add(iw6.a)) {
            return;
        }
        kvb.i(h4dVar, new lk8(aecVar, null, null), SystemClock.elapsedRealtime() - h4dVar.a());
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void e(aec aecVar) {
        ivb ivbVar = this.a;
        if (ivbVar.c != null) {
            if (ivbVar.i) {
                ivbVar.e = SystemClock.elapsedRealtime();
            } else {
                ivbVar.e = -1L;
                ivbVar.i = true;
            }
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void f(ldc ldcVar, t4j t4jVar) {
        h4d h4dVar = this.a.c;
        if (h4dVar != null) {
            kvb.e(h4dVar, new lk8(ldcVar, null, null), t4jVar);
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void i(wdc wdcVar, aec aecVar, p4d p4dVar, p4d p4dVar2) {
        ivb ivbVar = this.a;
        p35 p35Var = ivbVar.h;
        p35Var.b();
        ivbVar.c(aecVar);
        p35Var.a(p4dVar2.b());
        ivbVar.c(aecVar);
        h4d h4dVarD = null;
        if (p4dVar.a() == p4dVar2.a()) {
            if (wdcVar == wdc.b || wdcVar == wdc.a) {
                h4d h4dVar = ivbVar.d;
                if (h4dVar != null) {
                    String strB = h4dVar.b();
                    h4d h4dVar2 = ivbVar.c;
                    if (!cqk.d(strB, h4dVar2 != null ? h4dVar2.b() : null)) {
                        ivb.b(ivbVar, aecVar);
                    }
                }
                h4d h4dVar3 = ivbVar.c;
                if (h4dVar3 != null) {
                    kvb.n(h4dVar3, new lk8(aecVar, null, null), p4dVar2.b());
                }
                ivb.a(ivbVar, aecVar);
                ivbVar.i = false;
                return;
            }
            return;
        }
        h4d h4dVar4 = ivbVar.d;
        if (h4dVar4 == null) {
            h4d h4dVar5 = ivbVar.c;
            if (h4dVar5 != null) {
                h4dVarD = h4dVar5.d();
            }
        } else {
            h4dVarD = h4dVar4;
        }
        if (h4dVarD != null) {
            a5d a5dVar = ivbVar.n;
            boolean z = nec.a;
            h4dVarD.toString();
            if (a5dVar != null) {
                a5dVar.invoke();
            }
            ivbVar.d = h4dVarD;
        }
        ivb.b(ivbVar, aecVar);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void k(aec aecVar) {
        ivb ivbVar = this.a;
        ivb.a(ivbVar, aecVar);
        h4d h4dVar = ivbVar.c;
        if (h4dVar == null || !((Set) ivbVar.f.a).add(iw6.c)) {
            return;
        }
        kvb.m(h4dVar, new lk8(aecVar, null, null), SystemClock.elapsedRealtime() - h4dVar.a());
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void l(aec aecVar) {
        ivb ivbVar = this.a;
        ivbVar.d(aecVar);
        h4d h4dVar = ivbVar.c;
        if (h4dVar != null) {
            kvb.o(h4dVar, new lk8(aecVar, null, null));
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void m(aec aecVar, boolean z) {
        ivb ivbVar = this.a;
        p35 p35Var = ivbVar.h;
        h4d h4dVar = ivbVar.c;
        if (h4dVar != null) {
            if (!z) {
                p35Var.b();
                ivbVar.c(aecVar);
            } else {
                if (((Set) ivbVar.f.a).add(iw6.b)) {
                    kvb.j(h4dVar, new lk8(aecVar, null, null), SystemClock.elapsedRealtime() - h4dVar.a());
                }
                p35Var.a(((ldc) aecVar).y());
            }
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void o(ldc ldcVar) {
        ivb.b(this.a, ldcVar);
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void p(aec aecVar) {
        h4d h4dVar = this.a.c;
        if (h4dVar != null) {
            kvb.h(h4dVar, new lk8(aecVar, null, null), SystemClock.elapsedRealtime() - h4dVar.a());
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void q(OneVideoExoPlaybackException oneVideoExoPlaybackException, m4j m4jVar, aec aecVar) {
        h4d h4dVar = ((ivb) this.a.a.b).c;
        if (h4dVar != null) {
            kvb.g(h4dVar, new lk8(aecVar, null, null), oneVideoExoPlaybackException);
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void u(ldc ldcVar, t4j t4jVar) {
        boolean z = nec.a;
        ivb ivbVar = this.a;
        ivb.a(ivbVar, ldcVar);
        ivbVar.i = false;
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void y(aec aecVar) {
        h4d h4dVar = this.a.c;
        if (h4dVar != null) {
            kvb.k(h4dVar, new lk8(aecVar, null, null), ((ldc) aecVar).y() / 1000);
        }
    }
}
