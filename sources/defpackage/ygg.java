package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ygg {
    public final ny8 a;
    public final ny8 b;

    public ygg(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static fvi b(b70 b70Var) {
        a70 a70Var = new a70(1);
        a70Var.a = b70Var.c;
        a70Var.b = b70Var.a;
        a70Var.c = b70Var.b;
        a70Var.d = b70Var.d;
        a70Var.e = b70Var.e;
        return new fvi(a70Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    public final void a(long j, long j2, e70 e70Var) {
        w6g w6gVar;
        b70 b70Var;
        b70 b70Var2;
        String str = e70Var.t;
        y60 y60Var = e70Var.a;
        String str2 = e70Var.u;
        d70 d70Var = e70Var.d;
        int i = y60Var == null ? -1 : xgg.$EnumSwitchMapping$1[y60Var.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                int i3 = d70Var.b;
                int i4 = i3 != 0 ? xgg.$EnumSwitchMapping$0[qt4.D(i3)] : -1;
                if (i4 == 1) {
                    i2 = 3;
                } else {
                    if (i4 != 2) {
                        ore.o();
                        return;
                    }
                    i2 = 11;
                }
            } else if (i == 3) {
                i2 = 2;
            } else if (i != 4) {
                w6gVar = null;
            } else {
                i2 = 7;
            }
            if (i2 != 3) {
                if (i2 == 11) {
                    w6gVar = new w6g(i2, str2);
                } else {
                    w6gVar = new w6g(i2, str2);
                }
            } else if (i2 == 11) {
                w6gVar = new w6g(i2, str2);
            } else {
                w6gVar = new w6g(i2, str2);
            }
        } else if (i2 != 3 && (b70Var2 = d70Var.n) != null) {
            w6gVar = new mxi(i2, str2, b(b70Var2), d70Var.e);
        } else if (i2 == 11 || (b70Var = d70Var.n) == null) {
            w6gVar = new w6g(i2, str2);
        } else {
            w6gVar = new lzi(str2, d70Var.f, d70Var.g, d70Var.c, d70Var.t, d70Var.e, b(b70Var));
        }
        if (w6gVar != null) {
            ((qfa) this.a.getValue()).n(j2, str, new ahc(17));
            ((cq6) this.b.getValue()).c(w6gVar, j2, j, str);
        } else {
            gm0.Y("ygg", "skipped for type " + y60Var);
        }
    }
}
