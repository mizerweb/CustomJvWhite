package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mga implements oga {
    public final long a;
    public final long b;

    public mga(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mga)) {
            return false;
        }
        mga mgaVar = (mga) obj;
        return this.a == mgaVar.a && this.b == mgaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "ByRange(startTime=", ", endTime="));
    }
}
