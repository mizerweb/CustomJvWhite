package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class lpg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ spg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpg(spg spgVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = spgVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        spg spgVar = this.h;
        switch (i) {
            case 0:
                lpg lpgVar = new lpg(spgVar, lq4Var, 0);
                lpgVar.g = obj;
                return lpgVar;
            default:
                lpg lpgVar2 = new lpg(spgVar, lq4Var, 1);
                lpgVar2.g = obj;
                return lpgVar2;
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
        return ((lpg) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object poeVar;
        Object poeVar2;
        int i = this.e;
        spg spgVar = this.h;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                gu4 gu4Var = (gu4) this.g;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        zv8[] zv8VarArr = spg.y;
                        ldh ldhVarD = spgVar.D();
                        long j = spgVar.d;
                        this.g = gu4Var;
                        this.f = 1;
                        if (ldhVarD.p(j, true, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    poeVar = sbiVar;
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    qv1.t(gu4Var, "Can't delete sticker set", thA);
                }
                return sbiVar;
            default:
                gu4 gu4Var2 = (gu4) this.g;
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        zv8[] zv8VarArr2 = spg.y;
                        ldh ldhVarD2 = spgVar.D();
                        long j2 = spgVar.d;
                        this.g = gu4Var2;
                        this.f = 1;
                        if (ldhVarD2.p(j2, false, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    poeVar2 = sbiVar;
                    break;
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 != null) {
                    if (thA2 instanceof CancellationException) {
                        throw thA2;
                    }
                    qv1.t(gu4Var2, "Can't delete sticker set", thA2);
                }
                return sbiVar;
        }
    }
}
