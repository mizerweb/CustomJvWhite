package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class fbm {
    private final nlh a;
    private final AtomicLong b = new AtomicLong(-1);

    public fbm(Context context, String str) {
        this.a = new wlk(context, wlk.k, new olh("mlkit:vision"), do7.c);
    }

    public static fbm a(Context context) {
        return new fbm(context, "mlkit:vision");
    }

    public final /* synthetic */ void b(long j, Exception exc) {
        this.b.set(j);
    }

    public final synchronized void c(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = this.b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.b.get() <= 1800000) {
            return;
        }
        ((wlk) this.a).c(new mlh(0, Arrays.asList(new oxa(i, i2, 0, j, j2, null, null, 0, -1)))).k(new ttb() { // from class: ebm
            @Override // defpackage.ttb
            public final void onFailure(Exception exc) {
                this.a.b(jElapsedRealtime, exc);
            }
        });
    }
}
