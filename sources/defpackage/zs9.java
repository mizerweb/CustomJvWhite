package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zs9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;

    public zs9(long j, long j2, long j3, long j4, int i, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = i;
        this.f = j5;
    }

    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs9)) {
            return false;
        }
        zs9 zs9Var = (zs9) obj;
        return this.a == zs9Var.a && this.b == zs9Var.b && this.c == zs9Var.c && this.d == zs9Var.d && this.e == zs9Var.e && this.f == zs9Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + zo5.c(this.e, qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "MediaCacheEntity(id=", ", chatId=");
        sbS.append(this.b);
        qt4.z(this.c, ", messageId=", ", attachId=", sbS);
        c0a.w(sbS, this.d, ", type=", this.e);
        return zo5.k(this.f, ", size=", ")", sbS);
    }
}
