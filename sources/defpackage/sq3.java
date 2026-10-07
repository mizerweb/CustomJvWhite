package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sq3 {
    public final long a;
    public final long b;
    public long c;
    public boolean d;

    public sq3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a() {
        if (this.b == this.c) {
            this.d = true;
        } else {
            ore.k("Try confirm not completed chunk");
        }
    }

    public final void b(long j) {
        long j2 = this.c + j;
        this.c = j2;
        if (j2 <= this.b) {
            return;
        }
        ore.k("Chunk.bytesWritten > Chunk.len");
    }

    public final String toString() {
        return c0a.m(this.b, " }", qt4.s(this.a, "Chunk { offset: ", ", len: "));
    }
}
