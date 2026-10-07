package defpackage;

import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ir1 extends lr1 {
    public final vnh b;
    public final vy1 c;

    public ir1(vnh vnhVar, vy1 vy1Var) {
        super(x7j.b);
        this.b = vnhVar;
        this.c = vy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1)) {
            return false;
        }
        ir1 ir1Var = (ir1) obj;
        return this.b.equals(ir1Var.b) && cqk.d(this.c, ir1Var.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 225L;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 225;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        ir1 ir1Var = k79Var instanceof ir1 ? (ir1) k79Var : null;
        if (ir1Var == null) {
            return null;
        }
        hr1 hr1Var = new hr1(3);
        BitSet bitSet = (BitSet) hr1Var.b;
        bitSet.set(0, !cqk.d(this.c, ir1Var.c));
        bitSet.set(1, !this.b.equals(ir1Var.b));
        return hr1Var;
    }

    public final String toString() {
        return "Sharing(title=" + this.b + ", sharingState=" + this.c + ")";
    }
}
