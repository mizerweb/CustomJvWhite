package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class osc implements hh9 {
    public final e5d a;
    public final et3 b;
    public final ny8 c;
    public final p41 d;
    public sgg e;
    public boolean f;
    public final ir2 g;

    public osc(e5d e5dVar, et3 et3Var, ny8 ny8Var) {
        this.a = e5dVar;
        this.b = et3Var;
        this.c = ny8Var;
        p41 p41VarB = yab.b(1, 0, null, 6);
        this.d = p41VarB;
        this.g = e9i.q0(p41VarB);
    }

    public static final long a(osc oscVar) {
        e5d e5dVar = oscVar.a;
        return ((!((Boolean) e5dVar.f().i()).booleanValue() || ((xb9) oscVar.b).S() <= 0) ? ((Number) e5dVar.h().i()).longValue() : ((Number) e5dVar.t1.a(e5d.S6[122]).i()).longValue()) * 1000;
    }

    public final void b(boolean z) {
        sgg sggVar = this.e;
        if (sggVar != null) {
            sggVar.b(null);
        }
        String name = osc.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.s("Start permission timer on restart; requested: ", z), null);
            }
        }
        this.e = yab.i0((wmi) this.c.getValue(), null, 0, new c03(z, this, null), 3);
    }

    @Override // defpackage.hh9
    public final void c() {
        this.e = null;
        xb9 xb9Var = (xb9) this.b;
        xb9Var.J0.B(xb9Var, xb9.g1[27], -1L);
    }
}
