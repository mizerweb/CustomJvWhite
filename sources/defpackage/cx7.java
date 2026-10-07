package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cx7 extends qs0 {
    public int g;

    @Override // defpackage.rg6
    public final int b() {
        return this.g;
    }

    @Override // defpackage.rg6
    public final Object i() {
        return null;
    }

    @Override // defpackage.rg6
    public final void l(long j, long j2, long j3, List list, gt9[] gt9VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            c.t();
        }
    }

    @Override // defpackage.rg6
    public final int t() {
        return 0;
    }
}
