package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class nkk {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public nkk(fbc fbcVar, BasePendingResult basePendingResult) {
        this.c = fbcVar;
        this.b = basePendingResult;
    }

    public final void a(Status status) {
        voe voeVar;
        switch (this.a) {
            case 0:
                ((Map) ((fbc) this.c).b).remove(this.b);
                return;
            default:
                if (!status.b()) {
                    ((qjh) this.c).a(vd7.x(status));
                    return;
                }
                BasePendingResult basePendingResult = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                yab.u("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.h);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.f);
                }
                yab.u("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.a) {
                    yab.u("Result has already been consumed.", !basePendingResult.g);
                    yab.u("Result is not ready.", basePendingResult.d());
                    voeVar = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                    break;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    ore.m();
                    return;
                } else {
                    yab.s(voeVar);
                    ((qjh) this.c).b(null);
                    return;
                }
        }
    }

    public nkk(BasePendingResult basePendingResult, qjh qjhVar, lu8 lu8Var) {
        this.b = basePendingResult;
        this.c = qjhVar;
    }
}
