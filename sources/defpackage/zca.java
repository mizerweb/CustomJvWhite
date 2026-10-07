package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zca implements rg6 {
    public final rg6 a;
    public final hyh b;

    public zca(rg6 rg6Var, hyh hyhVar) {
        this.a = rg6Var;
        this.b = hyhVar;
    }

    @Override // defpackage.rg6
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.rg6
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.rg6
    public final boolean c(long j, uq3 uq3Var, List list) {
        return this.a.c(j, uq3Var, list);
    }

    @Override // defpackage.rg6
    public final b87 d(int i) {
        return this.b.d[this.a.e(i)];
    }

    @Override // defpackage.rg6
    public final int e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof zca)) {
            return this.b.equals(((zca) obj).b);
        }
        return false;
    }

    @Override // defpackage.rg6
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.rg6
    public final boolean g(int i, long j) {
        return this.a.g(i, j);
    }

    @Override // defpackage.rg6
    public final void h(float f) {
        this.a.h(f);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.rg6
    public final Object i() {
        return this.a.i();
    }

    @Override // defpackage.rg6
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.rg6
    public final int k(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.rg6
    public final void l(long j, long j2, long j3, List list, gt9[] gt9VarArr) {
        this.a.l(j, j2, j3, list, gt9VarArr);
    }

    @Override // defpackage.rg6
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.rg6
    public final hyh m() {
        return this.b;
    }

    @Override // defpackage.rg6
    public final int n(b87 b87Var) {
        return this.a.k(this.b.b(b87Var));
    }

    @Override // defpackage.rg6
    public final void o(boolean z) {
        this.a.o(z);
    }

    @Override // defpackage.rg6
    public final void p() {
        this.a.p();
    }

    @Override // defpackage.rg6
    public final int q(long j, List list) {
        return this.a.q(j, list);
    }

    @Override // defpackage.rg6
    public final int r() {
        return this.a.r();
    }

    @Override // defpackage.rg6
    public final b87 s() {
        return this.b.d[this.a.r()];
    }

    @Override // defpackage.rg6
    public final int t() {
        return this.a.t();
    }

    @Override // defpackage.rg6
    public final void u() {
        this.a.u();
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zca) {
            return this.a.equals(((zca) obj).a);
        }
        return false;
    }
}
