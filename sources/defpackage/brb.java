package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class brb extends fqb {
    public final z2f a;
    public final long b;
    public final long c;
    public final TimeUnit d;

    public brb(long j, long j2, TimeUnit timeUnit, z2f z2fVar) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = z2fVar;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        arb arbVar = new arb(rrbVar);
        rrbVar.c(arbVar);
        z2f z2fVar = this.a;
        if (!(z2fVar instanceof lzh)) {
            oo5.e(arbVar, z2fVar.d(arbVar, this.b, this.c, this.d));
        } else {
            kzh kzhVar = new kzh();
            oo5.e(arbVar, kzhVar);
            kzhVar.c(arbVar, this.b, this.c, this.d);
        }
    }
}
