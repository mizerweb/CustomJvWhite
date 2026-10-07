package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class j79 implements e89 {
    public ArrayList a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger d;
    public final u72 e = f55.m(new due(this));
    public r72 f;

    public j79(ArrayList arrayList, boolean z, jm5 jm5Var) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.d = new AtomicInteger(arrayList.size());
        b(new pi(25, this), zjl.a());
        if (this.a.isEmpty()) {
            this.f.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        ArrayList arrayList2 = this.a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            e89 e89Var = (e89) arrayList2.get(i2);
            e89Var.b(new xs(this, i2, e89Var, 3), jm5Var);
        }
    }

    @Override // defpackage.e89
    public final void b(Runnable runnable, Executor executor) {
        this.e.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e89) it.next()).cancel(z);
            }
        }
        return this.e.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<e89> arrayList = this.a;
        if (arrayList != null && !isDone()) {
            loop0: for (e89 e89Var : arrayList) {
                while (!e89Var.isDone()) {
                    try {
                        e89Var.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            return (List) this.e.b.get();
                        }
                    }
                }
            }
        }
        return (List) this.e.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.e.b.get(j, timeUnit);
    }
}
