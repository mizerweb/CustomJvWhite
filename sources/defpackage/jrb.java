package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jrb extends AtomicReference implements ko5, Runnable {
    public final rrb a;

    public jrb(rrb rrbVar) {
        this.a = rrbVar;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        oo5.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == oo5.a) {
            return;
        }
        rrb rrbVar = this.a;
        rrbVar.d(0L);
        lazySet(l66.a);
        rrbVar.b();
    }
}
