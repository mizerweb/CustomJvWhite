package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dr2 {
    public final l7f a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public dr2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, l7f l7fVar) {
        this.a = l7fVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable a(long j, nq4 nq4Var, String str, String str2) {
        cr2 cr2Var;
        long j2;
        if (nq4Var instanceof cr2) {
            cr2Var = (cr2) nq4Var;
            int i = cr2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cr2Var.g = i - Integer.MIN_VALUE;
            } else {
                cr2Var = new cr2(this, nq4Var);
            }
        } else {
            cr2Var = new cr2(this, nq4Var);
        }
        Object objB = cr2Var.e;
        int i2 = cr2Var.g;
        if (i2 == 0) {
            ch3.d0(objB);
            gm0.x(dr2.class.getName(), "change self photo", null);
            s7f s7fVar = (s7f) ((et3) this.b.getValue());
            s7fVar.q.B(s7fVar, s7f.j0[11], null);
            long jA = this.a.a();
            no4 no4Var = (no4) this.d.getValue();
            br2 br2Var = new br2(0, j, str, str2);
            cr2Var.d = jA;
            cr2Var.g = 1;
            objB = no4Var.b(jA, br2Var, cr2Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            j2 = jA;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = cr2Var.d;
            ch3.d0(objB);
        }
        vg4 vg4Var = (vg4) objB;
        ((ij4) this.c.getValue()).a(j2);
        return vg4Var;
    }
}
