package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class u89 {
    public final Thread a;
    public final sfh b;
    public final s89 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;

    public u89(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, qt3 qt3Var, s89 s89Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = s89Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || qt3Var == null || s89Var == null) {
            this.b = null;
        } else {
            this.b = ((nfh) qt3Var).a(looper, new q89(0, this));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new t89(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            sfh sfhVar = this.b;
            sfhVar.getClass();
            Handler handler = sfhVar.a;
            if (!handler.hasMessages(1)) {
                rfh rfhVarA = sfhVar.a(1);
                Message message = rfhVarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                rfhVarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, r89 r89Var) {
        g();
        this.f.add(new mr7(new CopyOnWriteArraySet(this.d), i, r89Var));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            t89.a((t89) it.next(), this.c);
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet<t89> copyOnWriteArraySet = this.d;
        for (t89 t89Var : copyOnWriteArraySet) {
            if (t89Var.a.equals(obj)) {
                t89.a(t89Var, this.c);
                copyOnWriteArraySet.remove(t89Var);
            }
        }
    }

    public final void f(int i, r89 r89Var) {
        c(i, r89Var);
        b();
    }

    public final void g() {
        if (this.i) {
            lvb.b0(Thread.currentThread() == this.a);
        }
    }

    public u89(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public u89(Looper looper, qt3 qt3Var, s89 s89Var) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), qt3Var, s89Var, true);
    }

    public u89(Looper looper) {
        this(looper.getThread());
    }
}
