package defpackage;

import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ara extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public jsa f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ jsa i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ara(jsa jsaVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = jsaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        jsa jsaVar = this.i;
        switch (i) {
            case 0:
                ara araVar = new ara(jsaVar, lq4Var, 0);
                araVar.h = obj;
                return araVar;
            default:
                ara araVar2 = new ara(jsaVar, lq4Var, 1);
                araVar2.h = obj;
                return araVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Set set = (Set) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ara) create(set, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = sbi.a;
        jsa jsaVar = this.i;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                Set set = (Set) this.h;
                int i2 = this.g;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        rt2 rt2Var = (rt2) jsaVar.w2.a.getValue();
                        if (rt2Var == null || !jsaVar.p0()) {
                            return obj2;
                        }
                        ((jfa) jsaVar.N1.getValue()).c(rt2Var, set, jsaVar.R2);
                        ffa ffaVar = (ffa) jsaVar.M1.getValue();
                        this.h = null;
                        this.f = jsaVar;
                        this.g = 1;
                        if (ffaVar.x(rt2Var, set, this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jsaVar = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    gm0.V(jsaVar.getClass().getName(), "messageCommentsPrefetcher fail", th);
                    return obj2;
                }
            default:
                Set set2 = (Set) this.h;
                int i3 = this.g;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jsa jsaVar2 = this.f;
                        ch3.d0(obj);
                        return obj2;
                    }
                    ch3.d0(obj);
                    zv8[] zv8VarArr = jsa.Z2;
                    v8d v8dVar = (v8d) jsaVar.L1.getValue();
                    Object value = jsaVar.w2.a.getValue();
                    if (value == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str = jsaVar.R2;
                    this.h = null;
                    this.f = jsaVar;
                    this.g = 1;
                    return v8dVar.B((rt2) value, set2, str, this) == hu4Var ? hu4Var : obj2;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    gm0.V(jsaVar.getClass().getName(), "pollUpdatesPrefetcher fail", th2);
                    return obj2;
                }
        }
    }
}
