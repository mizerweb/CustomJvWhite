package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class pxe extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public pxe(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread oxeVar = this.c ? new oxe(runnable, str) : new Thread(runnable, str);
        oxeVar.setPriority(this.b);
        oxeVar.setDaemon(true);
        return oxeVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return zo5.w(new StringBuilder("RxThreadFactory["), this.a, "]");
    }

    public pxe(String str) {
        this(str, 5, false);
    }
}
