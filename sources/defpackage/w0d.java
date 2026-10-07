package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w0d implements x0d {
    public final long a;
    public final ynh b;
    public final xnh c;
    public final boolean d;
    public final u5c e;

    public w0d(long j, ynh ynhVar, xnh xnhVar, boolean z, u5c u5cVar) {
        this.a = j;
        this.b = ynhVar;
        this.c = xnhVar;
        this.d = z;
        this.e = u5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0d)) {
            return false;
        }
        w0d w0dVar = (w0d) obj;
        return this.a == w0dVar.a && cqk.d(this.b, w0dVar.b) && this.c.equals(w0dVar.c) && this.d == w0dVar.d && this.e == w0dVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + nbh.n((this.c.hashCode() + bc1.h(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "State(messageId=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", canClose=" + this.d + ", viewType=" + this.e + ")";
    }
}
