package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qdg extends sdg {
    public final long c;

    public qdg(long j) {
        super(j, 1);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdg) && this.c == ((qdg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return nbh.s(this.c, "DialogUserId(contactId=", ")");
    }
}
