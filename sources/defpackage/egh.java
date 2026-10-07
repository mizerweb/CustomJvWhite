package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class egh extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public hgh f;
    public int g;
    public final /* synthetic */ hgh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egh(hgh hghVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = hghVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hgh hghVar = this.h;
        switch (i) {
            case 0:
                return new egh(hghVar, lq4Var, 0);
            case 1:
                return new egh(hghVar, lq4Var, 1);
            default:
                return new egh(hghVar, lq4Var, 2);
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
            case 1:
                break;
        }
        return ((egh) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = sbi.a;
        hgh hghVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        oqg oqgVarK = hghVar.k();
                        this.f = hghVar;
                        this.g = 1;
                        obj = oqgVarK.d(this);
                        if (obj == hu4Var) {
                            obj = hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hghVar = this.f;
                        ch3.d0(obj);
                    }
                    return obj;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    gm0.V(hghVar.b, "fail to getPushToken", th);
                }
                break;
            case 1:
                int i3 = this.g;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        oqg oqgVarK2 = hghVar.k();
                        this.f = hghVar;
                        this.g = 1;
                        if (oqgVarK2.g(this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hghVar = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused) {
                    gm0.Y(hghVar.b, "storeServicesInfo.initialize() failed");
                    return obj2;
                }
            default:
                int i4 = this.g;
                try {
                    if (i4 == 0) {
                        ch3.d0(obj);
                        lxe lxeVar = (lxe) hghVar.d.getValue();
                        this.f = hghVar;
                        this.g = 1;
                        if (lxeVar.g(this) == hu4Var) {
                            obj2 = hu4Var;
                        }
                    } else {
                        if (i4 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hghVar = this.f;
                        ch3.d0(obj);
                    }
                    return obj2;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable unused2) {
                    gm0.Y(hghVar.b, "reservedStoreServicesInfo.initialize() failed");
                    return obj2;
                }
        }
    }
}
