package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lj0 {
    public static final lj0 d = new lj0(0, 0, 0);
    public static final lj0 e = new lj0(1, 3, 2);
    public static final lj0 f = new lj0(1, 3, 1);
    public static final lj0 g = new lj0(6, 7, 1);
    public static final lj0 h = new lj0(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public lj0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return this.a == lj0Var.a && this.b == lj0Var.b && this.c == lj0Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return zo5.t(sb, this.c, "}");
    }
}
