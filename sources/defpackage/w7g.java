package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class w7g extends AtomicBoolean implements ko5 {
    public final s8g a;
    public final x7g b;

    public w7g(s8g s8gVar, x7g x7gVar) {
        this.a = s8gVar;
        this.b = x7gVar;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.k(this);
        }
    }
}
