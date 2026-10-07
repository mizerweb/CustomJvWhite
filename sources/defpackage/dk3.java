package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class dk3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk3(lq4 lq4Var, Object obj) {
        super(2, lq4Var);
        this.e = 3;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                dk3 dk3Var = new dk3(2, lq4Var, 0);
                dk3Var.g = obj;
                return dk3Var;
            case 1:
                dk3 dk3Var2 = new dk3(2, lq4Var, 1);
                dk3Var2.g = obj;
                return dk3Var2;
            case 2:
                dk3 dk3Var3 = new dk3(2, lq4Var, 2);
                dk3Var3.g = obj;
                return dk3Var3;
            case 3:
                return new dk3(lq4Var, this.g);
            case 4:
                dk3 dk3Var4 = new dk3(2, lq4Var, 4);
                dk3Var4.g = obj;
                return dk3Var4;
            case 5:
                dk3 dk3Var5 = new dk3(2, lq4Var, 5);
                dk3Var5.g = obj;
                return dk3Var5;
            case 6:
                dk3 dk3Var6 = new dk3(2, lq4Var, 6);
                dk3Var6.g = obj;
                return dk3Var6;
            case 7:
                dk3 dk3Var7 = new dk3(2, lq4Var, 7);
                dk3Var7.g = obj;
                return dk3Var7;
            case 8:
                dk3 dk3Var8 = new dk3(2, lq4Var, 8);
                dk3Var8.g = obj;
                return dk3Var8;
            default:
                dk3 dk3Var9 = new dk3(2, lq4Var, 9);
                dk3Var9.g = obj;
                return dk3Var9;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((dk3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((dk3) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((dk3) create((plc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
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
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ylc ylcVar = new ylc(null, Boolean.FALSE);
                this.g = null;
                this.f = 1;
                return yx6Var.emit(ylcVar, this) == hu4Var ? hu4Var : sbiVar;
            case 1:
                yx6 yx6Var2 = (yx6) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var2.emit(null, this) == hu4Var ? hu4Var : sbiVar;
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
                    return yx6Var3.emit(null, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.f;
                try {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            ch3.d0(obj);
                        } else {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    ch3.d0(obj);
                    String str = (String) this.g;
                    b78 b78VarA = vd7.A();
                    v78 v78VarK = ghb.k(str, bwb.a);
                    this.f = 1;
                    obj = vd7.s(b78VarA, v78VarK, 300L, this, 12);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    obj = new poe(th);
                }
                if (!(obj instanceof poe)) {
                    return obj;
                }
                return null;
            case 4:
                yx6 yx6Var4 = (yx6) this.g;
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
                rib ribVar = new rib();
                this.g = null;
                this.f = 1;
                return yx6Var4.emit(ribVar, this) == hu4Var ? hu4Var : sbiVar;
            case 5:
                yx6 yx6Var5 = (yx6) this.g;
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var5.emit(null, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                yx6 yx6Var6 = (yx6) this.g;
                int i8 = this.f;
                if (i8 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var6.emit(null, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i8 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                yx6 yx6Var7 = (yx6) this.g;
                int i9 = this.f;
                if (i9 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var7.emit(sbiVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i9 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                yx6 yx6Var8 = (yx6) this.g;
                int i10 = this.f;
                if (i10 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return yx6Var8.emit(sbiVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i10 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                plc plcVar = (plc) this.g;
                int i11 = this.f;
                if (i11 == 0) {
                    ch3.d0(obj);
                    if (plcVar instanceof nlc) {
                        this.g = plcVar;
                        this.f = 1;
                        if (rx8.t(600L, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return plcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
