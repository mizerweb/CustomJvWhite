package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b57 extends kih {
    public final long c;

    public b57(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b57) && this.c == ((b57) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.s(this.c, "Response(folderSync=", ")");
    }
}
