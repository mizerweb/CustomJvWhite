package one.video.player.error;

import defpackage.qdc;
import defpackage.sdc;
import kotlin.Metadata;
import one.video.exo.error.OneVideoExoRendererException;
import one.video.exo.error.OneVideoExoSourceException;
import one.video.exo.error.OneVideoExoUnexpectedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/video/player/error/OneVideoPlaybackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "qdc", "sdc", "rdc", "one-video-player_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class OneVideoPlaybackException extends Exception {
    public qdc a;
    public String b;
    public sdc c;
    public OneVideoExoSourceException d;
    public OneVideoExoRendererException e;
    public OneVideoExoUnexpectedException f;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qdc getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final sdc getC() {
        return this.c;
    }
}
