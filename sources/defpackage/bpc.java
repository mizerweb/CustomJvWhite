package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bpc {
    public final String a;

    public bpc(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpc) && cqk.d(this.a, ((bpc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Peer(id=", this.a, ")");
    }
}
