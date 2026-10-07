package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yai extends xt4 {
    public static final yai c = new yai();

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        j1k j1kVar = (j1k) vt4Var.x0(j1k.c);
        if (j1kVar != null) {
            j1kVar.b = true;
        } else {
            c.i("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.xt4
    public final xt4 R0(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.xt4
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
