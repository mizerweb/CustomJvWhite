package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ov2 {
    public final String a = ov2.class.getName();
    public final ny8 b;
    public final ny8 c;

    public ov2(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(long j, long j2, nq4 nq4Var) {
        nv2 nv2Var;
        long j3;
        long j4;
        Object obj;
        if (nq4Var instanceof nv2) {
            nv2Var = (nv2) nq4Var;
            int i = nv2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nv2Var.i = i - Integer.MIN_VALUE;
            } else {
                nv2Var = new nv2(this, nq4Var);
            }
        } else {
            nv2Var = new nv2(this, nq4Var);
        }
        nv2 nv2Var2 = nv2Var;
        Object objE = nv2Var2.g;
        int i2 = nv2Var2.i;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j4 = nv2Var2.e;
                    j3 = nv2Var2.d;
                    try {
                        ch3.d0(objE);
                    } catch (Throwable th) {
                        th = th;
                        objE = new poe(th);
                    }
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = nv2Var2.f;
                    ch3.d0(objE);
                }
                return obj;
            }
            ch3.d0(objE);
            wy2 wy2Var = new wy2(j, 0, (String) null, false, (String) null, (Map) null, (String) null, (String) null, (r60) null, (Long) null, false, j2);
            try {
                pvb pvbVar = (pvb) this.b.getValue();
                String str = this.a;
                nv2Var2.f = null;
                nv2Var2.d = j;
                nv2Var2.e = j2;
                nv2Var2.i = 1;
                objE = qe7.E(pvbVar, wy2Var, str, 0L, 0, null, null, nv2Var2, 124);
                if (objE != hu4Var) {
                    j3 = j;
                    j4 = j2;
                }
            } catch (Throwable th2) {
                th = th2;
                j3 = j;
                j4 = j2;
                objE = new poe(th);
            }
            return hu4Var;
            dg3 dg3Var = (dg3) (objE instanceof poe ? null : objE);
            st2 st2Var = dg3Var != null ? dg3Var.c : null;
            if (st2Var == null) {
                return objE;
            }
            xn3 xn3Var = (xn3) this.c.getValue();
            List listSingletonList = Collections.singletonList(st2Var);
            nv2Var2.f = objE;
            nv2Var2.d = j3;
            nv2Var2.e = j4;
            nv2Var2.i = 2;
            if (xn3Var.w(listSingletonList, nv2Var2) != hu4Var) {
                obj = objE;
                return obj;
            }
            return hu4Var;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
