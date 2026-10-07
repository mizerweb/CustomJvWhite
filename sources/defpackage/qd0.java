package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qd0 extends kih {
    public final mw c;
    public final ujd d;

    public qd0(mw mwVar, ujd ujdVar) {
        this.c = mwVar;
        this.d = ujdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return this.c.equals(qd0Var.c) && cqk.d(this.d, qd0Var.d);
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
