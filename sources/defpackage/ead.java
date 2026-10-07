package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ead extends kih {
    public final long c;
    public final u8b d;
    public final int e;

    public ead(long j, u8b u8bVar, int i) {
        this.c = j;
        this.d = u8bVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ead)) {
            return false;
        }
        ead eadVar = (ead) obj;
        return this.c == eadVar.c && cqk.d(this.d, eadVar.d) && this.e == eadVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(marker=");
        sb.append(this.c);
        sb.append(", voters=");
        sb.append(this.d);
        return qv1.o(sb, ", voteCount=", this.e, ")");
    }
}
