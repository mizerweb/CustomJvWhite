package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz implements qf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ dz(gza gzaVar) {
        this.a = 10;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        rx3 rx3Var;
        boolean z = false;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                l8b l8bVar = ((cj4) obj).a;
                int i = l8bVar.e;
                l8b l8bVar2 = ((cj4) obj2).a;
                l8b l8bVar3 = new l8b(i + l8bVar2.e);
                l8bVar3.j(l8bVar);
                l8bVar3.j(l8bVar2);
                return new cj4(l8bVar3);
            case 1:
                return new dj4(rx8.X(((dj4) obj).a, ((dj4) obj2).a));
            case 2:
                sh3 sh3Var = (sh3) obj;
                sh3 sh3Var2 = (sh3) obj2;
                boolean z3 = sh3Var instanceof rh3;
                rh3 rh3Var = rh3.a;
                if (z3 || (sh3Var2 instanceof rh3)) {
                    return rh3Var;
                }
                if (!(sh3Var instanceof qh3) || !(sh3Var2 instanceof qh3)) {
                    if (sh3Var2 instanceof qh3) {
                        ore.k("Unreachable");
                        return null;
                    }
                    if (sh3Var2.equals(rh3Var)) {
                        ore.k("Unreachable");
                        return null;
                    }
                    ore.o();
                    return null;
                }
                pw pwVar = new pw(0);
                qh3 qh3Var = (qh3) sh3Var;
                pwVar.addAll(qh3Var.a);
                qh3 qh3Var2 = (qh3) sh3Var2;
                pwVar.addAll(qh3Var2.a);
                if (!qh3Var.b && !qh3Var2.b) {
                    z2 = false;
                }
                pw pwVar2 = new pw(0);
                pwVar2.addAll(qh3Var.c);
                pwVar2.addAll(qh3Var2.c);
                return new qh3(pwVar, z2, pwVar2, false);
            case 3:
                return sbi.a;
            case 4:
                tt4 tt4Var = (tt4) obj2;
                vt4 vt4VarI = ((vt4) obj).I(tt4Var.getKey());
                k66 k66Var = k66.a;
                if (vt4VarI == k66Var) {
                    return tt4Var;
                }
                khb khbVar = khb.f;
                xt4 xt4Var = (xt4) vt4VarI.x0(khbVar);
                if (xt4Var == null) {
                    rx3Var = new rx3(vt4VarI, tt4Var);
                } else {
                    vt4 vt4VarI2 = vt4VarI.I(khbVar);
                    if (vt4VarI2 == k66Var) {
                        return new rx3(tt4Var, xt4Var);
                    }
                    rx3Var = new rx3(new rx3(vt4VarI2, tt4Var), xt4Var);
                }
                return rx3Var;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 6:
                return ((vt4) obj).u0((tt4) obj2);
            case 7:
                return ((vt4) obj).u0((tt4) obj2);
            case 8:
                return Boolean.valueOf(cqk.d(obj, obj2));
            case 9:
                return Integer.valueOf(tre.P(((fda) obj).a.c, ((fda) obj2).a.c));
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    int i2 = 0;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            xw3.V0();
                            throw null;
                        }
                        w73 w73Var = (w73) obj3;
                        w73 w73Var2 = (w73) list2.get(i2);
                        if (w73Var.a == w73Var2.a && cqk.d(w73Var.c, w73Var2.c) && brl.c(w73Var.f, w73Var2.f) && cqk.d(w73Var.g, w73Var2.g) && cqk.d(w73Var.m, w73Var2.m) && w73Var.n == w73Var2.n && w73Var.o == w73Var2.o && w73Var.p == w73Var2.p && gm0.C(w73Var.u) == gm0.C(w73Var2.u) && w73Var.w() == w73Var2.w() && w73Var.x() == w73Var2.x() && w73Var.q == w73Var2.q && cqk.d(w73Var.r, w73Var2.r) && cqk.d(w73Var.b, w73Var2.b) && w73Var.s == w73Var2.s) {
                            i2 = i3;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                List list3 = (List) obj2;
                return tre.t0((rv8) obj, tre.B0(n1g.f, list3, true), new wo9(1, list3));
            case 13:
                List list4 = (List) obj2;
                aw8 aw8VarT0 = tre.t0((rv8) obj, tre.B0(n1g.f, list4, true), new wo9(2, list4));
                if (aw8VarT0 != null) {
                    return lvb.o0(aw8VarT0);
                }
                return null;
            case 14:
                List list5 = (List) obj2;
                List list6 = (List) obj;
                ArrayList arrayList = new ArrayList(yw3.W0(list6, 10));
                Iterator it = list6.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((osg) it.next()).b.a));
                }
                List list7 = list5;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list7, 10));
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((osg) it2.next()).b.a));
                }
                return Boolean.valueOf(arrayList.equals(arrayList2));
            case 15:
                tt4 tt4Var2 = (tt4) obj2;
                if (!(tt4Var2 instanceof pqh)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? tt4Var2 : Integer.valueOf(iIntValue + 1);
            case 16:
                pqh pqhVar = (pqh) obj;
                tt4 tt4Var3 = (tt4) obj2;
                if (pqhVar != null) {
                    return pqhVar;
                }
                if (tt4Var3 instanceof pqh) {
                    return (pqh) tt4Var3;
                }
                return null;
            default:
                xqh xqhVar = (xqh) obj;
                tt4 tt4Var4 = (tt4) obj2;
                if (tt4Var4 instanceof pqh) {
                    pqh pqhVar2 = (pqh) tt4Var4;
                    vt4 vt4Var = xqhVar.a;
                    ThreadLocal threadLocal = pqhVar2.b;
                    Object obj4 = threadLocal.get();
                    threadLocal.set(pqhVar2.a);
                    Object[] objArr = xqhVar.b;
                    int i4 = xqhVar.d;
                    objArr[i4] = obj4;
                    pqh[] pqhVarArr = xqhVar.c;
                    xqhVar.d = i4 + 1;
                    pqhVarArr[i4] = pqhVar2;
                }
                return xqhVar;
        }
    }

    public /* synthetic */ dz(int i) {
        this.a = i;
    }
}
