package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface kki {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object b(kki kkiVar, ahi ahiVar, nq4 nq4Var) {
        jki jkiVar;
        if (nq4Var instanceof jki) {
            jkiVar = (jki) nq4Var;
            int i = jkiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkiVar.f = i - Integer.MIN_VALUE;
            } else {
                jkiVar = new jki(kkiVar, nq4Var);
            }
        } else {
            jkiVar = new jki(kkiVar, nq4Var);
        }
        Object objI = jkiVar.d;
        int i2 = jkiVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            String strB = ahiVar.b();
            oji ojiVarC = ahiVar.c();
            long jA = ahiVar.a();
            jkiVar.f = 1;
            nki nkiVar = (nki) kkiVar;
            objI = ch3.I(jkiVar, nkiVar.a, true, false, new lki(strB, ojiVarC, jA, nkiVar));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        return t0m.a((chi) objI);
    }

    default List a() {
        ArrayList arrayList;
        jji jjiVar = jji.UPLOADING;
        r66 r66Var = r66.a;
        try {
            nki nkiVar = (nki) this;
            List list = (List) ch3.G(nkiVar.a, true, false, new ptf(nkiVar));
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(t0m.a((chi) it.next()));
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? r66Var : arrayList;
        } catch (Throwable th) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "UploadsDao", "blockingGetUploadsWithStatus fail fro status " + jjiVar, th);
                }
            }
        }
    }
}
