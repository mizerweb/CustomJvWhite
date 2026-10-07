package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cki {
    public final int a;
    public final int b;

    public cki(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cki)) {
            return false;
        }
        cki ckiVar = (cki) obj;
        return this.a == ckiVar.a && this.b == ckiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("Config(maxChunkSize=", this.a, ", maxConnections=", this.b, ")");
    }
}
