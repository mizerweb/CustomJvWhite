package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class k7g implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ m7g a;
    public final /* synthetic */ String b;

    public k7g(m7g m7gVar, String str) {
        this.a = m7gVar;
        this.b = str;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        m7g m7gVar = this.a;
        yab.i0(m7gVar.f, null, 0, new dtd(this.b, m7gVar, null, 29), 3);
    }
}
