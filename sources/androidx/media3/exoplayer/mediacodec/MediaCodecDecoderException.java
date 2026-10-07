package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.nt9;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final nt9 a;
    public final int b;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, nt9 nt9Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(nt9Var == null ? null : nt9Var.a);
        super(sb.toString(), illegalStateException);
        this.a = nt9Var;
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.b = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
