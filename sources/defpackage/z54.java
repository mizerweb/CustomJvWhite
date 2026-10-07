package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z54 {
    public final q54 a;
    public final m8b b;
    public final long c;

    public z54(q54 q54Var, m8b m8bVar, long j) {
        this.a = q54Var;
        this.b = m8bVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z54)) {
            return false;
        }
        z54 z54Var = (z54) obj;
        return this.a == z54Var.a && this.b.equals(z54Var.b) && this.c == z54Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplaintResult(complainTypeId=");
        sb.append(this.a);
        sb.append(", serverIds=");
        sb.append(this.b);
        sb.append(", ownerId=");
        return c0a.m(this.c, ")", sb);
    }
}
