package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oe0 extends kih {
    public final String c;
    public final int d;
    public final int e;

    public oe0(String str, int i, int i2) {
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe0)) {
            return false;
        }
        oe0 oe0Var = (oe0) obj;
        return this.c.equals(oe0Var.c) && this.d == oe0Var.d && this.e == oe0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(this.d, this.c.hashCode() * 31, 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return zo5.t(c0a.r(this.d, "Response(trackId='", this.c, "',codeLength=", ",blockingDuration="), this.e, ")");
    }
}
