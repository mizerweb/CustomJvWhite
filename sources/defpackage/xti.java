package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class xti extends zc2 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ r72 c;
    public final /* synthetic */ hmf d;

    public xti(AtomicBoolean atomicBoolean, r72 r72Var, hmf hmfVar) {
        this.b = atomicBoolean;
        this.c = r72Var;
        this.d = hmfVar;
    }

    @Override // defpackage.zc2
    public final void b(int i, gd2 gd2Var) {
        Object obj;
        if (this.a) {
            this.a = false;
            tvj.a("VideoCapture", "cameraCaptureResult timestampNs = " + gd2Var.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = gd2Var.d().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        r72 r72Var = this.c;
        if (iIntValue == r72Var.hashCode() && r72Var.b(null) && !atomicBoolean.getAndSet(true)) {
            zjl.d().execute(new ewg(this, 16, this.d));
        }
    }
}
