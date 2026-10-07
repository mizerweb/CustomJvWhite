package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rxa extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ sxa f;
    public final /* synthetic */ u8b g;
    public final /* synthetic */ u8b h;
    public final /* synthetic */ u8b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxa(sxa sxaVar, u8b u8bVar, u8b u8bVar2, u8b u8bVar3, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = sxaVar;
        this.g = u8bVar;
        this.h = u8bVar2;
        this.i = u8bVar3;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new rxa(this.f, this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((rxa) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            this.e = 1;
            Object objA = sxa.a(this.f, this.g, this.h, this.i, this);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}
