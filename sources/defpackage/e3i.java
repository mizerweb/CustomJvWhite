package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e3i {
    public final int a;
    public final int b;

    static {
        new e3i(1, 4);
    }

    public e3i(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i <= 0) {
            ore.p("maxParallelTranscode must be positive");
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        ore.p("maxUploadConnections must be positive");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3i)) {
            return false;
        }
        e3i e3iVar = (e3i) obj;
        return this.a == e3iVar.a && this.b == e3iVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + zo5.c(2097152, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return nbh.u("TransloadConfig(maxParallelTranscode=", this.a, ", maxUploadChunkSize=2097152, maxUploadConnections=", this.b, ")");
    }
}
