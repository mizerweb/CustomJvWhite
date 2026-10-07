package androidx.media3.exoplayer.mediacodec;

import defpackage.b87;
import defpackage.nt9;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final nt9 c;
    public final String d;

    public MediaCodecRenderer$DecoderInitializationException(b87 b87Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + b87Var, mediaCodecUtil$DecoderQueryException, b87Var.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, nt9 nt9Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = nt9Var;
        this.d = str3;
    }
}
