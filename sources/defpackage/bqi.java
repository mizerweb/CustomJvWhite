package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bqi extends oqi {
    public final long a;
    public final boolean b;

    public bqi(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqi)) {
            return false;
        }
        bqi bqiVar = (bqi) obj;
        return this.a == bqiVar.a && this.b == bqiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "RepeatVideo(startPosition=", ", startPlay=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
