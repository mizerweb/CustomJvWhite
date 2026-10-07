package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r71 {
    public final s71 a;
    public final long b;

    public r71(s71 s71Var, long j) {
        this.a = s71Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r71)) {
            return false;
        }
        r71 r71Var = (r71) obj;
        return this.a == r71Var.a && this.b == r71Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheItem(type=" + this.a + ", sizeBytes=" + this.b + ")";
    }
}
