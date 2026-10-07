package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class us6 {
    public final t51 a;
    public final pzf b = e9i.b(0, 0, 7);
    public final dq4 c;

    public us6(t51 t51Var, xhh xhhVar) {
        this.a = t51Var;
        this.c = cqk.a(((n0c) xhhVar).c());
        t51Var.d(this);
    }

    @l7h
    public final void onEvent(rgf rgfVar) {
        if ("file.local.max.size.reached".equals(rgfVar.b)) {
            yab.i0(this.c, null, 0, new ts6(this, null, 1), 3);
        }
    }

    @l7h
    public final void onEvent(bu6 bu6Var) {
        if (bgc.h.equals(bu6Var.c)) {
            yab.i0(this.c, null, 0, new ts6(this, null, 0), 3);
        }
    }
}
