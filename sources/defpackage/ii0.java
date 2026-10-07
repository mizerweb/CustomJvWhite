package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ii0 {
    public final long a;
    public final ij0 b;
    public final kh0 c;

    public ii0(long j, ij0 ij0Var, kh0 kh0Var) {
        this.a = j;
        this.b = ij0Var;
        this.c = kh0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ii0)) {
            return false;
        }
        ii0 ii0Var = (ii0) obj;
        return this.a == ii0Var.a && this.b.equals(ii0Var.b) && this.c.equals(ii0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
