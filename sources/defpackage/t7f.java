package defpackage;

import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
public final class t7f extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7f(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new t7f((SdkCoroutineWorker) obj2, lq4Var, 0);
            case 1:
                return new t7f((erg) obj2, lq4Var, 1);
            case 2:
                return new t7f((iug) obj2, lq4Var, 2);
            case 3:
                return new t7f((vzg) obj2, lq4Var, 3);
            case 4:
                return new t7f((yf5) obj2, lq4Var, 4);
            case 5:
                return new t7f((xf5) obj2, lq4Var, 5);
            case 6:
                return new t7f((nub) obj2, lq4Var, 6);
            case 7:
                return new t7f((tci) obj2, lq4Var, 7);
            default:
                return new t7f((xyj) obj2, lq4Var, 8);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((t7f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((t7f) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((t7f) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((t7f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((t7f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((t7f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((t7f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((t7f) create((sh3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((t7f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i != 0) {
                    if (i == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                SdkCoroutineWorker sdkCoroutineWorker = (SdkCoroutineWorker) this.g;
                this.f = 1;
                Object objD = sdkCoroutineWorker.d(this);
                return objD == hu4Var ? hu4Var : objD;
            case 1:
                erg ergVar = (erg) this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    if (ergVar.e.compareAndSet(false, true)) {
                        this.f = 1;
                        if (erg.a(ergVar, this) == hu4Var2) {
                            return hu4Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            case 2:
                sbi sbiVar = sbi.a;
                hu4 hu4Var3 = hu4.a;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    String str = ((iug) this.g).f;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Reload preview stories", null);
                        }
                    }
                    vzg vzgVarB = ((iug) this.g).B();
                    this.f = 1;
                    Object objEmit = vzgVarB.k.emit(pzg.a, this);
                    if (objEmit != hu4Var3) {
                        objEmit = sbiVar;
                    }
                    if (objEmit == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            case 3:
                hu4 hu4Var4 = hu4.a;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    vzg vzgVar = (vzg) this.g;
                    this.f = 1;
                    if (vzg.b(vzgVar, 10, this) == hu4Var4) {
                        return hu4Var4;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            case 4:
                hu4 hu4Var5 = hu4.a;
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yf5 yf5Var = (yf5) this.g;
                this.f = 1;
                Object objP = yf5Var.p(this);
                return objP == hu4Var5 ? hu4Var5 : objP;
            case 5:
                hu4 hu4Var6 = hu4.a;
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    xf5 xf5Var = (xf5) this.g;
                    if (xf5Var == null) {
                        return null;
                    }
                    this.f = 1;
                    obj = xf5Var.z0(this);
                    if (obj == hu4Var6) {
                        return hu4Var6;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                nqg nqgVar = (nqg) obj;
                if (nqgVar != null) {
                    return nqgVar.a;
                }
                return null;
            case 6:
                hu4 hu4Var7 = hu4.a;
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    nub nubVar = (nub) this.g;
                    this.f = 1;
                    if (nubVar.k(this) == hu4Var7) {
                        return hu4Var7;
                    }
                } else {
                    if (i7 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            case 7:
                hu4 hu4Var8 = hu4.a;
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                tci tciVar = (tci) this.g;
                this.f = 1;
                Object objA = tci.a(tciVar, this);
                return objA == hu4Var8 ? hu4Var8 : objA;
            default:
                sbi sbiVar2 = sbi.a;
                hu4 hu4Var9 = hu4.a;
                int i9 = this.f;
                if (i9 == 0) {
                    ch3.d0(obj);
                    xyj xyjVar = (xyj) this.g;
                    this.f = 1;
                    Object objK0 = yab.K0(((n0c) xyjVar.c).b(), new wyj(xyjVar, null, 0), this);
                    if (objK0 != hu4Var9) {
                        objK0 = sbiVar2;
                    }
                    if (objK0 == hu4Var9) {
                        return hu4Var9;
                    }
                } else {
                    if (i9 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar2;
        }
    }
}
