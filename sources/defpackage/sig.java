package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sig {
    public final long a;
    public final long b;
    public final ce9 c;

    public sig(long j, long j2, ce9 ce9Var) {
        this.a = j;
        this.b = j2;
        this.c = ce9Var;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sig)) {
            return false;
        }
        sig sigVar = (sig) obj;
        return this.a == sigVar.a && this.b == sigVar.b && this.c.equals(sigVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StatEntity(id=", ", timestamp=");
        sbS.append(this.b);
        sbS.append(", data=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
