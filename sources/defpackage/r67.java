package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class r67 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public Object f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ x67 i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r67(x67 x67Var, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = x67Var;
        this.j = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.j;
        x67 x67Var = this.i;
        switch (i) {
            case 0:
                r67 r67Var = new r67(x67Var, str, lq4Var, 0);
                r67Var.h = obj;
                return r67Var;
            default:
                r67 r67Var2 = new r67(x67Var, str, lq4Var, 1);
                r67Var2.h = obj;
                return r67Var2;
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
        return ((r67) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object poeVar;
        Object poeVar2;
        int i = this.e;
        int i2 = 3;
        String str = this.j;
        hu4 hu4Var = hu4.a;
        x67 x67Var = this.i;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i3 = this.g;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            ch3.d0(obj);
                        } else {
                            if (i3 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ch3.d0(obj);
                        }
                        return sbiVar;
                    }
                    ch3.d0(obj);
                    f27 f27Var = x67Var.h;
                    this.h = null;
                    this.f = null;
                    this.g = 1;
                    if (f27Var.a(str, this) == hu4Var) {
                        return hu4Var;
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
                    this.h = null;
                    this.f = poeVar;
                    this.g = 2;
                    if (yab.K0(((n0c) x67Var.c).c(), new c37(x67Var, lq4Var, i2), this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            default:
                int i4 = this.g;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            ch3.d0(obj);
                        } else {
                            if (i4 != 2) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ch3.d0(obj);
                        }
                        return sbiVar;
                    }
                    ch3.d0(obj);
                    a47 a47Var = x67Var.i;
                    this.h = null;
                    this.f = null;
                    this.g = 1;
                    if (a47Var.a(str, this) == hu4Var) {
                        return hu4Var;
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
                    this.h = null;
                    this.f = poeVar2;
                    this.g = 2;
                    if (yab.K0(((n0c) x67Var.c).c(), new c37(x67Var, lq4Var, i2), this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
        }
    }
}
