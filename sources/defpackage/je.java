package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je extends a8j {
    public static final /* synthetic */ zv8[] j;
    public final long c;
    public final be d;
    public final ny8 e;
    public final p3c f = qyj.S();
    public final pzf g;
    public final mjg h;
    public final ie i;

    static {
        z8b z8bVar = new z8b(je.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public je(long j2, be beVar, ny8 ny8Var, ny8 ny8Var2) {
        this.c = j2;
        this.d = beVar;
        this.e = ny8Var;
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.g = pzfVarB;
        mjg mjgVarA = p90.a(null);
        this.h = mjgVarA;
        this.i = new ie(new r07(beVar.k, pzfVarB, new d3(this, null, 1), 0), this, 0);
        if (beVar.h.compareAndSet(false, true)) {
            yab.i0(beVar.g, null, 0, new i26(beVar, (lq4) null, 3), 3);
        }
        e9i.j0(new fz6(beVar.m, new i26(this, (lq4) null, 4), 3), this.b);
        e9i.j0(new fz6(e9i.I(e9i.F(mjgVarA, 200L)), new dn0(this, ny8Var2, (lq4) null, 3), 3), this.b);
    }

    public final boolean B() {
        CharSequence charSequence = (CharSequence) this.h.getValue();
        return !(charSequence == null || charSequence.length() == 0);
    }
}
