package defpackage;

import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kch implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceTextureHelper b;

    public /* synthetic */ kch(SurfaceTextureHelper surfaceTextureHelper, int i) {
        this.a = i;
        this.b = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        switch (i) {
            case 0:
                surfaceTextureHelper.lambda$stopListening$1();
                break;
            case 1:
                surfaceTextureHelper.lambda$dispose$6();
                break;
            case 2:
                surfaceTextureHelper.lambda$returnTextureFrame$5();
                break;
            default:
                surfaceTextureHelper.lambda$forceFrame$3();
                break;
        }
    }
}
