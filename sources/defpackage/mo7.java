package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mo7 implements otb, ttb {
    public final /* synthetic */ i1m a;

    @Override // defpackage.otb
    public void j(Task task) {
        kzi kziVar = (kzi) this.a.a;
        if (!task.j() || task.h() == null) {
            kziVar.w();
            return;
        }
        Location location = (Location) task.h();
        vc9 vc9Var = new vc9(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed());
        ek2 ek2Var = (ek2) kziVar.b;
        if ((ek2Var.t() instanceof hib) && ((AtomicBoolean) kziVar.a).compareAndSet(false, true)) {
            ek2Var.resumeWith(vc9Var);
        }
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        ((kzi) this.a.a).w();
    }
}
