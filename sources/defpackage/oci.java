package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oci extends xt4 {
    public static final oci c = new oci();

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        hd5.d.c.y(runnable, true, false);
    }

    @Override // defpackage.xt4
    public final void I0(vt4 vt4Var, Runnable runnable) {
        hd5.d.c.y(runnable, true, true);
    }

    @Override // defpackage.xt4
    public final xt4 R0(int i, String str) {
        n1g.m(i);
        if (i >= ykh.d) {
            return str != null ? new qab(this, str) : this;
        }
        return super.R0(i, str);
    }

    @Override // defpackage.xt4
    public final String toString() {
        return "Dispatchers.IO";
    }
}
