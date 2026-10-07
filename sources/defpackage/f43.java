package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f43 extends a8j {
    public final long c;
    public final xn3 d;
    public final ny8 e;
    public final mjg f;
    public final r8e g;
    public final r8e h;

    public f43(long j, xn3 xn3Var, xhh xhhVar, ny8 ny8Var) {
        this.c = j;
        this.d = xn3Var;
        this.e = ny8Var;
        mjg mjgVarA = p90.a(null);
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        n0c n0cVar = (n0c) xhhVar;
        xx6 xx6VarT = e9i.T(new cu2(new jz(xn3Var.k(j), 13), 2), n0cVar.a());
        Boolean bool = Boolean.FALSE;
        this.h = e9i.G0(xx6VarT, this.b, j0g.a, bool);
        e9i.j0(e9i.T(new fz6(new jz(xn3Var.k(j), 13), new in1(this, (lq4) null, 16), 3), n0cVar.a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(lq4 lq4Var) {
        d43 d43Var;
        if (lq4Var instanceof d43) {
            d43Var = (d43) lq4Var;
            int i = d43Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                d43Var.f = i - Integer.MIN_VALUE;
            } else {
                d43Var = new d43(this, (nq4) lq4Var);
            }
        } else {
            d43Var = new d43(this, (nq4) lq4Var);
        }
        Object objV = d43Var.d;
        int i2 = d43Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            d43Var.f = 1;
            objV = this.d.v(this.c, d43Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.e.getValue()));
    }
}
