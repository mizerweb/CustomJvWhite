package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class adi implements cdi {
    public final long a;

    public adi(long j) {
        this.a = j;
    }

    @Override // defpackage.cdi
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adi) && this.a == ((adi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "InitialEvent(mark=", ")");
    }
}
