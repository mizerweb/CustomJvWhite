package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ojg extends b4 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.b4
    public final boolean a(a4 a4Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(p90.f);
        return true;
    }

    @Override // defpackage.b4
    public final lq4[] b(a4 a4Var) {
        this.a.set(null);
        return ch3.a;
    }
}
