package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j1h implements k1h {
    public final long a;

    public j1h(long j) {
        this.a = j;
        String.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1h) && this.a == ((j1h) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Sticker(stickerId=", ")");
    }
}
