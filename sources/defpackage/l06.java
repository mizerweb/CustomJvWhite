package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l06 extends fg7 implements wf7 {
    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        long j;
        vk2 tk2Var;
        long jLongValue = ((Number) obj).longValue();
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        float fFloatValue3 = ((Number) obj4).floatValue();
        float fFloatValue4 = ((Number) serializable).floatValue();
        xk2 xk2Var = ((oyg) this.receiver).a;
        List<vk2> list = xk2Var.b;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        boolean z = false;
        for (vk2 vk2Var : list) {
            if (vk2Var.getId() != jLongValue) {
                j = jLongValue;
            } else {
                if (vk2Var instanceof uk2) {
                    umh umhVar = ((uk2) vk2Var).a;
                    umhVar.getClass();
                    j = jLongValue;
                    umh umhVarA = umh.a(umhVar, null, 0, 0, null, 0, 0, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, 127);
                    umhVarA.l = umhVar.l;
                    umhVarA.m = umhVar.m;
                    umhVarA.n.set(umhVar.n);
                    tk2Var = new uk2(umhVarA);
                } else {
                    j = jLongValue;
                    if (vk2Var instanceof tk2) {
                        g59 g59Var = ((tk2) vk2Var).a;
                        g59 g59Var2 = new g59(g59Var.a, g59Var.b, g59Var.c, g59Var.d, g59Var.e, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4);
                        g59Var2.j = g59Var.j;
                        g59Var2.k = g59Var.k;
                        g59Var2.l.set(g59Var.l);
                        tk2Var = new tk2(g59Var2);
                    } else if (!(vk2Var instanceof sk2)) {
                        ore.o();
                        return null;
                    }
                    z = true;
                }
                vk2Var = tk2Var;
                z = true;
            }
            arrayList.add(vk2Var);
            jLongValue = j;
        }
        if (z) {
            xk2Var.b = arrayList;
            mjg mjgVar = xk2Var.d;
            mjgVar.getClass();
            mjgVar.j(null, arrayList);
        }
        return sbi.a;
    }
}
