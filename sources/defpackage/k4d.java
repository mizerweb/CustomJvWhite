package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public final class k4d implements y3d {
    public final Application a;
    public final ed6 b;
    public final df6 c;
    public final ny8 d;
    public final d4d e;
    public final wwd f;
    public final ny8 g;
    public final wwd h;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final String i = k4d.class.getName();
    public final pw m = new pw(0);
    public final pgg n = new pgg((Object) null);

    public k4d(ed6 ed6Var, df6 df6Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, d4d d4dVar, wwd wwdVar, wwd wwdVar2, Application application) {
        this.a = application;
        this.b = ed6Var;
        this.c = df6Var;
        this.d = ny8Var;
        this.e = d4dVar;
        this.f = wwdVar;
        this.g = ny8Var2;
        this.h = wwdVar2;
        this.j = ny8Var3;
        this.k = ny8Var4;
        this.l = ny8Var5;
    }

    @Override // defpackage.y3d
    public final void a(e3j e3jVar) {
        String str = this.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Players pool. Free player, " + e3jVar, null);
            }
        }
        e3jVar.stop();
        e3jVar.H(null);
        this.m.add(e3jVar);
    }

    @Override // defpackage.y3d
    public final e3j get() {
        if (!this.m.isEmpty()) {
            pw pwVar = this.m;
            e3j e3jVar = (e3j) pwVar.b(pwVar.c - 1);
            String str = this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Players pool. Pool has player, " + e3jVar, null);
                }
            }
            e3jVar.X(this.n);
            return e3jVar;
        }
        gm0.n(this.i, "Players pool. Pool is empty create new player");
        boolean zBooleanValue = ((Boolean) ((e5d) this.j.getValue()).x().i()).booleanValue();
        Application application = this.a;
        ed6 ed6Var = this.b;
        if (zBooleanValue) {
            bec becVar = new bec(application, ed6Var, this.e, (gue) this.l.getValue(), (dti) this.f.get(), (wo6) this.k.getValue(), (e5d) this.j.getValue(), this.c, this.g);
            becVar.X(this.n);
            becVar.q0((c3j) this.h.get());
            return becVar;
        }
        f3j f3jVar = new f3j(application, ed6Var, this.c, this.d, this.e, (gue) this.l.getValue(), (dti) this.f.get(), (wo6) this.k.getValue(), this.g);
        f3jVar.q0((c3j) this.h.get());
        return f3jVar;
    }
}
