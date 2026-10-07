package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y65 implements qf {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public pf[] f = new pf[100];

    public final synchronized void a() {
        if (this.a) {
            b(0);
        }
    }

    public final synchronized void b(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            l();
        }
    }

    @Override // defpackage.qf
    public final synchronized pf g() {
        pf pfVar;
        try {
            int i = this.d + 1;
            this.d = i;
            int i2 = this.e;
            if (i2 > 0) {
                pf[] pfVarArr = this.f;
                int i3 = i2 - 1;
                this.e = i3;
                pfVar = pfVarArr[i3];
                pfVar.getClass();
                this.f[this.e] = null;
            } else {
                pf pfVar2 = new pf(0, new byte[this.b]);
                pf[] pfVarArr2 = this.f;
                if (i > pfVarArr2.length) {
                    this.f = (pf[]) Arrays.copyOf(pfVarArr2, pfVarArr2.length * 2);
                }
                pfVar = pfVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return pfVar;
    }

    @Override // defpackage.qf
    public final synchronized void i(n21 n21Var) {
        while (n21Var != null) {
            try {
                pf[] pfVarArr = this.f;
                int i = this.e;
                this.e = i + 1;
                pfVarArr[i] = n21Var.a();
                this.d--;
                n21Var = n21Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // defpackage.qf
    public final synchronized void k(pf pfVar) {
        pf[] pfVarArr = this.f;
        int i = this.e;
        this.e = i + 1;
        pfVarArr[i] = pfVar;
        this.d--;
        notifyAll();
    }

    @Override // defpackage.qf
    public final synchronized void l() {
        int iMax = Math.max(0, vqi.g(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }

    @Override // defpackage.qf
    public final int q() {
        return this.b;
    }
}
