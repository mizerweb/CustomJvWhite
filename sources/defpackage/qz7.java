package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qz7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ tz7 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz7(tz7 tz7Var, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = tz7Var;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.h;
        tz7 tz7Var = this.g;
        switch (i) {
            case 0:
                return new qz7(tz7Var, str, lq4Var, 0);
            default:
                return new qz7(tz7Var, str, lq4Var, 1);
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
        return ((qz7) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        String str = this.h;
        tz7 tz7Var = this.g;
        hu4 hu4Var = hu4.a;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objA = tz7.a(tz7Var, str, this);
                    return objA == hu4Var ? hu4Var : objA;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                gb3 gb3Var = new gb3(tz7Var, i2, str);
                this.f = 1;
                Object objV = qyj.V(k66.a, gb3Var, this);
                return objV == hu4Var ? hu4Var : objV;
        }
    }
}
