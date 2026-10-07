package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nwc extends rbb {
    public final double b;
    public final double c;

    public nwc(double d, double d2) {
        super(sbi.a);
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwc)) {
            return false;
        }
        nwc nwcVar = (nwc) obj;
        return Double.compare(this.b, nwcVar.b) == 0 && Double.compare(this.c, nwcVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "SendLocation(lat=" + this.b + ", lon=" + this.c + ")";
    }
}
