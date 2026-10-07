package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p25 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p25(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new p25(1, lq4Var, 0);
            case 1:
                return new p25(1, lq4Var, 1);
            case 2:
                return new p25(1, lq4Var, 2);
            case 3:
                return new p25(1, lq4Var, 3);
            case 4:
                return new p25(1, lq4Var, 4);
            case 5:
                return new p25(1, lq4Var, 5);
            default:
                return new p25(1, lq4Var, 6);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                ((p25) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                return new p25(1, lq4Var, 1).invokeSuspend(sbiVar);
            case 2:
                return new p25(1, lq4Var, 2).invokeSuspend(sbiVar);
            case 3:
                return new p25(1, lq4Var, 3).invokeSuspend(sbiVar);
            case 4:
                return new p25(1, lq4Var, 4).invokeSuspend(sbiVar);
            case 5:
                return new p25(1, lq4Var, 5).invokeSuspend(sbiVar);
            default:
                return new p25(1, lq4Var, 6).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    throw null;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    yek yekVarA = xik.a();
                    this.f = 1;
                    obj = cqk.k(new iik(yekVarA.a.a, false, null), this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return ((i4k) obj).a;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    yek yekVarA2 = xik.a();
                    this.f = 1;
                    obj = cqk.k(new iik(yekVarA2.a.a, false, null), this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                i4k i4kVar = (i4k) obj;
                return new o7k(i4kVar.a, i4kVar.b);
            case 3:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    ewe eweVar = new ewe(qgk.c(), xik.a);
                    this.f = 1;
                    return eweVar.b(true, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                n7k n7kVar = (n7k) qgk.e.getValue();
                this.f = 1;
                Object objE = n7kVar.e(this);
                return objE == hu4Var ? hu4Var : objE;
            case 5:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    n7k n7kVar2 = (n7k) qgk.e.getValue();
                    this.f = 1;
                    return n7kVar2.b(this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i8 = this.f;
                if (i8 == 0) {
                    ch3.d0(obj);
                    yek yekVarA3 = xik.a();
                    this.f = 1;
                    obj = cqk.k(new iik(yekVarA3.a.a, false, null), this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i8 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                i4k i4kVar2 = (i4k) obj;
                return new o7k(i4kVar2.a, i4kVar2.b);
        }
    }
}
