package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x9f implements z9f {
    public final qw2 a;
    public final no4 b;
    public final mm4 c;
    public final daf d;

    public x9f(qw2 qw2Var, no4 no4Var, mm4 mm4Var, daf dafVar) {
        this.a = qw2Var;
        this.b = no4Var;
        this.c = mm4Var;
        this.d = dafVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.z9f
    public final Object a(String str, nq4 nq4Var) {
        w9f w9fVar;
        daf dafVar;
        ArrayList arrayList;
        if (nq4Var instanceof w9f) {
            w9fVar = (w9f) nq4Var;
            int i = w9fVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w9fVar.g = i - Integer.MIN_VALUE;
            } else {
                w9fVar = new w9f(this, nq4Var);
            }
        } else {
            w9fVar = new w9f(this, nq4Var);
        }
        Object objB = w9fVar.e;
        int i2 = w9fVar.g;
        if (i2 == 0) {
            ch3.d0(objB);
            m8b m8bVar = new m8b();
            List listP = this.a.P(qw2.I);
            ArrayList<rt2> arrayList2 = new ArrayList();
            Iterator it = listP.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                dafVar = this.d;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                if (dafVar.e((rt2) next, str)) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.size() > 1) {
                bx3.Y0(arrayList2, new xa8(26));
            }
            ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
            for (rt2 rt2Var : arrayList2) {
                vg4 vg4VarW = rt2Var.w();
                if (vg4VarW != null) {
                    m8bVar.a(vg4VarW.v());
                }
                arrayList3.add(dafVar.a(rt2Var, str));
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            w9fVar.d = arrayList4;
            w9fVar.g = 1;
            objB = b(str, m8bVar, w9fVar);
            Object obj = hu4.a;
            if (objB == obj) {
                return obj;
            }
            arrayList = arrayList4;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = w9fVar.d;
            ch3.d0(objB);
        }
        arrayList.addAll((List) objB);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[LOOP:0: B:32:0x00bb->B:34:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, m8b m8bVar, nq4 nq4Var) {
        v9f v9fVar;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        if (nq4Var instanceof v9f) {
            v9fVar = (v9f) nq4Var;
            int i = v9fVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9fVar.j = i - Integer.MIN_VALUE;
            } else {
                v9fVar = new v9f(this, nq4Var);
            }
        } else {
            v9fVar = new v9f(this, nq4Var);
        }
        Object objH = v9fVar.h;
        int i2 = v9fVar.j;
        lq4 lq4Var = null;
        daf dafVar = this.d;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objH);
            v9fVar.d = str;
            v9fVar.e = m8bVar;
            v9fVar.j = 1;
            objH = this.b.a.h();
            if (objH != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            m8bVar = v9fVar.e;
            str = v9fVar.d;
            ch3.d0(objH);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = v9fVar.g;
            arrayList2 = v9fVar.f;
            str2 = v9fVar.d;
            ch3.d0(objH);
        }
        bx3.Y0(arrayList, (Comparator) objH);
        arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
        it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(dafVar.b((vg4) it.next(), str2));
        }
        return arrayList3;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : (Iterable) objH) {
            vg4 vg4Var = (vg4) obj;
            if (!m8bVar.d(vg4Var.v()) && dafVar.f(vg4Var, str)) {
                arrayList4.add(obj);
            }
        }
        v9fVar.d = str;
        v9fVar.e = null;
        v9fVar.f = arrayList4;
        v9fVar.g = arrayList4;
        v9fVar.j = 2;
        mm4 mm4Var = this.c;
        objH = yab.K0((xt4) mm4Var.c.getValue(), new qn6(mm4Var, lq4Var, 13), v9fVar);
        if (objH != hu4Var) {
            str2 = str;
            arrayList = arrayList4;
            arrayList2 = arrayList;
            bx3.Y0(arrayList, (Comparator) objH);
            arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(dafVar.b((vg4) it.next(), str2));
            }
            return arrayList3;
        }
        return hu4Var;
    }
}
