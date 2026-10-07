package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o7 extends a8j {
    public final ha9 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = o7.class.getName();
    public final r8e g;

    public o7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ha9 ha9Var) {
        this.c = ha9Var;
        this.d = ny8Var;
        this.e = ny8Var3;
        this.g = e9i.G0(e9i.T(e9i.M0(((y6b) ny8Var.getValue()).h, new n7(null, this, ny8Var)), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b, j0g.a, r66.a);
    }

    public final void B(ha9 ha9Var) {
        r7 r7Var = r7.a;
        long jT = ((s7f) ((et3) new ca2(r7.d(ha9Var)).getAccessor().d(85).getValue())).t();
        if (jT == -1) {
            gm0.r(this.f, "Account not authorized", new x6());
            return;
        }
        ((k6b) this.e.getValue()).a(2, 1, Long.valueOf(jT));
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Switch account to " + ha9Var + ", userId = " + jT, null);
            }
        }
        hl9.b.j(ha9Var);
    }
}
