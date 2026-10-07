package defpackage;

import android.content.Intent;
import android.media.projection.MediaProjection;
import java.util.concurrent.Executor;
import org.webrtc.ScreenCapturerAndroid;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class b4f extends MediaProjection.Callback {
    public final ScreenCapturerAndroid a;
    public final y3e b;
    public volatile boolean c;
    public volatile boolean d;
    public int e;
    public int f;
    public int g;
    public final Executor h;

    public b4f(Intent intent, Executor executor, CidLogger cidLogger) {
        this.b = cidLogger;
        this.h = executor;
        this.a = new ScreenCapturerAndroid(intent, this);
    }

    public final void a(int i, int i2) {
        this.b.log("ScreenCapturerAdapter", nbh.u("changeFormat, ", i, "x", i2, "@30"));
        if (this.g == i && this.f == i2 && this.e == 30) {
            return;
        }
        this.e = 30;
        this.f = i2;
        this.g = i;
        if (this.d) {
            this.b.log("ScreenCapturerAdapter", "Screen capture is already started, just change capture format");
            try {
                this.a.changeCaptureFormat(i, i2, 30);
            } catch (Exception e) {
                this.b.reportException("ScreenCapturerAdapter", "screen.capture.change.format", new RuntimeException("Cant change screen capture format", e));
            }
        }
    }

    public final void b() {
        this.b.log("ScreenCapturerAdapter", "release");
        c();
        this.a.dispose();
    }

    public final void c() {
        this.b.log("ScreenCapturerAdapter", "stop");
        if (!this.d) {
            this.b.log("ScreenCapturerAdapter", "Screen capturer is not yet started");
            return;
        }
        this.d = false;
        try {
            this.a.stopCapture();
        } catch (Exception e) {
            this.b.reportException("ScreenCapturerAdapter", "screen.capture.stop", new RuntimeException("Stop screen capture failed", e));
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        this.b.log("ScreenCapturerAdapter", "onStop, screen capture session stopped");
        this.c = true;
        this.h.execute(new h7b(19, this));
    }
}
