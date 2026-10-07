package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uk4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ yk4 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk4(yk4 yk4Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = yk4Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new uk4(this.g, this.h, lq4Var, 0);
            case 1:
                return new uk4(this.g, this.h, lq4Var, 1);
            case 2:
                return new uk4(this.g, this.h, lq4Var, 2);
            case 3:
                return new uk4(this.g, this.h, lq4Var, 3);
            case 4:
                return new uk4(this.g, this.h, lq4Var, 4);
            default:
                return new uk4(this.g, this.h, lq4Var, 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((uk4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.h;
        yk4 yk4Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return yk4.C(yk4Var, j, false, this) == hu4Var ? hu4Var : sbiVar;
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
                    ch4 ch4Var = (ch4) yk4Var.j.getValue();
                    this.f = 1;
                    return ch4Var.a(this.h, this, null, null) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    no4 no4Var = (no4) yk4Var.f.getValue();
                    this.f = 1;
                    obj = no4Var.i(j);
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
                return Boolean.valueOf(jcd.d((jcd) yk4Var.s.getValue(), (vg4) obj, null, 2));
            case 3:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    bm4 bm4Var = (bm4) yk4Var.k.getValue();
                    this.f = 1;
                    return bm4Var.a(j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    mh4 mh4Var = (mh4) yk4Var.h.getValue();
                    this.f = 1;
                    return mh4Var.a(j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i6 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    sch schVar = (sch) yk4Var.l.getValue();
                    this.f = 1;
                    return schVar.a(j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
