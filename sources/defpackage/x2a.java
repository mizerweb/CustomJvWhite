package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x2a implements c3a, n3a {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x2a(o3a o3aVar, ry9 ry9Var, boolean z, boolean z2) {
        this.c = o3aVar;
        this.d = ry9Var;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.c3a
    public void a(h2a h2aVar, int i) {
        h2aVar.f(i, (umf) this.c, this.a, this.b, ((i2a) this.d).c);
    }

    @Override // defpackage.n3a
    public void b(i2a i2aVar) {
        o3a o3aVar = (o3a) this.c;
        mof mofVarR = o3aVar.g.r(i2aVar, c98.r((ry9) this.d), -1, -9223372036854775807L);
        mofVarR.b(new ng7(mofVarR, 0, new lh6(o3aVar, i2aVar, this.a, this.b)), im5.a);
    }

    public /* synthetic */ x2a(umf umfVar, boolean z, boolean z2, i2a i2aVar) {
        this.c = umfVar;
        this.a = z;
        this.b = z2;
        this.d = i2aVar;
    }
}
