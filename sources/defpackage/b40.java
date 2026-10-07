package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class b40 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(b40.class, "a");
    public volatile int a;

    public final boolean a() {
        return b.compareAndSet(this, 0, 1);
    }

    public final boolean b() {
        return this.a != 0;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
