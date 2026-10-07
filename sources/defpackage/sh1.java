package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class sh1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh1(int i) {
        super(3, null);
        this.e = i;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = (yx6) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                sh1 sh1Var = new sh1(3, lq4Var, 0);
                sh1Var.g = yx6Var;
                sh1Var.h = obj2;
                return sh1Var.invokeSuspend(sbiVar);
            case 1:
                sh1 sh1Var2 = new sh1(3, lq4Var, 1);
                sh1Var2.g = yx6Var;
                sh1Var2.h = obj2;
                return sh1Var2.invokeSuspend(sbiVar);
            case 2:
                sh1 sh1Var3 = new sh1(3, lq4Var, 2);
                sh1Var3.g = yx6Var;
                sh1Var3.h = obj2;
                return sh1Var3.invokeSuspend(sbiVar);
            case 3:
                sh1 sh1Var4 = new sh1(3, lq4Var, 3);
                sh1Var4.g = yx6Var;
                sh1Var4.h = obj2;
                return sh1Var4.invokeSuspend(sbiVar);
            case 4:
                sh1 sh1Var5 = new sh1(3, lq4Var, 4);
                sh1Var5.g = yx6Var;
                sh1Var5.h = obj2;
                return sh1Var5.invokeSuspend(sbiVar);
            case 5:
                sh1 sh1Var6 = new sh1(3, lq4Var, 5);
                sh1Var6.g = yx6Var;
                sh1Var6.h = obj2;
                return sh1Var6.invokeSuspend(sbiVar);
            case 6:
                sh1 sh1Var7 = new sh1(3, lq4Var, 6);
                sh1Var7.g = yx6Var;
                sh1Var7.h = obj2;
                return sh1Var7.invokeSuspend(sbiVar);
            case 7:
                sh1 sh1Var8 = new sh1(3, lq4Var, 7);
                sh1Var8.g = yx6Var;
                sh1Var8.h = obj2;
                return sh1Var8.invokeSuspend(sbiVar);
            case 8:
                sh1 sh1Var9 = new sh1(3, lq4Var, 8);
                sh1Var9.g = yx6Var;
                sh1Var9.h = obj2;
                return sh1Var9.invokeSuspend(sbiVar);
            case 9:
                sh1 sh1Var10 = new sh1(3, lq4Var, 9);
                sh1Var10.g = yx6Var;
                sh1Var10.h = obj2;
                return sh1Var10.invokeSuspend(sbiVar);
            case 10:
                sh1 sh1Var11 = new sh1(3, lq4Var, 10);
                sh1Var11.g = yx6Var;
                sh1Var11.h = obj2;
                return sh1Var11.invokeSuspend(sbiVar);
            case 11:
                sh1 sh1Var12 = new sh1(3, lq4Var, 11);
                sh1Var12.g = yx6Var;
                sh1Var12.h = obj2;
                return sh1Var12.invokeSuspend(sbiVar);
            case 12:
                sh1 sh1Var13 = new sh1(3, lq4Var, 12);
                sh1Var13.g = yx6Var;
                sh1Var13.h = obj2;
                return sh1Var13.invokeSuspend(sbiVar);
            case 13:
                sh1 sh1Var14 = new sh1(3, lq4Var, 13);
                sh1Var14.g = yx6Var;
                sh1Var14.h = obj2;
                return sh1Var14.invokeSuspend(sbiVar);
            case 14:
                sh1 sh1Var15 = new sh1(3, lq4Var, 14);
                sh1Var15.g = yx6Var;
                sh1Var15.h = obj2;
                return sh1Var15.invokeSuspend(sbiVar);
            case 15:
                sh1 sh1Var16 = new sh1(3, lq4Var, 15);
                sh1Var16.g = yx6Var;
                sh1Var16.h = obj2;
                return sh1Var16.invokeSuspend(sbiVar);
            default:
                sh1 sh1Var17 = new sh1(3, lq4Var, 16);
                sh1Var17.g = yx6Var;
                sh1Var17.h = obj2;
                return sh1Var17.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
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
                gjg gjgVarZ = ((x02) this.h).z();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var, gjgVarZ, this) == hu4Var ? hu4Var : sbiVar;
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
                x02 x02Var = (x02) this.h;
                gjg gjgVarZ2 = x02Var.z();
                this.g = null;
                this.h = null;
                this.f = 1;
                e9i.M(yx6Var2);
                Object objCollect = gjgVarZ2.collect(new he(yx6Var2, 7, x02Var), this);
                if (objCollect != hu4Var) {
                    objCollect = sbiVar;
                }
                if (objCollect != hu4Var) {
                    objCollect = sbiVar;
                }
                return objCollect == hu4Var ? hu4Var : sbiVar;
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
                mjg mjgVarA = ((x02) this.h).A().a();
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
                mjg mjgVarA2 = ((x02) this.h).getParticipants().a();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var4, mjgVarA2, this) == hu4Var ? hu4Var : sbiVar;
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
                mjg mjgVarB = ((x02) this.h).b();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var5, mjgVarB, this) == hu4Var ? hu4Var : sbiVar;
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
                mjg mjgVarA3 = ((x02) this.h).A().a();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var6, mjgVarA3, this) == hu4Var ? hu4Var : sbiVar;
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
                mjg mjgVarJ = ((x02) this.h).u().j();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var7, mjgVarJ, this) == hu4Var ? hu4Var : sbiVar;
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
                gjg gjgVarIsHeldByMe = ((x02) this.h).isHeldByMe();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var8, gjgVarIsHeldByMe, this) == hu4Var ? hu4Var : sbiVar;
            case 8:
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
                r8e r8eVar = ((yv3) this.h).c;
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var9, r8eVar, this) == hu4Var ? hu4Var : sbiVar;
            case 9:
                int i11 = this.f;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var10 = this.g;
                gjg gjgVarZ3 = ((x02) this.h).z();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var10, gjgVarZ3, this) == hu4Var ? hu4Var : sbiVar;
            case 10:
                int i12 = this.f;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var11 = this.g;
                Collection collectionValues = ((Map) this.h).values();
                ArrayList arrayList = new ArrayList(yw3.W0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e5d) ((j6b) it.next()).getAccessor().c(26)).G2.a(e5d.S6[188]).h());
                }
                xx6[] xx6VarArr = (xx6[]) ww3.T1(arrayList).toArray(new xx6[0]);
                this.g = null;
                this.h = null;
                this.f = 1;
                e9i.M(yx6Var11);
                Object objN = n1g.n(this, yx6Var11, new j7(xx6VarArr, 7), new nj5(3, null, 2), xx6VarArr);
                if (objN != hu4Var) {
                    objN = sbiVar;
                }
                if (objN != hu4Var) {
                    objN = sbiVar;
                }
                return objN == hu4Var ? hu4Var : sbiVar;
            case 11:
                int i13 = this.f;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var12 = this.g;
                mjg mjgVarA4 = ((x02) this.h).getParticipants().a();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var12, mjgVarA4, this) == hu4Var ? hu4Var : sbiVar;
            case 12:
                int i14 = this.f;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var13 = this.g;
                gjg gjgVarZ4 = ((x02) this.h).z();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var13, gjgVarZ4, this) == hu4Var ? hu4Var : sbiVar;
            case 13:
                int i15 = this.f;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var14 = this.g;
                r8e r8eVar2 = ((h8g) this.h).d;
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var14, r8eVar2, this) == hu4Var ? hu4Var : sbiVar;
            case 14:
                int i16 = this.f;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var15 = this.g;
                r8e r8eVar3 = ((h8g) this.h).d;
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var15, r8eVar3, this) == hu4Var ? hu4Var : sbiVar;
            case 15:
                int i17 = this.f;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var16 = this.g;
                r8e r8eVar4 = ((eag) this.h).d;
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var16, r8eVar4, this) == hu4Var ? hu4Var : sbiVar;
            default:
                int i18 = this.f;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var17 = this.g;
                gjg gjgVarZ5 = ((x02) this.h).z();
                this.g = null;
                this.h = null;
                this.f = 1;
                return e9i.L(yx6Var17, gjgVarZ5, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
