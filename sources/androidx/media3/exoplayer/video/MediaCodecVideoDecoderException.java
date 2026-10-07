package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import defpackage.nt9;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public MediaCodecVideoDecoderException(IllegalStateException illegalStateException, nt9 nt9Var, Surface surface) {
        super(illegalStateException, nt9Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
