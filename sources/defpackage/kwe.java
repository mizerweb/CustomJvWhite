package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class kwe {
    public final xt4 a;
    public final String b = kwe.class.getName();
    public final ny8 c;

    public kwe(ny8 ny8Var, xt4 xt4Var) {
        this.a = xt4Var;
        this.c = ny8Var;
    }

    public static final void a(kwe kweVar, Context context, jk7 jk7Var) {
        try {
            context.unbindService(jk7Var);
            String name = kwe.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "unbind: done", null);
            }
        } catch (IllegalArgumentException e) {
            gm0.V(kwe.class.getName(), "unbind: failed", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, nq4 nq4Var) {
        jwe jweVar;
        if (nq4Var instanceof jwe) {
            jweVar = (jwe) nq4Var;
            int i = jweVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jweVar.f = i - Integer.MIN_VALUE;
            } else {
                jweVar = new jwe(this, nq4Var);
            }
        } else {
            jweVar = new jwe(this, nq4Var);
        }
        Object obj = jweVar.d;
        int i2 = jweVar.f;
        lq4 lq4Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            xt4 xt4Var = this.a;
            gce gceVar = new gce(this, context, lq4Var, 5);
            jweVar.f = 1;
            Object objK0 = yab.K0(xt4Var, gceVar, jweVar);
            hu4 hu4Var = hu4.a;
            return objK0 == hu4Var ? hu4Var : objK0;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String strK = qv1.k("getAppUpdateInfo failed: ", th.getMessage());
            if (((Boolean) ((e5d) this.c.getValue()).p().i()).booleanValue()) {
                gm0.V(kwe.class.getName(), strK, new fwe(th, strK));
            } else {
                gm0.V(kwe.class.getName(), strK, th);
            }
            throw th;
        }
    }
}
