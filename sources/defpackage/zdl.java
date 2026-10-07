package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zdl {
    public static Object a(y8e y8eVar, nq4 nq4Var) {
        ek2 ek2Var = new ek2(1, p90.B(nq4Var));
        ek2Var.u();
        y8eVar.e(new uvc(ek2Var, 24, (Object) null));
        ek2Var.w(new ssb(y8eVar, 0));
        return ek2Var.s();
    }

    public static final List b(String str, ts0 ts0Var, ts0 ts0Var2) {
        if (str == null || r5h.X0(str)) {
            return null;
        }
        List list = vs0.n;
        int iM0 = xw3.M0(list, ts0Var);
        int iM1 = xw3.M0(list, ts0Var2);
        if (iM0 < 0 || iM0 >= iM1) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList(iM1 - iM0);
        if (iM0 <= iM1) {
            while (true) {
                String strA = vs0.a(str, (ts0) vs0.n.get(iM1));
                if (strA != null) {
                    arrayList.add(strA);
                }
                if (iM1 == iM0) {
                    break;
                }
                iM1--;
            }
        }
        return arrayList;
    }
}
