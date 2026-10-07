package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j93 {
    public final ny8 a;
    public final ny8 b;

    public j93(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, boolean z, nq4 nq4Var) {
        i93 i93Var;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        if (nq4Var instanceof i93) {
            i93Var = (i93) nq4Var;
            int i = i93Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                i93Var.h = i - Integer.MIN_VALUE;
            } else {
                i93Var = new i93(this, nq4Var);
            }
        } else {
            i93Var = new i93(this, nq4Var);
        }
        Object objI = i93Var.f;
        int i2 = i93Var.h;
        ny8 ny8Var = this.b;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) ny8Var.getValue();
            i93Var.d = j;
            i93Var.e = z;
            i93Var.h = 1;
            objI = xn3Var.i(j, i93Var);
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            z = i93Var.e;
            j = i93Var.d;
            ch3.d0(objI);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = i93Var.e;
            j3 = i93Var.d;
            ch3.d0(objI);
        }
        z2 = z3;
        j2 = j3;
        pvb pvbVar = (pvb) this.a.getValue();
        pvb.t(pvbVar, new g93(pvbVar.u().a.g(), j2, z2));
        return sbi.a;
        rt2 rt2Var = (rt2) objI;
        if (rt2Var != null) {
            xn3 xn3Var2 = (xn3) ny8Var.getValue();
            long j4 = rt2Var.a;
            wo0 wo0Var = new wo0(rt2Var, z, lq4Var, 4);
            i93Var.d = j;
            i93Var.e = z;
            i93Var.h = 2;
            objI = xn3Var2.d(j4, wo0Var, i93Var);
            if (objI != hu4Var) {
                long j5 = j;
                z3 = z;
                j3 = j5;
                z2 = z3;
                j2 = j3;
            }
            return hu4Var;
        }
        j2 = j;
        z2 = z;
        pvb pvbVar2 = (pvb) this.a.getValue();
        pvb.t(pvbVar2, new g93(pvbVar2.u().a.g(), j2, z2));
        return sbi.a;
    }
}
