package defpackage;

import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ct0 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ ct0(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                wx wxVar = BaseVideoPlayer.C;
                return "playbackSpeed set to " + f;
            default:
                wx wxVar2 = BaseVideoPlayer.C;
                return "volume set to " + f;
        }
    }
}
