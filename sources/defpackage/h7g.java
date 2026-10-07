package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class h7g implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4a b;
    public final /* synthetic */ MediaPlayer c;
    public final /* synthetic */ m7g d;

    public /* synthetic */ h7g(z4a z4aVar, MediaPlayer mediaPlayer, m7g m7gVar, int i) {
        this.a = i;
        this.b = z4aVar;
        this.c = mediaPlayer;
        this.d = m7gVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        m7g m7gVar = this.d;
        MediaPlayer mediaPlayer = this.c;
        z4a z4aVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Boolean.valueOf(z4aVar.t(mediaPlayer, m7gVar.a));
    }
}
