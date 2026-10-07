package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class tgg implements it9 {
    public final qt3 a;
    public boolean b;
    public long c;
    public long d;
    public s2d e = s2d.d;

    public tgg(qt3 qt3Var) {
        this.a = qt3Var;
    }

    @Override // defpackage.it9
    public final long A() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        ((nfh) this.a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        s2d s2dVar = this.e;
        return (s2dVar.a == 1.0f ? vqi.X(jElapsedRealtime) : jElapsedRealtime * ((long) s2dVar.c)) + j;
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            ((nfh) this.a).getClass();
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        ((nfh) this.a).getClass();
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    @Override // defpackage.it9
    public final s2d c() {
        return this.e;
    }

    @Override // defpackage.it9
    public final void x(s2d s2dVar) {
        if (this.b) {
            a(A());
        }
        this.e = s2dVar;
    }
}
