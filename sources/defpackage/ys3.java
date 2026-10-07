package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ys3 {
    public final String a;
    public final byte b;

    public ys3(byte b, String str) {
        this.a = str;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys3)) {
            return false;
        }
        ys3 ys3Var = (ys3) obj;
        return cqk.d(this.a, ys3Var.a) && this.b == ys3Var.b;
    }

    public final int hashCode() {
        return Byte.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "ClickableLinkApi(url=", this.a, ", checkResult=", ")");
    }
}
