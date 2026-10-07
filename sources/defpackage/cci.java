package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cci extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ v05 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cci(v05 v05Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = v05Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new cci(this.g, this.h, lq4Var, 0);
            case 1:
                return new cci(this.g, this.h, lq4Var, 1);
            default:
                return new cci(this.g, this.h, lq4Var, 2);
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
        return ((cci) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        long j = this.h;
        sbi sbiVar = sbi.a;
        v05 v05Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    ch4 ch4Var = (ch4) ((ny8) v05Var.f).getValue();
                    this.f = 1;
                    return ch4Var.a(this.h, this, null, null) == hu4Var ? hu4Var : sbiVar;
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
                    mh4 mh4Var = (mh4) ((ny8) v05Var.e).getValue();
                    this.f = 1;
                    return mh4Var.a(j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    j93 j93Var = (j93) ((ny8) v05Var.g).getValue();
                    this.f = 1;
                    return j93Var.a(j, true, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
