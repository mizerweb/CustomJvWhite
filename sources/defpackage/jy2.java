package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jy2 {
    public final long a;
    public final long b;
    public final nx2 c;
    public final long d;
    public final long e;
    public final long f;

    public jy2(long j, long j2, nx2 nx2Var, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = nx2Var;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy2)) {
            return false;
        }
        jy2 jy2Var = (jy2) obj;
        return this.a == jy2Var.a && this.b == jy2Var.b && cqk.d(this.c, jy2Var.c) && this.d == jy2Var.d && this.e == jy2Var.e && this.f == jy2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + qt4.g(qt4.g((this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ChatEntity(id=", ", serverId=");
        sbS.append(this.b);
        sbS.append(", chatData=");
        sbS.append(this.c);
        qt4.z(this.d, ", favouriteIndex=", ", sortTime=", sbS);
        sbS.append(this.e);
        return zo5.k(this.f, ", cid=", ")", sbS);
    }
}
