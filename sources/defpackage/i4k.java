package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i4k {
    public final m7k a;
    public final r7k b;

    public i4k(m7k m7kVar, r7k r7kVar, xfk xfkVar) {
        this.a = m7kVar;
        this.b = r7kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4k)) {
            return false;
        }
        i4k i4kVar = (i4k) obj;
        return this.a.equals(i4kVar.a) && this.b.equals(i4kVar.b) && cqk.d(null, null);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 0;
    }

    public final String toString() {
        return "IPCClientsDto(authIPCClient=" + this.a + ", pushIPCClient=" + this.b + ", testPushIPCClient=" + ((Object) null) + ')';
    }
}
