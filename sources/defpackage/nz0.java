package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class nz0 implements dbb {
    public final qg7 a;
    public final pc5 b;
    public final ExecutorService c;
    public final String d;
    public volatile boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayList());
    public volatile Future g;

    public nz0(qg7 qg7Var, pc5 pc5Var, ExecutorService executorService, String str, boolean z) {
        this.a = qg7Var;
        this.b = pc5Var;
        this.c = executorService;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.dbb
    public final void a() {
        boolean z = this.e;
        this.e = true;
        if (z || !this.e) {
            return;
        }
        f();
    }

    @Override // defpackage.dbb
    public final void b(ebb ebbVar) {
        Future future;
        if (this.g == null || !((future = this.g) == null || future.isDone())) {
            c(ebbVar);
        } else {
            this.c.execute(new qe(this, 19, ebbVar));
        }
    }

    public final void c(ebb ebbVar) {
        AtomicReference atomicReference;
        boolean z = false;
        loop0: while (true) {
            atomicReference = this.f;
            ArrayList arrayList = (ArrayList) atomicReference.get();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == ebbVar) {
                    z = true;
                    break;
                }
            }
            do {
                if (atomicReference.compareAndSet(arrayList, arrayList2)) {
                    break loop0;
                }
            } while (atomicReference.get() == arrayList);
        }
        if (z) {
            return;
        }
        while (true) {
            ArrayList arrayList3 = (ArrayList) atomicReference.get();
            ArrayList arrayList4 = new ArrayList(arrayList3);
            arrayList4.add(new WeakReference(ebbVar));
            while (!atomicReference.compareAndSet(arrayList3, arrayList4)) {
                if (atomicReference.get() != arrayList3) {
                }
            }
            return;
        }
    }

    public final void d(ibb ibbVar, ebb ebbVar) {
        if (ibbVar != null) {
            try {
                if (ibbVar.b.exists() && ibbVar.b.canRead()) {
                    ebbVar.onFinished(this.d, ibbVar.b, ibbVar.a);
                    return;
                }
            } catch (Throwable th) {
                if (th instanceof ExecutionException) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        ebbVar.onFailed(cause);
                    }
                } else {
                    ebbVar.onFailed(th);
                }
                if (this.e) {
                    c(ebbVar);
                    f();
                    return;
                }
                return;
            }
        }
        if (this.e) {
            c(ebbVar);
            f();
        }
    }

    public final void e(File file, String str) {
        for (WeakReference weakReference : (Iterable) this.f.get()) {
            ebb ebbVar = (ebb) weakReference.get();
            if (ebbVar != null) {
                ebbVar.onFinished(this.d, file, str);
            }
            weakReference.clear();
        }
    }

    public final void f() {
        Future future = this.g;
        if (future == null || future.isDone()) {
            this.g = this.c.submit(new mz0(0, this));
        } else {
            gm0.Y(nz0.class.getName(), "Early return in start cuz of result != null && !result.isDone");
        }
    }
}
