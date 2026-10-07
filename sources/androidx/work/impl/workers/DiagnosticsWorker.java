package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.ch3;
import defpackage.czj;
import defpackage.jqh;
import defpackage.k89;
import defpackage.l89;
import defpackage.n1g;
import defpackage.nre;
import defpackage.oyj;
import defpackage.qzj;
import defpackage.rre;
import defpackage.szj;
import defpackage.ufh;
import defpackage.yk5;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final l89 d() {
        oyj oyjVarD = oyj.d(this.a);
        WorkDatabase workDatabase = oyjVarD.c;
        qzj qzjVarX = workDatabase.x();
        czj czjVarV = workDatabase.v();
        szj szjVarY = workDatabase.y();
        ufh ufhVarU = workDatabase.u();
        oyjVarD.b.d.getClass();
        List list = (List) ch3.G(qzjVarX.a, true, false, new jqh(System.currentTimeMillis() - 86400000, 3));
        rre rreVar = qzjVarX.a;
        List list2 = (List) ch3.G(rreVar, true, false, new nre(19));
        List list3 = (List) ch3.G(rreVar, true, false, new nre(22));
        if (!list.isEmpty()) {
            n1g n1gVarX = n1g.x();
            String str = yk5.a;
            n1gVarX.J(str, "Recently completed work:\n\n");
            n1g.x().J(str, yk5.a(czjVarV, szjVarY, ufhVarU, list));
        }
        if (!list2.isEmpty()) {
            n1g n1gVarX2 = n1g.x();
            String str2 = yk5.a;
            n1gVarX2.J(str2, "Running work:\n\n");
            n1g.x().J(str2, yk5.a(czjVarV, szjVarY, ufhVarU, list2));
        }
        if (!list3.isEmpty()) {
            n1g n1gVarX3 = n1g.x();
            String str3 = yk5.a;
            n1gVarX3.J(str3, "Enqueued work:\n\n");
            n1g.x().J(str3, yk5.a(czjVarV, szjVarY, ufhVarU, list3));
        }
        return new k89();
    }
}
