package defpackage;

import org.webrtc.ScreenCapturerAndroid;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c4f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScreenCapturerAndroid b;

    public /* synthetic */ c4f(ScreenCapturerAndroid screenCapturerAndroid, int i) {
        this.a = i;
        this.b = screenCapturerAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScreenCapturerAndroid screenCapturerAndroid = this.b;
        switch (i) {
            case 0:
                screenCapturerAndroid.lambda$new$0();
                break;
            default:
                screenCapturerAndroid.updateVirtualDisplay();
                break;
        }
    }
}
