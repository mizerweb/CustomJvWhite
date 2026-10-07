package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a3d implements h4j {
    public final /* synthetic */ g3d b;

    public a3d(g3d g3dVar) {
        this.b = g3dVar;
    }

    @Override // defpackage.h4j
    public final void a(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        for (c3d c3dVar : this.b.h) {
            VideoFrameProcessingException videoFrameProcessingExceptionA = VideoFrameProcessingException.a(-9223372036854775807L, videoSink$VideoSinkException);
            c3dVar.i.execute(new d86(c3dVar, c3dVar.h, videoFrameProcessingExceptionA, 22));
        }
    }

    @Override // defpackage.h4j
    public final void b() {
        for (c3d c3dVar : this.b.h) {
            h4j h4jVar = c3dVar.h;
            Executor executor = c3dVar.i;
            Objects.requireNonNull(h4jVar);
            executor.execute(new b3d(h4jVar, 1));
        }
    }

    @Override // defpackage.h4j
    public final void c(k4j k4jVar) {
        for (c3d c3dVar : this.b.h) {
            c3dVar.i.execute(new i7b(c3dVar.h, 15, k4jVar));
        }
    }

    @Override // defpackage.h4j
    public final void onFirstFrameRendered() {
        for (c3d c3dVar : this.b.h) {
            h4j h4jVar = c3dVar.h;
            Executor executor = c3dVar.i;
            Objects.requireNonNull(h4jVar);
            executor.execute(new b3d(h4jVar, 2));
        }
    }
}
