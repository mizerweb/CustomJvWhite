package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jdc implements xf {
    public final /* synthetic */ ldc a;

    public jdc(ldc ldcVar) {
        this.a = ldcVar;
    }

    @Override // defpackage.xf
    public final void D0(wf wfVar, t55 t55Var) {
    }

    @Override // defpackage.xf
    public final void I0(wf wfVar, int i, long j, long j2) {
        ldc ldcVar = this.a;
        ldcVar.n.a(ldcVar, i, j, j2);
    }

    @Override // defpackage.xf
    public final void J0(wf wfVar, int i, long j, long j2) {
        ldc ldcVar = this.a;
        ldcVar.n.b(ldcVar, i, j, j2);
    }

    @Override // defpackage.xf
    public final void P0(wf wfVar, b87 b87Var, w55 w55Var) {
        int iH = uya.h(b87Var.n);
        ldc ldcVar = this.a;
        ldcVar.n.h(ldcVar, srk.c(iH, b87Var), w55Var != null ? yql.b(w55Var, iH) : null);
    }

    @Override // defpackage.xf
    public final void R(wf wfVar, t55 t55Var) {
    }

    @Override // defpackage.xf
    public final void R0(wf wfVar, String str) {
        this.a.i = str;
    }

    @Override // defpackage.xf
    public final void c0(t99 t99Var, uz9 uz9Var) {
        b87 b87Var = uz9Var.c;
        int i = uz9Var.b;
        ux9 ux9VarB = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && b87Var != null) {
                    ux9VarB = srk.d(b87Var);
                }
            } else if (b87Var != null) {
                ux9VarB = srk.e(b87Var);
            }
        } else if (b87Var != null) {
            ux9VarB = srk.b(b87Var);
        }
        ldc ldcVar = this.a;
        q97 q97Var = ldcVar.n;
        fdc fdcVarB = gql.b(t99Var.a);
        HashMap map = e35.a;
        q97Var.e(ldcVar, fdcVarB, e35.a(uz9Var.a), ux9VarB);
    }

    @Override // defpackage.xf
    public final void d0(wf wfVar, String str) {
        this.a.j = null;
    }

    @Override // defpackage.xf
    public final void f0(wf wfVar, String str) {
        this.a.j = str;
    }

    @Override // defpackage.xf
    public final void i(int i, long j) {
        ldc ldcVar = this.a;
        ldcVar.n.g(ldcVar, j, i);
    }

    @Override // defpackage.xf
    public final void p0(t99 t99Var, uz9 uz9Var) {
        long j = t99Var.f;
        ldc ldcVar = this.a;
        q97 q97Var = ldcVar.n;
        a35 a35Var = t99Var.a;
        fdc fdcVarB = gql.b(a35Var);
        long j2 = t99Var.f;
        long j3 = t99Var.e;
        HashMap map = e35.a;
        q97Var.c(ldcVar, fdcVarB, j2, j3, e35.a(uz9Var.a));
        int i = uz9Var.b;
        if (i == 2) {
            ldcVar.T = j;
        } else if (i == 1) {
            ldcVar.U = j;
        }
        ldcVar.S = uz9Var.g - uz9Var.f;
        ldcVar.R = a35Var.a.getHost();
    }

    @Override // defpackage.xf
    public final void r(wf wfVar, k3d k3dVar, k3d k3dVar2, int i) {
        ldc ldcVar = this.a;
        ldcVar.n.f(pm5.a(i), ldcVar, ldc.v(ldcVar, k3dVar), ldc.v(ldcVar, k3dVar2));
    }

    @Override // defpackage.xf
    public final void u(wf wfVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        ldc ldcVar = this.a;
        q97 q97Var = ldcVar.n;
        fdc fdcVarB = gql.b(t99Var.a);
        HashMap map = e35.a;
        q97Var.d(ldcVar, fdcVarB, e35.a(uz9Var.a), iOException);
    }

    @Override // defpackage.xf
    public final void z0(wf wfVar, String str) {
        this.a.i = null;
    }
}
