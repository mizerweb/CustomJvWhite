package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tn2 extends koe implements qf7 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn2(int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        tn2 tn2Var = new tn2(this.e, lq4Var);
        tn2Var.d = obj;
        return tn2Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((tn2) create((thf) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        thf thfVar = (thf) this.d;
        int i = this.c;
        ln2 ln2Var = ln2.c;
        int i2 = this.e;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            if (i2 == 2) {
                this.d = thfVar;
                this.c = 1;
                thfVar.b(ln2Var, this);
                return hu4Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ch3.d0(obj);
                    if (i2 == 1) {
                        this.d = null;
                        this.c = 3;
                        thfVar.b(ln2Var, this);
                        return hu4Var;
                    }
                } else {
                    if (i != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            }
            ch3.d0(obj);
        }
        this.d = thfVar;
        this.c = 2;
        thfVar.b(ln2.b, this);
        return hu4Var;
    }
}
