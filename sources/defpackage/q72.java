package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q72 extends nr2 {
    public final qf7 f;

    public q72(qf7 qf7Var, vt4 vt4Var, int i, int i2) {
        super(qf7Var, vt4Var, i, i2, 0);
        this.f = qf7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nr2, defpackage.mr2
    public final Object f(njd njdVar, lq4 lq4Var) {
        p72 p72Var;
        if (lq4Var instanceof p72) {
            p72Var = (p72) lq4Var;
            int i = p72Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                p72Var.g = i - Integer.MIN_VALUE;
            } else {
                p72Var = new p72(this, (nq4) lq4Var);
            }
        } else {
            p72Var = new p72(this, (nq4) lq4Var);
        }
        Object obj = p72Var.e;
        int i2 = p72Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            p72Var.d = njdVar;
            p72Var.g = 1;
            Object objF = super.f(njdVar, p72Var);
            Object obj2 = hu4.a;
            if (objF == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            njdVar = p72Var.d;
            ch3.d0(obj);
        }
        if (njdVar.f.D()) {
            return sbi.a;
        }
        ore.k("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.nr2, defpackage.mr2
    public final mr2 g(vt4 vt4Var, int i, int i2) {
        return new q72(this.f, vt4Var, i, i2);
    }
}
