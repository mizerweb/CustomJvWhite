package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i6f {
    public final long a;
    public final long b;
    public final s5e c;

    public i6f(long j, long j2, s5e s5eVar) {
        this.a = j;
        this.b = j2;
        this.c = s5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6f)) {
            return false;
        }
        i6f i6fVar = (i6f) obj;
        return this.a == i6fVar.a && this.b == i6fVar.b && cqk.d(this.c, i6fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ReactionInfo(messageServerId=", ", messageTime=");
        sbS.append(this.b);
        sbS.append(", reaction=");
        sbS.append((Object) this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
