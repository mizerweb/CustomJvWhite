package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dh0 {
    public final int a;
    public final int b;
    public final r72 c;

    public dh0(int i, int i2, r72 r72Var) {
        this.a = i;
        this.b = i2;
        this.c = r72Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dh0) {
            dh0 dh0Var = (dh0) obj;
            return this.a == dh0Var.a && this.b == dh0Var.b && this.c == dh0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
