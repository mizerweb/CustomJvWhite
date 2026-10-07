package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by9 {
    public long a;
    public long b = Long.MIN_VALUE;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public final void a(long j) {
        lvb.R(j == Long.MIN_VALUE || j >= 0);
        this.b = j;
    }

    public final void b(long j) {
        lvb.R(j >= 0);
        this.a = j;
    }
}
