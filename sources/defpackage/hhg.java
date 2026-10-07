package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hhg {
    public final ghg a;
    public final boolean b;
    public final boolean c;
    public final af7 d;
    public final c32 e;

    public hhg(ghg ghgVar, boolean z, boolean z2, cz1 cz1Var, c32 c32Var) {
        this.a = ghgVar;
        this.b = z;
        this.c = z2;
        this.d = cz1Var;
        this.e = c32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhg)) {
            return false;
        }
        hhg hhgVar = (hhg) obj;
        return this.a.equals(hhgVar.a) && this.b == hhgVar.b && this.c == hhgVar.c && cqk.d(this.d, hhgVar.d) && this.e == hhgVar.e;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        af7 af7Var = this.d;
        int iHashCode = (iN + (af7Var == null ? 0 : af7Var.hashCode())) * 31;
        c32 c32Var = this.e;
        return iHashCode + (c32Var != null ? c32Var.hashCode() : 0);
    }

    public final String toString() {
        return "StartCallParams(type=" + this.a + ", isVideo=" + this.b + ", isAudio=" + this.c + ", callbackPrepare=" + this.d + ", callStartSource=" + this.e + ")";
    }
}
