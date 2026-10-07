package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class to4 extends qr0 {
    public final int o;
    public final long p;
    public final q51 q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public to4(u25 u25Var, a35 a35Var, b87 b87Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, q51 q51Var) {
        super(u25Var, a35Var, b87Var, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = q51Var;
    }

    @Override // defpackage.ft9
    public final long a() {
        return this.j + ((long) this.o);
    }

    @Override // defpackage.ft9
    public final boolean b() {
        return this.t;
    }

    @Override // defpackage.y99
    public final void load() {
        uvc uvcVar = this.m;
        uvcVar.getClass();
        if (this.r == 0) {
            long j = this.p;
            for (wye wyeVar : (wye[]) uvcVar.c) {
                if (wyeVar.F != j) {
                    wyeVar.F = j;
                    wyeVar.z = true;
                }
            }
            q51 q51Var = this.q;
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            q51Var.b(uvcVar, j3, j4 != -9223372036854775807L ? j4 - this.p : -9223372036854775807L);
        }
        try {
            a35 a35VarD = this.b.d(this.r);
            lkg lkgVar = this.i;
            qa5 qa5Var = new qa5(lkgVar, a35VarD.f, lkgVar.f(a35VarD));
            while (!this.s) {
                try {
                    int iL = this.q.a.l(qa5Var, q51.k);
                    lvb.b0(iL != 1);
                    if (!(iL == 0)) {
                        break;
                    }
                } catch (Throwable th) {
                    this.r = qa5Var.d - this.b.f;
                    throw th;
                }
            }
            b87 b87Var = this.d;
            String str = b87Var.m;
            int i = b87Var.M;
            int i2 = b87Var.N;
            if (uya.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                kyh kyhVarX = uvcVar.x(4);
                int i3 = i * i2;
                long j5 = (this.h - this.g) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    kyhVarX.f(0, new nmc());
                    kyhVarX.a(((long) i4) * j5, 0, 0, 0, null);
                }
            }
            this.r = qa5Var.d - this.b.f;
            gz8.a(this.i);
            this.t = !this.s;
        } catch (Throwable th2) {
            gz8.a(this.i);
            throw th2;
        }
    }

    @Override // defpackage.y99
    public final void z() {
        this.s = true;
    }
}
