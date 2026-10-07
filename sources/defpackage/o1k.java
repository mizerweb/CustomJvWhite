package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o1k implements fli {
    public final m1k a;
    public final float b;
    public final float c;
    public final ifh d;
    public final ifh e;
    public boolean f;
    public kli g;
    public i64 h;

    public o1k(m1k m1kVar) {
        this.a = m1kVar;
        this.b = m1kVar.w();
        this.c = m1kVar.b();
        final int i = 0;
        this.d = new ifh(new af7(this) { // from class: n1k
            public final /* synthetic */ o1k b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                o1k o1kVar = this.b;
                switch (i2) {
                    case 0:
                        return new t1k(1.0f, o1kVar.b, o1kVar.c);
                    default:
                        return new g8b((t1k) o1kVar.d.getValue());
                }
            }
        });
        final int i2 = 1;
        this.e = new ifh(new af7(this) { // from class: n1k
            public final /* synthetic */ o1k b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                o1k o1kVar = this.b;
                switch (i3) {
                    case 0:
                        return new t1k(1.0f, o1kVar.b, o1kVar.c);
                    default:
                        return new g8b((t1k) o1kVar.d.getValue());
                }
            }
        });
    }

    public final e89 a(t1k t1kVar, boolean z, boolean z2) {
        i64 i64Var = new i64();
        i64 i64Var2 = this.h;
        if (i64Var2 != null) {
            if (z) {
                bc1.p("Cancelled due to another zoom value being set.", i64Var2);
            } else {
                rpl.d(i64Var, i64Var2);
            }
        }
        this.h = i64Var;
        boolean zC = wxl.c();
        ifh ifhVar = this.e;
        if (zC) {
            ((g8b) ifhVar.getValue()).k(t1kVar);
        } else {
            ((g8b) ifhVar.getValue()).i(t1kVar);
        }
        kli kliVar = this.g;
        if (kliVar != null) {
            float fC = t1kVar.c();
            m1k m1kVar = this.a;
            rpl.d(z2 ? m1kVar.E(fC, kliVar) : m1kVar.i(kliVar), i64Var);
        } else {
            bc1.p("Camera is not active.", i64Var);
        }
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = ot4.class;
        try {
            i64Var.Y(new j22(29, r72Var));
            r72Var.a = "Job.asListenableFuture";
        } catch (Exception e) {
            u72Var.c(e);
        }
        return o9b.g(u72Var);
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.g = kliVar;
        t1k t1kVar = (t1k) ((g8b) this.e.getValue()).d();
        if (t1kVar == null) {
            t1kVar = (t1k) this.d.getValue();
        }
        a(t1kVar, false, this.f || t1kVar.c() != 1.0f);
        this.f = true;
    }

    @Override // defpackage.fli
    public final void reset() {
        a((t1k) this.d.getValue(), true, true);
    }
}
