package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class iif implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ArrayDeque c;
    public Runnable d;
    public final Object e;

    public iif(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.e) {
                    Object objPoll = this.c.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.d = runnable2;
                    if (objPoll != null) {
                        this.b.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.e) {
                    try {
                        Runnable runnable3 = (Runnable) this.c.poll();
                        this.d = runnable3;
                        if (runnable3 != null) {
                            ((rg) this.b).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.e) {
                    try {
                        this.c.add(new p0((Object) this, 5, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                synchronized (this.e) {
                    this.c.offer(new o90(runnable, 25, this));
                    if (this.d == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.e) {
                    try {
                        this.c.add(new qe(this, 4, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public iif(rg rgVar) {
        this.a = 2;
        this.e = new Object();
        this.c = new ArrayDeque();
        this.b = rgVar;
    }
}
