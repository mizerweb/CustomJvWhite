package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ydg implements aeg {
    public final long a;

    public ydg(long j) {
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
        return (obj instanceof ydg) && this.a == ((ydg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Retry(sliceTime=", ")");
    }
}
