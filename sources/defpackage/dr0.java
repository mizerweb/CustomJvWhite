package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ dr0(er0 er0Var, Exception exc, int i) {
        this.a = i;
        this.b = er0Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        er0 er0Var = this.b;
        switch (i) {
            case 0:
                er0Var.d.a(VideoFrameProcessingException.a(-9223372036854775807L, exc));
                break;
            default:
                er0Var.d.a(VideoFrameProcessingException.a(-9223372036854775807L, exc));
                break;
        }
    }
}
