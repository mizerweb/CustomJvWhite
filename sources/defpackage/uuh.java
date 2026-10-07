package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class uuh {
    public final AtomicInteger a = new AtomicInteger(8);

    public uuh(long j) {
        new AtomicLong(System.nanoTime());
    }

    public static boolean a(uuh uuhVar) {
        int i;
        AtomicInteger atomicInteger = uuhVar.a;
        do {
            i = atomicInteger.get();
            if (i < 1) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i, i - 1));
        return true;
    }
}
