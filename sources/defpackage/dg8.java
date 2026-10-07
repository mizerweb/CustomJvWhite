package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dg8 extends uq3 {
    public final q51 j;
    public uvc k;
    public long l;
    public volatile boolean m;

    public dg8(u25 u25Var, a35 a35Var, b87 b87Var, int i, Object obj, q51 q51Var) {
        super(u25Var, a35Var, 2, b87Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = q51Var;
    }

    @Override // defpackage.y99
    public final void load() {
        if (this.l == 0) {
            this.j.b(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            a35 a35VarD = this.b.d(this.l);
            lkg lkgVar = this.i;
            qa5 qa5Var = new qa5(lkgVar, a35VarD.f, lkgVar.f(a35VarD));
            while (!this.m) {
                try {
                    int iL = this.j.a.l(qa5Var, q51.k);
                    boolean z = false;
                    lvb.b0(iL != 1);
                    if (iL == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } catch (Throwable th) {
                    this.l = qa5Var.d - this.b.f;
                    this.j.a();
                    throw th;
                }
            }
            this.l = qa5Var.d - this.b.f;
            this.j.a();
            gz8.a(this.i);
        } catch (Throwable th2) {
            gz8.a(this.i);
            throw th2;
        }
    }

    @Override // defpackage.y99
    public final void z() {
        this.m = true;
    }
}
