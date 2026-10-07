package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vke {
    public final double a;
    public final int b;
    public final int c;

    public vke(int i, int i2, double d) {
        this.a = d;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vke)) {
            return false;
        }
        vke vkeVar = (vke) obj;
        return Double.compare(this.a, vkeVar.a) == 0 && this.b == vkeVar.b && this.c == vkeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + spc.a(this.b, Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStatusConfig(networkStatusReportThreshold=");
        sb.append(this.a);
        sb.append(", networkStatusReportIntervalMs=");
        sb.append(this.b);
        return qv1.o(sb, ", networkStatusReportForceIntervalMs=", this.c, ")");
    }
}
