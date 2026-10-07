package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gm8 extends a8j implements pd4 {
    public final /* synthetic */ c8j c;
    public final nh8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ic6 l;
    public final ic6 m;
    public final pzf n;
    public final nr2 o;
    public final r8e p;
    public final p3c q;
    public final p3c r;
    public final p3c s;
    public final xx6 t;
    public static final /* synthetic */ zv8[] v = {new z8b(gm8.class, "findContactByPhoneJob", "getFindContactByPhoneJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, gm8.class, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;"), new z8b(gm8.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;")};
    public static final ou7 u = new ou7(29);

    public gm8(nh8 nh8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        c8j c8jVar = new c8j(ny8Var5, new x27(15));
        this.c = c8jVar;
        this.d = nh8Var;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        e9i.j0(new fz6(nh8Var.h, new el6(this, (lq4) null, 15), 3), this.b);
        this.l = new ic6(null);
        this.m = new ic6(null);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.n = pzfVarB;
        this.o = e9i.m0(pzfVarB, new jz(c8jVar.d, 13));
        this.p = nh8Var.b(this.b);
        this.q = qyj.S();
        this.r = qyj.S();
        this.s = qyj.S();
        this.t = nh8Var.a(new c9(2, null, 12));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9 == r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.gm8 r6, java.lang.String r7, java.lang.String r8, defpackage.nq4 r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof defpackage.em8
            if (r0 == 0) goto L16
            r0 = r9
            em8 r0 = (defpackage.em8) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.g = r1
            goto L1b
        L16:
            em8 r0 = new em8
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            tnh r6 = r0.d
            defpackage.ch3.d0(r9)
            goto La0
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L37:
            defpackage.ch3.d0(r9)
            goto L7b
        L3b:
            defpackage.ch3.d0(r9)
            int r8 = r8.length()
            if (r8 != 0) goto L4d
            tnh r4 = new tnh
            r7 = 2131822733(0x7f11088d, float:1.9278246E38)
            r4.<init>(r7)
            goto L8b
        L4d:
            int r8 = r7.length()
            nh8 r9 = r6.d
            mjg r9 = r9.e
            java.lang.Object r9 = r9.getValue()
            x0c r9 = (defpackage.x0c) r9
            java.lang.Integer r9 = r9.e
            if (r9 == 0) goto L64
            int r9 = r9.intValue()
            goto L67
        L64:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L67:
            if (r8 <= r9) goto L72
            tnh r4 = new tnh
            r7 = 2131822734(0x7f11088e, float:1.9278248E38)
            r4.<init>(r7)
            goto L8b
        L72:
            r0.g = r3
            java.lang.Object r9 = C(r7, r6, r0)
            if (r9 != r5) goto L7b
            goto L9e
        L7b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L8b
            tnh r4 = new tnh
            r7 = 2131822783(0x7f1108bf, float:1.9278347E38)
            r4.<init>(r7)
        L8b:
            if (r4 == 0) goto La1
            pzf r6 = r6.n
            tl8 r7 = new tl8
            r7.<init>(r4)
            r0.d = r4
            r0.g = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r5) goto L9f
        L9e:
            return r5
        L9f:
            r6 = r4
        La0:
            r4 = r6
        La1:
            if (r4 != 0) goto La4
            goto La5
        La4:
            r3 = 0
        La5:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm8.B(gm8, java.lang.String, java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object C(String str, gm8 gm8Var, nq4 nq4Var) {
        fm8 fm8Var;
        Long lC0;
        if (nq4Var instanceof fm8) {
            fm8Var = (fm8) nq4Var;
            int i = fm8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fm8Var.f = i - Integer.MIN_VALUE;
            } else {
                fm8Var = new fm8(nq4Var);
            }
        } else {
            fm8Var = new fm8(nq4Var);
        }
        Object objB = fm8Var.e;
        int i2 = fm8Var.f;
        boolean z = false;
        if (i2 == 0) {
            ch3.d0(objB);
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            lC0 = y5h.C0(sb.toString());
            utd utdVar = (utd) gm8Var.h.getValue();
            long jT = ((s7f) ((et3) gm8Var.j.getValue())).t();
            fm8Var.d = lC0;
            fm8Var.f = 1;
            objB = utdVar.b(jT, fm8Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lC0 = fm8Var.d;
            ch3.d0(objB);
        }
        long jW = ((vjd) objB).d.w();
        if (lC0 != null && jW == lC0.longValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void D(String str, String str2) {
        xt4 xt4VarB = ((n0c) ((xhh) this.i.getValue())).b();
        yt4 yt4Var = (yt4) this.k.getValue();
        xt4VarB.getClass();
        sgg sggVar = (sgg) this.c.a(this.b, lvb.x0(xt4VarB, yt4Var), 2, new ihc(this, str, str2, (lq4) null, 2));
        this.q.B(this, v[0], sggVar);
    }

    public final void E() {
        zv8[] zv8VarArr = v;
        zv8 zv8Var = zv8VarArr[2];
        p3c p3cVar = this.s;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var == null || !vo8Var.isActive()) {
            lk9 lk9VarC = ((n0c) ((xhh) this.i.getValue())).c();
            yt4 yt4Var = (yt4) this.k.getValue();
            lk9VarC.getClass();
            p3cVar.B(this, zv8VarArr[2], a8j.t(this, lvb.x0(lk9VarC, yt4Var), new wz6(this, null, 8), 2));
        }
    }

    @Override // defpackage.pd4
    public final q8e q() {
        return this.c.d;
    }

    @Override // defpackage.a8j
    public final void y() {
        zv8[] zv8VarArr = v;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.q;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
        zv8 zv8Var2 = zv8VarArr[1];
        p3c p3cVar2 = this.r;
        vo8 vo8Var2 = (vo8) p3cVar2.m(this, zv8Var2);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        p3cVar2.B(this, zv8VarArr[1], null);
        zv8 zv8Var3 = zv8VarArr[2];
        p3c p3cVar3 = this.s;
        vo8 vo8Var3 = (vo8) p3cVar3.m(this, zv8Var3);
        if (vo8Var3 != null) {
            vo8Var3.b(null);
        }
        p3cVar3.B(this, zv8VarArr[2], null);
    }
}
