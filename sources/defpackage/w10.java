package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class w10 extends mdh implements vf7 {
    public /* synthetic */ List e;
    public /* synthetic */ long f;
    public final /* synthetic */ y10 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(y10 y10Var, lq4 lq4Var) {
        super(4, lq4Var);
        this.g = y10Var;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj2).longValue();
        w10 w10Var = new w10(this.g, (lq4) obj4);
        w10Var.e = (List) obj;
        w10Var.f = jLongValue;
        return w10Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object next;
        List list = this.e;
        long j = this.f;
        ch3.d0(obj);
        y10 y10Var = this.g;
        List listL = y10Var.g().l();
        Iterator it = listL.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jA = ((tq3) next).a();
                do {
                    Object next3 = it.next();
                    long jA2 = ((tq3) next3).a();
                    if (jA > jA2) {
                        next = next3;
                        jA = jA2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        tq3 tq3Var = (tq3) next;
        long jA3 = tq3Var != null ? tq3Var.a() : 0L;
        Iterator it2 = listL.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                long jC = ((tq3) next2).c();
                do {
                    Object next4 = it2.next();
                    long jC2 = ((tq3) next4).c();
                    if (jC < jC2) {
                        next2 = next4;
                        jC = jC2;
                    }
                } while (it2.hasNext());
            }
        }
        tq3 tq3Var2 = (tq3) next2;
        long jC3 = tq3Var2 != null ? tq3Var2.c() : BuildConfig.MAX_TIME_TO_UPLOAD;
        long jX = oc9.x(j, Math.min(jA3, jC3), Math.max(jA3, jC3));
        if (jX > j && y10Var.i() == 2) {
            jX = j;
        }
        List listS = y10Var.v.s(y10Var.i(), jX, false);
        List listL2 = y10Var.g().l();
        tq3 tq3VarT = qe7.t(jX, listL2);
        tq3 tq3VarI = y10Var.g().i(jX);
        tq3 tq3VarG = y10Var.g().g(jX);
        long jD = y10Var.g().d();
        long jK = y10Var.g().k();
        String strJ = y10Var.g().j();
        qg7 qg7Var = y10Var.b;
        int size = listS.size();
        int size2 = list.size();
        int size3 = listL2.size();
        StringBuilder sbP = qv1.p("getHistoryItems return ", size, " out of total ", size2, " around ");
        sbP.append(jX);
        qt4.z(j, ", original around ", ". Around chunk ", sbP);
        sbP.append(tq3VarT);
        sbP.append(". Before ");
        sbP.append(tq3VarI);
        sbP.append(". After ");
        sbP.append(tq3VarG);
        sbP.append(". First ");
        sbP.append(jD);
        qt4.z(jK, ". Last ", ". MoreInfo: ", sbP);
        sbP.append(strJ);
        sbP.append(" Chunks count = ");
        sbP.append(size3);
        sbP.append(".");
        qg7Var.r(sbP.toString());
        return listS;
    }
}
