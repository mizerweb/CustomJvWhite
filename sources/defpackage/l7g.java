package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class l7g implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ String a;

    public l7g(String str) {
        this.a = str;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sbR = c0a.r(i, "Playback(", this.a, ") | on error happened. what:", " extra:");
        sbR.append(i2);
        c7g c7gVar = new c7g(sbR.toString(), null, 2, null);
        gm0.V("SimpleRingtonePlayer", c7gVar.getMessage(), c7gVar);
        return false;
    }
}
