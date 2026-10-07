package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i67 extends kih {
    public final long c;

    public i67(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i67) && this.c == ((i67) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.s(this.c, "Response(folderSync=", ")");
    }
}
