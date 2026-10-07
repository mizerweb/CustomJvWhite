package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ci7 implements fi7 {
    public final int a;
    public final int b;

    public ci7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci7)) {
            return false;
        }
        ci7 ci7Var = (ci7) obj;
        return this.a == ci7Var.a && this.b == ci7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("UpdateCameraLayoutParams(width=", this.a, ", height=", this.b, ")");
    }
}
