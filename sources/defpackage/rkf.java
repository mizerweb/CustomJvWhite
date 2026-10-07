package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class rkf extends mjf implements btc {
    public static final pkf g;
    public static final /* synthetic */ zv8[] h;
    public final long b;
    public final long c;
    public final boolean d;
    public final String e = rkf.class.getName();
    public final p3c f = qyj.S();

    static {
        z8b z8bVar = new z8b(rkf.class, "maxTimeoutJob", "getMaxTimeoutJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
        g = new pkf();
    }

    public rkf(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (defpackage.qyj.V(r9, r1, r0) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.rkf r8, defpackage.nq4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.qkf
            if (r0 == 0) goto L13
            r0 = r9
            qkf r0 = (defpackage.qkf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            qkf r0 = new qkf
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r9)
            goto L76
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r4
        L31:
            defpackage.ch3.d0(r9)
            goto L57
        L35:
            defpackage.ch3.d0(r9)
            java.lang.String r9 = r8.e
            java.lang.String r1 = "Reach max timeout"
            defpackage.gm0.n(r9, r1)
            zb5 r9 = r8.p()
            java.util.concurrent.ConcurrentHashMap$KeySetView r9 = r9.c
            r9.remove(r8)
            okh r9 = r8.u()
            long r6 = r8.b
            r0.f = r3
            java.lang.Object r9 = r9.m(r6, r0)
            if (r9 != r5) goto L57
            goto L75
        L57:
            njf r9 = r8.a
            if (r9 == 0) goto L5c
            r4 = r9
        L5c:
            xhh r9 = r4.f()
            n0c r9 = (defpackage.n0c) r9
            xt4 r9 = r9.b()
            ize r1 = new ize
            r3 = 9
            r1.<init>(r3, r8)
            r0.f = r2
            java.lang.Object r8 = defpackage.qyj.V(r9, r1, r0)
            if (r8 != r5) goto L76
        L75:
            return r5
        L76:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkf.C(rkf, nq4):java.lang.Object");
    }

    @Override // defpackage.mjf
    public final void B() {
        gm0.n(this.e, "Process request location for message: " + this.c);
        njf njfVar = this.a;
        lq4 lq4Var = null;
        if (njfVar == null) {
            njfVar = null;
        }
        ew5.g(njfVar.a.m());
        p().c.add(this);
        D(null);
        if (this.d) {
            return;
        }
        njf njfVar2 = this.a;
        if (njfVar2 == null) {
            njfVar2 = null;
        }
        D(yab.i0(njfVar2.i(), null, 0, new gce(this, lq4Var, 18), 3));
    }

    public final void D(sgg sggVar) {
        this.f.B(this, h[0], sggVar);
    }

    @Override // defpackage.btc
    public final void d() {
        gm0.n(this.e, "onMaxFailCount: remove task, mark message as error");
        D(null);
        sfa sfaVarL = r().l(this.c);
        if (sfaVarL != null) {
            r().p(sfaVarL, xfa.ERROR);
            p().c.remove(this);
            u().d(this.b);
        }
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.LocationRequest locationRequest = new Tasks.LocationRequest();
        locationRequest.requestId = this.b;
        locationRequest.messageId = this.c;
        locationRequest.liveLocation = this.d;
        return sia.toByteArray(locationRequest);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_LOCATION_REQUEST;
    }

    @Override // defpackage.btc
    public final atc j() {
        sfa sfaVarL = r().l(this.c);
        return (sfaVarL == null || sfaVarL.j == wja.DELETED || !sfaVarL.Q()) ? atc.c : atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }
}
