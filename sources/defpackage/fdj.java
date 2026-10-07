package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fdj extends tu3 {
    public final long c;

    public fdj(long j) {
        super(Long.valueOf(j), 1);
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
        return (obj instanceof fdj) && this.c == ((fdj) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return nbh.s(this.c, "DialogUserId(sourceId=", ")");
    }
}
