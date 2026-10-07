package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eke implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;

    public /* synthetic */ eke(ny8 ny8Var, int i) {
        this.a = i;
        this.b = ny8Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                return (ScheduledExecutorService) ((a2c) ny8Var.getValue()).p.getValue();
            case 1:
                return (ScheduledExecutorService) ((a2c) ny8Var.getValue()).p.getValue();
            case 2:
                a2c a2cVar = (a2c) ny8Var.getValue();
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                a2cVar.getClass();
                return a2cVar.h(a2c.f(a2cVar, "ONEME_FB_BLOCK", 1, iAvailableProcessors, true, true, 1, 64), "ONEME_FB_BLOCK");
            case 3:
                return (ScheduledExecutorService) ((a2c) ny8Var.getValue()).r.getValue();
            case 4:
                return new vwf((Context) ny8Var.getValue());
            case 5:
                return ((o31) ny8Var.getValue()).a(16384);
            case 6:
                return e9i.I(e9i.o(new wof(1, null, ny8Var)));
            default:
                h5 h5Var = ((mdj) ny8Var.getValue()).a;
                return new bij(h5Var.d(116), h5Var.d(23));
        }
    }
}
