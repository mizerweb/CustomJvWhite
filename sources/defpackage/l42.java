package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l42 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l42(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        yx6 yx6Var = (yx6) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                l42 l42Var = new l42(i2, lq4Var, 0);
                l42Var.g = yx6Var;
                l42Var.h = obj2;
                return l42Var.invokeSuspend(sbiVar);
            case 1:
                l42 l42Var2 = new l42(i2, lq4Var, 1);
                l42Var2.g = yx6Var;
                l42Var2.h = obj2;
                return l42Var2.invokeSuspend(sbiVar);
            case 2:
                l42 l42Var3 = new l42(i2, lq4Var, 2);
                l42Var3.g = yx6Var;
                l42Var3.h = obj2;
                return l42Var3.invokeSuspend(sbiVar);
            case 3:
                l42 l42Var4 = new l42(i2, lq4Var, i2);
                l42Var4.g = yx6Var;
                l42Var4.h = obj2;
                return l42Var4.invokeSuspend(sbiVar);
            case 4:
                l42 l42Var5 = new l42(i2, lq4Var, 4);
                l42Var5.g = yx6Var;
                l42Var5.h = obj2;
                return l42Var5.invokeSuspend(sbiVar);
            case 5:
                l42 l42Var6 = new l42(i2, lq4Var, 5);
                l42Var6.g = yx6Var;
                l42Var6.h = obj2;
                return l42Var6.invokeSuspend(sbiVar);
            case 6:
                l42 l42Var7 = new l42(i2, lq4Var, 6);
                l42Var7.g = yx6Var;
                l42Var7.h = obj2;
                return l42Var7.invokeSuspend(sbiVar);
            case 7:
                l42 l42Var8 = new l42(i2, lq4Var, 7);
                l42Var8.g = yx6Var;
                l42Var8.h = obj2;
                return l42Var8.invokeSuspend(sbiVar);
            default:
                l42 l42Var9 = new l42(i2, lq4Var, 8);
                l42Var9.g = yx6Var;
                l42Var9.h = obj2;
                return l42Var9.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xx6 a95Var;
        xx6 gy4Var;
        xx6 a95Var2;
        xx6 byeVar;
        int i = this.e;
        r66 r66Var = r66.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var = this.g;
                mjg mjgVarB = ((x02) this.h).b();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var, mjgVarB, this) == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var2 = this.g;
                gjg gjgVarZ = ((x02) this.h).z();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var2, gjgVarZ, this) == hu4Var ? hu4Var : sbiVar;
            case 2:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var3 = this.g;
                mjg mjgVarA = ((x02) this.h).getParticipants().a();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var3, mjgVarA, this) == hu4Var ? hu4Var : sbiVar;
            case 3:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var4 = this.g;
                mjg mjgVarJ = ((x02) this.h).u().j();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var4, mjgVarJ, this) == hu4Var ? hu4Var : sbiVar;
            case 4:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var5 = this.g;
                List list = (List) this.h;
                if (list.isEmpty()) {
                    a95Var = new tz(7, null);
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((x02) it.next()).isHeldByMe());
                    }
                    a95Var = new a95((xx6[]) ww3.T1(arrayList).toArray(new xx6[0]), list, 0);
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var5, a95Var, this) == hu4Var ? hu4Var : sbiVar;
            case 5:
                int i7 = this.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var6 = this.g;
                Collection collectionValues = ((Map) this.h).values();
                ArrayList arrayList2 = new ArrayList(yw3.W0(collectionValues, 10));
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new jz(((e5d) ((j6b) it2.next()).getAccessor().c(26)).G2.a(e5d.S6[188]).h(), 18));
                }
                xx6[] xx6VarArr = (xx6[]) ww3.T1(arrayList2).toArray(new xx6[0]);
                this.g = null;
                this.h = null;
                this.f = 1;
                e9i.M(yx6Var6);
                Object objN = n1g.n(this, yx6Var6, new ey4(xx6VarArr, 3), new fy4(3, null, 3), xx6VarArr);
                if (objN != hu4Var) {
                    objN = sbiVar;
                }
                if (objN != hu4Var) {
                    objN = sbiVar;
                }
                return objN == hu4Var ? hu4Var : sbiVar;
            case 6:
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var7 = this.g;
                Map map = (Map) this.h;
                if (map.isEmpty()) {
                    gy4Var = new tz(7, r66Var);
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        ha9 ha9Var = (ha9) entry.getKey();
                        j6b j6bVar = (j6b) entry.getValue();
                        arrayList3.add(new r07(((s7f) j6bVar.a()).u(), ha9Var, j6bVar, 4));
                    }
                    gy4Var = new gy4((xx6[]) ww3.T1(arrayList3).toArray(new xx6[0]), 2);
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var7, gy4Var, this) == hu4Var ? hu4Var : sbiVar;
            case 7:
                int i9 = this.f;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var8 = this.g;
                List list3 = (List) this.h;
                if (list3.isEmpty()) {
                    a95Var2 = new tz(7, r66Var);
                } else {
                    List list4 = list3;
                    ArrayList arrayList4 = new ArrayList(yw3.W0(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((x02) it3.next()).isHeldByMe());
                    }
                    a95Var2 = new a95((xx6[]) ww3.T1(arrayList4).toArray(new xx6[0]), list3, 1);
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var8, a95Var2, this) == hu4Var ? hu4Var : sbiVar;
            default:
                int i10 = this.f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var9 = this.g;
                Integer num = (Integer) this.h;
                if (num == null || num.intValue() <= 0) {
                    byeVar = o66.a;
                } else {
                    ghb ghbVar = ew5.b;
                    int iIntValue = num.intValue();
                    if (iIntValue < 15) {
                        iIntValue = 15;
                    }
                    byeVar = new bye(new h31(ew5.g(qe7.O(iIntValue, lw5.SECONDS)), null, 1));
                }
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var9, byeVar, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
