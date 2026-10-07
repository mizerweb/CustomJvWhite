package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class k64 extends h64 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k64(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.h64
    public final void b(m64 m64Var) {
        int i = this.a;
        Object obj = this.b;
        qn5 qn5Var = vm9.c;
        switch (i) {
            case 0:
                j66 j66Var = new j66(qn5Var);
                m64Var.c(j66Var);
                if (!j66Var.a()) {
                    try {
                        ((v7) obj).run();
                        if (!j66Var.a()) {
                            m64Var.b();
                        }
                        break;
                    } catch (Throwable th) {
                        iwl.a(th);
                        if (j66Var.a()) {
                            tre.s0(th);
                            return;
                        } else {
                            m64Var.onError(th);
                            return;
                        }
                    }
                }
                break;
            default:
                j66 j66Var2 = new j66(qn5Var);
                m64Var.c(j66Var2);
                try {
                    ((Callable) obj).call();
                    if (!j66Var2.a()) {
                        m64Var.b();
                    }
                    break;
                } catch (Throwable th2) {
                    iwl.a(th2);
                    if (!j66Var2.a()) {
                        m64Var.onError(th2);
                        return;
                    }
                    tre.s0(th2);
                }
                break;
        }
    }
}
