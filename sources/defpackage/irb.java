package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class irb extends AtomicInteger implements rrb, ko5, Runnable {
    public final rrb a;
    public final y2f d;
    public ko5 f;
    public volatile boolean g;
    public Throwable h;
    public volatile boolean i;
    public volatile boolean j;
    public boolean k;
    public final long b = 3;
    public final TimeUnit c = TimeUnit.SECONDS;
    public final AtomicReference e = new AtomicReference();

    public irb(rrb rrbVar, y2f y2fVar) {
        this.a = rrbVar;
        this.d = y2fVar;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.e;
        rrb rrbVar = this.a;
        int iAddAndGet = 1;
        while (!this.i) {
            boolean z = this.g;
            if (z && this.h != null) {
                atomicReference.lazySet(null);
                rrbVar.onError(this.h);
                this.d.dispose();
                return;
            }
            boolean z2 = atomicReference.get() == null;
            if (z) {
                atomicReference.getAndSet(null);
                rrbVar.b();
                this.d.dispose();
                return;
            }
            if (z2) {
                if (this.j) {
                    this.k = false;
                    this.j = false;
                }
            } else if (!this.k || this.j) {
                rrbVar.d(atomicReference.getAndSet(null));
                this.j = false;
                this.k = true;
                this.d.b(this, this.b, this.c);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // defpackage.rrb
    public final void b() {
        this.g = true;
        a();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.f, ko5Var)) {
            this.f = ko5Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        this.e.set(obj);
        a();
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.i = true;
        this.f.dispose();
        this.d.dispose();
        if (getAndIncrement() == 0) {
            this.e.lazySet(null);
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        this.h = th;
        this.g = true;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j = true;
        a();
    }
}
