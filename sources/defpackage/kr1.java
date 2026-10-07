package defpackage;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kr1 extends lr1 {
    public final List b;
    public final ll9 c;
    public final qgc d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr1(meg megVar) {
        super(x7j.a);
        List list = megVar != null ? megVar.a : null;
        list = list == null ? r66.a : list;
        ll9 ll9Var = megVar != null ? megVar.b : null;
        qgc qgcVar = megVar != null ? megVar.c : null;
        boolean z = megVar != null ? megVar.d : false;
        this.b = list;
        this.c = ll9Var;
        this.d = qgcVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr1)) {
            return false;
        }
        kr1 kr1Var = (kr1) obj;
        return this.b.equals(kr1Var.b) && cqk.d(this.c, kr1Var.c) && cqk.d(this.d, kr1Var.d) && this.e == kr1Var.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 111L;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        ll9 ll9Var = this.c;
        int iHashCode2 = (iHashCode + (ll9Var == null ? 0 : ll9Var.hashCode())) * 31;
        qgc qgcVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (qgcVar != null ? qgcVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 111;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        kr1 kr1Var = k79Var instanceof kr1 ? (kr1) k79Var : null;
        if (kr1Var == null) {
            return null;
        }
        jr1 jr1Var = new jr1(3);
        BitSet bitSet = (BitSet) jr1Var.b;
        bitSet.set(0, !this.b.equals(kr1Var.b));
        bitSet.set(1, (cqk.d(this.c, kr1Var.c) && cqk.d(this.d, kr1Var.d)) ? false : true);
        bitSet.set(2, this.e != kr1Var.e);
        return jr1Var;
    }

    public final String toString() {
        return "Speaker(opponentsPages=" + this.b + ", mainOpponentState=" + this.c + ", opponentPipState=" + this.d + ", isP2GCallAnimationDepended=" + this.e + ")";
    }
}
