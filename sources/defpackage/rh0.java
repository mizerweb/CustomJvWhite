package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rh0 {
    public final hi0 a;
    public final int b;

    public rh0(hi0 hi0Var, int i) {
        this.a = hi0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj;
        return this.a.equals(rh0Var.a) && this.b == rh0Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return zo5.t(sb, this.b, "}");
    }
}
