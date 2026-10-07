package defpackage;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: loaded from: classes4.dex */
public final class xwi extends wwi implements Choreographer.FrameCallback {
    @Override // defpackage.wwi
    public final void b() {
        long refreshRate;
        this.b.registerDisplayListener(this, vqi.p(null));
        this.a.postFrameCallback(this);
        Display display = this.b.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            lvb.G0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.d = refreshRate;
    }

    @Override // defpackage.wwi
    public final void c() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.a.postFrameCallback(this);
            Display display = this.b.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                lvb.G0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.d = refreshRate;
        }
    }
}
