package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ns8 {
    public final String a;
    public final int b;

    public ns8(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns8)) {
            return false;
        }
        ns8 ns8Var = (ns8) obj;
        return cqk.d(this.a, ns8Var.a) && this.b == ns8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "JsBridgeMethodErrorReason(title=", this.a, ", code=", ")");
    }
}
