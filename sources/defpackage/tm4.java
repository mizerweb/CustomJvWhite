package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tm4 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public tm4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    public final xx6 a() {
        phl phlVar = ((dz4) ((x02) ((b95) this.a.getValue()).i.a.getValue()).z().getValue()).a;
        m32 m32Var = phlVar instanceof m32 ? (m32) phlVar : null;
        if (m32Var != null) {
            long j = m32Var.a;
            xx6 xx6VarT = e9i.T(new fz6(((no4) this.b.getValue()).j(j), new i20(this, j, (lq4) null, 12)), ((n0c) ((xhh) this.d.getValue())).a());
            if (xx6VarT != null) {
                return xx6VarT;
            }
        }
        return new tz(7, null);
    }
}
