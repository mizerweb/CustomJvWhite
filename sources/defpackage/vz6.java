package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes4.dex */
public final class vz6 implements yx6 {
    public final /* synthetic */ tf7 a;
    public final /* synthetic */ yx6 b;

    public vz6(tf7 tf7Var, yx6 yx6Var) {
        this.a = tf7Var;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        uz6 uz6Var;
        if (lq4Var instanceof uz6) {
            uz6Var = (uz6) lq4Var;
            int i = uz6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uz6Var.f = i - Integer.MIN_VALUE;
            } else {
                uz6Var = new uz6(this, lq4Var);
            }
        } else {
            uz6Var = new uz6(this, lq4Var);
        }
        Object objI = uz6Var.e;
        int i2 = uz6Var.f;
        if (i2 == 0) {
            ch3.d0(objI);
            uz6Var.d = this;
            uz6Var.f = 1;
            objI = this.a.i(this.b, obj, uz6Var);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = uz6Var.d;
            ch3.d0(objI);
        }
        if (((Boolean) objI).booleanValue()) {
            return sbi.a;
        }
        throw new AbortFlowException(this);
    }
}
