package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class ndh implements dbb {
    public final qg7 a;
    public final pc5 b;
    public final xt4 c;
    public final xt4 d;
    public final gu4 e;
    public final String f;
    public volatile boolean g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public volatile yf5 i;

    public ndh(qg7 qg7Var, pc5 pc5Var, xt4 xt4Var, xt4 xt4Var2, gu4 gu4Var, String str, boolean z) {
        this.a = qg7Var;
        this.b = pc5Var;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = gu4Var;
        this.f = str;
        this.g = z;
    }

    public static final void c(ndh ndhVar, ibb ibbVar, ebb ebbVar) {
        ndhVar.getClass();
        if (ibbVar != null) {
            try {
                if (ibbVar.b.exists() && ibbVar.b.canRead()) {
                    ebbVar.onFinished(ndhVar.f, ibbVar.b, ibbVar.a);
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
                if (ndhVar.g) {
                    ndhVar.e(ebbVar);
                    ndhVar.f();
                    return;
                }
                return;
            }
        }
        if (ndhVar.g) {
            ndhVar.e(ebbVar);
            ndhVar.f();
        }
    }

    public static final void d(ndh ndhVar, File file, String str) {
        for (WeakReference weakReference : ndhVar.h) {
            ebb ebbVar = (ebb) weakReference.get();
            if (ebbVar != null) {
                ebbVar.onFinished(ndhVar.f, file, str);
            }
            weakReference.clear();
        }
    }

    @Override // defpackage.dbb
    public final void a() {
        boolean z = this.g;
        this.g = true;
        if (z || !this.g) {
            return;
        }
        f();
    }

    @Override // defpackage.dbb
    public final void b(ebb ebbVar) {
        yf5 yf5Var;
        if (this.i == null || !((yf5Var = this.i) == null || yf5Var.W())) {
            e(ebbVar);
        } else {
            yab.i0(this.e, this.c, 0, new gv7(this, ebbVar, null, 17), 2);
        }
    }

    public final void e(ebb ebbVar) {
        u6 u6Var = new u6(19, new u8h(6));
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        copyOnWriteArrayList.removeIf(u6Var);
        if (!copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (cqk.d(((WeakReference) it.next()).get(), ebbVar)) {
                    return;
                }
            }
        }
        copyOnWriteArrayList.add(new WeakReference(ebbVar));
    }

    public final void f() {
        yf5 yf5Var = this.i;
        if (yf5Var != null && !yf5Var.W()) {
            gm0.Y(ndh.class.getName(), "Early return in start cuz of result != null && !result.isDone");
        } else {
            this.i = yab.h(this.e, this.c, 0, new xra(this, null, 23), 2);
        }
    }
}
