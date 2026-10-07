package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xq3 implements xye {
    public final yq3 a;
    public final wye b;
    public final int c;
    public boolean d;
    public final /* synthetic */ yq3 e;

    public xq3(yq3 yq3Var, yq3 yq3Var2, wye wyeVar, int i) {
        this.e = yq3Var;
        this.a = yq3Var2;
        this.b = wyeVar;
        this.c = i;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        yq3 yq3Var = this.e;
        ed7 ed7Var = yq3Var.g;
        int[] iArr = yq3Var.b;
        int i = this.c;
        ed7Var.E(iArr[i], yq3Var.c[i], 0, null, yq3Var.t);
        this.d = true;
    }

    @Override // defpackage.xye
    public final void b() {
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        yq3 yq3Var = this.e;
        if (yq3Var.A()) {
            return -3;
        }
        qr0 qr0Var = yq3Var.v;
        wye wyeVar = this.b;
        if (qr0Var != null && qr0Var.c(this.c + 1) <= wyeVar.t()) {
            return -3;
        }
        a();
        return wyeVar.C(v2aVar, u55Var, i, yq3Var.y);
    }

    @Override // defpackage.xye
    public final boolean m() {
        yq3 yq3Var = this.e;
        return !yq3Var.A() && this.b.x(yq3Var.y);
    }

    @Override // defpackage.xye
    public final int o(long j) throws Throwable {
        yq3 yq3Var = this.e;
        if (yq3Var.A()) {
            return 0;
        }
        boolean z = yq3Var.y;
        wye wyeVar = this.b;
        int iV = wyeVar.v(j, z);
        qr0 qr0Var = yq3Var.v;
        if (qr0Var != null) {
            iV = Math.min(iV, qr0Var.c(this.c + 1) - wyeVar.t());
        }
        wyeVar.G(iV);
        if (iV > 0) {
            a();
        }
        return iV;
    }
}
