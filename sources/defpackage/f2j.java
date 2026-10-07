package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class f2j extends a8j {
    public final g1j c;
    public final xhh d;
    public final ny8 e;
    public final mjg f;
    public final mjg g;
    public final hde h;
    public final ic6 i;
    public final ic6 j;
    public final mjg k;
    public final mjg l;
    public final r8e m;
    public final mjg n;
    public final r8e o;
    public final mjg p;
    public final r8e q;

    public f2j(g1j g1jVar, xhh xhhVar, ny8 ny8Var) {
        this.c = g1jVar;
        this.d = xhhVar;
        this.e = ny8Var;
        this.f = g1jVar.v;
        Boolean bool = Boolean.FALSE;
        mjg mjgVarA = p90.a(bool);
        this.g = mjgVarA;
        this.h = new hde(e9i.I(new r07(g1jVar.w, mjgVarA, new e2j(3, null), 0)), 18);
        this.i = new ic6(null);
        this.j = new ic6(null);
        this.k = p90.a(null);
        mjg mjgVarA2 = p90.a(Float.valueOf(0.0f));
        this.l = mjgVarA2;
        this.m = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(Float.valueOf(1.0f));
        this.n = mjgVarA3;
        this.o = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(bool);
        this.p = mjgVarA4;
        r8e r8eVar = g1jVar.E;
        r8e r8eVar2 = g1jVar.z;
        this.q = e9i.G0(e9i.T(e9i.B(r8eVar, new jz(r8eVar2, 13), mjgVarA, mjgVarA4, new b2j(this, null)), ((n0c) xhhVar).a()), this.b, j0g.a, y1j.a);
        e9i.j0(new fz6(new hde(r8eVar2, 17), new hpf(this, null, 22), 3), this.b);
    }

    @Override // defpackage.a8j
    public final void y() {
        Bitmap bitmap = (Bitmap) this.k.getValue();
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
