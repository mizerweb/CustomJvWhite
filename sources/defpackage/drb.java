package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class drb extends AtomicReference implements rrb {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicInteger b;

    public /* synthetic */ drb(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    @Override // defpackage.rrb
    public final void b() {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                wqb wqbVar = (wqb) atomicInteger;
                oo5.a(wqbVar.e);
                j0m.b(wqbVar.b, wqbVar, wqbVar.d);
                break;
            default:
                ((hrb) atomicInteger).e();
                break;
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        switch (this.a) {
            case 0:
                oo5.e(this, ko5Var);
                break;
            default:
                oo5.e(this, ko5Var);
                break;
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                ((wqb) atomicInteger).f();
                break;
            default:
                oo5.a(this);
                ((hrb) atomicInteger).e();
                break;
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                wqb wqbVar = (wqb) atomicInteger;
                oo5.a(wqbVar.e);
                rrb rrbVar = wqbVar.b;
                j40 j40Var = wqbVar.d;
                if (j40Var.b(th) && wqbVar.getAndIncrement() == 0) {
                    j40Var.c(rrbVar);
                    break;
                }
                break;
            default:
                hrb hrbVar = (hrb) atomicInteger;
                oo5.a((AtomicReference) hrbVar.c);
                rrb rrbVar2 = (rrb) hrbVar.b;
                j40 j40Var2 = (j40) hrbVar.e;
                if (j40Var2.b(th) && hrbVar.getAndIncrement() == 0) {
                    j40Var2.c(rrbVar2);
                    break;
                }
                break;
        }
    }
}
