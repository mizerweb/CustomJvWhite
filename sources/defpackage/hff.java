package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hff extends a8j implements sy9 {
    public static final /* synthetic */ zv8[] C = {new z8b(hff.class, "sendJob", "getSendJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, hff.class, "longClickSendJob", "getLongClickSendJob()Lkotlinx/coroutines/Job;"), new z8b(hff.class, "scheduledDialogJob", "getScheduledDialogJob()Lkotlinx/coroutines/Job;")};
    public final r8e A;
    public final o56 B;
    public final long c;
    public final as9 d;
    public final gi7 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final String o = hff.class.getName();
    public final si7 p;
    public final ti7 q;
    public final p3c r;
    public final p3c s;
    public final p3c t;
    public final gjg u;
    public final mjg v;
    public final r8e w;
    public final ic6 x;
    public final r8e y;
    public final r8e z;

    public hff(long j, as9 as9Var, gi7 gi7Var, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.c = j;
        this.d = as9Var;
        this.e = gi7Var;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var2;
        this.j = ny8Var;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var8;
        this.n = ny8Var9;
        si7 si7Var = new si7(this, 2);
        this.p = si7Var;
        ti7 ti7Var = new ti7(this, 2);
        this.q = ti7Var;
        this.r = qyj.S();
        this.s = qyj.S();
        this.t = qyj.S();
        this.u = as9Var.c;
        F().c.add(ti7Var);
        F().f.add(si7Var);
        boolean z2 = true;
        e9i.j0(new fz6(e9i.q0(as9Var.s), new gff(this, null, 1), 3), this.b);
        e9i.j0(new fz6(new hde(gi7Var.d, 5), new gff(this, null, 0), 3), this.b);
        mjg mjgVarA = p90.a(srh.a(F()));
        this.v = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.w = r8eVar;
        this.x = new ic6(null);
        hz1 hz1Var = new hz1(r8eVar, 12);
        mjg mjgVar = uw8.f;
        r07 r07Var = new r07(hz1Var, mjgVar, new ad1(3, null, 6), 0);
        Boolean bool = Boolean.FALSE;
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(r07Var, dq4Var, a8gVar, bool);
        this.y = r8eVarG0;
        dff dffVar = new dff(hz1Var, this, z);
        if (!((Boolean) r8eVarG0.a.getValue()).booleanValue() && !as9Var.E() && !z) {
            z2 = false;
        }
        this.z = e9i.G0(dffVar, this.b, a8gVar, Boolean.valueOf(z2));
        this.A = e9i.G0(new q0d(new r07(mjgVar, r8eVar, wef.h, 0), this, 16), this.b, a8gVar, igf.b);
        this.B = new o56();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(hff hffVar, nq4 nq4Var) {
        vef vefVar;
        if (nq4Var instanceof vef) {
            vefVar = (vef) nq4Var;
            int i = vefVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vefVar.f = i - Integer.MIN_VALUE;
            } else {
                vefVar = new vef(hffVar, nq4Var);
            }
        } else {
            vefVar = new vef(hffVar, nq4Var);
        }
        Object objN = vefVar.d;
        int i2 = vefVar.f;
        if (i2 == 0) {
            ch3.d0(objN);
            jz jzVar = new jz(hffVar.u, 13);
            vefVar.f = 1;
            objN = e9i.N(jzVar, vefVar);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        rt2 rt2Var = (rt2) objN;
        if (sol.a(rt2Var, (wo6) hffVar.g.getValue())) {
            a8j.x(hffVar.x, new tef(sol.c(rt2Var)));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        if (r4.b(r5, r18, r2, r9, r10, null, r8, r20, r12) == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
    
        if (defpackage.iva.b(r4, r5, r18, r8, r9, null, r6, r12, 48) == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.hff r17, java.lang.CharSequence r18, defpackage.hb9 r19, java.lang.Long r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hff.C(hff, java.lang.CharSequence, hb9, java.lang.Long, nq4):java.lang.Object");
    }

    public final void D(CharSequence charSequence, long j) {
        int iE = ((g5d) ((gjf) this.f.getValue())).e();
        if (F().c() > iE) {
            a8j.x(this.x, new ref(iE));
            return;
        }
        sgg sggVarH0 = yab.h0(this.b, ((n0c) E()).a(), 2, new h99(this, j, charSequence, null, 7));
        this.r.B(this, C[0], sggVarH0);
    }

    public final xhh E() {
        return (xhh) this.h.getValue();
    }

    public final ief F() {
        return ((ib9) this.i.getValue()).a;
    }

    public final void G(CharSequence charSequence, hb9 hb9Var) {
        if (this.d.d.i()) {
            I();
            return;
        }
        sgg sggVarH0 = yab.h0(this.b, ((n0c) E()).a(), 2, new voc(this, charSequence, hb9Var, null, 25));
        this.r.B(this, C[0], sggVarH0);
    }

    public final void H() {
        a8j.t(this, ((n0c) E()).a(), new yef(this, null, 0), 2);
    }

    public final void I() {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) E()).a(), 2, new xef(this, null, 1));
        this.t.B(this, C[2], sggVarH0);
    }

    @Override // defpackage.sy9
    public final void k(jef jefVar) {
        hb9 hb9VarB = h1h.b(jefVar.a);
        int iH = F().h(hb9VarB);
        int iE = ((g5d) ((gjf) this.f.getValue())).e();
        if (((Boolean) this.e.c.invoke()).booleanValue() && iH == 0 && F().c() >= iE) {
            a8j.x(this.x, new ref(iE));
        } else {
            F().w(hb9VarB);
            a8j.t(this, ((n0c) E()).a(), new yef(this, null, 1), 2);
            F().h(hb9VarB);
        }
        H();
    }

    @Override // defpackage.sy9
    public final void p(jef jefVar) {
        a8j.x(this.x, new qef(jefVar));
    }

    @Override // defpackage.a8j
    public final void y() {
        ief iefVarF = F();
        iefVarF.c.remove(this.q);
        ief iefVarF2 = F();
        iefVarF2.f.remove(this.p);
    }
}
