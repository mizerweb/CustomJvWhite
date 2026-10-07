package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b0f implements e0f {
    public final t50 a;
    public final long b;
    public final long c;

    public b0f(t50 t50Var, long j, long j2) {
        this.a = t50Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0f)) {
            return false;
        }
        b0f b0fVar = (b0f) obj;
        return this.a.equals(b0fVar.a) && this.b == b0fVar.b && this.c == b0fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulkDownload(attachModel=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        return zo5.k(this.c, ", messageId=", ")", sb);
    }
}
