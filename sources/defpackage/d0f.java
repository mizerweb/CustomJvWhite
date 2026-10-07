package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d0f implements e0f {
    public final long a;
    public final t50 b;
    public final long c;
    public final long d;

    public d0f(long j, t50 t50Var, long j2, long j3) {
        this.a = j;
        this.b = t50Var;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0f)) {
            return false;
        }
        d0f d0fVar = (d0f) obj;
        return this.a == d0fVar.a && cqk.d(this.b, d0fVar.b) && this.c == d0fVar.c && this.d == d0fVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleDownload(attachId=");
        sb.append(this.a);
        sb.append(", currentItem=");
        sb.append(this.b);
        qt4.z(this.c, ", chatId=", ", messageId=", sb);
        return c0a.m(this.d, ")", sb);
    }
}
