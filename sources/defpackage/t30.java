package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t30 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt9 b;

    public /* synthetic */ t30(kt9 kt9Var, yt9 yt9Var, int i) {
        this.a = i;
        this.b = yt9Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        yt9 yt9Var = this.b;
        switch (i) {
            case 0:
                Handler handler = yt9Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    yt9Var.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = yt9Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    yt9Var.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
