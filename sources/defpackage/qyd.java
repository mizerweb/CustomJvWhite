package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qyd extends j7h {
    public static final pyd[] c = new pyd[0];
    public static final pyd[] d = new pyd[0];
    public final AtomicReference a = new AtomicReference(d);
    public Throwable b;

    @Override // defpackage.rrb
    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        pyd[] pydVarArr = (pyd[]) atomicReference.getAndSet(obj2);
        for (pyd pydVar : pydVarArr) {
            if (!pydVar.get()) {
                pydVar.a.b();
            }
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (this.a.get() == c) {
            ko5Var.dispose();
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (obj == null) {
            throw gd6.a("onNext called with a null value.");
        }
        fd6 fd6Var = gd6.a;
        for (pyd pydVar : (pyd[]) this.a.get()) {
            if (!pydVar.get()) {
                pydVar.a.d(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        pyd pydVar = new pyd(rrbVar, this);
        rrbVar.c(pydVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            pyd[] pydVarArr = (pyd[]) atomicReference.get();
            if (pydVarArr == c) {
                Throwable th = this.b;
                if (th != null) {
                    rrbVar.onError(th);
                    return;
                } else {
                    rrbVar.b();
                    return;
                }
            }
            int length = pydVarArr.length;
            pyd[] pydVarArr2 = new pyd[length + 1];
            System.arraycopy(pydVarArr, 0, pydVarArr2, 0, length);
            pydVarArr2[length] = pydVar;
            do {
                if (atomicReference.compareAndSet(pydVarArr, pydVarArr2)) {
                    if (pydVar.get()) {
                        h(pydVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == pydVarArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(pyd pydVar) {
        pyd[] pydVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            pyd[] pydVarArr2 = (pyd[]) atomicReference.get();
            if (pydVarArr2 == c || pydVarArr2 == (pydVarArr = d)) {
                return;
            }
            int length = pydVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (pydVarArr2[i] == pydVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                pydVarArr = new pyd[length - 1];
                System.arraycopy(pydVarArr2, 0, pydVarArr, 0, i);
                System.arraycopy(pydVarArr2, i + 1, pydVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(pydVarArr2, pydVarArr)) {
                if (atomicReference.get() != pydVarArr2) {
                }
            }
            return;
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (th == null) {
            throw gd6.a("onError called with a null Throwable.");
        }
        fd6 fd6Var = gd6.a;
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            tre.s0(th);
            return;
        }
        this.b = th;
        for (pyd pydVar : (pyd[]) atomicReference.getAndSet(obj2)) {
            if (pydVar.get()) {
                tre.s0(th);
            } else {
                pydVar.a.onError(th);
            }
        }
    }
}
