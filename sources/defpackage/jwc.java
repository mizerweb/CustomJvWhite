package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jwc implements mwc {
    public final double a;
    public final double b;
    public final Float c;
    public final boolean d;

    public jwc(double d, double d2, Float f, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwc)) {
            return false;
        }
        jwc jwcVar = (jwc) obj;
        return Double.compare(this.a, jwcVar.a) == 0 && Double.compare(this.b, jwcVar.b) == 0 && cqk.d(this.c, jwcVar.c) && this.d == jwcVar.d;
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31;
        Float f = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveCamera(lat=");
        sb.append(this.a);
        sb.append(", lon=");
        sb.append(this.b);
        sb.append(", zoom=");
        sb.append(this.c);
        return nbh.z(sb, ", animate=", this.d, ")");
    }
}
