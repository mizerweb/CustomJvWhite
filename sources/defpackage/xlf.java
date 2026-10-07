package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.Layout;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.chats.tab.StoriesAppBarBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xlf implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xlf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        mo3 mo3Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((ulf) obj).F());
            case 1:
                Context context = ((a1g) obj).a;
                mj9 mj9Var = l76.a;
                return new g51(context);
            case 2:
                u9c u9cVar = (u9c) obj;
                gvb gvbVar = u9cVar.i;
                zv8[] zv8VarArr = u9c.l;
                int iIntValue = ((Number) gvbVar.m(u9cVar, zv8VarArr[5])).intValue();
                u9cVar.i.B(u9cVar, zv8VarArr[5], 0);
                return Integer.valueOf(iIntValue);
            case 3:
                StoriesAppBarBehavior storiesAppBarBehavior = (StoriesAppBarBehavior) obj;
                if (storiesAppBarBehavior.w.getValue() == pqg.d && (mo3Var = storiesAppBarBehavior.E) != null) {
                    mo3Var.invoke();
                }
                return sbi.a;
            case 4:
                return (Layout) obj;
            case 5:
                oph ophVar = (oph) obj;
                return new pri(ophVar.a, ophVar.b);
            case 6:
                return new svj(((svj) obj).b, 1);
            case 7:
                z96.a((cyj) obj);
                return sbi.a;
            case 8:
                oyj oyjVar = (oyj) obj;
                WorkDatabase workDatabase = oyjVar.c;
                Context context2 = oyjVar.a;
                String str = xfh.f;
                if (Build.VERSION.SDK_INT >= 34) {
                    kp8.a(context2).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
                ArrayList arrayListD = xfh.d(context2, jobScheduler);
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    Iterator it = arrayListD.iterator();
                    while (it.hasNext()) {
                        xfh.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) ch3.G(workDatabase.x().a, false, true, new nre(23))).intValue();
                j3f.b(oyjVar.b, workDatabase, oyjVar.e);
                return sbi.a;
            case 9:
                xyj xyjVar = (xyj) obj;
                String str2 = xyj.n;
                gm0.n(str2, "start init property workManager");
                oyj oyjVarD = oyj.d(new vyj(xyjVar, xyjVar.a));
                gm0.n(str2, "workManager property inited!");
                tyj tyjVar = new tyj();
                synchronized (n1g.d) {
                    try {
                        if (n1g.e == null) {
                            n1g.e = tyjVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return oyjVarD;
            case 10:
                return ((Worker) obj).d();
            case 11:
                Context context3 = ((zek) obj).a;
                Object systemService = context3 != null ? context3.getSystemService(wk8.b("f844a79ffcc82a96fac43091e9ce3081")) : null;
                if (systemService instanceof ConnectivityManager) {
                    return (ConnectivityManager) systemService;
                }
                return null;
            default:
                Context context4 = ((rik) obj).a;
                Object systemService2 = context4 != null ? context4.getSystemService(wk8.b("f844a79ffcc82a96fac43091e9ce3081")) : null;
                if (systemService2 instanceof ConnectivityManager) {
                    return (ConnectivityManager) systemService2;
                }
                return null;
        }
    }
}
