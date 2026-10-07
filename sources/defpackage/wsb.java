package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wsb extends kih {
    public final String c;
    public final long d;
    public final long e;
    public final long f;

    public wsb(long j, long j2, long j3, String str) {
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.a = Math.abs(System.nanoTime() - j3) / 1000000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsb)) {
            return false;
        }
        wsb wsbVar = (wsb) obj;
        return cqk.d(this.c, wsbVar.c) && this.d == wsbVar.d && this.e == wsbVar.e && this.f == wsbVar.f;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + qt4.g(qt4.g(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final long i() {
        return this.e;
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = this.c;
        StringBuilder sbB = nbh.B(this.d, "Response(token=", r5h.h1(str, 0, str.length(), "*").toString(), " expiredDurationSec=");
        sbB.append(")");
        return sbB.toString();
    }

    public /* synthetic */ wsb() {
        this(0L, 0L, 0L, "");
    }
}
