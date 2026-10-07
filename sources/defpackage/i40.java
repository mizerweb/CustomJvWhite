package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class i40 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(i40.class, Object.class, "a");
    public volatile Object a;

    public final boolean a(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        return false;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
