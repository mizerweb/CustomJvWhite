package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fn5 {
    public boolean a;
    public long b;
    public long c;

    public final synchronized long a() {
        return this.b;
    }

    public final synchronized void b(long j, long j2) {
        if (this.a) {
            this.b += j;
            this.c += j2;
        }
    }
}
