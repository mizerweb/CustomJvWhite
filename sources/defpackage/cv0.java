package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cv0 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;

    public cv0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        zu0 zu0Var;
        long j;
        if (nq4Var instanceof zu0) {
            zu0Var = (zu0) nq4Var;
            int i = zu0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zu0Var.g = i - Integer.MIN_VALUE;
            } else {
                zu0Var = new zu0(this, nq4Var);
            }
        } else {
            zu0Var = new zu0(this, nq4Var);
        }
        Object objK0 = zu0Var.e;
        int i2 = zu0Var.g;
        if (i2 == 0) {
            ch3.d0(objK0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            xb9 xb9Var = (xb9) b();
            gvb gvbVar = xb9Var.U0;
            zv8[] zv8VarArr = xb9.g1;
            if (((Number) gvbVar.m(xb9Var, zv8VarArr[38])).longValue() != 0) {
                xb9 xb9Var2 = (xb9) b();
                if (((Boolean) xb9Var2.V0.m(xb9Var2, zv8VarArr[39])).booleanValue()) {
                    xb9 xb9Var3 = (xb9) b();
                    if (jCurrentTimeMillis - ((Number) xb9Var3.U0.m(xb9Var3, zv8VarArr[38])).longValue() >= 86400000) {
                        xb9 xb9Var4 = (xb9) b();
                        xb9Var4.V0.B(xb9Var4, zv8VarArr[39], Boolean.FALSE);
                    }
                    xb9 xb9Var5 = (xb9) b();
                    if (((Boolean) xb9Var5.V0.m(xb9Var5, zv8VarArr[39])).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    ut7 ut7Var = (ut7) this.c.getValue();
                    zu0Var.d = jCurrentTimeMillis;
                    zu0Var.g = 1;
                    objK0 = yab.K0(((n0c) ((xhh) ut7Var.b.getValue())).b(), new ag0(jCurrentTimeMillis, jCurrentTimeMillis - 86400000, ut7Var, null), zu0Var);
                    hu4 hu4Var = hu4.a;
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                    j = jCurrentTimeMillis;
                }
            }
            xb9 xb9Var6 = (xb9) b();
            xb9Var6.U0.B(xb9Var6, zv8VarArr[38], Long.valueOf(jCurrentTimeMillis));
            return Boolean.TRUE;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = zu0Var.d;
        ch3.d0(objK0);
        Boolean bool = (Boolean) objK0;
        if (bool.booleanValue()) {
            xb9 xb9Var7 = (xb9) b();
            xb9Var7.U0.B(xb9Var7, xb9.g1[38], Long.valueOf(j));
        }
        return bool;
    }

    public final et3 b() {
        return (et3) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, boolean z2, nq4 nq4Var) {
        bv0 bv0Var;
        mjg mjgVar;
        mjg mjgVar2;
        if (nq4Var instanceof bv0) {
            bv0Var = (bv0) nq4Var;
            int i = bv0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                bv0Var.i = i - Integer.MIN_VALUE;
            } else {
                bv0Var = new bv0(this, nq4Var);
            }
        } else {
            bv0Var = new bv0(this, nq4Var);
        }
        Object objK0 = bv0Var.g;
        int i2 = bv0Var.i;
        sbi sbiVar = sbi.a;
        boolean z3 = false;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            bv0Var.d = z;
            bv0Var.e = z2;
            bv0Var.i = 1;
            objK0 = yab.K0(((n0c) ((xhh) this.d.getValue())).a(), new av0(this, z, null), bv0Var);
            if (objK0 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z2 = bv0Var.e;
            z = bv0Var.d;
            ch3.d0(objK0);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mjgVar2 = bv0Var.f;
            ch3.d0(objK0);
        }
        if (((Boolean) objK0).booleanValue()) {
            mjgVar = mjgVar2;
            mjgVar2 = mjgVar;
            z3 = true;
        }
        mjgVar2.setValue(Boolean.valueOf(z3));
        return sbiVar;
        boolean zBooleanValue = ((Boolean) objK0).booleanValue();
        mjgVar = this.e;
        if (zBooleanValue) {
            ((xb9) b()).i0(0);
            Boolean bool = Boolean.FALSE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
            return sbiVar;
        }
        if (z2) {
            bv0Var.f = mjgVar;
            bv0Var.d = z;
            bv0Var.e = z2;
            bv0Var.i = 2;
            objK0 = a(bv0Var);
            if (objK0 != obj) {
                mjgVar2 = mjgVar;
                if (((Boolean) objK0).booleanValue()) {
                    mjgVar = mjgVar2;
                    mjgVar2 = mjgVar;
                    z3 = true;
                }
            }
            return obj;
        }
        mjgVar2 = mjgVar;
        z3 = true;
        mjgVar2.setValue(Boolean.valueOf(z3));
        return sbiVar;
    }
}
