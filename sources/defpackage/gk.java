package defpackage;

import android.view.Choreographer;
import org.webrtc.RenderSynchronizer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gk implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                break;
        }
    }
}
