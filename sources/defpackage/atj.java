package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.my.tracker.core.o.u;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import one.me.webapp.settings.WebAppsSettingScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class atj implements qbf, muj, otb, hfh, n78 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ atj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hfh
    public Object a() {
        xde xdeVar = (xde) this.b;
        Iterator it = ((Iterable) ((uxe) xdeVar.c).A(new ahc(13))).iterator();
        while (it.hasNext()) {
            ((kr6) xdeVar.d).N((ij0) it.next(), 1, false);
        }
        return null;
    }

    @Override // defpackage.qbf
    public int e(int i) {
        usj usjVar = (usj) ((k79) ((WebAppsSettingScreen) this.b).e.F(i));
        if (usjVar.a() != 0) {
            return usjVar.a();
        }
        return 0;
    }

    @Override // defpackage.otb
    public void j(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ((zxj) obj).b.d(null);
                break;
            case 3:
                ((ScheduledFuture) obj).cancel(false);
                break;
            default:
                u.b.a((u.c) obj, task);
                break;
        }
    }

    @Override // defpackage.n78
    public void n(o78 o78Var) {
        b2k b2kVar = (b2k) this.b;
        try {
            l78 l78VarD = o78Var.d();
            if (l78VarD != null) {
                b2kVar.c.n(l78VarD);
            }
        } catch (IllegalStateException unused) {
            if (tvj.f(6, "CXCP")) {
                Log.e("CXCP", "Failed to acquire latest image");
            }
        }
    }
}
