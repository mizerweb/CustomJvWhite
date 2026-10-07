package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class iqb implements rrb, ko5 {
    public final nif a;
    public final y2f b;
    public ko5 c;
    public hqb d;
    public volatile long e;
    public boolean f;

    public iqb(nif nifVar, y2f y2fVar) {
        this.a = nifVar;
        this.b = y2fVar;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        hqb hqbVar = this.d;
        if (hqbVar != null) {
            oo5.a(hqbVar);
        }
        if (hqbVar != null) {
            hqbVar.run();
        }
        this.a.b();
        this.b.dispose();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.c, ko5Var)) {
            this.c = ko5Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e + 1;
        this.e = j;
        hqb hqbVar = this.d;
        if (hqbVar != null) {
            oo5.a(hqbVar);
        }
        hqb hqbVar2 = new hqb(obj, j, this);
        this.d = hqbVar2;
        oo5.d(hqbVar2, this.b.b(hqbVar2, 1000L, TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.c.dispose();
        this.b.dispose();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.f) {
            tre.s0(th);
            return;
        }
        hqb hqbVar = this.d;
        if (hqbVar != null) {
            oo5.a(hqbVar);
        }
        this.f = true;
        this.a.onError(th);
        this.b.dispose();
    }
}
