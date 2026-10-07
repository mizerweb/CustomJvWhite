package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class r7a {
    public final LinkedBlockingDeque a = new LinkedBlockingDeque();
    public final AtomicReference b = new AtomicReference(null);

    public final AtomicReference a() {
        return this.b;
    }

    public final q7a b() {
        return (q7a) this.a.peek();
    }

    public final boolean c() {
        return this.a.isEmpty();
    }
}
