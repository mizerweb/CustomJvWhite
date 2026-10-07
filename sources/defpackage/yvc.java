package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yvc extends kih {
    public final u8b c;

    public yvc(u8b u8bVar) {
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvc) && this.c.equals(((yvc) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("Response{attaches={", u8b.k(this.c, null, 63), "}}");
    }
}
