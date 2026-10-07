package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gp8 extends ld9 implements no5, qc8 {
    public up8 g;

    @Override // defpackage.qc8
    public final rhb b() {
        return null;
    }

    @Override // defpackage.no5
    public final void dispose() {
        up8 up8Var = this.g;
        if (up8Var == null) {
            up8Var = null;
        }
        up8Var.b0(this);
    }

    @Override // defpackage.qc8
    public final boolean isActive() {
        return true;
    }

    public abstract boolean o();

    public abstract void p(Throwable th);

    @Override // defpackage.ld9
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(f55.n(this));
        sb.append("[job@");
        up8 up8Var = this.g;
        if (up8Var == null) {
            up8Var = null;
        }
        sb.append(f55.n(up8Var));
        sb.append(']');
        return sb.toString();
    }
}
