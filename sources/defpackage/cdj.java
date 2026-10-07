package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cdj extends tu3 {
    public final long c;

    public cdj(long j) {
        super(Long.valueOf(j), 4);
        this.c = j;
    }

    @Override // defpackage.tu3
    public final Long b() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdj) && this.c == ((cdj) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return nbh.s(this.c, "ChannelId(sourceId=", ")");
    }
}
