package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xpc {
    public final int a;
    public final int b;

    public xpc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpc)) {
            return false;
        }
        xpc xpcVar = (xpc) obj;
        return this.a == xpcVar.a && this.b == xpcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("Bitrate(dimension=", this.a, ", bitrate=", this.b, ")");
    }
}
