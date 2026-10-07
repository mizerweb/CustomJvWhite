package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y1d implements a2d {
    public final String a;
    public final long b;
    public final int c;

    public y1d(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1d)) {
            return false;
        }
        y1d y1dVar = (y1d) obj;
        return cqk.d(this.a, y1dVar.a) && this.b == y1dVar.b && this.c == y1dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qv1.o(nbh.B(this.b, "NeuroAvatar(url=", this.a, ", photoId="), ", categoryId=", this.c, ")");
    }
}
