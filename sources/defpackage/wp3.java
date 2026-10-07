package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wp3 extends gp8 implements vp3 {
    public final up8 h;

    public wp3(up8 up8Var) {
        this.h = up8Var;
    }

    @Override // defpackage.vp3
    public final boolean a(Throwable th) {
        up8 up8Var = this.g;
        if (up8Var == null) {
            up8Var = null;
        }
        return up8Var.u(th);
    }

    @Override // defpackage.vp3
    public final vo8 getParent() {
        up8 up8Var = this.g;
        if (up8Var != null) {
            return up8Var;
        }
        return null;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return true;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        up8 up8Var = this.g;
        if (up8Var == null) {
            up8Var = null;
        }
        this.h.q(up8Var);
    }
}
