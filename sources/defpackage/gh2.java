package defpackage;

import android.os.SystemClock;
import org.webrtc.Size;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class gh2 implements hh2 {
    public final CidLogger a;
    public final nsh b = new nsh();
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public gh2(CidLogger cidLogger) {
        this.a = cidLogger;
    }

    public final String toString() {
        return "fps estimation: " + (1.0E9d / this.b.b.b) + ", frame size: " + this.c;
    }
}
