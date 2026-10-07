package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h89 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ r72 c;
    public final /* synthetic */ af7 d;

    public /* synthetic */ h89(AtomicBoolean atomicBoolean, r72 r72Var, af7 af7Var, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = r72Var;
        this.d = af7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        af7 af7Var = this.d;
        r72 r72Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        r72Var.b(af7Var.invoke());
                    } catch (Throwable th) {
                        r72Var.d(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        r72Var.b(af7Var.invoke());
                    } catch (Throwable th2) {
                        r72Var.d(th2);
                    }
                    break;
                }
                break;
        }
    }
}
