package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;
import one.me.sdk.ringtone.player.MediaSource$SoundConfigException;

/* JADX INFO: loaded from: classes2.dex */
public final class idg implements kdg {
    public final String a;

    public idg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idg) && cqk.d(this.a, ((idg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (qt4.D(3) * 31);
    }

    @Override // defpackage.z4a
    public final boolean t(MediaPlayer mediaPlayer, Context context) {
        try {
            mediaPlayer.setDataSource(this.a);
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
        return "Custom(type=" + pye.h(3) + ", path=" + this.a + ")";
    }
}
