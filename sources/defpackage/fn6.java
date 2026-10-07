package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fn6 extends mdh implements cf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn6(gn6 gn6Var, ilb ilbVar, long j, lq4 lq4Var) {
        super(1, lq4Var);
        this.h = gn6Var;
        this.i = ilbVar;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.i;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new fn6((gn6) obj2, (ilb) obj, this.g, lq4Var);
            default:
                return new fn6((sua) obj2, this.g, (gda) obj, lq4Var);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((fn6) create(lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objP;
        Object objF;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        Object obj2 = this.h;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objB = gn6.b((gn6) obj2, (ilb) obj3, this.g, this);
                    return objB == hu4Var ? hu4Var : objB;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                gda gdaVar = (gda) obj3;
                sua suaVar = (sua) obj2;
                uoa uoaVar = suaVar.a;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    long j = gdaVar.a;
                    this.f = 1;
                    objP = suaVar.p(this.g, j, this);
                    if (objP != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 == 2 || i3 == 3 || i3 == 4) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                objP = obj;
                sfa sfaVar = (sfa) objP;
                if (sfaVar != null) {
                    return sfaVar;
                }
                long j2 = gdaVar.f;
                uoa uoaVar2 = suaVar.a;
                if (j2 == 0) {
                    long jA = uoa.a(uoaVar2, this.g, gdaVar, suaVar.l());
                    this.f = 2;
                    Object objF2 = suaVar.f(jA, this);
                    if (objF2 != hu4Var) {
                        return objF2;
                    }
                } else {
                    ose oseVar = (ose) uoaVar2;
                    toa toaVar = (toa) oseVar.h();
                    gga ggaVar = (gga) ch3.G(toaVar.a, true, false, new koa(this.g, j2, toaVar, 0));
                    sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
                    if (sfaVarB != null) {
                        long j3 = sfaVarB.a;
                        if (sfaVarB.b == 0) {
                            List list = xfa.b;
                            long jL = suaVar.l();
                            ose oseVar2 = (ose) uoaVar;
                            oseVar2.getClass();
                            oseVar2.D(gdaVar, this.g, false, null, jL, dnl.a(null));
                            ((ose) uoaVar).C(j3, new oo(sfaVarB, pm9.e(gdaVar.h, (m7f) suaVar.c.getValue()), suaVar, 17));
                            this.f = 3;
                            Object objF3 = suaVar.f(j3, this);
                            if (objF3 != hu4Var) {
                                return objF3;
                            }
                        } else {
                            long jA2 = uoa.a(suaVar.a, this.g, (gda) obj3, suaVar.l());
                            this.f = 4;
                            objF = suaVar.f(jA2, this);
                            if (objF != hu4Var) {
                                return objF;
                            }
                        }
                    } else {
                        long jA3 = uoa.a(suaVar.a, this.g, (gda) obj3, suaVar.l());
                        this.f = 4;
                        objF = suaVar.f(jA3, this);
                        if (objF != hu4Var) {
                            return objF;
                        }
                    }
                }
                return hu4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn6(sua suaVar, long j, gda gdaVar, lq4 lq4Var) {
        super(1, lq4Var);
        this.h = suaVar;
        this.g = j;
        this.i = gdaVar;
    }
}
