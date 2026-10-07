package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bo0 {
    public final boolean a;
    public final boolean b;

    public bo0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo0)) {
            return false;
        }
        bo0 bo0Var = (bo0) obj;
        return this.a == bo0Var.a && this.b == bo0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("SignalingConfig(dcReportNetworkStatEnabled=", this.a, ", producerCommandV3=", this.b, ")");
    }
}
