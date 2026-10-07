package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class e7g implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ m7g a;
    public final /* synthetic */ MediaPlayer b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MediaPlayer d;
    public final /* synthetic */ int e;

    public e7g(m7g m7gVar, MediaPlayer mediaPlayer, String str, MediaPlayer mediaPlayer2, int i) {
        this.a = m7gVar;
        this.b = mediaPlayer;
        this.c = str;
        this.d = mediaPlayer2;
        this.e = i;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i;
        m7g m7gVar = this.a;
        MediaPlayer mediaPlayer2 = m7gVar.d;
        MediaPlayer mediaPlayer3 = this.b;
        if (mediaPlayer2 != mediaPlayer3) {
            m7g.e(m7gVar, mediaPlayer);
            return;
        }
        StringBuilder sb = new StringBuilder("Playback(");
        String str = this.c;
        sb.append(str);
        sb.append(") | player prepared");
        gm0.n("SimpleRingtonePlayer", sb.toString());
        gm0.n("SimpleRingtonePlayer", "Playback(" + str + ") | requesting audio focus after player start, volume:" + m7gVar.j + " isPlaying:" + m7gVar.d());
        MediaPlayer mediaPlayer4 = this.d;
        if (mediaPlayer4 != null) {
            m7g.e(m7gVar, mediaPlayer4);
        }
        mediaPlayer.start();
        int i2 = this.e;
        if (i2 != 0) {
            i = i2 != 2 ? 1 : 6;
        } else {
            i = 3;
        }
        m7gVar.e.v(i2, m7gVar.i, i);
        gm0.n("SimpleRingtonePlayer", "prepared player: " + mediaPlayer + ", current player: " + mediaPlayer3 + ", usage: " + i);
    }
}
