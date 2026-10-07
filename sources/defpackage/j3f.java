package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j3f {
    public static final String a = n1g.Z("Schedulers");

    public static void a(qzj qzjVar, lhb lhbVar, List list) {
        if (list.size() > 0) {
            lhbVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qzjVar.f(jCurrentTimeMillis, ((mzj) it.next()).a);
            }
        }
    }

    public static void b(ja4 ja4Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        qzj qzjVarX = workDatabase.x();
        workDatabase.b();
        try {
            rre rreVar = qzjVarX.a;
            rre rreVar2 = qzjVarX.a;
            List list2 = (List) ch3.G(rreVar, true, false, new nre(20));
            a(qzjVarX, ja4Var.d, list2);
            List list3 = (List) ch3.G(rreVar2, true, false, new q4c(ja4Var.k, 1));
            a(qzjVarX, ja4Var.d, list3);
            list3.addAll(list2);
            List list4 = (List) ch3.G(rreVar2, true, false, new nre(22));
            workDatabase.p();
            workDatabase.f();
            if (list3.size() > 0) {
                mzj[] mzjVarArr = (mzj[]) list3.toArray(new mzj[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    a3f a3fVar = (a3f) it.next();
                    if (a3fVar.e()) {
                        a3fVar.c(mzjVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                mzj[] mzjVarArr2 = (mzj[]) list4.toArray(new mzj[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    a3f a3fVar2 = (a3f) it2.next();
                    if (!a3fVar2.e()) {
                        a3fVar2.c(mzjVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
