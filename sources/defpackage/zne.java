package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zne implements nnf, hh9 {
    public final ny8 a;
    public final ny8 b;
    public final dq4 c;
    public final mjg d;
    public final String e;

    public zne(ny8 ny8Var, ny8 ny8Var2, xhh xhhVar, yt4 yt4Var) {
        this.a = ny8Var;
        this.b = ny8Var2;
        xt4 xt4VarR0 = ((n0c) xhhVar).a().R0(1, "restore-tasks-on-connect");
        xt4VarR0.getClass();
        this.c = cqk.a(lvb.x0(xt4VarR0, yt4Var));
        this.d = p90.a(0);
        this.e = "RestoreScheduledTaskExecutor";
    }

    @Override // defpackage.nnf
    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        mjg mjgVar = this.d;
        mjgVar.getClass();
        mjgVar.j(null, numValueOf);
    }

    @Override // defpackage.hh9
    public final void c() {
    }
}
