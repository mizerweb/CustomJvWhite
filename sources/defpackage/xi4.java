package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi4 {
    public final long a;
    public final long b;
    public final ki4 c;

    public xi4(long j, long j2, ki4 ki4Var) {
        this.a = j;
        this.b = j2;
        this.c = ki4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xi4) {
            xi4 xi4Var = (xi4) obj;
            return this.a == xi4Var.a && this.b == xi4Var.b && this.c == xi4Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ContactEntity(id=", ", serverId=");
        sbS.append(this.b);
        sbS.append(", contactData=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
