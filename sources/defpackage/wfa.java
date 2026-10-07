package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wfa {
    public final String a = wfa.class.getName();
    public final ny8 b;
    public final ny8 c;

    public wfa(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    public static Object b(wfa wfaVar, boolean z, long j, nq4 nq4Var) {
        mg5 mg5Var = mg5.REGULAR;
        wfaVar.getClass();
        Object objA = wfaVar.a(z, Collections.singletonList(new Long(j)), mg5Var, nq4Var);
        return objA == hu4.a ? objA : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, List list, mg5 mg5Var, nq4 nq4Var) {
        vfa vfaVar;
        if (nq4Var instanceof vfa) {
            vfaVar = (vfa) nq4Var;
            int i = vfaVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfaVar.i = i - Integer.MIN_VALUE;
            } else {
                vfaVar = new vfa(this, nq4Var);
            }
        } else {
            vfaVar = new vfa(this, nq4Var);
        }
        Object objJ = vfaVar.g;
        int i2 = vfaVar.i;
        if (i2 == 0) {
            ch3.d0(objJ);
            vfaVar.e = list;
            vfaVar.f = mg5Var;
            vfaVar.d = z;
            vfaVar.i = 1;
            objJ = ((sua) this.b.getValue()).j(list, vfaVar);
            hu4 hu4Var = hu4.a;
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = vfaVar.d;
            mg5Var = vfaVar.f;
            list = vfaVar.e;
            ch3.d0(objJ);
        }
        boolean z2 = z;
        mg5 mg5Var2 = mg5Var;
        List list2 = (List) objJ;
        if (list2.size() != list.size()) {
            String strL = qt4.l("Requested to delete ", list.size(), list2.size(), " messages, but found only ");
            qv1.u(strL, this.a, strL);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            Long l = new Long(((sfa) obj).h);
            Object arrayList = linkedHashMap.get(l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(l, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list3 = (List) entry.getValue();
            wzj wzjVar = (wzj) this.c.getValue();
            ku6 ku6Var = mg5.d;
            List list4 = list3;
            ArrayList arrayList2 = new ArrayList(yw3.W0(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                c0a.t(((sfa) it.next()).a, arrayList2);
            }
            wzjVar.c(new gkf(jLongValue, arrayList2, z2, mg5Var2));
        }
        return sbi.a;
    }
}
