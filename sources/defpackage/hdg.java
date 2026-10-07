package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import java.io.IOException;
import one.me.sdk.ringtone.player.MediaSource$SoundConfigException;

/* JADX INFO: loaded from: classes2.dex */
public final class hdg implements kdg {
    public final int a;
    public final Integer b;

    public hdg(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdg)) {
            return false;
        }
        hdg hdgVar = (hdg) obj;
        return this.a == hdgVar.a && this.b.equals(hdgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (qt4.D(this.a) * 31);
    }

    @Override // defpackage.z4a
    public final boolean t(MediaPlayer mediaPlayer, Context context) {
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(this.b.intValue());
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd);
                rx8.n(assetFileDescriptorOpenRawResourceFd, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(assetFileDescriptorOpenRawResourceFd, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            gm0.X("SoundConfigTag", e, e.getMessage(), new Object[0]);
            return false;
        } catch (IllegalStateException e2) {
            gm0.X("SoundConfigTag", new MediaSource$SoundConfigException(e2), e2.getMessage(), new Object[0]);
            return false;
        }
    }

    public final String toString() {
        return "Asset(type=" + pye.h(this.a) + ", asset=" + this.b + ")";
    }
}
