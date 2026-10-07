package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;

/* JADX INFO: loaded from: classes4.dex */
public final class vt9 implements h4j {
    public final /* synthetic */ zt9 b;

    public vt9(zt9 zt9Var) {
        this.b = zt9Var;
    }

    @Override // defpackage.h4j
    public final void a(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        b87 b87Var = videoSink$VideoSinkException.a;
        zt9 zt9Var = this.b;
        zt9Var.U1 = zt9Var.d(videoSink$VideoSinkException, b87Var, false, 7001);
    }

    @Override // defpackage.h4j
    public final void b() {
        zt9 zt9Var = this.b;
        if (zt9Var.x2 != null) {
            zt9Var.S0(0, 1);
        }
    }

    @Override // defpackage.h4j
    public final void c(k4j k4jVar) {
    }

    @Override // defpackage.h4j
    public final void d() {
        eg6 eg6Var = this.b.J;
        if (eg6Var != null) {
            eg6Var.b();
        }
    }

    @Override // defpackage.h4j
    public final void onFirstFrameRendered() {
        zt9 zt9Var = this.b;
        Surface surface = zt9Var.x2;
        if (surface != null) {
            fbc fbcVar = zt9Var.i2;
            Handler handler = (Handler) fbcVar.b;
            if (handler != null) {
                handler.post(new xc2(fbcVar, surface, SystemClock.elapsedRealtime(), 7));
            }
            zt9Var.A2 = true;
        }
    }
}
