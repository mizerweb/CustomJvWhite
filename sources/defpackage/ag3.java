package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ag3 {
    public final ny8 a;
    public final ny8 b;

    public ag3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final sbi a(long j, long j2) {
        ag3 ag3Var = this;
        pvb pvbVar = (pvb) ag3Var.a.getValue();
        if (pvbVar.j(j)) {
            pvb.t(pvbVar, new cg3(pvbVar.u().a.g(), j, j2, 0, null, false, null, null, null, null, null, -1L, false));
            ag3Var = this;
        }
        qw2 qw2VarJ = ((xn3) ag3Var.b.getValue()).j();
        Long l = new Long(j);
        qw2VarJ.r(l.longValue(), uw2.d);
        qw2VarJ.v(l.longValue(), false, new p51(24));
        return sbi.a;
    }
}
