package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qvi {
    public long a;
    public long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvi)) {
            return false;
        }
        qvi qviVar = (qvi) obj;
        return this.a == qviVar.a && this.b == qviVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "VideoCoverage(videoCoverageStart=", ", videoCoverageEnd="));
    }
}
