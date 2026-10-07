package one.me.android;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.ae9;
import defpackage.c79;
import defpackage.gm0;
import defpackage.je9;
import defpackage.k89;
import defpackage.l89;
import defpackage.re7;
import defpackage.rsc;
import defpackage.ul9;
import defpackage.usc;
import defpackage.yab;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/android/DailyAnalyticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lrsc;", "permissionStats", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lrsc;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DailyAnalyticsWorker extends Worker {
    public final rsc e;

    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters, rsc rscVar) {
        super(context, workerParameters);
        this.e = rscVar;
    }

    @Override // androidx.work.Worker
    public final l89 d() {
        String strB;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "one.me.android.DailyAnalyticsWorker", "work " + this.b.a + " started", null);
        }
        rsc rscVar = this.e;
        rscVar.getClass();
        ul9 ul9Var = new ul9();
        c79 c79VarW = yab.w();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ul9 ul9Var2 = new ul9();
            ul9Var2.put("pType", "push");
            ul9Var2.put("pStatus", rsc.b(rscVar.c));
            c79VarW.add(ul9Var2.b());
        }
        ul9 ul9Var3 = new ul9();
        ul9Var3.put("pType", "contacts");
        ul9Var3.put("pStatus", rsc.b(rscVar.d));
        c79VarW.add(ul9Var3.b());
        ul9 ul9Var4 = new ul9();
        ul9Var4.put("pType", "fsi");
        re7 re7Var = rscVar.j;
        if (re7Var != null) {
            ul9Var4.put("pStatus", rsc.b(re7Var));
        }
        c79VarW.add(ul9Var4.b());
        ul9 ul9Var5 = new ul9();
        ul9Var5.put("pType", "gallery");
        usc uscVar = rscVar.e;
        if (i < 34) {
            strB = rsc.b(uscVar);
        } else if (uscVar.i()) {
            strB = "allowed";
        } else {
            strB = rscVar.f.i() ? "partial" : "denied";
        }
        ul9Var5.put("pStatus", strB);
        c79VarW.add(ul9Var5.b());
        ul9 ul9Var6 = new ul9();
        ul9Var6.put("pType", "camera");
        ul9Var6.put("pStatus", rsc.b(rscVar.g));
        c79VarW.add(ul9Var6.b());
        ul9 ul9Var7 = new ul9();
        ul9Var7.put("pType", "microphone");
        ul9Var7.put("pStatus", rsc.b(rscVar.h));
        c79VarW.add(ul9Var7.b());
        ul9 ul9Var8 = new ul9();
        ul9Var8.put("pType", "geo");
        ul9Var8.put("pStatus", rsc.b(rscVar.i));
        c79VarW.add(ul9Var8.b());
        ul9Var.put("permissions", yab.j(c79VarW));
        ae9.k((ae9) rscVar.a.getValue(), "PERMISSION", "permission_status", ul9Var.b(), 8);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "one.me.android.DailyAnalyticsWorker", "work " + this.b.a + " finished", null);
        }
        return new k89();
    }
}
