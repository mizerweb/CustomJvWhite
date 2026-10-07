package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class h40 {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(h40.class, "a");
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}
