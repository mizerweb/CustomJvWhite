package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oy3 {
    public final String a = oy3.class.getName();
    public final ny8 b;
    public final ny8 c;

    public oy3(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, nq4 nq4Var) {
        ny3 ny3Var;
        if (nq4Var instanceof ny3) {
            ny3Var = (ny3) nq4Var;
            int i = ny3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny3Var.g = i - Integer.MIN_VALUE;
            } else {
                ny3Var = new ny3(this, nq4Var);
            }
        } else {
            ny3Var = new ny3(this, nq4Var);
        }
        Object objT = ny3Var.e;
        int i2 = ny3Var.g;
        if (i2 == 0) {
            ch3.d0(objT);
            ny3Var.d = list;
            ny3Var.g = 1;
            objT = ((l34) this.b.getValue()).t(list, ny3Var);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ny3Var.d;
            ch3.d0(objT);
        }
        List list2 = (List) objT;
        if (list2.size() != list.size()) {
            String strL = qt4.l("Requested to delete ", list.size(), list2.size(), " comments, but found only ");
            qv1.u(strL, this.a, strL);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            q24 q24Var = ((ky3) obj).K;
            Object arrayList = linkedHashMap.get(q24Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(q24Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            q24 q24Var2 = (q24) entry.getKey();
            List list3 = (List) entry.getValue();
            wzj wzjVar = (wzj) this.c.getValue();
            List list4 = list3;
            ArrayList arrayList2 = new ArrayList(yw3.W0(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                c0a.t(((ky3) it.next()).a, arrayList2);
            }
            wzjVar.c(new fkf(q24Var2, arrayList2));
        }
        return sbi.a;
    }
}
