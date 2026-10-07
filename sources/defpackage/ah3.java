package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah3 extends a8j {
    public final in0 c;
    public final ny8 d;
    public final p41 e;
    public final ir2 f;

    public ah3(in0 in0Var, jn0 jn0Var, ny8 ny8Var) {
        this.c = in0Var;
        this.d = ny8Var;
        lq4 lq4Var = null;
        p41 p41VarB = yab.b(-2, 0, null, 6);
        this.e = p41VarB;
        this.f = e9i.q0(p41VarB);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", zo5.s("init: shouldObserve=", jn0Var.b()), null);
            }
        }
        if (jn0Var.b()) {
            e9i.j0(new fz6(new tz(2, new bye(new x10(jn0Var, lq4Var, 1))), new qob(this, jn0Var, lq4Var, 15), 3), this.b);
        }
    }
}
