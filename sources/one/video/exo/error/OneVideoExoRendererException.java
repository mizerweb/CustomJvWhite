package one.video.exo.error;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import defpackage.b87;
import defpackage.e87;
import defpackage.f87;
import defpackage.lvb;
import defpackage.nt9;
import defpackage.srk;
import defpackage.ux9;
import java.util.HashMap;
import kotlin.Metadata;
import one.video.player.error.OneVideoRendererException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/exo/error/OneVideoExoRendererException;", "Lone/video/player/error/OneVideoRendererException;", "one-video-player-exo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneVideoExoRendererException extends OneVideoRendererException {
    public final String a;
    public final ux9 b;
    public final e87 c;

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Illegal instructions before constructor call */
    public OneVideoExoRendererException(ExoPlaybackException exoPlaybackException) {
        ux9 ux9VarE;
        b87 b87Var = exoPlaybackException.m;
        int i = exoPlaybackException.j;
        lvb.b0(i == 1);
        Throwable cause = exoPlaybackException.getCause();
        cause.getClass();
        super((Exception) cause);
        String str = exoPlaybackException.k;
        this.a = str;
        if (i != 1 || str == null) {
            ux9VarE = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1782852404) {
                if (iHashCode != -598752976) {
                    if (iHashCode == 846582055 && str.equals("MediaCodecAudioRenderer") && b87Var != null) {
                        ux9VarE = srk.b(b87Var);
                    } else {
                        ux9VarE = null;
                    }
                } else if (str.equals("TextRenderer") && b87Var != null) {
                    ux9VarE = srk.d(b87Var);
                } else {
                    ux9VarE = null;
                }
            } else if (str.equals("MediaCodecVideoRenderer") && b87Var != null) {
                ux9VarE = srk.e(b87Var);
            } else {
                ux9VarE = null;
            }
        }
        this.b = ux9VarE;
        HashMap map = f87.a;
        e87 e87Var = (e87) f87.a.get(Integer.valueOf(exoPlaybackException.n));
        this.c = e87Var == null ? e87.f : e87Var;
        getCause();
        getCause();
        getCause();
        Throwable cause2 = getCause();
        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = cause2 instanceof MediaCodecRenderer$DecoderInitializationException ? (MediaCodecRenderer$DecoderInitializationException) cause2 : null;
        if (mediaCodecRenderer$DecoderInitializationException != null) {
            a(mediaCodecRenderer$DecoderInitializationException.c);
            return;
        }
        Throwable cause3 = getCause();
        MediaCodecDecoderException mediaCodecDecoderException = cause3 instanceof MediaCodecDecoderException ? (MediaCodecDecoderException) cause3 : null;
        if (mediaCodecDecoderException != null) {
            a(mediaCodecDecoderException.a);
        }
    }

    public static void a(nt9 nt9Var) {
        if (nt9Var == null) {
            return;
        }
        Boolean.compare(nt9Var.h, false);
        Boolean.compare(nt9Var.e, false);
        Boolean.compare(nt9Var.f(), false);
        nt9Var.d.getMaxSupportedInstances();
        Boolean.compare(nt9Var.g, false);
        Boolean.compare(nt9Var.i, false);
        Boolean.compare(nt9Var.j, false);
        Boolean.compare(nt9Var.f, false);
    }
}
