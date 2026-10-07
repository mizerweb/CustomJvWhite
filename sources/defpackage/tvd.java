package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tvd implements xye {
    public final int a;
    public final /* synthetic */ vvd b;

    public tvd(vvd vvdVar, int i) {
        this.b = vvdVar;
        this.a = i;
    }

    @Override // defpackage.xye
    public final void b() throws IOException {
        int i = this.a;
        vvd vvdVar = this.b;
        vvdVar.v[i].z();
        dc9 dc9Var = vvdVar.m;
        int iO = vvdVar.d.o(vvdVar.F);
        IOException iOException = (IOException) dc9Var.d;
        if (iOException != null) {
            throw iOException;
        }
        x99 x99Var = (x99) dc9Var.c;
        if (x99Var != null) {
            if (iO == Integer.MIN_VALUE) {
                iO = x99Var.a;
            }
            IOException iOException2 = x99Var.e;
            if (iOException2 != null && x99Var.f > iO) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        vvd vvdVar = this.b;
        if (vvdVar.H()) {
            return -3;
        }
        int i2 = this.a;
        vvdVar.A(i2);
        int iC = vvdVar.v[i2].C(v2aVar, u55Var, i, vvdVar.o1);
        if (iC == -3) {
            vvdVar.B(i2);
        }
        return iC;
    }

    @Override // defpackage.xye
    public final boolean m() {
        vvd vvdVar = this.b;
        return !vvdVar.H() && vvdVar.v[this.a].x(vvdVar.o1);
    }

    @Override // defpackage.xye
    public final int o(long j) throws Throwable {
        vvd vvdVar = this.b;
        if (vvdVar.H()) {
            return 0;
        }
        int i = this.a;
        vvdVar.A(i);
        wye wyeVar = vvdVar.v[i];
        int iV = wyeVar.v(j, vvdVar.o1);
        wyeVar.G(iV);
        if (iV == 0) {
            vvdVar.B(i);
        }
        return iV;
    }
}
