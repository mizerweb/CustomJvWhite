package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class ka implements pf2 {
    public final pf2 a;
    public final ja b;
    public final ia c;

    public ka(pf2 pf2Var, ja jaVar) {
        this.a = pf2Var;
        this.b = jaVar;
        pd2 pd2Var = jaVar.c;
        be2 be2VarD = pf2Var.d();
        pd2Var.s();
        this.c = new ia(be2VarD);
    }

    @Override // defpackage.pf2, defpackage.nc2
    public final nf2 a() {
        return this.b;
    }

    @Override // defpackage.pf2
    public final gqb b() {
        return this.a.b();
    }

    @Override // defpackage.bli
    public final void c(cli cliVar) {
        this.a.c(cliVar);
    }

    @Override // defpackage.pf2
    public final be2 d() {
        return this.c;
    }

    @Override // defpackage.pf2
    public final pd2 e() {
        return this.a.e();
    }

    @Override // defpackage.pf2
    public final void f(pd2 pd2Var) {
        this.a.f(pd2Var);
    }

    @Override // defpackage.pf2
    public final void g(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.pf2
    public final void h(Collection collection) {
        this.a.h(collection);
    }

    @Override // defpackage.bli
    public final void i(cli cliVar) {
        this.a.i(cliVar);
    }

    @Override // defpackage.pf2
    public final nf2 j() {
        return this.b;
    }

    @Override // defpackage.pf2
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.bli
    public final void l(cli cliVar) {
        this.a.l(cliVar);
    }

    @Override // defpackage.pf2
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.pf2
    public final void n(ArrayList arrayList) {
        this.a.n(arrayList);
    }

    @Override // defpackage.pf2
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.pf2
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.bli
    public final void r(cli cliVar) {
        this.a.r(cliVar);
    }

    @Override // defpackage.pf2
    public final e89 release() {
        return this.a.release();
    }
}
