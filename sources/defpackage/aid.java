package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class aid implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public aid(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new AtomicInteger(1);
                this.b = str;
                break;
            case 2:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                break;
            default:
                this.b = str;
                this.c = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new Thread(new e80(this, runnable), qt4.j(((AtomicInteger) obj).getAndIncrement(), str, "-"));
            case 1:
                Thread thread = new Thread(runnable, qt4.j(((AtomicInteger) obj).getAndIncrement(), str, "-"));
                thread.setDaemon(true);
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(new kye(runnable, 3));
                threadNewThread.setName(str);
                return threadNewThread;
        }
    }
}
