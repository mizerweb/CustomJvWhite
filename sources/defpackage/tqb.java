package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class tqb extends AtomicReference implements rrb {
    public final uqb a;
    public volatile boolean b;
    public volatile b7g c;
    public int d;

    public tqb(uqb uqbVar) {
        this.a = uqbVar;
    }

    @Override // defpackage.rrb
    public final void b() {
        this.b = true;
        this.a.f();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.e(this, ko5Var) && (ko5Var instanceof o1e)) {
            o1e o1eVar = (o1e) ko5Var;
            int iK = o1eVar.k();
            if (iK == 1) {
                this.d = iK;
                this.c = o1eVar;
                this.b = true;
                this.a.f();
                return;
            }
            if (iK == 2) {
                this.d = iK;
                this.c = o1eVar;
            }
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        int i = this.d;
        uqb uqbVar = this.a;
        if (i != 0) {
            uqbVar.f();
            return;
        }
        if (uqbVar.get() == 0 && uqbVar.compareAndSet(0, 1)) {
            uqbVar.a.d(obj);
            if (uqbVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            b7g nfgVar = this.c;
            if (nfgVar == null) {
                nfgVar = new nfg(uqbVar.d);
                this.c = nfgVar;
            }
            nfgVar.offer(obj);
            if (uqbVar.getAndIncrement() != 0) {
                return;
            }
        }
        uqbVar.g();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.a.g.b(th)) {
            uqb uqbVar = this.a;
            uqbVar.getClass();
            uqbVar.e();
            this.b = true;
            this.a.f();
        }
    }
}
