package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bje extends kih {
    public final long c;

    public bje(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bje) && this.c == ((bje) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.s(this.c, "Response(timestampRemoveProfile=", ")");
    }
}
