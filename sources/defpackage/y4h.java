package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y4h extends tre implements ot8 {
    public final s74 p;
    public final qs8 q;
    public final w0k r;
    public final ot8[] s;
    public final khb t;
    public final at8 u;
    public boolean v;
    public String w;
    public String x;

    public y4h(s74 s74Var, qs8 qs8Var, w0k w0kVar, ot8[] ot8VarArr) {
        this.p = s74Var;
        this.q = qs8Var;
        this.r = w0kVar;
        this.s = ot8VarArr;
        this.t = qs8Var.b;
        this.u = qs8Var.a;
        int iOrdinal = w0kVar.ordinal();
        if (ot8VarArr != null) {
            ot8 ot8Var = ot8VarArr[iOrdinal];
            if (ot8Var == null && ot8Var == this) {
                return;
            }
            ot8VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void A(int i) {
        if (this.v) {
            C(String.valueOf(i));
        } else {
            this.p.h(i);
        }
    }

    @Override // defpackage.tre, defpackage.x74
    public final boolean B() {
        return this.u.a;
    }

    @Override // defpackage.tre, defpackage.u76
    public final void C(String str) {
        this.p.l(str);
    }

    @Override // defpackage.tre
    public final void S(fif fifVar, int i) {
        int iOrdinal = this.r.ordinal();
        s74 s74Var = this.p;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!s74Var.a) {
                s74Var.g(',');
            }
            s74Var.e();
            return;
        }
        if (iOrdinal == 2) {
            if (s74Var.a) {
                this.v = true;
                s74Var.e();
                return;
            }
            if (i % 2 == 0) {
                s74Var.g(',');
                s74Var.e();
            } else {
                s74Var.g(':');
                s74Var.n();
                z = false;
            }
            this.v = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!s74Var.a) {
                s74Var.g(',');
            }
            s74Var.e();
            oc9.U(this.q, fifVar);
            C(fifVar.f(i));
            s74Var.g(':');
            s74Var.n();
            return;
        }
        if (i == 0) {
            this.v = true;
        }
        if (i == 1) {
            s74Var.g(',');
            s74Var.n();
            this.v = false;
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final x74 a(fif fifVar) {
        ot8 ot8Var;
        qs8 qs8Var = this.q;
        w0k w0kVarE0 = lvb.E0(qs8Var, fifVar);
        char c = w0kVarE0.a;
        s74 s74Var = this.p;
        s74Var.g(c);
        s74Var.a = true;
        String str = this.w;
        if (str != null) {
            String strI = this.x;
            if (strI == null) {
                strI = fifVar.i();
            }
            s74Var.e();
            C(str);
            s74Var.g(':');
            C(strI);
            this.w = null;
            this.x = null;
        }
        if (this.r == w0kVarE0) {
            return this;
        }
        ot8[] ot8VarArr = this.s;
        return (ot8VarArr == null || (ot8Var = ot8VarArr[w0kVarE0.ordinal()]) == null) ? new y4h(s74Var, qs8Var, w0kVarE0, ot8VarArr) : ot8Var;
    }

    @Override // defpackage.u76
    public final khb b() {
        return this.t;
    }

    @Override // defpackage.tre, defpackage.x74
    public final void c() {
        s74 s74Var = this.p;
        s74Var.getClass();
        s74Var.a = false;
        s74Var.g(this.r.b);
    }

    @Override // defpackage.tre, defpackage.u76
    public final void d(double d) {
        boolean z = this.v;
        s74 s74Var = this.p;
        if (z) {
            C(String.valueOf(d));
        } else {
            ((qf4) s74Var.b).s(String.valueOf(d));
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw xd2.b(Double.valueOf(d), ((qf4) s74Var.b).toString());
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void f(byte b) {
        if (this.v) {
            C(String.valueOf((int) b));
        } else {
            this.p.f(b);
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final u76 g(fif fifVar) {
        boolean zB = z4h.b(fifVar);
        w0k w0kVar = this.r;
        qs8 qs8Var = this.q;
        s74 t74Var = this.p;
        if (zB) {
            if (!(t74Var instanceof u74)) {
                t74Var = new u74((qf4) t74Var.b, this.v);
            }
            return new y4h(t74Var, qs8Var, w0kVar, null);
        }
        if (z4h.a(fifVar)) {
            if (!(t74Var instanceof t74)) {
                t74Var = new t74((qf4) t74Var.b, this.v);
            }
            return new y4h(t74Var, qs8Var, w0kVar, null);
        }
        if (this.w != null) {
            this.x = fifVar.i();
        }
        return this;
    }

    @Override // defpackage.tre, defpackage.u76
    public final void l(fif fifVar, int i) {
        C(fifVar.f(i));
    }

    @Override // defpackage.tre, defpackage.x74
    public final void o(fif fifVar, int i, aw8 aw8Var, Object obj) {
        if (obj != null || this.u.d) {
            super.o(fifVar, i, aw8Var, obj);
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void p(long j) {
        if (this.v) {
            C(String.valueOf(j));
        } else {
            this.p.i(j);
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void s() {
        this.p.j("null");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    @Override // defpackage.tre, defpackage.u76
    public final void t(aw8 aw8Var, Object obj) {
        String strA;
        qs8 qs8Var = this.q;
        boolean z = aw8Var instanceof f3;
        int i = qs8Var.a.i;
        if (!z) {
            int iD = qt4.D(i);
            if (iD != 0) {
                if (iD == 1) {
                    lvb lvbVarD = aw8Var.d().d();
                    if (cqk.d(lvbVarD, c6h.f) || cqk.d(lvbVarD, d6h.f)) {
                        strA = tjl.a(qs8Var, aw8Var.d());
                    }
                } else if (iD != 2) {
                    ore.o();
                    return;
                }
            }
            strA = null;
        } else if (i != 1) {
            strA = tjl.a(qs8Var, aw8Var.d());
        } else {
            strA = null;
        }
        if (z) {
            f3 f3Var = (f3) aw8Var;
            if (obj == null) {
                ore.d(((uad) f3Var).d(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            } else {
                wjl.b(f3Var, this, obj);
                throw null;
            }
        }
        if (strA != null) {
            String strI = aw8Var.d().i();
            this.w = strA;
            this.x = strI;
        }
        aw8Var.a(this, obj);
    }

    @Override // defpackage.tre, defpackage.u76
    public final void u(short s) {
        if (this.v) {
            C(String.valueOf((int) s));
        } else {
            this.p.k(s);
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void v(boolean z) {
        if (this.v) {
            C(String.valueOf(z));
        } else {
            ((qf4) this.p.b).s(String.valueOf(z));
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void w(float f) {
        boolean z = this.v;
        s74 s74Var = this.p;
        if (z) {
            C(String.valueOf(f));
        } else {
            ((qf4) s74Var.b).s(String.valueOf(f));
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw xd2.b(Float.valueOf(f), ((qf4) s74Var.b).toString());
        }
    }

    @Override // defpackage.tre, defpackage.u76
    public final void x(char c) {
        C(String.valueOf(c));
    }
}
