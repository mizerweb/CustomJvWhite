package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                l3 l3Var = new l3(2, lq4Var, 0);
                l3Var.g = obj;
                return l3Var;
            case 1:
                l3 l3Var2 = new l3(2, lq4Var, 1);
                l3Var2.g = obj;
                return l3Var2;
            case 2:
                l3 l3Var3 = new l3(2, lq4Var, 2);
                l3Var3.g = obj;
                return l3Var3;
            case 3:
                l3 l3Var4 = new l3(2, lq4Var, 3);
                l3Var4.g = obj;
                return l3Var4;
            case 4:
                l3 l3Var5 = new l3(2, lq4Var, 4);
                l3Var5.g = obj;
                return l3Var5;
            case 5:
                l3 l3Var6 = new l3(2, lq4Var, 5);
                l3Var6.g = obj;
                return l3Var6;
            default:
                l3 l3Var7 = new l3(2, lq4Var, 6);
                l3Var7.g = obj;
                return l3Var7;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((l3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((l3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((l3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((l3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((l3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((l3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((l3) create((Map) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                yx6 yx6Var = (yx6) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var.emit(sbiVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                yx6 yx6Var2 = (yx6) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var2.emit(sbiVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                yx6 yx6Var3 = (yx6) this.g;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var3.emit(rh3.a, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                yx6 yx6Var4 = (yx6) this.g;
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var4.emit(sbiVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                yx6 yx6Var5 = (yx6) this.g;
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
                Boolean bool = Boolean.FALSE;
                this.g = null;
                this.f = 1;
                return yx6Var5.emit(bool, this) == hu4Var ? hu4Var : sbiVar;
            case 5:
                yx6 yx6Var6 = (yx6) this.g;
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
                rib ribVar = new rib();
                this.g = null;
                this.f = 1;
                return yx6Var6.emit(ribVar, this) == hu4Var ? hu4Var : sbiVar;
            default:
                Map map = (Map) this.g;
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
                Collection collectionValues = map.values();
                ArrayList arrayList = new ArrayList(yw3.W0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add((eh9) new qzb(((y6) it.next()).a).getAccessor().c(342));
                }
                ai8 ai8Var = new ai8(arrayList, null, 2);
                this.g = null;
                this.f = 1;
                return cqk.k(ai8Var, this) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
