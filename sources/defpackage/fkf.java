package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fkf extends mjf {
    public final q24 b;
    public final List c;
    public final String d = fkf.class.getName();

    public fkf(q24 q24Var, List list) {
        this.b = q24Var;
        this.c = list;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object C(fkf fkfVar, List list, nq4 nq4Var) {
        ekf ekfVar;
        List list2;
        ArrayList arrayList;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ekf) {
            ekfVar = (ekf) nq4Var;
            int i = ekfVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekfVar.h = i - Integer.MIN_VALUE;
            } else {
                ekfVar = new ekf(fkfVar, nq4Var);
            }
        } else {
            ekfVar = new ekf(fkfVar, nq4Var);
        }
        ekf ekfVar2 = ekfVar;
        Object obj = ekfVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = ekfVar2.h;
        if (i2 == 0) {
            ch3.d0(obj);
            if (list.isEmpty()) {
                gm0.Y(fkf.class.getName(), "Early return in deleteServerComments cuz of messageDbs.isEmpty()");
                return sbiVar;
            }
            String str = fkfVar.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "deleteServerMessages: commentsId = " + fkfVar.b + ", count = " + list.size(), null);
                }
            }
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(yw3.W0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                c0a.t(((ky3) it.next()).a, arrayList2);
            }
            njf njfVar = fkfVar.a;
            if (njfVar == null) {
                njfVar = null;
            }
            l34 l34VarD = njfVar.d();
            q24 q24Var = fkfVar.b;
            wja wjaVar = wja.DELETED;
            ekfVar2.d = list;
            ekfVar2.e = arrayList2;
            ekfVar2.h = 1;
            if (l34VarD.C(q24Var, arrayList2, wjaVar, true, ekfVar2) == hu4Var) {
                return hu4Var;
            }
            list2 = list;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList3 = ekfVar2.e;
            list2 = ekfVar2.d;
            ch3.d0(obj);
            arrayList = arrayList3;
        }
        pvb pvbVarB = fkfVar.b();
        q24 q24Var2 = fkfVar.b;
        long j = q24Var2.a;
        long j2 = q24Var2.b;
        List list4 = list2;
        ArrayList arrayList4 = new ArrayList(yw3.W0(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            c0a.t(((ky3) it2.next()).b, arrayList4);
        }
        pvbVarB.m(j, j2, arrayList, arrayList4);
        return sbiVar;
    }

    @Override // defpackage.mjf
    public final void B() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        yab.i0(njfVar.i(), null, 0, new gce(this, (lq4) null, 17), 3);
    }
}
