package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class s4j {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final String e = s4j.class.getName();

    static {
        zfe.a.getClass();
    }

    public s4j(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        qyj.S();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        r4j r4jVar;
        if (nq4Var instanceof r4j) {
            r4jVar = (r4j) nq4Var;
            int i = r4jVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r4jVar.f = i - Integer.MIN_VALUE;
            } else {
                r4jVar = new r4j(this, nq4Var);
            }
        } else {
            r4jVar = new r4j(this, nq4Var);
        }
        Object objG = r4jVar.d;
        int i2 = r4jVar.f;
        ny8 ny8Var = this.a;
        sbi sbiVar = sbi.a;
        String str = this.e;
        if (i2 == 0) {
            ch3.d0(objG);
            if (Looper.getMainLooper().isCurrentThread()) {
                ((wxb) this.b.getValue()).getClass();
                gm0.V(str, "Ok token was called from the main thread.", new IllegalStateException("Ok token was called from the main thread."));
            }
            long jF = ((s7f) ((et3) ny8Var.getValue())).f();
            long jP = ((s7f) ((et3) ny8Var.getValue())).p();
            if (jF < jP) {
                gm0.n(str, "Ok token will be expired in " + jP + ".");
                return sbiVar;
            }
            r4jVar.f = 1;
            String strC = ((svb) this.d.getValue()).c();
            if (strC == null) {
                objG = null;
            } else {
                objG = ((sih) this.c.getValue()).a.g(new vsb(strC, ((s7f) ((et3) ny8Var.getValue())).t()), r4jVar);
            }
            hu4 hu4Var = hu4.a;
            if (objG == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objG);
        }
        wsb wsbVar = (wsb) objG;
        if (wsbVar == null) {
            gm0.n(str, "Can't get ok token without auth token.");
            return sbiVar;
        }
        et3 et3Var = (et3) ny8Var.getValue();
        String strH = wsbVar.h();
        s7f s7fVar = (s7f) et3Var;
        gvb gvbVar = s7fVar.D;
        zv8[] zv8VarArr = s7f.j0;
        gvbVar.B(s7fVar, zv8VarArr[26], strH);
        s7f s7fVar2 = (s7f) ((et3) ny8Var.getValue());
        s7fVar2.F.B(s7fVar2, zv8VarArr[28], Long.valueOf(wsbVar.i()));
        gm0.n(str, "Ok token updated.");
        return sbiVar;
    }
}
