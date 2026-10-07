package defpackage;

import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dv9 implements r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ dv9(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    @Override // defpackage.r89
    public final void invoke(Object obj) {
        int i = this.a;
        PlaybackException playbackException = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 0:
                j3dVar.M0(playbackException);
                break;
            case 1:
                j3dVar.T(playbackException);
                break;
            case 2:
                j3dVar.M0(playbackException);
                break;
            default:
                j3dVar.T(playbackException);
                break;
        }
    }
}
