package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ut6 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ hii h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut6(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = (yx6) obj;
        hii hiiVar = (hii) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ut6 ut6Var = new ut6(3, lq4Var, 0);
                ut6Var.g = yx6Var;
                ut6Var.h = hiiVar;
                return ut6Var.invokeSuspend(sbiVar);
            default:
                ut6 ut6Var2 = new ut6(3, lq4Var, 1);
                ut6Var2.g = yx6Var;
                ut6Var2.h = hiiVar;
                return ut6Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                yx6 yx6Var = this.g;
                hii hiiVar = this.h;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.h = hiiVar;
                    this.f = 1;
                    if (yx6Var.emit(hiiVar, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return Boolean.valueOf(!(hiiVar.a == 100));
            default:
                yx6 yx6Var2 = this.g;
                hii hiiVar2 = this.h;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.h = hiiVar2;
                    this.f = 1;
                    if (yx6Var2.emit(hiiVar2, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return Boolean.valueOf(!(hiiVar2.a == 100));
        }
    }
}
