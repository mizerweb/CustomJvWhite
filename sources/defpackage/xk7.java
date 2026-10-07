package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xk7 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public xk7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ny8Var;
    }

    public final et3 a() {
        return (et3) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        uk7 uk7Var;
        if (nq4Var instanceof uk7) {
            uk7Var = (uk7) nq4Var;
            int i = uk7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk7Var.f = i - Integer.MIN_VALUE;
            } else {
                uk7Var = new uk7(this, nq4Var);
            }
        } else {
            uk7Var = new uk7(this, nq4Var);
        }
        Object objB = uk7Var.d;
        int i2 = uk7Var.f;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) this.c.getValue();
            long jT = ((s7f) a()).t();
            uk7Var.f = 1;
            objB = utdVar.b(jT, uk7Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        return ((vjd) objB).d.o();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(nq4 nq4Var) {
        vk7 vk7Var;
        if (nq4Var instanceof vk7) {
            vk7Var = (vk7) nq4Var;
            int i = vk7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk7Var.f = i - Integer.MIN_VALUE;
            } else {
                vk7Var = new vk7(this, nq4Var);
            }
        } else {
            vk7Var = new vk7(this, nq4Var);
        }
        Object objB = vk7Var.d;
        int i2 = vk7Var.f;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) this.c.getValue();
            long jT = ((s7f) a()).t();
            vk7Var.f = 1;
            objB = utdVar.b(jT, vk7Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        return zo5.j(((vjd) objB).d.w(), "+");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) {
        wk7 wk7Var;
        if (nq4Var instanceof wk7) {
            wk7Var = (wk7) nq4Var;
            int i = wk7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wk7Var.f = i - Integer.MIN_VALUE;
            } else {
                wk7Var = new wk7(this, nq4Var);
            }
        } else {
            wk7Var = new wk7(this, nq4Var);
        }
        Object objB = wk7Var.d;
        int i2 = wk7Var.f;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) this.c.getValue();
            long jT = ((s7f) a()).t();
            wk7Var.f = 1;
            objB = utdVar.b(jT, wk7Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        vjd vjdVar = (vjd) objB;
        String strB = xoh.b(vjdVar.d.r());
        vtc vtcVar = (vtc) this.b.getValue();
        vg4 vg4Var = vjdVar.d;
        String strValueOf = String.valueOf(vg4Var.w());
        xb9 xb9Var = (xb9) a();
        String strI0 = z5h.I0(vd7.v(vtcVar, strValueOf, (String) xb9Var.n0.m(xb9Var, xb9.g1[2]), ((s7f) a()).m()), '-', ' ', false);
        long jT2 = ((s7f) a()).t();
        String strA = vg4Var.A(((s7f) a()).k());
        String strK = vg4Var.k();
        if (strK != null) {
            return new ivf(jT2, strA, strK, vg4Var.u(), strI0, strB);
        }
        ore.p("Required value was null.");
        return null;
    }
}
