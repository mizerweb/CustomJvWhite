package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g95 extends au3 {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    super.finalize();
                    return;
                }
                Object objC = this.b.c();
                pj6.l("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.b)), objC == null ? null : objC.getClass().getName());
                zt3 zt3Var = this.c;
                if (zt3Var != null) {
                    zt3Var.w(this.b, this.d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // defpackage.au3
    /* JADX INFO: renamed from: l */
    public final au3 clone() {
        oc9.r(P());
        return new g95(this.b, this.c, this.d != null ? new Throwable() : null);
    }
}
