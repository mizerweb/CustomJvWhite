package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zi8 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof zi8) {
            return this.a == ((zi8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return "(" + ((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) j) + ")";
    }
}
