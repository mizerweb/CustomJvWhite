package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ywb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ tfi g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywb(tfi tfiVar, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = tfiVar;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        boolean z = this.h;
        tfi tfiVar = this.g;
        switch (i) {
            case 0:
                return new ywb(tfiVar, z, lq4Var, 0);
            default:
                return new ywb(tfiVar, z, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ywb) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = sbi.a;
        boolean z = this.h;
        hu4 hu4Var = hu4.a;
        tfi tfiVar = this.g;
        l8b l8bVar = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        this.f = 1;
                        if (tfiVar.a(z, this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return obj2;
                }
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ch3.d0(obj);
                pvb pvbVar = (pvb) tfiVar.a.getValue();
                ini iniVar = new ini();
                iniVar.z = Boolean.valueOf(z);
                wy2 wy2Var = new wy2(new ia4(l8bVar, new lni(iniVar), 23), 28);
                this.f = 1;
                obj = pvbVar.D(wy2Var, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                lni lniVar = ((w94) obj).d;
                if (lniVar != null) {
                    ((nni) tfiVar.b.getValue()).q(lniVar);
                    return obj2;
                }
                ore.p("Required value was null.");
                return null;
        }
    }
}
