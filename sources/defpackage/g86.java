package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i86 b;
    public final /* synthetic */ r72 c;

    public /* synthetic */ g86(i86 i86Var, r72 r72Var, int i) {
        this.a = i;
        this.b = i86Var;
        this.c = r72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        r72 r72Var = this.c;
        final i86 i86Var = this.b;
        switch (i) {
            case 0:
                r72Var.b(i86Var.b);
                break;
            default:
                m86 m86Var = i86Var.d;
                w31 w31Var = i86Var.b;
                if (w31Var == w31.a) {
                    final e89 e89VarA = m86Var.a();
                    o9b.h(e89VarA, r72Var);
                    final int i2 = 0;
                    r72Var.a(new Runnable() { // from class: h86
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            e89 e89Var = e89VarA;
                            i86 i86Var2 = i86Var;
                            switch (i3) {
                                case 0:
                                    i86Var2.getClass();
                                    if (!e89Var.cancel(true)) {
                                        qyj.l(null, e89Var.isDone());
                                        try {
                                            ((f86) e89Var.get()).a();
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            tvj.g(i86Var2.d.a, "Unable to cancel the input buffer: " + e);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    i86Var2.c.remove(e89Var);
                                    break;
                            }
                        }
                    }, zjl.a());
                    i86Var.c.add(e89VarA);
                    final int i3 = 1;
                    e89VarA.b(new Runnable() { // from class: h86
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            e89 e89Var = e89VarA;
                            i86 i86Var2 = i86Var;
                            switch (i4) {
                                case 0:
                                    i86Var2.getClass();
                                    if (!e89Var.cancel(true)) {
                                        qyj.l(null, e89Var.isDone());
                                        try {
                                            ((f86) e89Var.get()).a();
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            tvj.g(i86Var2.d.a, "Unable to cancel the input buffer: " + e);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    i86Var2.c.remove(e89Var);
                                    break;
                            }
                        }
                    }, m86Var.h);
                } else if (w31Var != w31.b) {
                    r72Var.d(new IllegalStateException("Unknown state: " + i86Var.b));
                } else {
                    r72Var.d(new IllegalStateException("BufferProvider is not active."));
                }
                break;
        }
    }
}
