package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v05 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public v05(r05 r05Var, t05 t05Var, eli eliVar) {
        this.a = eliVar;
        this.b = dp5.a(new u05(r05Var, t05Var, this, 1));
        this.c = dp5.a(new u05(r05Var, t05Var, this, 2));
        this.d = dp5.a(new u05(r05Var, t05Var, this, 7));
        this.e = dp5.a(new u05(r05Var, t05Var, this, 8));
        this.f = dp5.a(new u05(r05Var, t05Var, this, 6));
        this.g = dp5.a(new u05(r05Var, t05Var, this, 9));
        this.h = dp5.a(new u05(r05Var, t05Var, this, 5));
        this.i = dp5.a(new u05(r05Var, t05Var, this, 11));
        this.j = dp5.a(new u05(r05Var, t05Var, this, 10));
        this.k = dp5.a(new u05(r05Var, t05Var, this, 4));
        this.l = dp5.a(new u05(r05Var, t05Var, this, 3));
        this.m = dp5.a(new u05(r05Var, t05Var, this, 0));
    }

    public r8e a() {
        return (r8e) this.m;
    }

    public void b() {
        bci bciVar = (bci) ((r8e) this.m).a.getValue();
        if (bciVar != null) {
            yab.i0((gu4) this.b, ((n0c) ((xhh) this.d)).b(), 0, new cci(this, bciVar.a, null, 1), 2);
            ((mjg) this.l).setValue(null);
        }
    }

    public void c() {
        bci bciVar = (bci) ((r8e) this.m).a.getValue();
        if (bciVar != null) {
            ((no4) this.c).c(bciVar.a, ((s7f) ((et3) ((ny8) this.i).getValue())).f());
        }
    }

    public void d() {
        bci bciVar = (bci) ((r8e) this.m).a.getValue();
        if (bciVar != null) {
            ((no4) this.c).c(bciVar.a, 0L);
        }
    }

    public v05(gjg gjgVar, dq4 dq4Var, no4 no4Var, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        vg4 vg4VarW;
        this.a = gjgVar;
        this.b = dq4Var;
        this.c = no4Var;
        this.d = xhhVar;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var;
        this.j = ny8Var6;
        this.k = ny8Var7;
        mjg mjgVarA = p90.a(null);
        this.l = mjgVarA;
        this.m = new r8e(mjgVarA);
        rt2 rt2Var = (rt2) gjgVar.getValue();
        Long lValueOf = (rt2Var == null || !rt2Var.h0() || (!rt2Var.W() && !rt2Var.o0()) || (vg4VarW = rt2Var.w()) == null || vg4VarW.E()) ? null : Long.valueOf(vg4VarW.v());
        if (lValueOf != null) {
            e9i.j0(e9i.T(new fz6(new r07(new jz(no4Var.j(lValueOf.longValue()), 13), gjgVar, aci.h, 0), new j8g(this, (lq4) null, 20), 3), ((n0c) xhhVar).b()), dq4Var);
        }
    }
}
