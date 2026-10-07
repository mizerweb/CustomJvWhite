package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gth {
    public final /* synthetic */ hth a;

    public final void a(long j) {
        hth hthVar = this.a;
        bn7 bn7Var = hthVar.f;
        dn7 dn7Var = hthVar.d;
        dn7Var.getClass();
        bn7Var.o(dn7Var, j);
        AtomicBoolean atomicBoolean = hthVar.c;
        if (atomicBoolean.get()) {
            hthVar.f.q();
            atomicBoolean.set(false);
        }
        hthVar.b.decrementAndGet();
    }
}
