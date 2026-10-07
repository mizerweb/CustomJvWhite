package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class pnf implements nnf {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ onf c;
    public final /* synthetic */ ek2 d;

    public pnf(int i, AtomicBoolean atomicBoolean, onf onfVar, ek2 ek2Var) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = onfVar;
        this.d = ek2Var;
    }

    @Override // defpackage.nnf
    public final void b(int i) {
        if (i == this.a && this.b.compareAndSet(false, true)) {
            ((rnf) this.c).d(this);
            this.d.resumeWith(sbi.a);
        }
    }
}
