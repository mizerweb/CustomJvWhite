package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class x0b extends FutureTask {
    public final /* synthetic */ o30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0b(o30 o30Var, g35 g35Var) {
        super(g35Var);
        this.a = o30Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        o30 o30Var = this.a;
        AtomicBoolean atomicBoolean = o30Var.e;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            o30Var.a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            o30Var.a(null);
        } catch (ExecutionException e2) {
            ore.h("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            ore.h("An error occurred while executing doInBackground()", th);
        }
    }
}
