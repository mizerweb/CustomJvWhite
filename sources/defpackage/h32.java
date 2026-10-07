package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class h32 implements dwh {
    public final jb1 a;
    public final zfh b;
    public final so2 c;
    public final vn7 d;
    public final ih e;
    public final n11 f;
    public final d32 g;
    public final g85 h;
    public final gi1 i;
    public final cf4 j;
    public final ec1 k;
    public final ih l;
    public final h9 m;

    public h32(jb1 jb1Var, zfh zfhVar, so2 so2Var, vn7 vn7Var, ih ihVar, n11 n11Var, d32 d32Var, g85 g85Var, gi1 gi1Var, cf4 cf4Var, ec1 ec1Var, ih ihVar2, h9 h9Var) {
        zfhVar.getClass();
        so2Var.getClass();
        vn7Var.getClass();
        ihVar.getClass();
        n11Var.getClass();
        d32Var.getClass();
        g85Var.getClass();
        gi1Var.getClass();
        cf4Var.getClass();
        ec1Var.getClass();
        ihVar2.getClass();
        h9Var.getClass();
        this.a = jb1Var;
        this.b = zfhVar;
        this.c = so2Var;
        this.d = vn7Var;
        this.e = ihVar;
        this.f = n11Var;
        this.g = d32Var;
        this.h = g85Var;
        this.i = gi1Var;
        this.j = cf4Var;
        this.k = ec1Var;
        this.l = ihVar2;
        this.m = h9Var;
        ((w74) g85Var.e).dispose();
        w74 w74Var = new w74();
        g85Var.e = w74Var;
        z2f z2fVarB = i3f.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        brb brbVarA = fqb.a(5000L, 5000L, timeUnit, z2fVarB);
        o3j o3jVar = new o3j(g85Var);
        so2 so2Var2 = vm9.f;
        vx8 vx8Var = new vx8(o3jVar, so2Var2);
        brbVarA.f(vx8Var);
        w74Var.a(vx8Var);
        w74 w74Var2 = (w74) g85Var.e;
        brb brbVarA2 = fqb.a(1000L, 1000L, timeUnit, i3f.b());
        vx8 vx8Var2 = new vx8(new fpi(6, g85Var), so2Var2);
        brbVarA2.f(vx8Var2);
        w74Var2.a(vx8Var2);
    }

    @Override // defpackage.dwh
    public final void onTopologyUpdated(zvh zvhVar, zvh zvhVar2) {
        zvhVar.getClass();
        zvhVar2.getClass();
        this.i.onTopologyUpdated(zvhVar, zvhVar2);
    }
}
