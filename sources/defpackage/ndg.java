package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ndg extends sdg {
    public final long c;

    public ndg(long j) {
        super(j, 4);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndg) && this.c == ((ndg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return nbh.s(this.c, "ChannelId(channelId=", ")");
    }
}
