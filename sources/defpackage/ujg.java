package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ujg implements Runnable {
    public final AtomicInteger a = new AtomicInteger(0);
    public final lq0 b;
    public final pjd c;
    public final es0 d;
    public final String e;

    public ujg(lq0 lq0Var, pjd pjdVar, es0 es0Var, String str) {
        this.b = lq0Var;
        this.c = pjdVar;
        this.d = es0Var;
        this.e = str;
        pjdVar.a(es0Var, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        pjd pjdVar = this.c;
        es0 es0Var = this.d;
        String str = this.e;
        pjdVar.c(es0Var, str);
        pjdVar.j(es0Var, str);
        this.b.c();
    }

    public void f(Exception exc) {
        pjd pjdVar = this.c;
        es0 es0Var = this.d;
        String str = this.e;
        pjdVar.c(es0Var, str);
        pjdVar.b(es0Var, str, exc, null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        pjd pjdVar = this.c;
        es0 es0Var = this.d;
        String str = this.e;
        pjdVar.d(es0Var, str, pjdVar.c(es0Var, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
