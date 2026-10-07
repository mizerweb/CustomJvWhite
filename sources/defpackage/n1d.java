package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n1d {
    public final int a;
    public final int b;

    public n1d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1d)) {
            return false;
        }
        n1d n1dVar = (n1d) obj;
        return this.a == n1dVar.a && this.b == n1dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(16) + zo5.c(12, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return nbh.u("PipConfig(height=", this.a, ", wight=", this.b, ", verticalPadding=12, horizontalPadding=16)");
    }
}
