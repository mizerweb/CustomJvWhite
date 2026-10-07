package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zdg implements aeg {
    public final long a;

    public zdg(long j) {
        this.a = j;
    }

    @Override // defpackage.aeg
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdg) && this.a == ((zdg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Start(sliceTime=", ")");
    }
}
