package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iae {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final String d = iae.class.getName();

    public iae(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final ArrayList a() {
        vg4 vg4VarW;
        List listP = ((qw2) this.a.getValue()).P(qw2.I);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            rt2 rt2Var = (rt2) obj;
            if (rt2Var.b.a0 != 0 && ((vg4VarW = rt2Var.w()) == null || !vg4VarW.D())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(nq4 nq4Var) {
        gae gaeVar;
        nx2 nx2Var;
        if (nq4Var instanceof gae) {
            gaeVar = (gae) nq4Var;
            int i = gaeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gaeVar.f = i - Integer.MIN_VALUE;
            } else {
                gaeVar = new gae(this, nq4Var);
            }
        } else {
            gaeVar = new gae(this, nq4Var);
        }
        Object objH = gaeVar.d;
        int i2 = gaeVar.f;
        if (i2 == 0) {
            ch3.d0(objH);
            no4 no4Var = (no4) this.b.getValue();
            gaeVar.f = 1;
            objH = no4Var.h(gaeVar);
            hu4 hu4Var = hu4.a;
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objH) {
            vg4 vg4Var = (vg4) obj;
            if (vg4Var.a.b.q != 0 && !vg4Var.D()) {
                rt2 rt2VarQ = ((qw2) this.a.getValue()).Q(vg4Var.v());
                if (((rt2VarQ == null || (nx2Var = rt2VarQ.b) == null) ? 0L : nx2Var.a0) == 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final List c() {
        vg4 vg4VarW;
        fda fdaVar;
        vg4 vg4VarW2;
        ny8 ny8Var = this.a;
        List listP = ((qw2) ny8Var.getValue()).P(qw2.I);
        String str = this.d;
        gm0.n(str, "getRecentContacts:");
        List list = listP;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            rt2 rt2Var = (rt2) obj;
            if (!((qw2) ny8Var.getValue()).V(rt2Var) && rt2Var.b.b0 != 0 && rt2Var.h0() && ((vg4VarW2 = rt2Var.w()) == null || !vg4VarW2.D())) {
                arrayList.add(obj);
            }
        }
        List listM1 = ww3.M1(arrayList, new xa8(21));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM1.iterator();
        while (it.hasNext()) {
            cx3.Z0(((rt2) it.next()).g, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(Long.valueOf(((vg4) obj2).v()))) {
                arrayList3.add(obj2);
            }
        }
        List listN1 = ww3.N1(arrayList3, 10);
        if (listN1.size() == 10) {
            return listN1;
        }
        List list2 = listN1;
        ArrayList arrayList4 = new ArrayList(yw3.W0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf(((vg4) it2.next()).v()));
        }
        Set setX1 = ww3.X1(arrayList4);
        gm0.n(str, "getRecentContactsOldWay");
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            rt2 rt2Var2 = (rt2) obj3;
            if (rt2Var2.h0() && ((vg4VarW = rt2Var2.w()) == null || !vg4VarW.D())) {
                if (rt2Var2.b.g() && (fdaVar = rt2Var2.c) != null && !fdaVar.a.M()) {
                    arrayList5.add(obj3);
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            cx3.Z0(((rt2) it3.next()).g, arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList6) {
            if (!setX1.contains(Long.valueOf(((vg4) obj4).v()))) {
                arrayList7.add(obj4);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : arrayList7) {
            if (hashSet2.add(Long.valueOf(((vg4) obj5).v()))) {
                arrayList8.add(obj5);
            }
        }
        return ww3.G1(ww3.N1(arrayList8, 10 - listN1.size()), listN1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable d(int i, nq4 nq4Var) {
        hae haeVar;
        int i2;
        Object objB;
        f9f f9fVar;
        if (nq4Var instanceof hae) {
            haeVar = (hae) nq4Var;
            int i3 = haeVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                haeVar.g = i3 - Integer.MIN_VALUE;
            } else {
                haeVar = new hae(this, nq4Var);
            }
        } else {
            haeVar = new hae(this, nq4Var);
        }
        Object obj = haeVar.e;
        int i4 = haeVar.g;
        if (i4 == 0) {
            ch3.d0(obj);
            i2 = i;
            haeVar.d = i2;
            haeVar.g = 1;
            objB = b(haeVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = haeVar.d;
            ch3.d0(obj);
            objB = obj;
            i2 = i5;
        }
        Iterable iterable = (Iterable) objB;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new kae(null, (vg4) it.next()));
        }
        ArrayList arrayListA = a();
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayListA, 10));
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new kae((rt2) it2.next(), null));
        }
        ArrayList arrayListG1 = ww3.G1(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListG1) {
            kae kaeVar = (kae) obj2;
            if (kaeVar.a != null || kaeVar.b != null) {
                arrayList3.add(obj2);
            }
        }
        List<kae> listN1 = ww3.N1(ww3.L1(arrayList3), i2);
        ArrayList arrayList4 = new ArrayList(yw3.W0(listN1, 10));
        for (kae kaeVar2 : listN1) {
            vg4 vg4Var = kaeVar2.b;
            r66 r66Var = r66.a;
            if (vg4Var != null) {
                f9fVar = f9f.b(vg4Var, r66Var);
            } else {
                rt2 rt2Var = kaeVar2.a;
                f9fVar = rt2Var.d0() ? new f9f(2, null, r66Var, rt2Var, null, null, 0L, null, null) : f9f.a(rt2Var, r66Var, null);
            }
            arrayList4.add(f9fVar);
        }
        return arrayList4;
    }
}
