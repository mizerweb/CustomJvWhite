package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hf5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf5 b;
    public final /* synthetic */ InterruptedException c;

    public /* synthetic */ hf5(nf5 nf5Var, InterruptedException interruptedException, int i) {
        this.a = i;
        this.b = nf5Var;
        this.c = interruptedException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterruptedException interruptedException = this.c;
        nf5 nf5Var = this.b;
        switch (i) {
            case 0:
                nf5Var.h.a(VideoFrameProcessingException.a(-9223372036854775807L, interruptedException));
                break;
            default:
                nf5Var.h.a(new VideoFrameProcessingException(interruptedException));
                break;
        }
    }
}
