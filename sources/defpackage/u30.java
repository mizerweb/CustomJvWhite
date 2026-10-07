package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u30 implements pah {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ u30(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.pah
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new HandlerThread(v30.w(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(v30.w(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
