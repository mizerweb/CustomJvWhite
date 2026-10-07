package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bq9 {
    public final double a;
    public final double b;

    public bq9(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq9)) {
            return false;
        }
        bq9 bq9Var = (bq9) obj;
        return Double.compare(this.a, bq9Var.a) == 0 && Double.compare(this.b, bq9Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NetworkState(roundTripTimeMs=" + this.a + ", lostPacketsFraction=" + this.b + ")";
    }
}
