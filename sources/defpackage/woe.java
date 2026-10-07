package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class woe implements cle {
    public final long a;
    public final cf7 b;
    public final i64 c = new i64();
    public volatile Long d;

    public woe(long j, cf7 cf7Var) {
        this.a = j;
        this.b = cf7Var;
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) {
        if (this.c.W() || this.c.isCancelled()) {
            return;
        }
        Long l = (Long) wgVar.b.a.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null && this.d == null) {
            this.d = l;
        }
        Long l2 = this.d;
        if (this.a == 0 || l2 == null || l == null || l.longValue() - l2.longValue() <= this.a) {
            if (((Boolean) this.b.invoke(wgVar)).booleanValue()) {
                this.c.Q(wgVar);
                return;
            }
            return;
        }
        this.c.Q(null);
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Wait for capture result timeout, current: " + l.longValue() + " first: " + l2.longValue());
        }
    }
}
