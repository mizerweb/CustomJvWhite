package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rje {
    public final ks0 a;
    public final int b;
    public final ks0 c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public rje(ks0 ks0Var, ks0 ks0Var2, int i) {
        this.a = ks0Var;
        this.b = i;
        this.c = ks0Var2;
    }

    public static void b(ks0 ks0Var) {
        int i = ks0Var.h;
        if (i == 2) {
            lvb.b0(i == 2);
            ks0Var.h = 1;
            ks0Var.t();
        }
    }

    public static boolean h(ks0 ks0Var) {
        return ks0Var.h != 0;
    }

    public static void l(ks0 ks0Var, long j) {
        ks0Var.n = true;
        if (ks0Var instanceof nnh) {
            nnh nnhVar = (nnh) ks0Var;
            lvb.b0(nnhVar.n);
            nnhVar.K = j;
        }
    }

    public final void a(ks0 ks0Var, bc5 bc5Var) {
        lvb.b0(this.a == ks0Var || this.c == ks0Var);
        if (h(ks0Var)) {
            if (ks0Var == bc5Var.c) {
                bc5Var.d = null;
                bc5Var.c = null;
                bc5Var.e = true;
            }
            b(ks0Var);
            lvb.b0(ks0Var.h == 1);
            ks0Var.c.k();
            ks0Var.h = 0;
            ks0Var.i = null;
            ks0Var.j = null;
            ks0Var.n = false;
            ks0Var.m();
            ks0Var.q = null;
        }
    }

    public final int c() {
        boolean zH = h(this.a);
        ks0 ks0Var = this.c;
        return (zH ? 1 : 0) + ((ks0Var == null || !h(ks0Var)) ? 0 : 1);
    }

    public final ks0 d(v0a v0aVar) {
        xye xyeVar;
        if (v0aVar != null && (xyeVar = v0aVar.c[this.b]) != null) {
            ks0 ks0Var = this.a;
            if (ks0Var.i == xyeVar) {
                return ks0Var;
            }
            ks0 ks0Var2 = this.c;
            if (ks0Var2 != null && ks0Var2.i == xyeVar) {
                return ks0Var2;
            }
        }
        return null;
    }

    public final boolean e(v0a v0aVar, ks0 ks0Var) {
        if (ks0Var == null) {
            return true;
        }
        xye[] xyeVarArr = v0aVar.c;
        int i = this.b;
        xye xyeVar = xyeVarArr[i];
        xye xyeVar2 = ks0Var.i;
        if (xyeVar2 == null) {
            return true;
        }
        if (xyeVar2 == xyeVar) {
            if (xyeVar == null || ks0Var.i()) {
                return true;
            }
            v0a v0aVarH = v0aVar.h();
            if (v0aVar.g.g && v0aVarH != null && v0aVarH.e && ((ks0Var instanceof nnh) || (ks0Var instanceof xwa) || ks0Var.m >= v0aVarH.k())) {
                return true;
            }
        }
        v0a v0aVarH2 = v0aVar.h();
        return v0aVarH2 != null && v0aVarH2.c[i] == ks0Var.i;
    }

    public final boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h(this.a);
        }
        ks0 ks0Var = this.c;
        ks0Var.getClass();
        return ks0Var.h != 0;
    }

    public final void i(boolean z) {
        if (z) {
            if (this.e) {
                ks0 ks0Var = this.a;
                lvb.b0(ks0Var.h == 0);
                ks0Var.c.k();
                ks0Var.r();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            ks0 ks0Var2 = this.c;
            ks0Var2.getClass();
            lvb.b0(ks0Var2.h == 0);
            ks0Var2.c.k();
            ks0Var2.r();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(ks0 ks0Var, v0a v0aVar, vyh vyhVar, bc5 bc5Var) {
        ks0 ks0Var2;
        int i;
        if (ks0Var == null || ks0Var.h == 0 || (ks0Var == (ks0Var2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (ks0Var == this.c && this.d == 3) {
            return 1;
        }
        xye xyeVar = ks0Var.i;
        xye[] xyeVarArr = v0aVar.c;
        int i2 = this.b;
        byte b = xyeVar != xyeVarArr[i2];
        boolean zC = vyhVar.C(i2);
        if (!zC || b != false) {
            if (!ks0Var.n) {
                rg6 rg6Var = ((rg6[]) vyhVar.d)[i2];
                int length = rg6Var != null ? rg6Var.length() : 0;
                b87[] b87VarArr = new b87[length];
                for (int i3 = 0; i3 < length; i3++) {
                    rg6Var.getClass();
                    b87VarArr[i3] = rg6Var.d(i3);
                }
                xye xyeVar2 = v0aVar.c[i2];
                xyeVar2.getClass();
                ks0Var.z(b87VarArr, xyeVar2, v0aVar.k(), v0aVar.j(), v0aVar.g.a);
                return 3;
            }
            if (!ks0Var.j()) {
                return 0;
            }
            a(ks0Var, bc5Var);
            if (!zC || f()) {
                i(ks0Var == ks0Var2);
                return 1;
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.a)) {
            i(true);
        }
        ks0 ks0Var = this.c;
        if (ks0Var == null || ks0Var.h != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i;
        ks0 ks0Var = this.a;
        int i2 = ks0Var.h;
        if (i2 == 1 && this.d != 4) {
            lvb.b0(i2 == 1);
            ks0Var.h = 2;
            ks0Var.s();
            return;
        }
        ks0 ks0Var2 = this.c;
        if (ks0Var2 == null || (i = ks0Var2.h) != 1 || this.d == 3) {
            return;
        }
        lvb.b0(i == 1);
        ks0Var2.h = 2;
        ks0Var2.s();
    }
}
