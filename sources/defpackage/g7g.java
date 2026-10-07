package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class g7g implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ m7g b;
    public final /* synthetic */ MediaPlayer c;

    public g7g(String str, m7g m7gVar, MediaPlayer mediaPlayer) {
        this.a = str;
        this.b = m7gVar;
        this.c = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sbR = c0a.r(i, "Playback(", this.a, ") | on error happened. what:", " extra:");
        sbR.append(i2);
        c7g c7gVar = new c7g(sbR.toString(), null, 2, null);
        gm0.V("SimpleRingtonePlayer", c7gVar.getMessage(), c7gVar);
        m7g m7gVar = this.b;
        MediaPlayer mediaPlayer2 = m7gVar.d;
        MediaPlayer mediaPlayer3 = this.c;
        if (mediaPlayer2 != mediaPlayer3) {
            return false;
        }
        m7gVar.h(mediaPlayer3);
        m7gVar.d = null;
        return false;
    }
}
