package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nka {
    public final rre a;
    public final lhb c = new lhb(18);
    public final pl b = new pl(8, this);

    public nka(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Serializable b(nka nkaVar, nq4 nq4Var) {
        lka lkaVar;
        if (nq4Var instanceof lka) {
            lkaVar = (lka) nq4Var;
            int i = lkaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkaVar.f = i - Integer.MIN_VALUE;
            } else {
                lkaVar = new lka(nkaVar, nq4Var);
            }
        } else {
            lkaVar = new lka(nkaVar, nq4Var);
        }
        Object objI = lkaVar.d;
        int i2 = lkaVar.f;
        ArrayList arrayList = null;
        if (i2 == 0) {
            ch3.d0(objI);
            lkaVar.f = 1;
            objI = ch3.I(lkaVar, nkaVar.a, true, false, new ik4(14, nkaVar));
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
        List list = (List) objI;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ktk.a((jka) it.next()));
            }
        }
        return arrayList == null ? r66.a : arrayList;
    }

    public List a(long j) {
        ArrayList arrayList;
        List list = (List) ch3.G(this.a, true, false, new en3(j, this, 3));
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ktk.a((jka) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? r66.a : arrayList;
    }

    public List c() {
        ArrayList arrayList;
        List list = (List) ch3.G(this.a, true, false, new lh9(9, this));
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ktk.a((jka) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? r66.a : arrayList;
    }

    public Object d(gka gkaVar, ryf ryfVar) {
        Object objI = ch3.I(ryfVar, this.a, false, true, new iaa(this, 5, ktk.b(gkaVar)));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public Object e(pia piaVar, qhi qhiVar) {
        Object objI = ch3.I(qhiVar, this.a, false, true, new mka(piaVar.a, piaVar.b, piaVar.c));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }
}
