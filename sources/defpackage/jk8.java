package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jk8 implements gme, pjd {
    public final hme a;
    public final ka7 b;
    public final hme c;
    public final gme d;

    public jk8(la7 la7Var, ka7 ka7Var) {
        this.a = la7Var;
        this.b = ka7Var;
        this.c = la7Var;
        this.d = ka7Var;
    }

    @Override // defpackage.pjd
    public final void a(es0 es0Var, String str) {
        hme hmeVar = this.a;
        if (hmeVar != null) {
            hmeVar.b(es0Var.b, str);
        }
        ka7 ka7Var = this.b;
        if (ka7Var != null) {
            ka7Var.a(es0Var, str);
        }
    }

    @Override // defpackage.pjd
    public final void b(es0 es0Var, String str, Throwable th, Map map) {
        hme hmeVar = this.a;
        if (hmeVar != null) {
            hmeVar.e(es0Var.b, str, th, map);
        }
        ka7 ka7Var = this.b;
        if (ka7Var != null) {
            ka7Var.b(es0Var, str, th, map);
        }
    }

    @Override // defpackage.pjd
    public final boolean c(es0 es0Var, String str) {
        hme hmeVar = this.a;
        Boolean boolValueOf = hmeVar != null ? Boolean.valueOf(hmeVar.c(es0Var.b)) : null;
        if (!cqk.d(boolValueOf, Boolean.TRUE)) {
            ka7 ka7Var = this.b;
            boolValueOf = ka7Var != null ? Boolean.valueOf(ka7Var.c(es0Var, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // defpackage.pjd
    public final void d(es0 es0Var, String str, Map map) {
        hme hmeVar = this.a;
        if (hmeVar != null) {
            hmeVar.d(es0Var.b, str, map);
        }
        ka7 ka7Var = this.b;
        if (ka7Var != null) {
            ka7Var.d(es0Var, str, map);
        }
    }

    @Override // defpackage.pjd
    public final void e(es0 es0Var, String str, boolean z) {
        hme hmeVar = this.a;
        if (hmeVar != null) {
            hmeVar.i(es0Var.b, str, z);
        }
        ka7 ka7Var = this.b;
        if (ka7Var != null) {
            ka7Var.e(es0Var, str, z);
        }
    }

    @Override // defpackage.gme
    public final void f(es0 es0Var) {
        hme hmeVar = this.c;
        if (hmeVar != null) {
            hmeVar.k(es0Var.b);
        }
        gme gmeVar = this.d;
        if (gmeVar != null) {
            gmeVar.f(es0Var);
        }
    }

    @Override // defpackage.pjd
    public final void g(es0 es0Var) {
        hme hmeVar = this.a;
        if (hmeVar != null) {
            hmeVar.j(es0Var.b);
        }
        ka7 ka7Var = this.b;
        if (ka7Var != null) {
            ka7Var.g(es0Var);
        }
    }

    @Override // defpackage.gme
    public final void h(oof oofVar) {
        hme hmeVar = this.c;
        if (hmeVar != null) {
            hmeVar.f(oofVar.a, oofVar.d, oofVar.b, oofVar.g());
        }
        gme gmeVar = this.d;
        if (gmeVar != null) {
            gmeVar.h(oofVar);
        }
    }

    @Override // defpackage.gme
    public final void i(es0 es0Var) {
        hme hmeVar = this.c;
        if (hmeVar != null) {
            hmeVar.a(es0Var.a, es0Var.b, es0Var.g());
        }
        gme gmeVar = this.d;
        if (gmeVar != null) {
            gmeVar.i(es0Var);
        }
    }

    @Override // defpackage.pjd
    public final void j(es0 es0Var, String str) {
        hme hmeVar = this.a;
        if (hmeVar != null) {
            hmeVar.h(es0Var.b, str);
        }
        ka7 ka7Var = this.b;
        if (ka7Var != null) {
            ka7Var.j(es0Var, str);
        }
    }

    @Override // defpackage.gme
    public final void k(es0 es0Var, Throwable th) {
        hme hmeVar = this.c;
        if (hmeVar != null) {
            hmeVar.g(es0Var.a, es0Var.b, th, es0Var.g());
        }
        gme gmeVar = this.d;
        if (gmeVar != null) {
            gmeVar.k(es0Var, th);
        }
    }
}
