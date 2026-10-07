package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mre {
    public final ny8 a;
    public final ifh b = new ifh(d5d.i);

    public mre(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, nq4 nq4Var) {
        lre lreVar;
        mre mreVar;
        ue7 ue7VarE;
        LinkedHashSet linkedHashSet;
        te7 te7Var;
        List list;
        LinkedHashSet linkedHashSet2;
        List list2;
        if (nq4Var instanceof lre) {
            lreVar = (lre) nq4Var;
            int i = lreVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lreVar.h = i - Integer.MIN_VALUE;
                mreVar = this;
            } else {
                mreVar = this;
                lreVar = new lre(mreVar, nq4Var);
            }
        } else {
            mreVar = this;
            lreVar = new lre(mreVar, nq4Var);
        }
        Object objI = lreVar.f;
        int i2 = lreVar.h;
        int i3 = 4;
        int i4 = 3;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            if (r5h.X0(str) || (ue7VarE = ve7.e(str)) == null) {
                return r66.a;
            }
            te7 te7VarA = ue7VarE.a();
            String str2 = te7VarA.a;
            String str3 = te7VarA.b;
            te7 te7Var2 = te7VarA.c;
            te7 te7VarB = ue7VarE.b();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            if (te7Var2 != null) {
                dn4 dn4VarB = mreVar.b();
                String str4 = te7Var2.a;
                String str5 = te7Var2.b;
                lreVar.d = te7VarB;
                lreVar.e = linkedHashSet3;
                lreVar.h = 1;
                linkedHashSet = linkedHashSet3;
                Object objI2 = ch3.I(lreVar, ((in4) dn4VarB).a, true, false, new jh3(3, str3, str2, str4, str5));
                if (objI2 != hu4Var) {
                    te7Var = te7VarB;
                    objI = objI2;
                    list = (List) objI;
                }
            } else {
                linkedHashSet = linkedHashSet3;
                dn4 dn4VarB2 = mreVar.b();
                lreVar.d = te7VarB;
                lreVar.e = linkedHashSet;
                lreVar.h = 2;
                Object objI3 = ch3.I(lreVar, ((in4) dn4VarB2).a, true, false, new z92(str3, str2, i3));
                if (objI3 != hu4Var) {
                    te7Var = te7VarB;
                    objI = objI3;
                    list = (List) objI;
                }
            }
            return hu4Var;
        }
        if (i2 == 1) {
            linkedHashSet = lreVar.e;
            te7Var = lreVar.d;
            ch3.d0(objI);
            list = (List) objI;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    linkedHashSet2 = lreVar.e;
                    ch3.d0(objI);
                    list2 = (List) objI;
                    linkedHashSet2.addAll(list2);
                    return ww3.T1(linkedHashSet2);
                }
                if (i2 != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                linkedHashSet2 = lreVar.e;
                ch3.d0(objI);
                list2 = (List) objI;
                linkedHashSet2.addAll(list2);
                return ww3.T1(linkedHashSet2);
            }
            linkedHashSet = lreVar.e;
            te7Var = lreVar.d;
            ch3.d0(objI);
            list = (List) objI;
        }
        linkedHashSet.addAll(list);
        te7 te7Var3 = te7Var.c;
        String str6 = te7Var.a;
        String str7 = te7Var.b;
        if (te7Var3 != null) {
            dn4 dn4VarB3 = mreVar.b();
            te7 te7Var4 = te7Var.c;
            String str8 = te7Var4.a;
            String str9 = te7Var4.b;
            lreVar.d = null;
            lreVar.e = linkedHashSet;
            lreVar.h = 3;
            objI = ch3.I(lreVar, ((in4) dn4VarB3).a, true, false, new jh3(2, str7, str6, str8, str9));
            if (objI != hu4Var) {
                linkedHashSet2 = linkedHashSet;
                list2 = (List) objI;
                linkedHashSet2.addAll(list2);
                return ww3.T1(linkedHashSet2);
            }
        } else {
            dn4 dn4VarB4 = mreVar.b();
            lreVar.d = null;
            lreVar.e = linkedHashSet;
            lreVar.h = 4;
            objI = ch3.I(lreVar, ((in4) dn4VarB4).a, true, false, new z92(str7, str6, i4));
            if (objI != hu4Var) {
                linkedHashSet2 = linkedHashSet;
                list2 = (List) objI;
                linkedHashSet2.addAll(list2);
                return ww3.T1(linkedHashSet2);
            }
        }
        return hu4Var;
    }

    public final dn4 b() {
        return (dn4) this.a.getValue();
    }

    public final long c(ki4 ki4Var) {
        dn4 dn4VarB = b();
        in4 in4Var = (in4) dn4VarB;
        return ((Number) ch3.G(in4Var.a, false, true, new os1(in4Var, new xi4(0L, ki4Var.a, ki4Var), ((se7) this.b.getValue()).a, 6))).longValue();
    }
}
