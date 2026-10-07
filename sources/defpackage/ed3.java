package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ed3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public xd3 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xd3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed3(xd3 xd3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = xd3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xd3 xd3Var = this.i;
        switch (i) {
            case 0:
                ed3 ed3Var = new ed3(xd3Var, lq4Var, 0);
                ed3Var.h = obj;
                return ed3Var;
            default:
                ed3 ed3Var2 = new ed3(xd3Var, lq4Var, 1);
                ed3Var2.h = obj;
                return ed3Var2;
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
        return ((ed3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        int i = this.e;
        xd3 xd3Var = this.i;
        hu4 hu4Var = hu4.a;
        boolean z = true;
        sbi sbiVar = sbi.a;
        Object poeVar2 = null;
        switch (i) {
            case 0:
                gu4 gu4Var = (gu4) this.h;
                int i2 = this.g;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        jz jzVar = new jz(xd3Var.G1, 13);
                        this.h = gu4Var;
                        this.f = xd3Var;
                        this.g = 1;
                        obj = e9i.N(jzVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xd3Var = this.f;
                        ch3.d0(obj);
                    }
                    vg4 vg4VarW = ((rt2) obj).w();
                    if (vg4VarW != null) {
                        xd3Var.W1.set(((yfd) xd3Var.K.getValue()).H(vg4VarW.v(), xd3.class.getName() + "@" + gu4Var.hashCode()));
                        poeVar2 = sbiVar;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    poeVar2 = new poe(th);
                }
                Throwable thA = roe.a(poeVar2);
                if (thA != null) {
                    qv1.t(gu4Var, "onScreenAttached fail", thA);
                }
                return sbiVar;
            default:
                gu4 gu4Var2 = (gu4) this.h;
                int i3 = this.g;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        jz jzVar2 = new jz(xd3Var.G1, 13);
                        this.h = gu4Var2;
                        this.f = xd3Var;
                        this.g = 1;
                        obj = e9i.N(jzVar2, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xd3Var = this.f;
                        ch3.d0(obj);
                    }
                    rt2 rt2Var = (rt2) obj;
                    if (rt2Var.b.I.n) {
                        z = false;
                    } else {
                        zv8[] zv8VarArr = xd3.X1;
                        if (!((f5d) ((wo6) xd3Var.s.getValue())).q()) {
                            z = false;
                        }
                    }
                    if (rt2Var.d0() && rt2Var.z0() && rt2Var.J() && z && !rt2Var.b.I.m) {
                        a8j.x(xd3Var.L1, new dc3());
                    }
                    poeVar = sbiVar;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    poeVar = new poe(th2);
                }
                Throwable thA2 = roe.a(poeVar);
                if (thA2 != null) {
                    qv1.t(gu4Var2, "showDiscussionTooltipIfNeeded fail", thA2);
                }
                return sbiVar;
        }
    }
}
