package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class g40 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(g40.class, "a");
    public volatile int a;

    public final int a() {
        return b.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
