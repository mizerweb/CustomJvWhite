package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gu2 extends a8j {
    public final long c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public sgg k;
    public final v63 j = new v63(0);
    public final ArrayList l = new ArrayList();
    public final ic6 m = new ic6(null);

    public gu2(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = j;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var6;
    }

    public final rt2 B() {
        return (rt2) ((xn3) this.d.getValue()).k(this.c).a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(lq4 lq4Var) {
        du2 du2Var;
        if (lq4Var instanceof du2) {
            du2Var = (du2) lq4Var;
            int i = du2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                du2Var.f = i - Integer.MIN_VALUE;
            } else {
                du2Var = new du2(this, (nq4) lq4Var);
            }
        } else {
            du2Var = new du2(this, (nq4) lq4Var);
        }
        Object objV = du2Var.d;
        int i2 = du2Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3Var = (xn3) this.d.getValue();
            du2Var.f = 1;
            objV = xn3Var.v(this.c, du2Var);
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
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.i.getValue()));
    }

    public final void D() {
        ArrayList arrayList = this.l;
        List listT1 = ww3.T1(arrayList);
        arrayList.clear();
        sgg sggVar = this.k;
        if ((sggVar == null || !sggVar.isActive()) && !listT1.isEmpty()) {
            xt4 xt4VarB = ((n0c) ((xhh) this.f.getValue())).b();
            zhb zhbVar = zhb.b;
            xt4VarB.getClass();
            this.k = a8j.t(this, lvb.x0(xt4VarB, zhbVar), new dn0(this, listT1, (lq4) null, 16), 2);
        }
    }
}
