package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zih implements Runnable {
    public final /* synthetic */ kk2 a;
    public final /* synthetic */ rjh b;
    public final /* synthetic */ mq4 c;
    public final /* synthetic */ Task d;

    public zih(kk2 kk2Var, rjh rjhVar, mq4 mq4Var, Task task) {
        this.a = kk2Var;
        this.b = rjhVar;
        this.c = mq4Var;
        this.d = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjh rjhVar = this.b;
        kk2 kk2Var = this.a;
        if (kk2Var != null && kk2Var.a()) {
            rjhVar.a();
            return;
        }
        try {
            rjhVar.c(this.c.a(this.d));
        } catch (CancellationException unused) {
            rjhVar.a();
        } catch (Exception e) {
            rjhVar.b(e);
        }
    }
}
