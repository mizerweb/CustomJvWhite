package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ek3 extends mdh implements xf7 {
    public /* synthetic */ String e;
    public /* synthetic */ boolean f;
    public /* synthetic */ ylc g;
    public /* synthetic */ ulc h;
    public /* synthetic */ ulc i;
    public final /* synthetic */ fk3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek3(fk3 fk3Var, lq4 lq4Var) {
        super(6, lq4Var);
        this.j = fk3Var;
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ek3 ek3Var = new ek3(this.j, (lq4) obj6);
        ek3Var.e = (String) obj;
        ek3Var.f = zBooleanValue;
        ek3Var.g = (ylc) obj3;
        ek3Var.h = (ulc) obj4;
        ek3Var.i = (ulc) obj5;
        return ek3Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        wca wcaVar;
        Iterator it;
        boolean zContains;
        String str = this.e;
        boolean z = this.f;
        ylc ylcVar = this.g;
        ulc ulcVar = this.h;
        ulc ulcVar2 = this.i;
        ch3.d0(obj);
        ulc ulcVar3 = (ulc) ylcVar.a;
        Boolean bool = (Boolean) ylcVar.b;
        bool.getClass();
        fk3 fk3Var = this.j;
        fk3Var.Y.set(cqk.d(ulcVar2 != null ? ulcVar2.a : null, str) ? ulcVar2 : null);
        vca vcaVar = (vca) fk3Var.w.getValue();
        if (ulcVar3 == null) {
            list = null;
        } else {
            if (!cqk.d(ulcVar3.a, str)) {
                ulcVar3 = null;
            }
            if (ulcVar3 != null) {
                list = ulcVar3.b;
            } else {
                list = null;
            }
        }
        if (ulcVar == null) {
            list2 = null;
        } else {
            ulc ulcVar4 = cqk.d(ulcVar.a, str) ? ulcVar : null;
            if (ulcVar4 != null) {
                list2 = ulcVar4.b;
            } else {
                list2 = null;
            }
        }
        if (ulcVar2 == null) {
            list3 = null;
        } else {
            if (!cqk.d(ulcVar2.a, str)) {
                ulcVar2 = null;
            }
            if (ulcVar2 != null) {
                list3 = ulcVar2.b;
            } else {
                list3 = null;
            }
        }
        String str2 = ulcVar != null ? ulcVar.e : null;
        int iMax = z ? Math.max(5, (int) ((Number) ((g5d) ((gjf) fk3Var.j.getValue())).a.s4.a(e5d.S6[280]).i()).longValue()) : 5;
        vcaVar.getClass();
        boolean z2 = list == null || list2 == null || list3 == null;
        List list6 = list;
        boolean z3 = (list6 == null || list6.isEmpty()) && ((list4 = list2) == null || list4.isEmpty()) && ((list5 = list3) == null || list5.isEmpty());
        if (z2 && z3) {
            gm0.Y(vca.class.getName(), "Early return in invoke cuz of hasPending && empty");
            wcaVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            List listO1 = r66.a;
            if (list != null && list2 != null) {
                List list7 = list;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    rt2 rt2Var = ((f9f) it2.next()).d;
                    Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.A()) : null;
                    if (lValueOf != null) {
                        arrayList2.add(lValueOf);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    vg4 vg4Var = ((f9f) it3.next()).e;
                    Long lValueOf2 = vg4Var != null ? Long.valueOf(vg4Var.v()) : null;
                    if (lValueOf2 != null) {
                        arrayList3.add(lValueOf2);
                    }
                }
                ArrayList<zxd> arrayList4 = new ArrayList();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    zxd zxdVar = (zxd) next;
                    fgb fgbVar = daf.b;
                    st2 st2Var = zxdVar.a;
                    gm4 gm4Var = zxdVar.c;
                    if (st2Var != null) {
                        zContains = arrayList2.contains(Long.valueOf(st2Var.a));
                        it = it4;
                    } else {
                        if (gm4Var != null) {
                            pj4 pj4Var = gm4Var.a;
                            it = it4;
                            long j = pj4Var.a;
                            List list8 = list;
                            if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                                Iterator it5 = list8.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        try {
                                            f9f f9fVar = (f9f) it5.next();
                                            rt2 rt2Var2 = f9fVar.d;
                                            if (rt2Var2 != null && rt2Var2.h0() && f9fVar.d.w().v() == j) {
                                            }
                                        } catch (Throwable th) {
                                            qr7.o(th);
                                            return null;
                                        }
                                    } else if (pj4Var != null || !arrayList3.contains(Long.valueOf(pj4Var.a))) {
                                    }
                                    zContains = true;
                                }
                            } else if (pj4Var != null) {
                            }
                        } else {
                            it = it4;
                        }
                        zContains = false;
                    }
                    if (!zContains) {
                        arrayList4.add(next);
                    }
                    it4 = it;
                }
                ArrayList arrayList5 = new ArrayList(yw3.W0(arrayList4, 10));
                for (zxd zxdVar2 : arrayList4) {
                    arrayList5.add(new f9f(5, null, zxdVar2.b, null, null, null, 0L, zxdVar2, str2));
                }
                if (arrayList5.size() > iMax) {
                    listO1 = ww3.O1(arrayList5.size() - iMax, arrayList5);
                }
                arrayList.addAll(ww3.N1(arrayList5, iMax));
            }
            List list9 = listO1;
            if (list3 != null) {
                arrayList.addAll(list3);
            }
            wcaVar = new wca(arrayList, list9);
        }
        return new e5i(str, wcaVar, bool);
    }
}
