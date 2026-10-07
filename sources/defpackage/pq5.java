package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pq5 implements rq5 {
    public final int a;
    public final long b;
    public final long c;

    public pq5(int i, long j, long j2) {
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
        if (!(obj instanceof pq5)) {
            return false;
        }
        pq5 pq5Var = (pq5) obj;
        return this.a == pq5Var.a && this.b == pq5Var.b && this.c == pq5Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.k(this.c, ", chatId=", ")", nbh.B(this.b, "Loading(progress=", ezl.e(this.a), ", time="));
    }
}
