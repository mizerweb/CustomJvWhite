package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iug extends a8j {
    public static final /* synthetic */ zv8[] r;
    public static final long s;
    public final gjg c;
    public final gjg d;
    public final xhh e;
    public final String f = iug.class.getName();
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ftg l;
    public final pzf m;
    public final p3c n;
    public final ic6 o;
    public final ic6 p;
    public ytg q;

    static {
        z8b z8bVar = new z8b(iug.class, "writeMessageJob", "getWriteMessageJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        r = new zv8[]{z8bVar};
        ghb ghbVar = ew5.b;
        s = qe7.O(5, lw5.SECONDS);
    }

    public iug(boolean z, gjg gjgVar, gjg gjgVar2, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, cg9 cg9Var, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.c = gjgVar;
        this.d = gjgVar2;
        this.e = xhhVar;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var6;
        this.k = ny8Var9;
        ftg ftgVar = new ftg(z, B().j, tre.G0(((n0h) ny8Var7.getValue()).c, ftg.j), gjgVar2, ((s7f) ((et3) ny8Var.getValue())).t(), gm0.K(62.0f * yl5.d().getDisplayMetrics().density), xhhVar, this.b);
        this.l = ftgVar;
        this.m = e9i.b(0, 1, 5);
        this.n = qyj.S();
        this.o = new ic6(null);
        this.p = new ic6(null);
        n0c n0cVar = (n0c) xhhVar;
        tre.m0(e9i.T(new fz6(new wz(new q8e(((ij4) ny8Var5.getValue()).c), 3), new wyj(this, null, 15), 3), n0cVar.a()), this.b);
        ur2 ur2VarM0 = e9i.M0(e9i.I(new cug(gjgVar, 1)), new vm1((lq4) null, this, 12));
        q8e q8eVarStream = cg9Var.stream();
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.SECONDS;
        tre.m0(e9i.T(new fz6(oc9.e0(new dab(e9i.m0(tre.G0(q8eVarStream, qe7.O(15, lw5Var)), e9i.M0(e9i.I(new cug(gjgVar, 0)), new l42(3, null, 8)), ur2VarM0), this, 14), qe7.O(1, lw5Var)), new t7f(this, null, 2), 3), n0cVar.a()), this.b);
        tre.m0(new fz6(new tz(13, e9i.H(tre.G0(new jz(ftgVar.d, 24), s), new dz(14))), new y73(ny8Var8, (lq4) null, 18), 3), this.b);
    }

    public final vzg B() {
        return (vzg) this.j.getValue();
    }

    public final void C(long j, t3f t3fVar, gvg gvgVar) {
        ytg wtgVar;
        int iOrdinal = gvgVar.ordinal();
        if (iOrdinal == 0) {
            wtgVar = xtg.a;
        } else if (iOrdinal == 1) {
            wtgVar = new wtg(j);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            wtgVar = null;
        }
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Previous navigation type = " + this.q + ", new navigation type = " + wtgVar, null);
            }
        }
        this.q = wtgVar;
        a8j.x(this.o, new yug(j, t3fVar, gvgVar));
    }
}
