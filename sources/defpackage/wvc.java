package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wvc extends kih {
    public final String c;

    public wvc(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wvc) && this.c.equals(((wvc) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("Response(url=", this.c, ")");
    }
}
