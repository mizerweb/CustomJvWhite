package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pr5 implements qr5 {
    public final int a;
    public final long b;
    public final long c;

    public pr5(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr5)) {
            return false;
        }
        pr5 pr5Var = (pr5) obj;
        return this.a == pr5Var.a && this.b == pr5Var.b && this.c == pr5Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.k(this.c, ", botId=", ")", nbh.B(this.b, "Loading(progress=", ezl.e(this.a), ", time="));
    }
}
