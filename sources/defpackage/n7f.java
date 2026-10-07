package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* JADX INFO: loaded from: classes.dex */
public final class n7f implements SystemServicesManager$PushTokenGeneratedListener {
    public final ny8 a;
    public final ny8 b;

    public n7f(h5 h5Var) {
        this.a = h5Var.d(100);
        this.b = h5Var.d(146);
    }

    @Override // one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener
    public final void onPushTokenGenerated(p1f p1fVar, boolean z) {
        if (!((svb) this.a.getValue()).b() || z) {
            return;
        }
        ((pvb) this.b.getValue()).p();
    }
}
