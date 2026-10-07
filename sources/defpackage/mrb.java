package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mrb implements rrb {
    public final lrb a;
    public final nfg b;
    public volatile boolean c;
    public Throwable d;
    public final AtomicReference e = new AtomicReference();

    public mrb(lrb lrbVar, int i) {
        this.a = lrbVar;
        this.b = new nfg(i);
    }

    @Override // defpackage.rrb
    public final void b() {
        this.c = true;
        this.a.b();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        oo5.e(this.e, ko5Var);
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        this.b.offer(obj);
        this.a.b();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        this.d = th;
        this.c = true;
        this.a.b();
    }
}
