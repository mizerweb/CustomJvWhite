package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yh5 implements gjg {
    public final xre a;
    public final q0d b;

    public yh5(xre xreVar, q0d q0dVar) {
        this.a = xreVar;
        this.b = q0dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        xh5 xh5Var;
        if (lq4Var instanceof xh5) {
            xh5Var = (xh5) lq4Var;
            int i = xh5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xh5Var.f = i - Integer.MIN_VALUE;
            } else {
                xh5Var = new xh5(this, lq4Var);
            }
        } else {
            xh5Var = new xh5(this, lq4Var);
        }
        Object obj = xh5Var.d;
        int i2 = xh5Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            xx6 xx6VarI = e9i.I(this.b);
            xh5Var.f = 1;
            Object objCollect = xx6VarI.collect(yx6Var, xh5Var);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        ore.k("StateFlow collection never ends");
        return null;
    }

    @Override // defpackage.lzf
    public final List d() {
        return Collections.singletonList(this.a.invoke());
    }

    @Override // defpackage.gjg
    public final Object getValue() {
        return this.a.invoke();
    }
}
