package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class f7g implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ m7g b;
    public final /* synthetic */ MediaPlayer c;

    public f7g(String str, m7g m7gVar, MediaPlayer mediaPlayer) {
        this.a = str;
        this.b = m7gVar;
        this.c = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        gm0.n("SimpleRingtonePlayer", "Playback(" + this.a + ") | releasing safely player on completion");
        m7g m7gVar = this.b;
        MediaPlayer mediaPlayer2 = m7gVar.d;
        MediaPlayer mediaPlayer3 = this.c;
        if (mediaPlayer2 != mediaPlayer3) {
            m7g.e(m7gVar, mediaPlayer3);
        } else {
            m7gVar.h(mediaPlayer3);
            m7gVar.d = null;
        }
    }
}
