package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f7k {
    public final boolean a;
    public final long b;
    public final long c;

    public f7k(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7k)) {
            return false;
        }
        f7k f7kVar = (f7k) obj;
        return this.a == f7kVar.a && this.b == f7kVar.b && this.c == f7kVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ml9.a(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisibilityInterval(isFg=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return zo5.u(sb, this.c, ')');
    }
}
