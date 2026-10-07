package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eo3 extends ea2 {
    public final wsc k;
    public final osc l;
    public final svj m;
    public final g19 n;
    public final ny8 o;
    public final ny8 p;
    public boolean q;

    public eo3(go3 go3Var, wsc wscVar, osc oscVar, svj svjVar, g19 g19Var, ny8 ny8Var, et3 et3Var, ny8 ny8Var2) {
        super(wscVar, oscVar, svjVar, go3Var, g19Var, et3Var);
        this.k = wscVar;
        this.l = oscVar;
        this.m = svjVar;
        this.n = g19Var;
        this.o = ny8Var;
        this.p = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object j(eo3 eo3Var, nq4 nq4Var) {
        do3 do3Var;
        wsc wscVar = eo3Var.k;
        et3 et3Var = eo3Var.f;
        if (nq4Var instanceof do3) {
            do3Var = (do3) nq4Var;
            int i = do3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                do3Var.f = i - Integer.MIN_VALUE;
            } else {
                do3Var = new do3(eo3Var, nq4Var);
            }
        } else {
            do3Var = new do3(eo3Var, nq4Var);
        }
        Object objK0 = do3Var.d;
        int i2 = do3Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            if (wscVar.b()) {
                ((xb9) et3Var).i0(0);
                return Boolean.FALSE;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!eo3Var.q && ((xb9) et3Var).S() < 3) {
                ut7 ut7Var = (ut7) eo3Var.o.getValue();
                do3Var.f = 1;
                objK0 = yab.K0(((n0c) ((xhh) ut7Var.b.getValue())).b(), new ag0(jCurrentTimeMillis, jCurrentTimeMillis - 86400000, ut7Var, null), do3Var);
                hu4 hu4Var = hu4.a;
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            }
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objK0);
        if (((Boolean) objK0).booleanValue()) {
            gm0.n(eo3.class.getName(), "Request ignore battery optimizations: " + eo3Var.hashCode());
            ae9 ae9Var = (ae9) ((p96) eo3Var.p.getValue()).a.getValue();
            ul9 ul9Var = new ul9();
            ul9Var.put("reason", "main");
            ae9.k(ae9Var, "POWER_SAVING", "show_shade", ul9Var.b(), 8);
            wscVar.l(eo3Var.m);
            eo3Var.j = "NEED_BATTERY_OPTIMIZATIONS";
            xb9 xb9Var = (xb9) et3Var;
            xb9Var.i0(xb9Var.S() + 1);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.ea2
    public final void b() {
        lq4 lq4Var = null;
        if (this.k.e()) {
            if (this.k.b.a()) {
                yab.i0(tre.d0(this.n), null, 0, new m5(this, lq4Var, 27), 3);
                return;
            }
            a();
            this.q = true;
            ((xb9) this.f).i0(0);
            this.l.b(true);
            return;
        }
        String name = eo3.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(hashCode(), "Request post notification: "), null);
            }
        }
        this.k.j(this.m, true);
        this.j = "NEED_POST_NOTIFICATION";
        this.q = true;
        ((xb9) this.f).i0(0);
        this.l.b(true);
    }

    @Override // defpackage.ea2
    public final String d() {
        wsc wscVar = this.k;
        if (!wscVar.e()) {
            return "NEED_POST_NOTIFICATION";
        }
        if (wscVar.b.a()) {
            return !wscVar.b() ? "NEED_BATTERY_OPTIMIZATIONS" : "ALL_GRANTED";
        }
        return "NEED_FSI";
    }

    @Override // defpackage.ea2
    public final void e(int i) {
        if (i == 177) {
            if (this.k.e()) {
                a();
            } else {
                this.q = false;
            }
        }
    }
}
