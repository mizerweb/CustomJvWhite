package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class naj implements f22 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public boolean k;

    public naj(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        this.a = ny8Var10;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        ((b95) ny8Var9.getValue()).c(this);
    }

    public final void a() {
        gm0.n("naj", "onAppGoesBackground");
        this.k = false;
        if (((svb) this.b.getValue()).b()) {
            if (((x02) ((b95) this.j.getValue()).i.a.getValue()).m()) {
                gm0.n("naj", "ignore onAppGoesBackground due to active call");
                return;
            }
            ((j0d) this.c.getValue()).b();
            yfd yfdVar = (yfd) this.d.getValue();
            lq4 lq4Var = null;
            if (((Boolean) yfdVar.q.i()).booleanValue()) {
                String str = yfdVar.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "onAppGoesBackground: keep cache in background", null);
                    }
                }
            } else {
                yab.i0(yfdVar.m, null, 0, new c37(yfdVar, lq4Var, 19), 3);
            }
            hjc hjcVar = (hjc) this.f.getValue();
            hjcVar.i.entrySet().removeIf(new u6(12, new pyb(11)));
            hjcVar.j.clear();
            ((dme) this.g.getValue()).m(false);
            ((hq6) this.h.getValue()).getClass();
        }
    }

    public final void b(boolean z) {
        gm0.m("naj", "onAppGoesForeground forceContactSync = %b", Boolean.valueOf(z));
        ((mih) this.a.getValue()).e(false);
        ((wd4) this.i.getValue()).invalidate();
        if (!this.k && ((x02) ((b95) this.j.getValue()).i.a.getValue()).k()) {
            gm0.n("naj", "ignore onAppGoesForeground due to incoming call.");
            return;
        }
        this.k = true;
        ((dme) this.g.getValue()).m(true);
        ((j0d) this.c.getValue()).a();
        yfd yfdVar = (yfd) this.d.getValue();
        int i = ((rnf) ((onf) yfdVar.C.getValue())).q;
        String str = yfdVar.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onAppGoesForeground sessionState=" + i + "; allowOnlineStatus=" + yfdVar.I.get(), null);
            }
        }
        if (i > 1) {
            yfdVar.I.compareAndSet(false, true);
        }
        if (((svb) this.b.getValue()).b() && z) {
            ((n30) this.e.getValue()).b();
        }
    }

    @Override // defpackage.f22
    public final void e() {
        if (this.k) {
            return;
        }
        b(false);
        gm0.n("naj", "Call was accepted. Start ping activity state.");
    }

    @Override // defpackage.f22
    public final void m(String str) {
        if (this.k) {
            return;
        }
        a();
        gm0.n("naj", "Call was ended. Stop ping activity state.");
    }
}
