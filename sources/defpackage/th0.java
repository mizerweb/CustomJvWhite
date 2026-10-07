package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class th0 implements ceg {
    public static final th0 c = new th0(x98.b, xv.a);
    public final nwh a;
    public final og0 b;

    public th0(nwh nwhVar, og0 og0Var) {
        if (nwhVar == null) {
            ore.n("Null traceFlags");
            throw null;
        }
        this.a = nwhVar;
        if (og0Var != null) {
            this.b = og0Var;
        } else {
            ore.n("Null traceState");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof th0)) {
            return false;
        }
        th0 th0Var = (th0) obj;
        return this.a.equals(th0Var.a) && this.b.equals(th0Var.b);
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ ((this.a.hashCode() ^ 741203163) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=00000000000000000000000000000000, spanId=0000000000000000, traceFlags=" + this.a + ", traceState=" + this.b + ", remote=false, valid=false}";
    }
}
