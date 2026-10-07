package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a8j {
    public final String a = getClass().getName();
    public final dq4 b;

    public a8j() {
        ao5 ao5Var = ao5.a;
        lk9 lk9VarS0 = rk9.a.S0();
        nah nahVarA = wk8.a();
        nahVarA.Y(new yre(8, this));
        lk9VarS0.getClass();
        this.b = cqk.a(lvb.x0(lk9VarS0, nahVarA).u0(new z7j(this)));
    }

    public static sgg t(a8j a8jVar, vt4 vt4Var, qf7 qf7Var, int i) {
        if ((i & 1) != 0) {
            vt4Var = k66.a;
        }
        return yab.h0(a8jVar.b, vt4Var, (i & 2) != 0 ? 1 : 2, qf7Var);
    }

    public static void x(ic6 ic6Var, Object obj) {
        a4c a4cVar;
        a4c a4cVar2;
        String str = ic6Var.b;
        if (str != null && (a4cVar2 = gm0.f) != null) {
            je9 je9Var = je9.c;
            if (a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str, c0a.n(obj, "Emitting event -> "), null);
            }
        }
        boolean zA = ic6Var.a.a(obj);
        String str2 = ic6Var.b;
        if (str2 == null || zA || (a4cVar = gm0.f) == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar.b(je9Var2)) {
            a4cVar.c(je9Var2, str2, c0a.n(obj, "Got failed emit for event -> "), null);
        }
    }

    public void y() {
    }

    public void z() {
    }
}
