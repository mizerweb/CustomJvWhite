package defpackage;

import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi b;

    public /* synthetic */ aj(zi ziVar, int i) {
        this.a = i;
        this.b = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zi ziVar = this.b;
        switch (i) {
            case 0:
                ziVar.b.E1.b();
                di.d(new aj(ziVar, 1));
                break;
            default:
                AnimatedFileDrawable animatedFileDrawable = ziVar.b;
                if (animatedFileDrawable.I1 != null) {
                    uy0.c();
                    animatedFileDrawable.I1 = null;
                }
                animatedFileDrawable.H1 = false;
                AnimatedFileDrawable.a(animatedFileDrawable);
                animatedFileDrawable.e();
                break;
        }
    }
}
