package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qme {
    public final gj0 a;
    public final qhh b;
    public final u72 c;
    public final u72 d;
    public final r72 e;
    public final r72 f;
    public boolean g = false;
    public boolean h = false;
    public bp2 i;

    public qme(gj0 gj0Var, qhh qhhVar) {
        this.a = gj0Var;
        this.b = qhhVar;
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        try {
            this.e = r72Var;
            r72Var.a = "CaptureCompleteFuture";
        } catch (Exception e) {
            u72Var.c(e);
        }
        this.c = u72Var;
        r72 r72Var2 = new r72();
        r72Var2.c = new gne();
        u72 u72Var2 = new u72(r72Var2);
        r72Var2.b = u72Var2;
        try {
            this.f = r72Var2;
            r72Var2.a = "RequestCompleteFuture";
        } catch (Exception e2) {
            u72Var2.c(e2);
        }
        this.d = u72Var2;
    }

    public final void a() {
        gj0 gj0Var = this.a;
        boolean z = gj0Var.j;
        if (!z || gj0Var.a()) {
            if (!z) {
                qyj.l("The callback can only complete once.", !this.d.b.isDone());
            }
            this.f.b(null);
        }
    }

    public final void b() {
        wxl.a();
        if (this.g || this.h) {
            return;
        }
        this.h = true;
        gj2 gj2Var = this.a.d;
        if (gj2Var != null) {
            sd7 freezeCameraDetector = ((hj2) gj2Var.c).getFreezeCameraDetector();
            long j = gj2Var.b;
            long j2 = freezeCameraDetector.b;
            if (ew5.d(j, j2) > 0) {
                j2 = j;
            } else {
                freezeCameraDetector.d.invoke(new ew5(j));
            }
            freezeCameraDetector.e.B(freezeCameraDetector, sd7.f[0], yab.i0(freezeCameraDetector.a, null, 2, new vq(j2, freezeCameraDetector, (lq4) null, 26), 1));
        }
    }
}
