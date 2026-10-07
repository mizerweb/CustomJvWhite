package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zh implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g40 c;

    public /* synthetic */ zh(ThreadFactory threadFactory, String str, g40 g40Var) {
        this.a = threadFactory;
        this.b = str;
        this.c = g40Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        StringBuilder sbC = nbh.C(this.b);
        sbC.append(r5h.c1(String.valueOf(g40.b.incrementAndGet(this.c)), 2, '0'));
        threadNewThread.setName(sbC.toString());
        return threadNewThread;
    }
}
