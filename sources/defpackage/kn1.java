package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kn1 extends a8j {
    public final k42 c;
    public final zb1 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final mjg j;
    public final r8e k;
    public final mjg l;
    public final r8e m;
    public final mjg n;
    public final r8e o;
    public final ic6 p;

    public kn1(k42 k42Var, zb1 zb1Var, b95 b95Var, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, tm4 tm4Var) {
        this.c = k42Var;
        this.d = zb1Var;
        this.e = ny8Var3;
        this.f = ny8Var2;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var;
        mjg mjgVarA = p90.a(cn1.e);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.l = mjgVarA2;
        this.m = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(Boolean.valueOf(((ac1) zb1Var).c()));
        this.n = mjgVarA3;
        this.o = new r8e(mjgVarA3);
        this.p = new ic6(null);
        ur2 ur2VarM0 = e9i.M0(b95Var.i, new sh1(3, null, 2));
        n42 n42Var = (n42) k42Var;
        r8e r8eVar = n42Var.f;
        n0c n0cVar = (n0c) xhhVar;
        e9i.j0(e9i.T(new fz6(new r07(ur2VarM0, r8eVar, new ud9(this, (lq4) null, 2), 0), new in1(this, (lq4) null, 0), 3), n0cVar.a()), this.b);
        e9i.j0(e9i.T(e9i.C(n42Var.e, r8eVar, tm4Var.a(), new jn1(this, null, 0)), n0cVar.a()), this.b);
    }

    public final r8e B() {
        return this.k;
    }

    public final r8e C() {
        return this.o;
    }

    public final ic6 D() {
        return this.p;
    }

    public final r8e E() {
        return this.m;
    }

    public final void F(String str) {
        n42 n42Var = (n42) this.c;
        boolean z = ((f62) n42Var.f.a.getValue()).c;
        ic6 ic6Var = this.p;
        if (!z) {
            a8j.x(ic6Var, new zm1(str));
            return;
        }
        phl phlVar = ((f62) n42Var.f.a.getValue()).o;
        boolean z2 = false;
        if (phlVar != null && phlVar.b()) {
            z2 = true;
        }
        a8j.x(ic6Var, new an1((be1) n42Var.e.a.getValue(), z2, ((f62) n42Var.f.a.getValue()).h));
    }
}
