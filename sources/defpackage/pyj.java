package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pyj extends fg7 implements xf7 {
    public static final pyj a = new pyj(6, qyj.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        ja4 ja4Var = (ja4) obj2;
        azj azjVar = (azj) obj3;
        ijd ijdVar = (ijd) obj6;
        String str = j3f.a;
        xfh xfhVar = new xfh(context, (WorkDatabase) obj4, ja4Var);
        elc.a(context, SystemJobService.class, true);
        n1g.x().p(j3f.a, "Created SystemJobScheduler and enabled SystemJobService");
        return xw3.P0(xfhVar, new kq7(context, ja4Var, (azh) obj5, ijdVar, new fbc(ijdVar, 26, azjVar), azjVar));
    }
}
