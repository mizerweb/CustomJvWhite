package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vze {
    public final v3f a;
    public final xt4 b;
    public final poc c;
    public final ny8 d;

    public vze(v3f v3fVar, xt4 xt4Var, poc pocVar, ny8 ny8Var) {
        this.a = v3fVar;
        this.b = xt4Var;
        this.c = pocVar;
        this.d = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0169, code lost:
    
        if (r0 == r12) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Comparable a(defpackage.vze r22, java.lang.String r23, boolean r24, boolean r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vze.a(vze, java.lang.String, boolean, boolean, nq4):java.lang.Comparable");
    }

    public static Object c(vze vzeVar, String str, boolean z, nq4 nq4Var) {
        return yab.K0(vzeVar.b, new qi4(vzeVar, str, z, (lq4) null, 8), nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, boolean z, nq4 nq4Var) {
        tze tzeVar;
        if (nq4Var instanceof tze) {
            tzeVar = (tze) nq4Var;
            int i = tzeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzeVar.f = i - Integer.MIN_VALUE;
            } else {
                tzeVar = new tze(this, nq4Var);
            }
        } else {
            tzeVar = new tze(this, nq4Var);
        }
        Object objD = tzeVar.d;
        int i2 = tzeVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            tzeVar.f = 1;
            objD = d(tzeVar, str, z, false);
            Object obj = hu4.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        return Boolean.valueOf(objD != null);
    }

    public final Object d(nq4 nq4Var, String str, boolean z, boolean z2) {
        return yab.K0(lvb.x0(zhb.b, this.b), new km0(this, str, z, z2, (lq4) null), nq4Var);
    }

    public final Object e(v78 v78Var, boolean z, boolean z2, sze szeVar) {
        ek2 ek2Var = new ek2(1, p90.B(szeVar));
        ek2Var.u();
        try {
            t25 t25VarB = vd7.A().b(v78Var, null);
            ((q0) t25VarB).l(new uze(t25VarB, ek2Var, this, z2, oc9.v((int) (((Number) ((e5d) this.d.getValue()).p.a(e5d.S6[7]).i()).floatValue() * 100.0f), 0, 100), z), x72.a);
        } catch (Throwable th) {
            gm0.V("vze", "onNewResultImpl: failed to save image", th);
            ek2Var.resumeWith(null);
        }
        return ek2Var.s();
    }
}
