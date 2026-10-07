package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g10 {
    public final long a;
    public final int b;

    public g10(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj;
        return this.a == g10Var.a && this.b == g10Var.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "RemoteKey(time=", ", dir=");
        sbS.append(p.n(this.b));
        sbS.append(")");
        return sbS.toString();
    }
}
