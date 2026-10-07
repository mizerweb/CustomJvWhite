package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ipb implements aw8 {
    public final aw8 a;
    public final gif b;

    public ipb(aw8 aw8Var) {
        this.a = aw8Var;
        this.b = new gif(aw8Var.d());
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        if (obj != null) {
            u76Var.t(this.a, obj);
        } else {
            u76Var.s();
        }
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        if (r55Var.A()) {
            return r55Var.d(this.a);
        }
        return null;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ipb.class == obj.getClass() && cqk.d(this.a, ((ipb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
