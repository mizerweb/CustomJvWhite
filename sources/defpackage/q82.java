package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class q82 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek2 b;
    public final /* synthetic */ AtomicBoolean c;

    public /* synthetic */ q82(ek2 ek2Var, AtomicBoolean atomicBoolean, int i) {
        this.a = i;
        this.b = ek2Var;
        this.c = atomicBoolean;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        AtomicBoolean atomicBoolean = this.c;
        ek2 ek2Var = this.b;
        switch (i) {
            case 0:
                if ((ek2Var.t() instanceof hib) && atomicBoolean.compareAndSet(false, true)) {
                    ek2Var.resumeWith(Boolean.FALSE);
                }
                break;
            default:
                if ((ek2Var.t() instanceof hib) && atomicBoolean.compareAndSet(false, true)) {
                    ek2Var.resumeWith(Boolean.FALSE);
                }
                break;
        }
        return sbiVar;
    }
}
