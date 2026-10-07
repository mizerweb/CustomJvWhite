package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rr0 implements gt9 {
    public final long a;
    public final long b;
    public long c;

    public rr0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void c() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            qr7.d();
        }
    }

    @Override // defpackage.gt9
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
