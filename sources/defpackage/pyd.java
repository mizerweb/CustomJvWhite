package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class pyd extends AtomicBoolean implements ko5 {
    public final rrb a;
    public final qyd b;

    public pyd(rrb rrbVar, qyd qydVar) {
        this.a = rrbVar;
        this.b = qydVar;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.h(this);
        }
    }
}
