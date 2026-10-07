package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pr7 extends zvj {
    public pr7(or7 or7Var) {
        super(or7Var);
        or7Var.d.f();
        or7Var.e.f();
        this.f = or7Var.t0;
    }

    @Override // defpackage.qh5
    public final void a(qh5 qh5Var) {
        uh5 uh5Var = this.h;
        if (uh5Var.c && !uh5Var.j) {
            uh5Var.d((int) ((((uh5) uh5Var.l.get(0)).g * ((or7) this.b).p0) + 0.5f));
        }
    }

    @Override // defpackage.zvj
    public final void d() {
        hg4 hg4Var = this.b;
        or7 or7Var = (or7) hg4Var;
        int i = or7Var.q0;
        int i2 = or7Var.r0;
        int i3 = or7Var.t0;
        uh5 uh5Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                uh5Var.l.add(hg4Var.S.d.h);
                this.b.S.d.h.k.add(uh5Var);
                uh5Var.f = i;
            } else if (i2 != -1) {
                uh5Var.l.add(hg4Var.S.d.i);
                this.b.S.d.i.k.add(uh5Var);
                uh5Var.f = -i2;
            } else {
                uh5Var.b = true;
                uh5Var.l.add(hg4Var.S.d.i);
                this.b.S.d.i.k.add(uh5Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            uh5Var.l.add(hg4Var.S.e.h);
            this.b.S.e.h.k.add(uh5Var);
            uh5Var.f = i;
        } else if (i2 != -1) {
            uh5Var.l.add(hg4Var.S.e.i);
            this.b.S.e.i.k.add(uh5Var);
            uh5Var.f = -i2;
        } else {
            uh5Var.b = true;
            uh5Var.l.add(hg4Var.S.e.i);
            this.b.S.e.i.k.add(uh5Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.zvj
    public final void e() {
        hg4 hg4Var = this.b;
        int i = ((or7) hg4Var).t0;
        uh5 uh5Var = this.h;
        if (i == 1) {
            hg4Var.X = uh5Var.g;
        } else {
            hg4Var.Y = uh5Var.g;
        }
    }

    @Override // defpackage.zvj
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.zvj
    public final boolean k() {
        return false;
    }

    public final void m(uh5 uh5Var) {
        uh5 uh5Var2 = this.h;
        uh5Var2.k.add(uh5Var);
        uh5Var.l.add(uh5Var2);
    }
}
