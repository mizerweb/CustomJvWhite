package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class evf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public gvf f;
    public gvf g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ gvf k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evf(gvf gvfVar, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.k = gvfVar;
        this.l = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        int i2 = this.l;
        gvf gvfVar = this.k;
        switch (i) {
            case 0:
                return new evf(gvfVar, i2, lq4Var, 0);
            default:
                return new evf(gvfVar, i2, lq4Var, 1);
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
        return ((evf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        gvf gvfVar;
        int i;
        gvf gvfVar2;
        int i2;
        int i3 = this.e;
        sbi sbiVar = sbi.a;
        int i4 = this.l;
        gvf gvfVar3 = this.k;
        hu4 hu4Var = hu4.a;
        int i5 = 0;
        switch (i3) {
            case 0:
                int i6 = this.j;
                try {
                    try {
                        try {
                            if (i6 == 0) {
                                ch3.d0(obj);
                                zv8[] zv8VarArr = gvf.C;
                                if (nbh.c(gvfVar3.E().d.getString("app.privacy.phone.number.privacy", "CONTACTS")) == i4) {
                                    return sbiVar;
                                }
                                mfi mfiVar = (mfi) gvfVar3.l.getValue();
                                this.f = gvfVar3;
                                this.g = gvfVar3;
                                this.h = 0;
                                this.i = 0;
                                this.j = 1;
                                if (mfiVar.a(i4, this) != hu4Var) {
                                    gvfVar = gvfVar3;
                                    i = 0;
                                }
                                return hu4Var;
                            }
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                gvf gvfVar4 = this.f;
                                ch3.d0(obj);
                                return sbiVar;
                            }
                            int i7 = this.i;
                            int i8 = this.h;
                            gvf gvfVar5 = this.g;
                            gvf gvfVar6 = this.f;
                            ch3.d0(obj);
                            i5 = i8;
                            i = i7;
                            gvfVar = gvfVar5;
                            gvfVar3 = gvfVar6;
                            this.f = gvfVar;
                            this.g = null;
                            this.h = i5;
                            this.i = i;
                            this.j = 2;
                            if (gvf.D(gvfVar3, this) != hu4Var) {
                                return sbiVar;
                            }
                            return hu4Var;
                        } catch (Throwable th) {
                            th = th;
                            gvfVar3 = gvfVar;
                            gm0.V(gvfVar3.x, "updatePhoneNumberPrivacy fail", th);
                            gvf.C(gvfVar3, th);
                            return sbiVar;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                int i9 = this.j;
                try {
                    try {
                        try {
                            if (i9 == 0) {
                                ch3.d0(obj);
                                gfi gfiVar = (gfi) gvfVar3.j.getValue();
                                this.f = gvfVar3;
                                this.g = gvfVar3;
                                this.h = 0;
                                this.i = 0;
                                this.j = 1;
                                if (gfiVar.a(i4, this) != hu4Var) {
                                    gvfVar2 = gvfVar3;
                                    i2 = 0;
                                }
                                return hu4Var;
                            }
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    ore.k("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                gvf gvfVar7 = this.f;
                                ch3.d0(obj);
                                return sbiVar;
                            }
                            int i10 = this.i;
                            int i11 = this.h;
                            gvf gvfVar8 = this.g;
                            gvf gvfVar9 = this.f;
                            ch3.d0(obj);
                            i5 = i11;
                            i2 = i10;
                            gvfVar2 = gvfVar8;
                            gvfVar3 = gvfVar9;
                            this.f = gvfVar2;
                            this.g = null;
                            this.h = i5;
                            this.i = i2;
                            this.j = 2;
                            if (gvf.D(gvfVar3, this) != hu4Var) {
                                return sbiVar;
                            }
                            return hu4Var;
                        } catch (Throwable th3) {
                            th = th3;
                            gvfVar3 = gvfVar2;
                            gm0.V(gvfVar3.x, "updateWhoCanSearchMeByPhone fail", th);
                            gvf.C(gvfVar3, th);
                            return sbiVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                break;
        }
    }
}
