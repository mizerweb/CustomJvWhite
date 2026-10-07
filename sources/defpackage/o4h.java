package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o4h {
    public kyh b;
    public lj6 c;
    public esb d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final csb a = new csb();
    public ewe j = new ewe(4);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(nmc nmcVar);

    public abstract boolean c(nmc nmcVar, long j, ewe eweVar);

    public void d(boolean z) {
        if (z) {
            this.j = new ewe(4);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
