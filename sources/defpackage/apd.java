package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class apd extends a8j {
    public static final /* synthetic */ zv8[] r;
    public final zz5 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final mjg j;
    public final r8e k;
    public final mjg l;
    public final r8e m;
    public final ic6 n;
    public final ic6 o;
    public final p3c p;
    public final AtomicReference q;

    static {
        z8b z8bVar = new z8b(apd.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        r = new zv8[]{z8bVar};
    }

    public apd(long j, nnd nndVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, wi4 wi4Var, iy2 iy2Var) {
        zz5 hy2Var;
        this.d = ny8Var;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = ny8Var7;
        mjg mjgVarA = p90.a(r66.a);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        lq4 lq4Var = null;
        mjg mjgVarA2 = p90.a(null);
        this.l = mjgVarA2;
        this.m = new r8e(mjgVarA2);
        this.n = new ic6(null);
        this.o = new ic6(null);
        this.p = qyj.S();
        this.q = new AtomicReference();
        int iOrdinal = nndVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            hy2Var = new hy2(j, this.b, iy2Var.a, iy2Var.b, iy2Var.c, iy2Var.d, iy2Var.e, iy2Var.f, iy2Var.g, iy2Var.h, iy2Var.i, iy2Var.j, iy2Var.k, iy2Var.l, iy2Var.m, iy2Var.n, iy2Var.o);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                throw null;
            }
            hy2Var = new vi4(j, this.b, wi4Var.a, wi4Var.b, wi4Var.c, wi4Var.d, wi4Var.e, wi4Var.f, wi4Var.g, wi4Var.h, wi4Var.i, wi4Var.j, wi4Var.k, wi4Var.l, wi4Var.m, wi4Var.n, wi4Var.o);
        }
        this.c = hy2Var;
        int i = 3;
        e9i.j0(e9i.T(new fz6(new jz(hy2Var.h, 13), new xod(this, lq4Var, 0), i), ((n0c) ((xhh) ny8Var.getValue())).a()), this.b);
        e9i.j0(e9i.T(new fz6(hy2Var.d, new xod(this, null, 1), i), ((n0c) ((xhh) ny8Var.getValue())).c()), this.b);
        e9i.j0(e9i.T(new fz6(hy2Var.e, new xod(this, null, 2), i), ((n0c) ((xhh) ny8Var.getValue())).c()), this.b);
        e9i.j0(new fz6(new q8e(((und) ny8Var2.getValue()).a), new xod(this, null, 4), i), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(lq4 lq4Var) {
        zod zodVar;
        if (lq4Var instanceof zod) {
            zodVar = (zod) lq4Var;
            int i = zodVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zodVar.f = i - Integer.MIN_VALUE;
            } else {
                zodVar = new zod(this, (nq4) lq4Var);
            }
        } else {
            zodVar = new zod(this, (nq4) lq4Var);
        }
        Object objV = zodVar.d;
        int i2 = zodVar.f;
        if (i2 == 0) {
            ch3.d0(objV);
            zz5 zz5Var = this.c;
            if (!(zz5Var instanceof hy2)) {
                return Boolean.FALSE;
            }
            hy2 hy2Var = (hy2) zz5Var;
            zodVar.f = 1;
            objV = ((xn3) hy2Var.t.getValue()).v(hy2Var.p, zodVar);
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
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.h.getValue()));
    }

    public final void C() {
        if (!((wsc) this.e.getValue()).c(wsc.n)) {
            a8j.x(this.n, xnd.b);
            return;
        }
        yab.i0(this.b, ((n0c) ((xhh) this.d.getValue())).b(), 0, new xod(this, null, 3), 2);
    }

    @Override // defpackage.a8j
    public final void y() {
        this.c.b();
    }
}
