package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cik extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public d9b f;
    public int g;
    public final /* synthetic */ xo9 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cik(xo9 xo9Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = xo9Var;
        this.i = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new cik(this.h, this.i, lq4Var, 0);
            default:
                return new cik(this.h, this.i, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                return new cik(this.h, this.i, lq4Var, 0).invokeSuspend(sbiVar);
            default:
                return new cik(this.h, this.i, lq4Var, 1).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        d9b d9bVar;
        d9b d9bVar2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.i;
        hu4 hu4Var = hu4.a;
        xo9 xo9Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    d9bVar = xo9Var.m;
                    this.f = d9bVar;
                    this.g = 1;
                    obj = xo9Var.c(j, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d9bVar = this.f;
                ch3.d0(obj);
                Object obj2 = ((psh) obj).a;
                this.f = null;
                this.g = 2;
                if (d9bVar.emit(obj2, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    d9bVar2 = xo9Var.m;
                    this.f = d9bVar2;
                    this.g = 1;
                    obj = xo9Var.c(j, this);
                    if (obj != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d9bVar2 = this.f;
                ch3.d0(obj);
                Object obj3 = ((psh) obj).a;
                this.f = null;
                this.g = 2;
                if (d9bVar2.emit(obj3, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
