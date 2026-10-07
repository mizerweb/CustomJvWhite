package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class rxk {
    public ba9 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Executor f;
    public volatile o30 g;
    public volatile o30 h;
    public final Semaphore i;
    public final Set j;

    public rxk(Context context, Set set) {
        ThreadPoolExecutor threadPoolExecutor = o30.h;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        context.getApplicationContext();
        this.f = threadPoolExecutor;
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            if (!this.b) {
                this.e = true;
            }
            o30 o30Var = this.h;
            o30 o30Var2 = this.g;
            if (o30Var != null) {
                o30Var2.getClass();
                this.g = null;
                return;
            }
            o30Var2.getClass();
            o30 o30Var3 = this.g;
            o30Var3.d.set(true);
            if (o30Var3.b.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        o30 o30Var = this.g;
        Executor executor = this.f;
        if (o30Var.c == 1) {
            o30Var.c = 2;
            o30Var.a.getClass();
            executor.execute(o30Var.b);
            return;
        }
        int iD = qt4.D(o30Var.c);
        if (iD == 1) {
            ore.k("Cannot execute task: the task is already running.");
        } else if (iD != 2) {
            ore.k("We should never reach this state");
        } else {
            ore.k("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void c() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((ukk) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        uql.a(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
