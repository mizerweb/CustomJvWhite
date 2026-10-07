package defpackage;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gr1 extends lr1 {
    public final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr1(oq7 oq7Var) {
        super(x7j.c);
        List list = oq7Var != null ? oq7Var.a : null;
        list = list == null ? r66.a : list;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr1) && this.b.equals(((gr1) obj).b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 222L;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 222;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        gr1 gr1Var = k79Var instanceof gr1 ? (gr1) k79Var : null;
        if (gr1Var == null) {
            return null;
        }
        fr1 fr1Var = new fr1(3);
        ((BitSet) fr1Var.b).set(0, !this.b.equals(gr1Var.b));
        return fr1Var;
    }

    public final String toString() {
        return v0h.d("Grid(opponentsPages=", ")", this.b);
    }
}
