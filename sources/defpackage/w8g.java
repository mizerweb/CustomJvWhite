package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class w8g implements y3d {
    public final Application a;
    public final ed6 b;
    public final df6 c;
    public final ny8 d;
    public final d4d e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 i;
    public final wme k;
    public final String h = w8g.class.getName();
    public final pgg j = new pgg((Object) null);

    public w8g(ed6 ed6Var, df6 df6Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, d4d d4dVar, wwd wwdVar, wwd wwdVar2, Application application) {
        this.a = application;
        this.b = ed6Var;
        this.c = df6Var;
        this.d = ny8Var;
        this.e = d4dVar;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.i = ny8Var4;
        this.k = new wme(new fg9(this, wwdVar, ny8Var5, wwdVar2, 2));
    }

    @Override // defpackage.y3d
    public final void a(e3j e3jVar) {
        gm0.n(this.h, "Single player handler. Free player");
        e3jVar.stop();
        e3jVar.H(null);
    }

    @Override // defpackage.y3d
    public final e3j get() {
        String str = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("Single player handler. Player exist: ", this.k.d()), null);
            }
        }
        e3j e3jVar = (e3j) this.k.getValue();
        e3jVar.X(this.j);
        return e3jVar;
    }
}
