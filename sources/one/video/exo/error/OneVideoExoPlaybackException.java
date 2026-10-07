package one.video.exo.error;

import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.ExoPlaybackException;
import defpackage.e35;
import defpackage.lvb;
import defpackage.oa6;
import defpackage.ore;
import defpackage.p2d;
import defpackage.q2d;
import defpackage.qdc;
import defpackage.s6h;
import defpackage.sdc;
import defpackage.va;
import defpackage.wx;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import one.video.player.error.OneVideoPlaybackException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/exo/error/OneVideoExoPlaybackException;", "Lone/video/player/error/OneVideoPlaybackException;", "one-video-player-exo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneVideoExoPlaybackException extends OneVideoPlaybackException {
    public OneVideoExoPlaybackException(PlaybackException playbackException) {
        super(playbackException.getMessage(), playbackException.getCause());
        qdc qdcVar = qdc.A1;
        this.a = qdcVar;
        this.b = "";
        sdc sdcVar = sdc.e;
        this.c = sdcVar;
        HashMap map = p2d.a;
        qdc qdcVar2 = (qdc) p2d.a.get(Integer.valueOf(playbackException.a));
        this.a = qdcVar2 != null ? qdcVar2 : qdcVar;
        this.b = playbackException.b();
        wx wxVar = oa6.a;
        boolean z = playbackException instanceof ExoPlaybackException;
        va vaVar = new va(10);
        wxVar.getClass();
        wxVar.a(z, "INVALID_EXCEPTION_CLASS", vaVar);
        if (z) {
            HashMap map2 = q2d.a;
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            int i = exoPlaybackException.j;
            sdc sdcVar2 = (sdc) q2d.a.get(Integer.valueOf(i));
            sdcVar2 = sdcVar2 == null ? sdcVar : sdcVar2;
            this.c = sdcVar2;
            wxVar.a(sdcVar2 != sdcVar, "ERROR_TYPE_IS_NOT_RESOLVED", new va(10));
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 0) {
                lvb.b0(i == 0);
                Throwable cause = exoPlaybackException.getCause();
                cause.getClass();
                OneVideoExoSourceException oneVideoExoSourceException = new OneVideoExoSourceException((IOException) cause);
                Throwable cause2 = oneVideoExoSourceException.getCause();
                HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = cause2 instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) cause2 : null;
                if (httpDataSource$InvalidResponseCodeException != null) {
                    try {
                    } catch (NumberFormatException unused) {
                    }
                }
                oneVideoExoSourceException.getCause();
                Throwable cause3 = oneVideoExoSourceException.getCause();
                ParserException parserException = cause3 instanceof ParserException ? (ParserException) cause3 : null;
                if (parserException != null) {
                    e35.a(parserException.b);
                }
                this.d = oneVideoExoSourceException;
                return;
            }
            if (iOrdinal == 1) {
                this.e = new OneVideoExoRendererException(exoPlaybackException);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return;
                }
                ore.o();
                throw null;
            }
            lvb.b0(i == 2);
            Throwable cause4 = exoPlaybackException.getCause();
            cause4.getClass();
            OneVideoExoUnexpectedException oneVideoExoUnexpectedException = new OneVideoExoUnexpectedException((RuntimeException) cause4);
            Throwable cause5 = oneVideoExoUnexpectedException.getCause();
            StuckPlayerException stuckPlayerException = cause5 instanceof StuckPlayerException ? (StuckPlayerException) cause5 : null;
            if (stuckPlayerException != null) {
                HashMap map3 = s6h.a;
            }
            this.f = oneVideoExoUnexpectedException;
        }
    }
}
