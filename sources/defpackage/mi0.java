package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mi0 {
    public final hjd a;
    public final l78 b;

    public mi0(hjd hjdVar, l78 l78Var) {
        if (hjdVar == null) {
            ore.n("Null processingRequest");
            throw null;
        }
        this.a = hjdVar;
        this.b = l78Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mi0)) {
            return false;
        }
        mi0 mi0Var = (mi0) obj;
        return this.a.equals(mi0Var.a) && this.b.equals(mi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
