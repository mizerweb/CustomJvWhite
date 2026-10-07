package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xyg extends azg {
    public final long a;

    public xyg(long j) {
        this.a = j;
    }

    @Override // defpackage.azg
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyg) && this.a == ((xyg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Channel(id=", ")");
    }
}
