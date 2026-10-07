package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ns2 {
    public final long a;
    public final qpa b;
    public final jsa c;
    public final m8b d;
    public final m8b e;
    public final l8b f;
    public final String g;
    public up8 h;
    public final msa i;
    public final mjg j;

    public ns2(long j, qpa qpaVar, jsa jsaVar, msa msaVar, mjg mjgVar) {
        this.a = j;
        this.b = qpaVar;
        this.c = jsaVar;
        m8b m8bVar = ui9.a;
        this.d = new m8b();
        this.e = new m8b();
        l8b l8bVar = ki9.a;
        this.f = new l8b();
        this.g = ns2.class.getName();
        wo8 wo8VarA = vd7.a();
        wo8VarA.j0();
        this.h = wo8VarA;
        this.i = msaVar;
        this.j = mjgVar;
        a();
    }

    public final void a() {
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "start counting posts view", null);
            }
        }
        xx6 ra1Var = new ra1(4, new ls2(this.j, this, 0));
        if (ew5.d(this.a, 0L) > 0) {
            ra1Var = e9i.G(ra1Var, this.a);
        }
        sgg sggVarJ0 = e9i.j0(new fz6(e9i.G(new ls2(ra1Var, this, 1), qe7.O(1, lw5.SECONDS)), new jhc(this, null, 17), 3), (gu4) this.i.invoke());
        sggVarJ0.Y(new j22(7, this));
        this.h = sggVarJ0;
    }
}
