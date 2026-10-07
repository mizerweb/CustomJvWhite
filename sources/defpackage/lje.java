package defpackage;

import org.webrtc.RenderSynchronizer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lje implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ lje(RenderSynchronizer renderSynchronizer, int i) {
        this.a = i;
        this.b = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (i) {
            case 0:
                renderSynchronizer.lambda$registerListener$1();
                break;
            default:
                renderSynchronizer.lambda$new$0();
                break;
        }
    }
}
