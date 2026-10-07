package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct5 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ ct5(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return jt5.g((AtomicInteger) serializable, runnable);
            case 1:
                return new Thread(runnable, zo5.h(((AtomicInteger) serializable).getAndIncrement(), "tracer-io-"));
            default:
                return new Thread(runnable, (String) serializable);
        }
    }
}
