package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class b5h extends ReferenceQueue implements Runnable, Iterable {
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;

    static {
        new h45(5);
        new AtomicLong();
    }

    public b5h(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
        this.b = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d4(this, this.a.entrySet().iterator());
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference referenceRemove = remove();
                if (referenceRemove != null && this.b.remove(referenceRemove) != null) {
                    throw new ClassCastException();
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
