package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class y3 implements e89 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(y3.class.getName());
    public static final qyj f;
    public static final Object g;
    public volatile Object a;
    public volatile u3 b;
    public volatile x3 c;

    static {
        qyj w3Var;
        try {
            w3Var = new v3(AtomicReferenceFieldUpdater.newUpdater(x3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(x3.class, x3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y3.class, x3.class, DatabaseHelper.COMPRESSED_COLUMN_NAME), AtomicReferenceFieldUpdater.newUpdater(y3.class, u3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y3.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            w3Var = new w3();
        }
        f = w3Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void i(y3 y3Var) {
        x3 x3Var;
        u3 u3Var;
        u3 u3Var2;
        u3 u3Var3;
        do {
            x3Var = y3Var.c;
        } while (!f.g(y3Var, x3Var, x3.c));
        while (true) {
            u3Var = null;
            if (x3Var == null) {
                break;
            }
            Thread thread = x3Var.a;
            if (thread != null) {
                x3Var.a = null;
                LockSupport.unpark(thread);
            }
            x3Var = x3Var.b;
        }
        y3Var.h();
        do {
            u3Var2 = y3Var.b;
        } while (!f.e(y3Var, u3Var2, u3.d));
        while (true) {
            u3Var3 = u3Var;
            u3Var = u3Var2;
            if (u3Var == null) {
                break;
            }
            u3Var2 = u3Var.c;
            u3Var.c = u3Var3;
        }
        while (u3Var3 != null) {
            u3 u3Var4 = u3Var3.c;
            k(u3Var3.a, u3Var3.b);
            u3Var3 = u3Var4;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object m(Object obj) throws ExecutionException {
        if (obj instanceof s3) {
            Throwable th = ((s3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof t3) {
            throw new ExecutionException(((t3) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object n(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.e89
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        u3 u3Var = this.b;
        u3 u3Var2 = u3.d;
        if (u3Var != u3Var2) {
            u3 u3Var3 = new u3(runnable, executor);
            do {
                u3Var3.c = u3Var;
                if (f.e(this, u3Var, u3Var3)) {
                    return;
                } else {
                    u3Var = this.b;
                }
            } while (u3Var != u3Var2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        s3 s3Var;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                s3Var = new s3(z, new CancellationException("Future.cancel() was called."));
            } else {
                s3Var = z ? s3.c : s3.d;
            }
            if (f.f(this, obj, s3Var)) {
                i(this);
                return true;
            }
        }
        return false;
    }

    public final void d(StringBuilder sb) {
        try {
            Object objN = n(this);
            sb.append("SUCCESS, result=[");
            sb.append(objN == this ? "this future" : String.valueOf(objN));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        x3 x3Var = x3.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return m(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            x3 x3Var2 = this.c;
            if (x3Var2 != x3Var) {
                x3 x3Var3 = new x3();
                while (true) {
                    qyj qyjVar = f;
                    qyjVar.P(x3Var3, x3Var2);
                    if (qyjVar.g(this, x3Var2, x3Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(x3Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return m(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(x3Var3);
                        break;
                    }
                    x3Var2 = this.c;
                    if (x3Var2 == x3Var) {
                    }
                }
            }
            return m(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return m(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbS = qt4.s(j, "Waited ", " ");
        sbS.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbS.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(zo5.p(string3, " for ", string));
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof s3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String o() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void p(x3 x3Var) {
        x3Var.a = null;
        while (true) {
            x3 x3Var2 = this.c;
            if (x3Var2 == x3.c) {
                return;
            }
            x3 x3Var3 = null;
            while (x3Var2 != null) {
                x3 x3Var4 = x3Var2.b;
                if (x3Var2.a != null) {
                    x3Var3 = x3Var2;
                } else if (x3Var3 != null) {
                    x3Var3.b = x3Var4;
                    if (x3Var3.a == null) {
                    }
                } else if (!f.g(this, x3Var2, x3Var4)) {
                }
                x3Var2 = x3Var4;
            }
            return;
        }
    }

    public boolean q(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.f(this, null, obj)) {
            return false;
        }
        i(this);
        return true;
    }

    public boolean r(Throwable th) {
        th.getClass();
        if (!f.f(this, null, new t3(th))) {
            return false;
        }
        i(this);
        return true;
    }

    public final String toString() {
        String strO;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof s3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                strO = o();
            } catch (RuntimeException e2) {
                strO = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strO != null && !strO.isEmpty()) {
                p.j(sb, "PENDING, info=[", strO, "]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        x3 x3Var = x3.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return m(obj2);
            }
            x3 x3Var2 = this.c;
            if (x3Var2 != x3Var) {
                x3 x3Var3 = new x3();
                do {
                    qyj qyjVar = f;
                    qyjVar.P(x3Var3, x3Var2);
                    if (qyjVar.g(this, x3Var2, x3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                p(x3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m(obj);
                    }
                    x3Var2 = this.c;
                } while (x3Var2 != x3Var);
            }
            return m(this.a);
        }
        throw new InterruptedException();
    }
}
