package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sk9 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public sk9(long j, long j2, long j3, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk9)) {
            return false;
        }
        sk9 sk9Var = (sk9) obj;
        return this.a.equals(sk9Var.a) && this.b == sk9Var.b && this.c == sk9Var.c && this.d == sk9Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "LooperMessage(message=", this.a, ", startTime=");
        qt4.z(this.c, ", endTime=", ", messageQueueSize=", sbB);
        return c0a.m(this.d, ")", sbB);
    }
}
