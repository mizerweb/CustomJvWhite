package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sd0 extends kih {
    public final mw c;
    public final ujd d;

    public sd0(mw mwVar, ujd ujdVar) {
        this.c = mwVar;
        this.d = ujdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd0)) {
            return false;
        }
        sd0 sd0Var = (sd0) obj;
        return this.c.equals(sd0Var.c) && cqk.d(this.d, sd0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        ujd ujdVar = this.d;
        return iHashCode + (ujdVar == null ? 0 : ujdVar.hashCode());
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(profile=" + this.d + ", tokenTypes='" + ch3.z(this.c) + "')";
    }
}
