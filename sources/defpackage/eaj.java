package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class eaj implements pf2 {
    public final pf2 a;
    public final ia b;
    public final gaj c;
    public final faj d;

    public eaj(pf2 pf2Var, faj fajVar, vuf vufVar) {
        this.a = pf2Var;
        this.d = fajVar;
        this.b = new ia(pf2Var.d(), vufVar);
        this.c = new gaj(pf2Var.j());
    }

    @Override // defpackage.pf2
    public final gqb b() {
        return this.a.b();
    }

    @Override // defpackage.bli
    public final void c(cli cliVar) {
        wxl.a();
        this.d.c(cliVar);
    }

    @Override // defpackage.pf2
    public final be2 d() {
        return this.b;
    }

    @Override // defpackage.pf2
    public final void h(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.bli
    public final void i(cli cliVar) {
        wxl.a();
        this.d.i(cliVar);
    }

    @Override // defpackage.pf2
    public final nf2 j() {
        return this.c;
    }

    @Override // defpackage.bli
    public final void l(cli cliVar) {
        wxl.a();
        this.d.l(cliVar);
    }

    @Override // defpackage.pf2
    public final void n(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.pf2
    public final boolean p() {
        return false;
    }

    @Override // defpackage.bli
    public final void r(cli cliVar) {
        wxl.a();
        this.d.r(cliVar);
    }

    @Override // defpackage.pf2
    public final e89 release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
