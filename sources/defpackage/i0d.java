package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i0d implements f22 {
    public final /* synthetic */ j0d a;

    public i0d(j0d j0dVar) {
        this.a = j0dVar;
    }

    @Override // defpackage.f22
    public final void e() {
        j0d j0dVar = this.a;
        String str = j0dVar.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("onCallAccepted: lastPingInteractive=", j0dVar.k), null);
            }
        }
        if (!((Boolean) this.a.a.invoke()).booleanValue() || this.a.k) {
            return;
        }
        this.a.a();
    }

    @Override // defpackage.f22
    public final void m(String str) {
        j0d j0dVar = this.a;
        gm0.x(j0dVar.m, "onCallDestroyed", null);
        if (!((Boolean) j0dVar.a.invoke()).booleanValue() || ((gn8) j0dVar.e.getValue()).a()) {
            return;
        }
        j0dVar.b();
    }
}
