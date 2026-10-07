package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n37 implements dzc {
    public final xde a;
    public final nei b;
    public final ny8 c;
    public final ny8 d;
    public final pzf e;
    public final q8e f;
    public gu4 g;
    public boolean h;

    public n37(xde xdeVar, nei neiVar, ny8 ny8Var, ny8 ny8Var2) {
        this.a = xdeVar;
        this.b = neiVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.e = pzfVarB;
        this.f = new q8e(pzfVarB);
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.g = dq4Var;
    }

    @Override // defpackage.dzc
    public final void b() {
        this.g = null;
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
        this.a.L(xycVar);
    }

    @Override // defpackage.dzc
    public final void e(long j) {
        this.a.H(j);
    }
}
