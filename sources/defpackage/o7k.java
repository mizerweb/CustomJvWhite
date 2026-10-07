package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o7k {
    public final m7k a;
    public final r7k b;

    public o7k(m7k m7kVar, r7k r7kVar) {
        this.a = m7kVar;
        this.b = r7kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7k)) {
            return false;
        }
        o7k o7kVar = (o7k) obj;
        return this.a.equals(o7kVar.a) && this.b.equals(o7kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscribeIPCClientsDto(authIPCClient=" + this.a + ", pushIPCClient=" + this.b + ')';
    }
}
