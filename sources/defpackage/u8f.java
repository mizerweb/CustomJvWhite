package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u8f extends a8j {
    public final long c;
    public final qx2 d;
    public final o73 e;
    public final ev f = new ev(this, false, 16);
    public final r8e g;
    public final r8e h;
    public final ic6 i;

    public u8f(r8f r8fVar, long j, qx2 qx2Var, o73 o73Var) {
        this.c = j;
        this.d = qx2Var;
        this.e = o73Var;
        this.g = (r8e) o73Var.j;
        r8e r8eVar = (r8e) o73Var.k;
        this.h = r8eVar;
        this.i = new ic6(null);
        int i = 3;
        e9i.j0(new fz6(new q8e(r8fVar.a), new t8f(this, null, 0), i), this.b);
        e9i.j0(new fz6(new jz(r8eVar, 13), new t8f(this, null, 1), i), this.b);
    }

    public final void B() {
        this.f.f(false);
        o73 o73Var = this.e;
        q73 q73Var = (q73) o73Var.a;
        q73Var.g = null;
        q73Var.b();
        q73Var.b();
        ((mjg) o73Var.i).setValue(null);
        mjg mjgVar = (mjg) o73Var.h;
        mjgVar.getClass();
        mjgVar.j(null, n9f.a);
    }

    public final void C(boolean z) {
        this.f.f(true);
        o73 o73Var = this.e;
        q73 q73Var = (q73) o73Var.a;
        o9f o9fVar = new o9f(z);
        mjg mjgVar = (mjg) o73Var.h;
        if (cqk.d(mjgVar.getValue(), o9fVar)) {
            return;
        }
        mjgVar.j(null, o9fVar);
        yab.i0(q73Var.e, null, 0, new k23(q73Var, null, 7), 3);
        q73Var.g = o73Var;
    }
}
