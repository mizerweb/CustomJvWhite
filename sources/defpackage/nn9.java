package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class nn9 extends r0k {
    public final boolean l;
    public final tsh m;
    public final rsh n;
    public ln9 o;
    public kn9 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public nn9(ur0 ur0Var, boolean z) {
        super(ur0Var);
        this.l = z && ur0Var.l();
        this.m = new tsh();
        this.n = new rsh();
        ush ushVarJ = ur0Var.j();
        if (ushVarJ == null) {
            this.o = new ln9(new mn9(ur0Var.k()), tsh.p, ln9.h);
        } else {
            this.o = new ln9(ushVarJ, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.r0k
    public final x4a C(x4a x4aVar) {
        Object obj = x4aVar.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = ln9.h;
        }
        return x4aVar.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.r0k
    public final void D(ush ushVar) {
        long j;
        ln9 ln9Var;
        x4a x4aVarA;
        ln9 ln9Var2;
        if (this.r) {
            ln9 ln9Var3 = this.o;
            this.o = new ln9(ushVar, ln9Var3.f, ln9Var3.g);
            kn9 kn9Var = this.p;
            if (kn9Var != null) {
                H(kn9Var.g);
            }
        } else {
            if (!ushVar.p()) {
                tsh tshVar = this.m;
                ushVar.n(0, tshVar);
                long j2 = tshVar.k;
                Object obj = tshVar.a;
                kn9 kn9Var2 = this.p;
                if (kn9Var2 != null) {
                    long j3 = kn9Var2.b;
                    ln9 ln9Var4 = this.o;
                    Object obj2 = kn9Var2.a.a;
                    rsh rshVar = this.n;
                    ln9Var4.g(obj2, rshVar);
                    long j4 = rshVar.e + j3;
                    this.o.m(0, tshVar, 0L);
                    if (j4 != tshVar.k) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = ushVar.i(this.m, this.n, 0, j);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    ln9 ln9Var5 = this.o;
                    ln9Var = new ln9(ushVar, ln9Var5.f, ln9Var5.g);
                } else {
                    ln9Var = new ln9(ushVar, obj, obj3);
                }
                this.o = ln9Var;
                kn9 kn9Var3 = this.p;
                if (kn9Var3 != null && H(jLongValue)) {
                    x4a x4aVar = kn9Var3.a;
                    Object obj4 = x4aVar.a;
                    if (this.o.g != null && obj4.equals(ln9.h)) {
                        obj4 = this.o.g;
                    }
                    x4aVarA = x4aVar.a(obj4);
                }
                this.s = true;
                this.r = true;
                p(this.o);
                if (x4aVarA != null) {
                    kn9 kn9Var4 = this.p;
                    kn9Var4.getClass();
                    kn9Var4.b(x4aVarA);
                }
            }
            if (this.s) {
                ln9 ln9Var6 = this.o;
                ln9Var2 = new ln9(ushVar, ln9Var6.f, ln9Var6.g);
            } else {
                ln9Var2 = new ln9(ushVar, tsh.p, ln9.h);
            }
            this.o = ln9Var2;
        }
        x4aVarA = null;
        this.s = true;
        this.r = true;
        p(this.o);
        if (x4aVarA != null) {
            kn9 kn9Var5 = this.p;
            kn9Var5.getClass();
            kn9Var5.b(x4aVarA);
        }
    }

    @Override // defpackage.r0k
    public final void E() {
        if (this.l) {
            return;
        }
        this.q = true;
        B(null, this.k);
    }

    @Override // defpackage.ur0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final kn9 e(x4a x4aVar, qf qfVar, long j) {
        kn9 kn9Var = new kn9(x4aVar, qfVar, j);
        lvb.b0(kn9Var.d == null);
        ur0 ur0Var = this.k;
        kn9Var.d = ur0Var;
        if (!this.r) {
            this.p = kn9Var;
            if (!this.q) {
                this.q = true;
                B(null, ur0Var);
            }
            return kn9Var;
        }
        Object obj = x4aVar.a;
        if (this.o.g != null && obj.equals(ln9.h)) {
            obj = this.o.g;
        }
        kn9Var.b(x4aVar.a(obj));
        return kn9Var;
    }

    public final ln9 G() {
        return this.o;
    }

    public final boolean H(long j) {
        kn9 kn9Var = this.p;
        int iB = this.o.b(kn9Var.a.a);
        if (iB == -1) {
            return false;
        }
        ln9 ln9Var = this.o;
        rsh rshVar = this.n;
        ln9Var.f(iB, rshVar, false);
        long j2 = rshVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        kn9Var.g = j;
        return true;
    }

    @Override // defpackage.ur0
    public final boolean c(ry9 ry9Var) {
        return this.k.c(ry9Var);
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        kn9 kn9Var = (kn9) u0aVar;
        if (kn9Var.e != null) {
            ur0 ur0Var = kn9Var.d;
            ur0Var.getClass();
            ur0Var.q(kn9Var.e);
        }
        if (u0aVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void s() {
        this.r = false;
        this.q = false;
        super.s();
    }

    @Override // defpackage.r0k, defpackage.ur0
    public final void v(ry9 ry9Var) {
        if (this.s) {
            ln9 ln9Var = this.o;
            this.o = new ln9(vsh.q(ln9Var.e, ry9Var), ln9Var.f, ln9Var.g);
        } else {
            this.o = new ln9(new mn9(ry9Var), tsh.p, ln9.h);
        }
        this.k.v(ry9Var);
    }
}
