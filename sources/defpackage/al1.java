package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class al1 extends s7g {
    public final xva u;
    public final ny8 v;

    public al1(ph4 ph4Var, xva xvaVar) {
        super(ph4Var);
        this.u = xvaVar;
        this.v = rx8.P(3, new yk1(0, this));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        H((yw7) k79Var, false);
    }

    public final void H(yw7 yw7Var, boolean z) {
        long j = yw7Var.b;
        ph4 ph4Var = (ph4) this.a;
        ph4Var.setId(Long.hashCode(yw7Var.n));
        ph4Var.setTitle(yw7Var.f);
        if (yw7Var.k instanceof nw7) {
            ph4Var.B(j, null, null);
            ph4Var.setAvatarOverlay(new yvb((qk0) this.v.getValue()));
        } else {
            ph4Var.setAvatarOverlay(null);
            CharSequence charSequence = yw7Var.c;
            String str = yw7Var.d;
            if (str == null) {
                str = "";
            }
            ph4Var.B(j, charSequence, str);
        }
        ph4Var.setDescription(yw7Var.i);
        ph4Var.setTime(yw7Var.g);
        ph4Var.z(yw7Var.h);
        ph4Var.D = yw7Var.a;
        ph4Var.B = this.u;
        I(yw7Var, z);
    }

    public final void I(yw7 yw7Var, boolean z) {
        ph4 ph4Var = (ph4) this.a;
        int i = yw7Var.j;
        boolean z2 = false;
        ph4Var.x(i == 1 && !z);
        if (i == 2 && !z) {
            z2 = true;
        }
        ph4Var.y(z2);
    }
}
