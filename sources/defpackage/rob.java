package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rob implements hh9 {
    public final ny8 a;
    public final mjg b;

    public rob(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        mjg mjgVarA = p90.a(nob.c);
        this.b = mjgVarA;
        cl3 cl3Var = new cl3(mjgVarA, 2);
        ghb ghbVar = ew5.b;
        tre.m0(e9i.T(new fz6(tre.G0(cl3Var, qe7.O(100, lw5.MILLISECONDS)), new qob(this, (lq4) null, 0), 3), ((n0c) ((xhh) ny8Var2.getValue())).b()), (wmi) ny8Var3.getValue());
    }

    public final Object a(nn6 nn6Var) {
        nob nobVar = nob.c;
        mjg mjgVar = this.b;
        mjgVar.getClass();
        mjgVar.j(null, nobVar);
        Object objI = ch3.I(nn6Var, ((pnb) this.a.getValue()).a, false, true, new s9a(20));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        oob oobVar;
        pw pwVar;
        nob nobVar;
        ArrayList arrayList;
        if (nq4Var instanceof oob) {
            oobVar = (oob) nq4Var;
            int i = oobVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                oobVar.i = i - Integer.MIN_VALUE;
            } else {
                oobVar = new oob(this, nq4Var);
            }
        } else {
            oobVar = new oob(this, nq4Var);
        }
        Object obj = oobVar.g;
        int i2 = oobVar.i;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(obj);
            nob nobVar2 = (nob) this.b.getValue();
            boolean zIsEmpty = nobVar2.a.isEmpty();
            int i4 = 20;
            ny8 ny8Var = this.a;
            hu4 hu4Var = hu4.a;
            if (zIsEmpty && nobVar2.b.isEmpty()) {
                pnb pnbVar = (pnb) ny8Var.getValue();
                oobVar.d = null;
                oobVar.i = 1;
                Object objI = ch3.I(oobVar, pnbVar.a, true, false, new ik4(i4));
                if (objI != hu4Var) {
                    return objI;
                }
            } else {
                pwVar = new pw(0);
                List list = nobVar2.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((xn6) obj2).b().a()) {
                        arrayList2.add(obj2);
                    }
                }
                pwVar.addAll(arrayList2);
                pnb pnbVar2 = (pnb) ny8Var.getValue();
                oobVar.d = nobVar2;
                oobVar.e = pwVar;
                oobVar.f = arrayList2;
                oobVar.i = 2;
                Object objI2 = ch3.I(oobVar, pnbVar2.a, true, false, new ik4(i4));
                if (objI2 != hu4Var) {
                    nobVar = nobVar2;
                    obj = objI2;
                    arrayList = arrayList2;
                }
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
            return obj;
        }
        if (i2 != 2) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = oobVar.f;
        pwVar = oobVar.e;
        nobVar = oobVar.d;
        ch3.d0(obj);
        List list2 = (List) obj;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            bo6 bo6VarE = ((xn6) obj3).e();
            if (bo6VarE == bo6.MESSAGE_EDITED || bo6VarE == bo6.CHAT_MESSAGE_EDITED || bo6VarE == bo6.CHANNEL_MESSAGE_EDITED) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.isEmpty()) {
            pwVar.addAll(list2);
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                xn6 xn6Var = (xn6) obj4;
                if (!arrayList3.isEmpty()) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            xn6 xn6Var2 = (xn6) it.next();
                            if (xn6Var.b().equals(xn6Var2.b()) && xn6Var.h() == xn6Var2.h()) {
                                break;
                            }
                        }
                    }
                }
                arrayList4.add(obj4);
            }
            pwVar.addAll(arrayList4);
        }
        pwVar.removeIf(new hk3(i3, new g3(21, nobVar)));
        return ww3.M1(pwVar, new xa8(9));
    }

    @Override // defpackage.hh9
    public final void c() {
        nob nobVar = nob.c;
        mjg mjgVar = this.b;
        mjgVar.getClass();
        mjgVar.j(null, nobVar);
    }

    public final Object d(long j, mn6 mn6Var) {
        mjg mjgVar;
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        ilb ilbVar = new ilb(j);
        do {
            mjgVar = this.b;
            value = mjgVar.getValue();
            nob nobVar = (nob) value;
            List list = nobVar.a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((xn6) obj).b().equals(ilbVar)) {
                    arrayList.add(obj);
                }
            }
            List list2 = nobVar.b;
            arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                qt4.A(it.next());
                throw null;
            }
        } while (!mjgVar.h(value, new nob(arrayList, arrayList2)));
        pnb pnbVar = (pnb) this.a.getValue();
        pnbVar.getClass();
        Object objI = ch3.I(mn6Var, pnbVar.a, false, true, new x14(10, ilbVar.a, ilbVar.b));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }
}
