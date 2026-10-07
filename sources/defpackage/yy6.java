package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yy6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yx6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy6(yx6 yx6Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = yx6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                yy6 yy6Var = new yy6(this.h, lq4Var, 0);
                yy6Var.g = obj;
                return yy6Var;
            default:
                yy6 yy6Var2 = new yy6(this.h, lq4Var, 1);
                yy6Var2.g = obj;
                return yy6Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((yy6) create(new ds2(((ds2) obj).a), (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((yy6) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Throwable thA;
        int i = this.e;
        yx6 yx6Var = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    obj2 = ((ds2) this.g).a;
                    if (!(obj2 instanceof cs2)) {
                        this.g = obj2;
                        this.f = 1;
                        if (yx6Var.emit(obj2, this) == hu4Var) {
                            return hu4Var;
                        }
                        obj3 = obj2;
                    }
                    if (obj2 instanceof bs2) {
                        return Boolean.TRUE;
                    }
                    thA = ds2.a(obj2);
                    if (thA == null) {
                        return Boolean.FALSE;
                    }
                    throw thA;
                }
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj3 = this.g;
                ch3.d0(obj);
                obj2 = obj3;
                if (obj2 instanceof bs2) {
                    return Boolean.TRUE;
                }
                thA = ds2.a(obj2);
                if (thA == null) {
                    return Boolean.FALSE;
                }
                throw thA;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    Object obj4 = this.g;
                    this.f = 1;
                    if (yx6Var.emit(obj4, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }
}
