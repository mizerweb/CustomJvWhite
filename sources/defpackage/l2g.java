package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l2g implements n2g {
    public final double a;
    public final double b;
    public final Float c;

    public l2g(double d, double d2, Float f) {
        this.a = d;
        this.b = d2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2g)) {
            return false;
        }
        l2g l2gVar = (l2g) obj;
        return Double.compare(this.a, l2gVar.a) == 0 && Double.compare(this.b, l2gVar.b) == 0 && cqk.d(this.c, l2gVar.c);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31;
        Float f = this.c;
        return Boolean.hashCode(true) + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "MoveCamera(lat=" + this.a + ", lon=" + this.b + ", zoom=" + this.c + ", animate=true)";
    }
}
