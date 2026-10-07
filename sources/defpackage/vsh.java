package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vsh extends na7 {
    public final ry9 f;

    public vsh(ush ushVar, ry9 ry9Var) {
        super(ushVar);
        this.f = ry9Var;
    }

    public static vsh q(ush ushVar, ry9 ry9Var) {
        return ushVar instanceof vsh ? new vsh(((vsh) ushVar).e, ry9Var) : new vsh(ushVar, ry9Var);
    }

    @Override // defpackage.na7, defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        super.m(i, tshVar, j);
        ry9 ry9Var = this.f;
        tshVar.b = ry9Var;
        jy9 jy9Var = ry9Var.b;
        return tshVar;
    }
}
