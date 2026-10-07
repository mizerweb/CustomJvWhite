package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ef5 implements zm7, owi {
    public final /* synthetic */ int a;
    public final /* synthetic */ swi b;

    public /* synthetic */ ef5(swi swiVar, int i) {
        this.a = i;
        this.b = swiVar;
    }

    @Override // defpackage.zm7, defpackage.owi
    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        int i = this.a;
        this.b.a(videoFrameProcessingException);
    }
}
