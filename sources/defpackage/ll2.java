package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ll2 implements cle, tp7 {
    public final long a;
    public final h40 b;
    public xp7 c;

    public ll2(long j) {
        this.a = j;
        if (j <= 0) {
            ore.p("Failed requirement.");
            throw null;
        }
        h40 h40Var = new h40();
        h40Var.a = 0L;
        this.b = h40Var;
    }

    @Override // defpackage.tp7
    public final void a() {
    }

    @Override // defpackage.tp7
    public final void c() {
        long j;
        h40 h40Var = this.b;
        do {
            j = h40Var.a;
        } while (!h40.b.compareAndSet(h40Var, j, j != -1 ? 0L : -1L));
        this.c.W(false);
        Log.w("CXCP", "Capture processing has been disabled for " + this.c + " until " + this.a + " frames have been completed.");
    }

    @Override // defpackage.tp7
    public final void d() {
        this.b.a = -1L;
        this.c.W(false);
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) {
        long j2;
        long j3;
        h40 h40Var = this.b;
        do {
            j2 = h40Var.a;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!h40.b.compareAndSet(h40Var, j2, j3));
        if (j3 == this.a) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.c + " after " + j3 + " frames.");
            this.c.W(true);
        }
    }
}
