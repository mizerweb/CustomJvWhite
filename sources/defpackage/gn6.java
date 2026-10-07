package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gn6 {
    public final rre a;
    public final ig0 b = new ig0(3);

    public gn6(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static Object b(gn6 gn6Var, ilb ilbVar, long j, nq4 nq4Var) {
        dn6 dn6Var;
        Object obj;
        long j2;
        gn6 gn6Var2 = gn6Var;
        ilb ilbVar2 = ilbVar;
        if (nq4Var instanceof dn6) {
            dn6Var = (dn6) nq4Var;
            int i = dn6Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                dn6Var.j = i - Integer.MIN_VALUE;
            } else {
                dn6Var = new dn6(gn6Var2, nq4Var);
            }
        } else {
            dn6Var = new dn6(gn6Var2, nq4Var);
        }
        Object obj2 = dn6Var.h;
        int i2 = dn6Var.j;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj2);
            long j3 = ilbVar2.a;
            long j4 = ilbVar2.b;
            dn6Var.d = gn6Var2;
            dn6Var.e = ilbVar2;
            dn6Var.g = j;
            dn6Var.j = 1;
            Object objI = ch3.I(dn6Var, gn6Var2.a, true, false, new z14(3, j3, j4, j));
            if (objI != hu4Var) {
                obj = objI;
                j2 = j;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = dn6Var.f;
            ch3.d0(obj2);
            return list;
        }
        long j5 = dn6Var.g;
        ilb ilbVar3 = dn6Var.e;
        gn6 gn6Var3 = dn6Var.d;
        ch3.d0(obj2);
        ilbVar2 = ilbVar3;
        j2 = j5;
        obj = obj2;
        gn6Var2 = gn6Var3;
        List list2 = (List) obj;
        long j6 = ilbVar2.a;
        long j7 = ilbVar2.b;
        dn6Var.d = null;
        dn6Var.e = null;
        dn6Var.f = list2;
        dn6Var.g = j2;
        dn6Var.j = 2;
        Object objI2 = ch3.I(dn6Var, gn6Var2.a, false, true, new z14(2, j6, j7, j2));
        if (objI2 != hu4Var) {
            objI2 = sbi.a;
        }
        return objI2 == hu4Var ? hu4Var : list2;
    }

    public final Object a(List list, tob tobVar) {
        List<cpb> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (cpb cpbVar : list2) {
            ilb ilbVar = cpbVar.a;
            arrayList.add(ilbVar.a + "_" + ilbVar.b + "_" + cpbVar.b);
        }
        StringBuilder sbC = nbh.C("SELECT * FROM fcm_notifications_analytics WHERE chat_id||'_'||post_id||'_'||msg_id IN (");
        int size = arrayList.size();
        vd7.b(sbC, size);
        sbC.append(") AND analytics_status = (");
        sbC.append("?");
        sbC.append(")");
        return ch3.I(tobVar, this.a, true, false, new en6(arrayList, size, sbC.toString()));
    }
}
