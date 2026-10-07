package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;
import one.me.sdk.ringtone.player.MediaSource$SoundConfigException;

/* JADX INFO: loaded from: classes2.dex */
public final class jdg implements kdg {
    public final Uri a;

    public jdg(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdg) && cqk.d(this.a, ((jdg) obj).a);
    }

    public final int hashCode() {
        int iD = qt4.D(3) * 31;
        Uri uri = this.a;
        return iD + (uri == null ? 0 : uri.hashCode());
    }

    @Override // defpackage.z4a
    public final boolean t(MediaPlayer mediaPlayer, Context context) {
        Uri uri = this.a;
        if (uri == null) {
            return false;
        }
        try {
            mediaPlayer.setDataSource(context, uri);
            return true;
        } catch (IOException e) {
            gm0.X("SoundConfigTag", e, e.getMessage(), new Object[0]);
            return false;
        } catch (IllegalStateException e2) {
            gm0.X("SoundConfigTag", new MediaSource$SoundConfigException(e2), e2.getMessage(), new Object[0]);
            return false;
        }
    }

    public final String toString() {
        return "SystemRingtone(type=" + pye.h(3) + ", uri=" + this.a + ")";
    }
}
