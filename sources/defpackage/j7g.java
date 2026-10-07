package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class j7g implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ m7g b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MediaPlayer d;

    public j7g(String str, m7g m7gVar, int i, MediaPlayer mediaPlayer) {
        this.a = str;
        this.b = m7gVar;
        this.c = i;
        this.d = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        StringBuilder sb = new StringBuilder("Playback(");
        String str = this.a;
        sb.append(str);
        sb.append(") | player prepared");
        gm0.n("SimpleRingtonePlayer", sb.toString());
        m7g m7gVar = this.b;
        gm0.n("SimpleRingtonePlayer", "Playback(" + str + ") | requesting audio focus after player start, volume:" + m7gVar.j + " isPlaying:" + m7gVar.d());
        m7gVar.e.v(this.c, m7gVar.i, 1);
        mediaPlayer.start();
        gm0.n("SimpleRingtonePlayer", "prepared player: " + mediaPlayer + ", current player: " + this.d);
    }
}
