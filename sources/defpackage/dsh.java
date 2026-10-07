package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dsh implements u0a, t0a {
    public final u0a a;
    public final long b;
    public t0a c;

    public dsh(u0a u0aVar, long j) {
        this.a = u0aVar;
        this.b = j;
    }

    @Override // defpackage.t0a
    public final void C(u0a u0aVar) {
        t0a t0aVar = this.c;
        t0aVar.getClass();
        t0aVar.C(this);
    }

    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) {
        xye[] xyeVarArr2 = new xye[xyeVarArr.length];
        int i = 0;
        while (true) {
            xye xyeVar = null;
            if (i >= xyeVarArr.length) {
                break;
            }
            csh cshVar = (csh) xyeVarArr[i];
            if (cshVar != null) {
                xyeVar = cshVar.a;
            }
            xyeVarArr2[i] = xyeVar;
            i++;
        }
        u0a u0aVar = this.a;
        long j2 = this.b;
        long jA = u0aVar.a(rg6VarArr, zArr, xyeVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < xyeVarArr.length; i2++) {
            xye xyeVar2 = xyeVarArr2[i2];
            if (xyeVar2 == null) {
                xyeVarArr[i2] = null;
            } else {
                xye xyeVar3 = xyeVarArr[i2];
                if (xyeVar3 == null || ((csh) xyeVar3).a != xyeVar2) {
                    xyeVarArr[i2] = new csh(xyeVar2, j2);
                }
            }
        }
        return jA + j2;
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        long j2 = this.b;
        return this.a.c(j - j2, ybfVar) + j2;
    }

    @Override // defpackage.vhf
    public final long e() {
        long jE = this.a.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jE + this.b;
    }

    @Override // defpackage.u0a
    public final long g(long j) {
        long j2 = this.b;
        return this.a.g(j - j2) + j2;
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.u0a
    public final List j(ArrayList arrayList) {
        return this.a.j(arrayList);
    }

    @Override // defpackage.u0a
    public final long k() {
        long jK = this.a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.b;
    }

    @Override // defpackage.u0a
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        t0a t0aVar = this.c;
        t0aVar.getClass();
        t0aVar.q(this);
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        this.c = t0aVar;
        this.a.s(this, j - this.b);
    }

    @Override // defpackage.u0a
    public final iyh t() {
        return this.a.t();
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        ea9 ea9Var = new ea9();
        long j = fa9Var.a;
        ea9Var.b = fa9Var.b;
        ea9Var.c = fa9Var.c;
        ea9Var.a = j - this.b;
        return this.a.u(new fa9(ea9Var));
    }

    @Override // defpackage.vhf
    public final long v() {
        long jV = this.a.v();
        if (jV == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jV + this.b;
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        this.a.w(j - this.b, z);
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        this.a.y(j - this.b);
    }
}
