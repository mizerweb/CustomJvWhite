package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ix6 implements fli {
    public final kg2 a;
    public final ejg b;
    public final omi c;
    public final iwh d;
    public final so2 e;
    public kli f;
    public volatile int g = 2;
    public volatile x58 h;
    public i64 i;

    public ix6(kg2 kg2Var, ejg ejgVar, omi omiVar, iwh iwhVar, so2 so2Var) {
        this.a = kg2Var;
        this.b = ejgVar;
        this.c = omiVar;
        this.d = iwhVar;
        this.e = so2Var;
        qyj.a(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        ex6 ex6Var;
        ix6 ix6Var;
        i64 i64Var;
        long j2;
        if (nq4Var instanceof ex6) {
            ex6Var = (ex6) nq4Var;
            int i = ex6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ex6Var.h = i - Integer.MIN_VALUE;
            } else {
                ex6Var = new ex6(this, nq4Var);
            }
        } else {
            ex6Var = new ex6(this, nq4Var);
        }
        Object obj = ex6Var.f;
        int i2 = ex6Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            i64 i64Var2 = new i64();
            oo6 oo6Var = new oo6(2, i64Var2);
            ao5 ao5Var = ao5.a;
            lk9 lk9Var = rk9.a;
            ix6Var = this;
            zw9 zw9Var = new zw9(j, ix6Var, oo6Var, (lq4) null, 4);
            ex6Var.e = i64Var2;
            ex6Var.d = j;
            ex6Var.h = 1;
            Object objK0 = yab.K0(lk9Var, zw9Var, ex6Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            i64Var = i64Var2;
            j2 = j;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = ex6Var.d;
            i64 i64Var3 = ex6Var.e;
            ch3.d0(obj);
            ix6Var = this;
            j2 = j3;
            i64Var = i64Var3;
        }
        return yab.h(ix6Var.c.a, null, 0, new i20(i64Var, j2, (lq4) null, 15), 3);
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.f = kliVar;
        d(this.g, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(nq4 nq4Var) {
        fx6 fx6Var;
        int i;
        if (nq4Var instanceof fx6) {
            fx6Var = (fx6) nq4Var;
            int i2 = fx6Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fx6Var.g = i2 - Integer.MIN_VALUE;
            } else {
                fx6Var = new fx6(this, nq4Var);
            }
        } else {
            fx6Var = new fx6(this, nq4Var);
        }
        Object obj = fx6Var.e;
        hu4 hu4Var = hu4.a;
        int i3 = fx6Var.g;
        if (i3 == 0) {
            ch3.d0(obj);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "FlashControl: Waiting for any ongoing update to be completed");
            }
            int i4 = this.g;
            i64 i64VarA = this.i;
            if (i64VarA == null) {
                i64VarA = qyj.a(sbi.a);
            }
            fx6Var.d = i4;
            fx6Var.g = 1;
            if (i64VarA.g(fx6Var) == hu4Var) {
                return hu4Var;
            }
            i = i4;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = fx6Var.d;
            ch3.d0(obj);
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "awaitFlashModeUpdate: initialFlashMode = " + i);
        }
        return new Integer(i);
    }

    public final i64 d(int i, boolean z) {
        if (tvj.f(3, "CXCP")) {
            StringBuilder sbY = zo5.y(i, "setFlashAsync: flashMode = ", ", requestControl = ");
            sbY.append(this.f);
            Log.d("CXCP", sbY.toString());
        }
        i64 i64Var = new i64();
        if (this.f == null) {
            bc1.p("Camera is not active.", i64Var);
            return i64Var;
        }
        this.g = i;
        i64 i64Var2 = this.i;
        if (z) {
            if (i64Var2 != null) {
                bc1.p("There is a new flash mode being set or camera was closed", i64Var2);
            }
            this.i = null;
        } else if (i64Var2 != null) {
            rpl.d(i64Var, i64Var2);
        }
        this.i = i64Var;
        ejg ejgVar = this.b;
        synchronized (ejgVar.d) {
            ejgVar.h = i;
        }
        rpl.d(ejgVar.f(), i64Var);
        return i64Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        if (defpackage.ch3.c(r7, r1) == r2) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.nq4 r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix6.e(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        hx6 hx6Var;
        if (nq4Var instanceof hx6) {
            hx6Var = (hx6) nq4Var;
            int i = hx6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx6Var.f = i - Integer.MIN_VALUE;
            } else {
                hx6Var = new hx6(this, nq4Var);
            }
        } else {
            hx6Var = new hx6(this, nq4Var);
        }
        Object obj = hx6Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = hx6Var.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj);
            ao5 ao5Var = ao5.a;
            lk9 lk9Var = rk9.a;
            jhc jhcVar = new jhc(this, lq4Var, 29);
            hx6Var.f = 1;
            if (yab.K0(lk9Var, jhcVar, hx6Var) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        if (kjl.c(this.a.b)) {
            ejg ejgVar = this.b;
            synchronized (ejgVar.d) {
                ejgVar.j = false;
            }
            ejgVar.f();
        }
        if (this.e.O()) {
            this.d.c(0, true, (6 & 4) == 0);
        }
        return sbi.a;
    }

    @Override // defpackage.fli
    public final void reset() {
        this.g = 2;
        this.h = null;
        i64 i64Var = this.i;
        if (i64Var != null) {
            bc1.p("There is a new flash mode being set or camera was closed", i64Var);
        }
        this.i = null;
        d(2, true);
    }
}
