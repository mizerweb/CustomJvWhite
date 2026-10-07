package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ua2 {
    public static final /* synthetic */ zv8[] f;
    public final y82 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final p3c e = qyj.S();

    static {
        z8b z8bVar = new z8b(ua2.class, "tokenRefreshJob", "getTokenRefreshJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public ua2(y82 y82Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = y82Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        ta2 ta2Var;
        if (nq4Var instanceof ta2) {
            ta2Var = (ta2) nq4Var;
            int i = ta2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta2Var.f = i - Integer.MIN_VALUE;
            } else {
                ta2Var = new ta2(this, nq4Var);
            }
        } else {
            ta2Var = new ta2(this, nq4Var);
        }
        Object objA = ta2Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = ta2Var.f;
        if (i2 == 0) {
            ch3.d0(objA);
            if (Looper.getMainLooper().isCurrentThread()) {
                ((wxb) this.d.getValue()).getClass();
                gm0.V("CallsCredRepositoryTag", "Ok token was called from the main thread.", new IllegalStateException("Ok token was called from the main thread."));
            }
            long jF = ((s7f) ((et3) this.b.getValue())).f();
            long jP = ((s7f) ((et3) this.b.getValue())).p();
            if (jF >= jP) {
                uyb uybVar = (uyb) this.c.getValue();
                ta2Var.f = 1;
                objA = uybVar.a(ta2Var);
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallsCredRepositoryTag", nbh.s(jP, "Ok token will be expired in ", "."), null);
                    }
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objA);
        wsb wsbVar = (wsb) objA;
        et3 et3Var = (et3) this.b.getValue();
        String strH = wsbVar.h();
        s7f s7fVar = (s7f) et3Var;
        gvb gvbVar = s7fVar.D;
        zv8[] zv8VarArr = s7f.j0;
        gvbVar.B(s7fVar, zv8VarArr[26], strH);
        et3 et3Var2 = (et3) this.b.getValue();
        s7f s7fVar2 = (s7f) et3Var2;
        s7fVar2.F.B(s7fVar2, zv8VarArr[28], Long.valueOf(wsbVar.i()));
        gm0.n("CallsCredRepositoryTag", "Ok token updated.");
        return sbi.a;
    }
}
