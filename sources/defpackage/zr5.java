package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zr5 implements as5 {
    public final int a;
    public final long b;

    public zr5(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final int a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr5)) {
            return false;
        }
        zr5 zr5Var = (zr5) obj;
        return this.a == zr5Var.a && this.b == zr5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "Loading(progress=", ezl.e(this.a), ", time=");
        sbB.append(")");
        return sbB.toString();
    }
}
