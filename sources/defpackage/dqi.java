package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dqi extends oqi {
    public final long a;
    public final boolean b;

    public dqi(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqi)) {
            return false;
        }
        dqi dqiVar = (dqi) obj;
        return this.a == dqiVar.a && this.b == dqiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "RetryVideo(startPosition=", ", startPlay=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
