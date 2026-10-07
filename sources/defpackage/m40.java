package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m40 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public m40(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    public final void a(sfa sfaVar) {
        e70 e70VarH;
        boolean z;
        boolean zA;
        c46 c46Var = sfaVar.n;
        int i = c46Var != null ? c46Var.i() : 0;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (c46Var != null && (e70VarH = c46Var.h(i2)) != null) {
                w60 w60Var = e70VarH.f;
                String str = e70VarH.t;
                o60 o60Var = e70VarH.b;
                boolean zE = e70VarH.e();
                ny8 ny8Var = this.a;
                if (zE) {
                    boolean z3 = o60Var.e;
                    String str2 = o60Var.j;
                    if (!z3) {
                        z = true;
                        if (w60Var != null && ((x13) ny8Var.getValue()).a.c.d.getInt("app.media.load.stickers", 0) != -1) {
                            ny8 ny8Var2 = this.c;
                            ((h4c) ((c2a) ny8Var2.getValue())).e(w60Var.f, false);
                            ((h4c) ((c2a) ny8Var2.getValue())).e(w60Var.b, false);
                        }
                    } else if (!((x13) ny8Var.getValue()).a(false)) {
                        z = true;
                    } else if (str2 == null || str2.length() == 0) {
                        z = true;
                    } else {
                        ((wp6) this.e.getValue()).b(new pjh(sfaVar.a, str, 0L, 0L, o60Var.i, 0L, str2, true, true, 0L, "", 0, false, false, ns5.AUTOLOAD, null));
                        zA = ((x13) ny8Var.getValue()).a(true);
                        z = true;
                    }
                    zA = false;
                } else {
                    z = true;
                    if (w60Var != null) {
                        ny8 ny8Var3 = this.c;
                        ((h4c) ((c2a) ny8Var3.getValue())).e(w60Var.f, false);
                        ((h4c) ((c2a) ny8Var3.getValue())).e(w60Var.b, false);
                    }
                    zA = false;
                }
                if (zA) {
                    ((qfa) this.b.getValue()).n(sfaVar.a, str, new p51(8));
                    z2 = z;
                }
            }
        }
        if (z2) {
            ((t51) this.d.getValue()).c(new kfi(sfaVar.h, sfaVar.a, false));
        }
    }
}
