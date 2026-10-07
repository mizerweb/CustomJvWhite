package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cb8 extends mdh implements qf7 {
    public rb8 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ rb8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb8(rb8 rb8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = rb8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new cb8(this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((cb8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rb8 rb8Var;
        int i;
        int i2;
        int i3;
        int i4 = this.i;
        hu4 hu4Var = hu4.a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i = this.g;
                    i2 = this.f;
                    rb8Var = this.e;
                    ch3.d0(obj);
                } else {
                    if (i4 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.h;
                    ch3.d0(obj);
                }
                return new qoe(new Integer(i3 + ((Number) obj).intValue()));
            }
            ch3.d0(obj);
            rb8Var = this.j;
            String str = rb8.u;
            if (!((wsc) rb8Var.f.getValue()).f()) {
                throw new IllegalStateException("storage permissions not granted");
            }
            ih7 ih7Var = ih7.a;
            this.e = rb8Var;
            i = 0;
            this.f = 0;
            this.g = 0;
            this.i = 1;
            obj = rb8.c(rb8Var, ih7Var, this);
            if (obj != hu4Var) {
                i2 = 0;
            }
            return hu4Var;
            int iIntValue = ((Number) obj).intValue();
            kh7 kh7Var = kh7.a;
            this.e = null;
            this.f = i2;
            this.g = i;
            this.h = iIntValue;
            this.i = 2;
            Object objC = rb8.c(rb8Var, kh7Var, this);
            if (objC != hu4Var) {
                obj = objC;
                i3 = iIntValue;
                return new qoe(new Integer(i3 + ((Number) obj).intValue()));
            }
            return hu4Var;
        } catch (Throwable th) {
            return new ooe(th);
        }
    }
}
