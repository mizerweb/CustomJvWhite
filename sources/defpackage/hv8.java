package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hv8 extends koe implements tf7 {
    public int c;
    public /* synthetic */ w65 d;
    public final /* synthetic */ s84 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv8(s84 s84Var, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = s84Var;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        hv8 hv8Var = new hv8(this.e, (lq4) obj3);
        hv8Var.d = (w65) obj;
        return hv8Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        s84 s84Var = this.e;
        vyh vyhVar = (vyh) s84Var.c;
        int i = this.c;
        if (i == 0) {
            ch3.d0(obj);
            w65 w65Var = this.d;
            byte bE = vyhVar.E();
            if (bE == 1) {
                return s84Var.d(true);
            }
            if (bE == 0) {
                return s84Var.d(false);
            }
            if (bE != 6) {
                if (bE == 8) {
                    return s84Var.c();
                }
                vyh.q(vyhVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.c = 1;
            obj = s84.a(s84Var, w65Var, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return (jt8) obj;
    }
}
