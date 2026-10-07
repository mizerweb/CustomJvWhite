package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class x7g extends v7g implements s8g {
    public static final w7g[] f = new w7g[0];
    public static final w7g[] g = new w7g[0];
    public final p8g a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicReference c = new AtomicReference(f);
    public Object d;
    public Throwable e;

    public x7g(p8g p8gVar) {
        this.a = p8gVar;
    }

    @Override // defpackage.s8g
    public final void a(Object obj) {
        this.d = obj;
        for (w7g w7gVar : (w7g[]) this.c.getAndSet(g)) {
            if (!w7gVar.get()) {
                w7gVar.a.a(obj);
            }
        }
    }

    @Override // defpackage.s8g
    public final void c(ko5 ko5Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v7g
    public final void i(s8g s8gVar) {
        w7g w7gVar = new w7g(s8gVar, this);
        s8gVar.c(w7gVar);
        while (true) {
            AtomicReference atomicReference = this.c;
            w7g[] w7gVarArr = (w7g[]) atomicReference.get();
            if (w7gVarArr == g) {
                Throwable th = this.e;
                if (th != null) {
                    s8gVar.onError(th);
                    return;
                } else {
                    s8gVar.a(this.d);
                    return;
                }
            }
            int length = w7gVarArr.length;
            w7g[] w7gVarArr2 = new w7g[length + 1];
            System.arraycopy(w7gVarArr, 0, w7gVarArr2, 0, length);
            w7gVarArr2[length] = w7gVar;
            do {
                if (atomicReference.compareAndSet(w7gVarArr, w7gVarArr2)) {
                    if (w7gVar.get()) {
                        k(w7gVar);
                    }
                    if (this.b.getAndIncrement() == 0) {
                        this.a.h(this);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == w7gVarArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(w7g w7gVar) {
        w7g[] w7gVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            w7g[] w7gVarArr2 = (w7g[]) atomicReference.get();
            int length = w7gVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (w7gVarArr2[i] == w7gVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                w7gVarArr = f;
            } else {
                w7g[] w7gVarArr3 = new w7g[length - 1];
                System.arraycopy(w7gVarArr2, 0, w7gVarArr3, 0, i);
                System.arraycopy(w7gVarArr2, i + 1, w7gVarArr3, i, (length - i) - 1);
                w7gVarArr = w7gVarArr3;
            }
            while (!atomicReference.compareAndSet(w7gVarArr2, w7gVarArr)) {
                if (atomicReference.get() != w7gVarArr2) {
                }
            }
            return;
        }
    }

    @Override // defpackage.s8g
    public final void onError(Throwable th) {
        this.e = th;
        for (w7g w7gVar : (w7g[]) this.c.getAndSet(g)) {
            if (!w7gVar.get()) {
                w7gVar.a.onError(th);
            }
        }
    }
}
