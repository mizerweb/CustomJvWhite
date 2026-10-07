package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j2h {
    public final q2h a;
    public final u8b b;
    public final u8b c;

    public j2h(q2h q2hVar, u8b u8bVar, u8b u8bVar2) {
        this.a = q2hVar;
        this.b = u8bVar;
        this.c = u8bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2h)) {
            return false;
        }
        j2h j2hVar = (j2h) obj;
        return cqk.d(this.a, j2hVar.a) && cqk.d(this.b, j2hVar.b) && cqk.d(this.c, j2hVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        u8b u8bVar = this.c;
        return iHashCode + (u8bVar == null ? 0 : u8bVar.hashCode());
    }

    public final String toString() {
        return "InitialStats(stats=" + this.a + ", views=" + this.b + ", reactions=" + this.c + ")";
    }
}
