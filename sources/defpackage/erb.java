package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class erb extends AtomicReference implements rrb, ko5, Runnable {
    public final nif a;
    public final z2f d;
    public ko5 f;
    public final AtomicReference e = new AtomicReference();
    public final long b = 50;
    public final TimeUnit c = TimeUnit.MILLISECONDS;

    public erb(nif nifVar, z2f z2fVar) {
        this.a = nifVar;
        this.d = z2fVar;
    }

    @Override // defpackage.rrb
    public final void b() {
        oo5.a(this.e);
        this.a.b();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.f, ko5Var)) {
            this.f = ko5Var;
            this.a.c(this);
            long j = this.b;
            oo5.d(this.e, this.d.d(this, j, j, this.c));
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        lazySet(obj);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        oo5.a(this.e);
        this.f.dispose();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        oo5.a(this.e);
        this.a.onError(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.a.d(andSet);
        }
    }
}
