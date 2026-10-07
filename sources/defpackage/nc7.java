package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class nc7 implements AutoCloseable {
    public final bd7 a;
    public final Set b;
    public final b40 c;

    public nc7(bd7 bd7Var) {
        c79 c79Var = bd7Var.e;
        ArrayList arrayList = new ArrayList(yw3.W0(c79Var, 10));
        ListIterator listIterator = c79Var.listIterator(0);
        while (true) {
            b79 b79Var = (b79) listIterator;
            if (!b79Var.hasNext()) {
                break;
            } else {
                arrayList.add(new j4h(((zc7) b79Var.next()).c));
            }
        }
        Set setX1 = ww3.X1(arrayList);
        this.a = bd7Var;
        this.b = setX1;
        ArrayList arrayList2 = new ArrayList(yw3.W0(c79Var, 10));
        ListIterator listIterator2 = c79Var.listIterator(0);
        while (true) {
            b79 b79Var2 = (b79) listIterator2;
            if (!b79Var2.hasNext()) {
                ww3.X1(arrayList2);
                this.c = gvk.a(false);
                return;
            }
            arrayList2.add(new ojc(((zc7) b79Var2.next()).d));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        l();
    }

    public final void finalize() {
        if (l()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final boolean l() {
        boolean zIsTerminated;
        if (!this.c.a()) {
            return false;
        }
        bd7 bd7Var = this.a;
        yc7 yc7Var = bd7Var.d;
        c79 c79Var = bd7Var.e;
        g40 g40Var = (g40) yc7Var.a;
        g40Var.getClass();
        if (g40.b.decrementAndGet(g40Var) == 0) {
            ((i64) yc7Var.b).Q(new rjc(new tjc(2)));
        }
        int size = c79Var.getSize();
        for (int i = 0; i < size; i++) {
            zc7 zc7Var = (zc7) c79Var.get(i);
            if (this.b.contains(new j4h(zc7Var.c))) {
                g40 g40Var2 = (g40) zc7Var.a;
                g40Var2.getClass();
                if (g40.b.decrementAndGet(g40Var2) == 0) {
                    ((i64) zc7Var.b).Q(new rjc(new tjc(2)));
                    i64 i64Var = (i64) zc7Var.b;
                    Object obj = null;
                    if (i64Var.W() && !i64Var.isCancelled()) {
                        Object obj2 = ((rjc) i64Var.z()).a;
                        if (rjc.a(obj2)) {
                            obj = obj2;
                        }
                    }
                    a88 a88Var = (uzf) obj;
                    if (a88Var != null) {
                        if (a88Var instanceof AutoCloseable) {
                            a88Var.close();
                        } else if (a88Var instanceof ExecutorService) {
                            ExecutorService executorService = (ExecutorService) a88Var;
                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                executorService.shutdown();
                                boolean z = false;
                                while (!zIsTerminated) {
                                    try {
                                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
                                        if (!z) {
                                            executorService.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        } else {
                            ore.a();
                        }
                    }
                }
            }
        }
        return true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
