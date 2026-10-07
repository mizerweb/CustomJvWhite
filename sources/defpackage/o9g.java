package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o9g extends qr0 {
    public final int o;
    public final b87 p;
    public long q;
    public boolean r;

    public o9g(u25 u25Var, a35 a35Var, b87 b87Var, int i, Object obj, long j, long j2, long j3, int i2, b87 b87Var2) {
        super(u25Var, a35Var, b87Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = b87Var2;
    }

    @Override // defpackage.ft9
    public final boolean b() {
        return this.r;
    }

    @Override // defpackage.y99
    public final void load() {
        lkg lkgVar = this.i;
        uvc uvcVar = this.m;
        uvcVar.getClass();
        int iC = 0;
        for (wye wyeVar : (wye[]) uvcVar.c) {
            if (wyeVar.F != 0) {
                wyeVar.F = 0L;
                wyeVar.z = true;
            }
        }
        kyh kyhVarX = uvcVar.x(this.o);
        kyhVarX.g(this.p);
        try {
            long jF = lkgVar.f(this.b.d(this.q));
            if (jF != -1) {
                jF += this.q;
            }
            qa5 qa5Var = new qa5(this.i, this.q, jF);
            while (true) {
                long j = this.q;
                if (iC == -1) {
                    kyhVarX.a(this.g, 1, (int) j, 0, null);
                    gz8.a(lkgVar);
                    this.r = true;
                    return;
                }
                this.q = j + ((long) iC);
                iC = kyhVarX.c(qa5Var, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            gz8.a(lkgVar);
            throw th;
        }
    }

    @Override // defpackage.y99
    public final void z() {
    }
}
