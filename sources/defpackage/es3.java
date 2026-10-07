package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class es3 {
    public final ny8 a;

    public es3(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        ds3 ds3Var;
        Iterator it;
        int i;
        if (nq4Var instanceof ds3) {
            ds3Var = (ds3) nq4Var;
            int i2 = ds3Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ds3Var.i = i2 - Integer.MIN_VALUE;
            } else {
                ds3Var = new ds3(this, nq4Var);
            }
        } else {
            ds3Var = new ds3(this, nq4Var);
        }
        Object obj = ds3Var.g;
        int i3 = ds3Var.i;
        if (i3 == 0) {
            ch3.d0(obj);
            it = ((List) this.a.getValue()).iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ds3Var.f;
            j = ds3Var.d;
            it = ds3Var.e;
            ch3.d0(obj);
        }
        while (it.hasNext()) {
            cs3 cs3Var = (cs3) it.next();
            ds3Var.e = it;
            ds3Var.d = j;
            ds3Var.f = i;
            ds3Var.i = 1;
            Object objA = cs3Var.a(j, ds3Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        }
        return sbi.a;
    }
}
