package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class bxj extends axj {
    public mi8 o;
    public mi8 p;
    public mi8 q;

    public bxj(ixj ixjVar, WindowInsets windowInsets) {
        super(ixjVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.exj
    public mi8 g() {
        if (this.p == null) {
            this.p = mi8.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.exj
    public mi8 i() {
        if (this.o == null) {
            this.o = mi8.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.exj
    public mi8 k() {
        if (this.q == null) {
            this.q = mi8.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.ywj, defpackage.exj
    public ixj l(int i, int i2, int i3, int i4) {
        return ixj.g(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.zwj, defpackage.exj
    public void r(mi8 mi8Var) {
    }
}
