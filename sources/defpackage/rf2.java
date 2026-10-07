package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class rf2 implements pf2 {
    public final kmi a;
    public final nf2 b;
    public final be2 c;
    public final omi d;
    public final lh2 e;
    public final String f;
    public pd2 g;
    public final int h;
    public final b40 i;

    public rf2(qd2 qd2Var, kmi kmiVar, nf2 nf2Var, be2 be2Var, omi omiVar, lh2 lh2Var) {
        this.a = kmiVar;
        this.b = nf2Var;
        this.c = be2Var;
        this.d = omiVar;
        this.e = lh2Var;
        String str = qd2Var.a;
        this.f = str;
        this.g = td2.a;
        g40 g40Var = sf2.a;
        g40Var.getClass();
        this.h = g40.b.incrementAndGet(g40Var);
        this.i = gvk.a(false);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) ef2.b(str)));
        }
    }

    @Override // defpackage.pf2
    public final gqb b() {
        return this.e.b;
    }

    @Override // defpackage.bli
    public final void c(cli cliVar) {
        kmi kmiVar = this.a;
        synchronized (kmiVar.l) {
            if (kmiVar.m.contains(cliVar)) {
                kmiVar.k(kmiVar.m);
            }
        }
    }

    @Override // defpackage.pf2
    public final be2 d() {
        return this.c;
    }

    @Override // defpackage.pf2
    public final pd2 e() {
        return this.g;
    }

    @Override // defpackage.pf2
    public final void f(pd2 pd2Var) {
        this.g = pd2Var == null ? td2.a : pd2Var;
        if (pd2Var != null) {
            pd2Var.s();
        }
        synchronized (this.a.l) {
        }
    }

    @Override // defpackage.pf2
    public final void g(boolean z) {
        kmi kmiVar = this.a;
        synchronized (kmiVar.l) {
            kmiVar.o = z;
            hli hliVarH = kmiVar.h();
            if (hliVarH != null) {
                yab.i0(hliVarH.b.f, null, 0, new in((lq4) null, hliVarH, z), 3);
            }
        }
    }

    @Override // defpackage.pf2
    public final void h(Collection collection) {
        this.a.d(ww3.T1(collection));
    }

    @Override // defpackage.bli
    public final void i(cli cliVar) {
        this.a.a(cliVar);
    }

    @Override // defpackage.pf2
    public final nf2 j() {
        return this.b;
    }

    @Override // defpackage.bli
    public final void l(cli cliVar) {
        kmi kmiVar = this.a;
        synchronized (kmiVar.l) {
            if (kmiVar.m.contains(cliVar)) {
                kmiVar.l();
            }
        }
    }

    @Override // defpackage.pf2
    public final boolean m() {
        return this.i.b();
    }

    @Override // defpackage.pf2
    public final void n(ArrayList arrayList) {
        this.a.g(ww3.T1(arrayList));
    }

    @Override // defpackage.pf2
    public final void o() {
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.i.a()) {
            yab.i0(this.d.a, null, 0, new qf2(this, null, 0), 3);
        }
    }

    @Override // defpackage.pf2
    public final void q(boolean z) {
        kmi kmiVar = this.a;
        synchronized (kmiVar.l) {
            kmiVar.q = z;
        }
    }

    @Override // defpackage.bli
    public final void r(cli cliVar) {
        kmi kmiVar = this.a;
        synchronized (kmiVar.l) {
            if (kmiVar.n.remove(cliVar)) {
                kmiVar.l();
            }
        }
    }

    @Override // defpackage.pf2
    public final e89 release() {
        return f55.m(new ot4(0, yab.i0(this.d.a, null, 0, new qf2(this, null, 1), 3)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) ef2.b(this.f));
        sb.append('(');
        return zo5.t(sb, this.h, ")>");
    }
}
