package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class r82 implements cf7 {
    public final /* synthetic */ ek2 a;
    public final /* synthetic */ AtomicBoolean b;

    public r82(ek2 ek2Var, AtomicBoolean atomicBoolean) {
        this.a = ek2Var;
        this.b = atomicBoolean;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        ek2 ek2Var = this.a;
        if ((ek2Var.t() instanceof hib) && this.b.compareAndSet(false, true)) {
            ek2Var.resumeWith(Boolean.TRUE);
        }
        return sbi.a;
    }
}
