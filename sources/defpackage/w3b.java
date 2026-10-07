package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w3b extends kih {
    public final l8b c;

    public w3b(l8b l8bVar) {
        this.c = l8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3b) && this.c.equals(((w3b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        l8b l8bVar = this.c;
        return "{size=" + l8bVar.e + "[" + l8bVar + "]}";
    }
}
