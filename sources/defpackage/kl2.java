package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kl2 {
    public final int a;
    public final int b;

    public kl2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2)) {
            return false;
        }
        kl2 kl2Var = (kl2) obj;
        return this.a == kl2Var.a && this.b == kl2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.a);
        sb.append(", encodeRate=");
        return qt4.p(sb, this.b, ')');
    }
}
