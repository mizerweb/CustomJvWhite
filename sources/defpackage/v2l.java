package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class v2l implements Runnable {
    final Future a;
    final s2l b;

    public v2l(Future future, s2l s2lVar) {
        this.a = future;
        this.b = s2lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA = x4l.a((t4l) this.a);
        if (thA != null) {
            this.b.b(thA);
            return;
        }
        try {
            Future future = this.a;
            if (!future.isDone()) {
                throw new IllegalStateException(pqk.b("Future was expected to be done: %s", future));
            }
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.b.a(obj);
        } catch (ExecutionException e) {
            this.b.b(e.getCause());
        } catch (Throwable th2) {
            this.b.b(th2);
        }
    }

    public final String toString() {
        jpk jpkVarA = mpk.a(this);
        jpkVarA.a(this.b);
        return jpkVarA.toString();
    }
}
