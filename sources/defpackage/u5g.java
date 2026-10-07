package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u5g {
    public final boolean a;
    public final Long b;
    public final boolean c;
    public final long d;

    public u5g(boolean z, Long l, boolean z2, long j) {
        this.a = z;
        this.b = l;
        this.c = z2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5g)) {
            return false;
        }
        u5g u5gVar = (u5g) obj;
        return this.a == u5gVar.a && cqk.d(this.b, u5gVar.b) && this.c == u5gVar.c && this.d == u5gVar.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        return Long.hashCode(this.d) + pwe.b((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.c);
    }

    public final String toString() {
        return "FallbackParams(enableTimeoutBasedFallback=" + this.a + ", timeoutMS=" + this.b + ", fallbackOnAnyReconnectCase=" + this.c + ", connectTimeout=" + this.d + ")";
    }

    public /* synthetic */ u5g() {
        this(false, null, true, 5000L);
    }
}
