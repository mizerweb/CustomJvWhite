package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wfi {
    public final long a;
    public final long b;
    public long c;

    public wfi(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfi)) {
            return false;
        }
        wfi wfiVar = (wfi) obj;
        return this.a == wfiVar.a && this.b == wfiVar.b && this.c == wfiVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.a;
        long j3 = this.c + j2;
        StringBuilder sbS = qt4.s(j2, "Chunk[", " -> ");
        sbS.append(j + j2);
        return zo5.k(j3, " (position: ", ")]", sbS);
    }

    public /* synthetic */ wfi(long j, long j2) {
        this(j, j2, 0L);
    }
}
