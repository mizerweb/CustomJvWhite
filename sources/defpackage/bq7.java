package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bq7 {
    public final l9b a = new l9b();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        aq7 aq7Var;
        l9b l9bVar;
        if (nq4Var instanceof aq7) {
            aq7Var = (aq7) nq4Var;
            int i = aq7Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aq7Var.g = i - Integer.MIN_VALUE;
            } else {
                aq7Var = new aq7(this, nq4Var);
            }
        } else {
            aq7Var = new aq7(this, nq4Var);
        }
        Object obj = aq7Var.e;
        int i2 = aq7Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = this.a;
            aq7Var.d = l9bVar;
            aq7Var.g = 1;
            Object objB = l9bVar.b(aq7Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = aq7Var.d;
            ch3.d0(obj);
        }
        return new m9b(l9bVar);
    }
}
