package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f64 extends a8j {
    public final long[] c;
    public final Long d;
    public final Long e;
    public final boolean f;
    public final String g = f64.class.getName();
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg n;
    public final r8e o;
    public volatile q54 p;
    public final ic6 q;
    public sgg r;

    public f64(long[] jArr, Long l, Long l2, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = jArr;
        this.d = l;
        this.e = l2;
        this.f = z;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var;
        this.l = ny8Var5;
        this.m = ny8Var6;
        mjg mjgVarA = p90.a(null);
        this.n = mjgVarA;
        this.o = new r8e(mjgVarA);
        this.q = new ic6(null);
        a8j.t(this, null, new e64(this, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r11 == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r11 == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum B(defpackage.f64 r8, java.lang.Long r9, long[] r10, defpackage.nq4 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.c64
            if (r0 == 0) goto L13
            r0 = r11
            c64 r0 = (defpackage.c64) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            c64 r0 = new c64
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r11)
            goto L84
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r4
        L31:
            long[] r10 = r0.d
            defpackage.ch3.d0(r11)
            goto L56
        L37:
            defpackage.ch3.d0(r11)
            boolean r11 = r8.f
            if (r11 == 0) goto L41
            q54 r8 = defpackage.q54.STORY
            return r8
        L41:
            if (r9 == 0) goto L59
            long r6 = r9.longValue()
            xn3 r9 = r8.D()
            r0.d = r10
            r0.g = r3
            java.lang.Object r11 = r9.v(r6, r0)
            if (r11 != r5) goto L56
            goto L83
        L56:
            rt2 r11 = (defpackage.rt2) r11
            goto L5a
        L59:
            r11 = r4
        L5a:
            if (r11 == 0) goto L71
            boolean r8 = r11.h0()
            if (r8 == 0) goto L65
            q54 r8 = defpackage.q54.MSG_DIALOG
            return r8
        L65:
            boolean r8 = r11.d0()
            if (r8 == 0) goto L6e
            q54 r8 = defpackage.q54.MSG_CHANNEL
            return r8
        L6e:
            q54 r8 = defpackage.q54.MSG_CHAT
            return r8
        L71:
            long r9 = kotlin.collections.a.Z0(r10)
            xn3 r8 = r8.D()
            r0.d = r4
            r0.g = r2
            java.lang.Object r11 = r8.v(r9, r0)
            if (r11 != r5) goto L84
        L83:
            return r5
        L84:
            rt2 r11 = (defpackage.rt2) r11
            boolean r8 = r11.d0()
            if (r8 == 0) goto L8f
            q54 r8 = defpackage.q54.CHANNEL
            return r8
        L8f:
            boolean r8 = r11.h0()
            if (r8 == 0) goto La4
            vg4 r8 = r11.w()
            if (r8 == 0) goto La4
            boolean r8 = r8.E()
            if (r8 != r3) goto La4
            q54 r8 = defpackage.q54.BOT_PROFILE
            return r8
        La4:
            boolean r8 = r11.h0()
            if (r8 == 0) goto Lb3
            vg4 r8 = r11.w()
            if (r8 == 0) goto Lb3
            q54 r8 = defpackage.q54.USER_PROFILE
            return r8
        Lb3:
            q54 r8 = defpackage.q54.CHAT
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f64.B(f64, java.lang.Long, long[], nq4):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r2 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.f64 r19, int r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f64.C(f64, int, nq4):java.lang.Object");
    }

    public final xn3 D() {
        return (xn3) this.j.getValue();
    }

    public final void E(int i) {
        sgg sggVar = this.r;
        if (sggVar == null || !sggVar.isActive()) {
            this.r = a8j.t(this, zhb.b, new w93(this, i, (lq4) null, 2), 2);
        } else {
            gm0.n(this.g, "We already process complain");
        }
    }
}
