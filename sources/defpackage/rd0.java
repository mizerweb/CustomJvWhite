package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rd0 extends kih {
    public final long c;

    public rd0(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd0) && this.c == ((rd0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.s(this.c, "Response(timestampRemoveProfile=", ")");
    }
}
