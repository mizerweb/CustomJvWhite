package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class axb implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ bxb a;

    public axb(bxb bxbVar) {
        this.a = bxbVar;
    }

    @Override // one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener
    public final void onPushTokenGenerated(p1f p1fVar, boolean z) {
        bxb bxbVar = this.a;
        bxbVar.i.setValue(bxbVar.d());
    }
}
