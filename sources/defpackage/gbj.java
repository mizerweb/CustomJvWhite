package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gbj {
    public final ny8 a;
    public final ny8 b;
    public boolean c;
    public final ifh d;

    public gbj(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.d = new ifh(new eke(ny8Var, 6));
    }

    public final boolean a() {
        int iIntValue = ((Number) ((g5d) ((gjf) this.b.getValue())).a.l5.a(e5d.S6[325]).i()).intValue();
        ny8 ny8Var = this.a;
        if (iIntValue == 1) {
            return ((wd4) ny8Var.getValue()).c();
        }
        if (iIntValue != 2) {
            return iIntValue == 3 && ((wd4) ny8Var.getValue()).c() && this.c;
        }
        return this.c;
    }

    public final boolean b(gjg gjgVar) {
        boolean zC;
        rt2 rt2Var = (rt2) gjgVar.getValue();
        if (rt2Var != null) {
            int iIntValue = ((Number) ((g5d) ((gjf) this.b.getValue())).a.k5.a(e5d.S6[324]).i()).intValue();
            ny8 ny8Var = this.a;
            if (iIntValue == 1) {
                zC = ((wd4) ny8Var.getValue()).c();
            } else if (iIntValue != 2) {
                zC = iIntValue == 3 && ((wd4) ny8Var.getValue()).c() && this.c;
            } else {
                zC = this.c;
            }
            if (zC && (rt2Var.e0() || (rt2Var.h0() && !rt2Var.b0()))) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean z) {
        this.c = z;
    }
}
