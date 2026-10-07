package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class arb extends AtomicReference implements ko5, Runnable {
    public final rrb a;
    public long b;

    public arb(rrb rrbVar) {
        this.a = rrbVar;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        oo5.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != oo5.a) {
            long j = this.b;
            this.b = 1 + j;
            this.a.d(Long.valueOf(j));
        }
    }
}
