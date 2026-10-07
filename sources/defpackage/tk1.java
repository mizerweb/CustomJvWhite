package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tk1 extends uk1 {
    public final long b;
    public final long c;

    public tk1(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk1)) {
            return false;
        }
        tk1 tk1Var = (tk1) obj;
        return this.b == tk1Var.b && this.c == tk1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return c0a.m(this.c, ")", qt4.s(this.b, "OpenMessageByTime(chatLocalId=", ", time="));
    }
}
