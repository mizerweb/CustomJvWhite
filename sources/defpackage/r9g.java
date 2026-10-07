package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r9g implements u0a, w99 {
    public final a35 a;
    public final s25 b;
    public final v1i c;
    public final l6m d;
    public final ed7 e;
    public final iyh f;
    public final ArrayList g = new ArrayList();
    public final long h;
    public final dc9 i;
    public final b87 j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;

    public r9g(a35 a35Var, s25 s25Var, v1i v1iVar, b87 b87Var, long j, l6m l6mVar, ed7 ed7Var, boolean z, she sheVar) {
        this.a = a35Var;
        this.b = s25Var;
        this.c = v1iVar;
        this.j = b87Var;
        this.h = j;
        this.d = l6mVar;
        this.e = ed7Var;
        this.k = z;
        this.f = new iyh(new hyh("", b87Var));
        this.i = sheVar != null ? new dc9(sheVar) : new dc9("SingleSampleMediaPeriod", 1);
    }

    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < rg6VarArr.length; i++) {
            xye xyeVar = xyeVarArr[i];
            ArrayList arrayList = this.g;
            if (xyeVar != null && (rg6VarArr[i] == null || !zArr[i])) {
                arrayList.remove(xyeVar);
                xyeVarArr[i] = null;
            }
            if (xyeVarArr[i] == null && rg6VarArr[i] != null) {
                p9g p9gVar = new p9g(this);
                arrayList.add(p9gVar);
                xyeVarArr[i] = p9gVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        return j;
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        q9g q9gVar = (q9g) y99Var;
        lkg lkgVar = q9gVar.b;
        t99 t99Var = new t99(q9gVar.a, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.d.getClass();
        this.e.N(t99Var, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // defpackage.vhf
    public final long e() {
        return (this.l || this.i.J()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.u0a
    public final long g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return j;
            }
            p9g p9gVar = (p9g) arrayList.get(i);
            if (p9gVar.a == 2) {
                p9gVar.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        q9g q9gVar = (q9g) y99Var;
        this.n = (int) q9gVar.b.b;
        byte[] bArr = q9gVar.c;
        bArr.getClass();
        this.m = bArr;
        this.l = true;
        lkg lkgVar = q9gVar.b;
        t99 t99Var = new t99(q9gVar.a, lkgVar.c, lkgVar.d, j, j2, this.n);
        this.d.getClass();
        this.e.O(t99Var, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.i.J();
    }

    @Override // defpackage.u0a
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.u0a
    public final void n() {
    }

    @Override // defpackage.w99
    public final void p(y99 y99Var, long j, long j2, int i) {
        q9g q9gVar = (q9g) y99Var;
        lkg lkgVar = q9gVar.b;
        this.e.R(i == 0 ? new t99(j, q9gVar.a) : new t99(q9gVar.a, lkgVar.c, lkgVar.d, j, j2, lkgVar.b), 1, -1, this.j, 0, null, 0L, this.h, i);
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        t0aVar.C(this);
    }

    @Override // defpackage.u0a
    public final iyh t() {
        return this.f;
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        if (this.l) {
            return false;
        }
        dc9 dc9Var = this.i;
        if (dc9Var.J() || dc9Var.I()) {
            return false;
        }
        u25 u25VarA = this.b.a();
        v1i v1iVar = this.c;
        if (v1iVar != null) {
            u25VarA.w(v1iVar);
        }
        dc9Var.N(new q9g(u25VarA, this.a), this, this.d.o(1));
        return true;
    }

    @Override // defpackage.vhf
    public final long v() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        dc1 dc1Var;
        q9g q9gVar = (q9g) y99Var;
        lkg lkgVar = q9gVar.b;
        t99 t99Var = new t99(q9gVar.a, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        vqi.p0(this.h);
        mf mfVar = new mf(iOException, i, 7);
        l6m l6mVar = this.d;
        long jQ = l6mVar.q(mfVar);
        boolean z = jQ == -9223372036854775807L || i >= l6mVar.o(1);
        if (this.k && z) {
            lvb.H0("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            dc1Var = dc9.f;
        } else {
            dc1Var = jQ != -9223372036854775807L ? new dc1(0, jQ, false) : dc9.g;
        }
        dc1 dc1Var2 = dc1Var;
        this.e.P(t99Var, 1, -1, this.j, 0, null, 0L, this.h, iOException, !dc1Var2.f());
        return dc1Var2;
    }

    @Override // defpackage.vhf
    public final void y(long j) {
    }
}
