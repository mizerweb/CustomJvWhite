package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c10 extends f10 {
    public final long a;
    public final boolean b;

    public c10(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        return this.a == c10Var.a && this.b == c10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "LoadingAround(time=", ", isAddEventCaused=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
