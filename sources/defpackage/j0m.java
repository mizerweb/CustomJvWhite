package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j0m {
    public static final boolean a(j8c j8cVar) {
        return j8cVar == j8c.e;
    }

    public static void b(rrb rrbVar, AtomicInteger atomicInteger, j40 j40Var) {
        if (atomicInteger.getAndIncrement() == 0) {
            j40Var.c(rrbVar);
        }
    }

    public static void c(rrb rrbVar, Object obj, AtomicInteger atomicInteger, j40 j40Var) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            rrbVar.d(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                j40Var.c(rrbVar);
            }
        }
    }

    public static final g8c d(Widget widget, ynh ynhVar, o8c o8cVar, cf7 cf7Var) {
        h8c h8cVar = new h8c(widget);
        h8cVar.h(z8c.a);
        h8cVar.j(b9c.a);
        h8cVar.m(ynhVar);
        h8cVar.c(o8cVar);
        h8cVar.e(new nua(4, cf7Var));
        return h8cVar.p();
    }
}
