package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l4c {
    public final long a;
    public final int b;
    public final boolean c;

    public l4c(int i, long j, boolean z) {
        this.a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4c)) {
            return false;
        }
        l4c l4cVar = (l4c) obj;
        return this.a == l4cVar.a && this.b == l4cVar.b && this.c == l4cVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return nbh.z(c0a.q(this.b, this.a, "Key(animojiId=", ", size="), ", overrideAlpha=", this.c, ")");
    }
}
