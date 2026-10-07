package defpackage;

import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n86 implements obk {
    public final Object a;

    public n86(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        try {
            this.a = mediaCodecInfo.getCapabilitiesForType(str);
        } catch (RuntimeException e) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: ".concat(str), e);
        }
    }

    public void l(pbk pbkVar, c4h c4hVar) {
        ((obk) this.a).c(pbkVar, c4hVar);
    }

    public n86(z7k z7kVar, ku8 ku8Var) {
        this.a = z7kVar;
    }
}
