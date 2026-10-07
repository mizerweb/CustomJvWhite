package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 implements e89 {
    public static final boolean d;
    public static final uy8 e;
    public static final grk f;
    public static final Object g;
    public volatile Object a;
    public volatile c1 b;
    public volatile n1 c;

    static {
        boolean z;
        Throwable th;
        grk f1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new uy8(o1.class);
        Throwable th2 = null;
        try {
            f1Var = new m1();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                f1Var = new d1(AtomicReferenceFieldUpdater.newUpdater(n1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n1.class, n1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o1.class, n1.class, DatabaseHelper.COMPRESSED_COLUMN_NAME), AtomicReferenceFieldUpdater.newUpdater(o1.class, c1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                f1Var = new f1();
            }
        }
        f = f1Var;
        if (th2 != null) {
            uy8 uy8Var = e;
            Logger loggerA = uy8Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            uy8Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void f(o1 o1Var, boolean z) {
        c1 c1Var = null;
        while (true) {
            for (n1 n1VarF = f.f(o1Var); n1VarF != null; n1VarF = n1VarF.b) {
                Thread thread = n1VarF.a;
                if (thread != null) {
                    n1VarF.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                o1Var.j();
                z = false;
            }
            o1Var.d();
            c1 c1Var2 = c1Var;
            c1 c1VarE = f.e(o1Var);
            c1 c1Var3 = c1Var2;
            while (c1VarE != null) {
                c1 c1Var4 = c1VarE.c;
                c1VarE.c = c1Var3;
                c1Var3 = c1VarE;
                c1VarE = c1Var4;
            }
            while (c1Var3 != null) {
                c1Var = c1Var3.c;
                Runnable runnable = c1Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e1) {
                    e1 e1Var = (e1) runnable;
                    o1Var = e1Var.a;
                    if (o1Var.a == e1Var) {
                        if (f.c(o1Var, e1Var, i(e1Var.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c1Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                c1Var3 = c1Var;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof a1) {
            Throwable th = ((a1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b1) {
            throw new ExecutionException(((b1) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object i(e89 e89Var) {
        Object obj;
        Throwable thH;
        if (e89Var instanceof g1) {
            Object a1Var = ((o1) e89Var).a;
            if (a1Var instanceof a1) {
                a1 a1Var2 = (a1) a1Var;
                if (a1Var2.a) {
                    a1Var = a1Var2.b != null ? new a1(false, a1Var2.b) : a1.d;
                }
            }
            Objects.requireNonNull(a1Var);
            return a1Var;
        }
        if ((e89Var instanceof o1) && (thH = i4m.h((o1) e89Var)) != null) {
            return new b1(thH);
        }
        boolean zIsCancelled = e89Var.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            a1 a1Var3 = a1.d;
            Objects.requireNonNull(a1Var3);
            return a1Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = e89Var.get();
                        break;
                    } catch (Error | Exception e2) {
                        e = e2;
                        return new b1(e);
                    } catch (CancellationException e3) {
                        if (zIsCancelled) {
                            return new a1(false, e3);
                        }
                        return new b1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + e89Var, e3));
                    } catch (ExecutionException e4) {
                        if (!zIsCancelled) {
                            return new b1(e4.getCause());
                        }
                        return new a1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + e89Var, e4));
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e5) {
                e = e5;
                return new b1(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? g : obj;
        }
        return new a1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + e89Var));
    }

    @Override // defpackage.e89
    public void b(Runnable runnable, Executor executor) {
        c1 c1Var;
        c1 c1Var2 = c1.d;
        lvb.W(executor, "Executor was null.");
        if (!isDone() && (c1Var = this.b) != c1Var2) {
            c1 c1Var3 = new c1(runnable, executor);
            do {
                c1Var3.c = c1Var;
                if (f.b(this, c1Var, c1Var3)) {
                    return;
                } else {
                    c1Var = this.b;
                }
            } while (c1Var != c1Var2);
        }
        g(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e3) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e3.getClass());
                    sb.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        e(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        a1 a1Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof e1)) {
            return false;
        }
        if (d) {
            a1Var = new a1(z, new CancellationException("Future.cancel() was called."));
        } else {
            a1Var = z ? a1.c : a1.d;
            Objects.requireNonNull(a1Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.c(this, obj, a1Var)) {
                f(this, z);
                if (obj instanceof e1) {
                    e89 e89Var = ((e1) obj).b;
                    if (e89Var instanceof g1) {
                        this = (o1) e89Var;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof e1)) {
                            z2 = true;
                        }
                    } else {
                        e89Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (!(obj instanceof e1)) {
                return z2;
            }
        }
    }

    public void d() {
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        n1 n1Var = n1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof e1))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            n1 n1Var2 = this.c;
            if (n1Var2 != n1Var) {
                n1 n1Var3 = new n1();
                z = true;
                while (true) {
                    grk grkVar = f;
                    grkVar.g(n1Var3, n1Var2);
                    if (grkVar.d(this, n1Var2, n1Var3)) {
                        do {
                            sfl.a(this, nanos);
                            if (Thread.interrupted()) {
                                l(n1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof e1))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(n1Var3);
                        break;
                    }
                    n1Var2 = this.c;
                    if (n1Var2 == n1Var) {
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z = true;
        while (nanos > 0) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof e1))) {
                return h(obj4);
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
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(zo5.p(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof a1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof e1)) & (obj != null);
    }

    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(n1 n1Var) {
        n1Var.a = null;
        while (true) {
            n1 n1Var2 = this.c;
            if (n1Var2 == n1.c) {
                return;
            }
            n1 n1Var3 = null;
            while (n1Var2 != null) {
                n1 n1Var4 = n1Var2.b;
                if (n1Var2.a != null) {
                    n1Var3 = n1Var2;
                } else if (n1Var3 != null) {
                    n1Var3.b = n1Var4;
                    if (n1Var3.a == null) {
                    }
                } else if (!f.d(this, n1Var2, n1Var4)) {
                }
                n1Var2 = n1Var4;
            }
            return;
        }
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.c(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean n(Throwable th) {
        th.getClass();
        if (!f.c(this, null, new b1(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean o(e89 e89Var) {
        b1 b1Var;
        e89Var.getClass();
        Object obj = this.a;
        if (obj != null) {
            if (obj instanceof a1) {
                e89Var.cancel(((a1) obj).a);
            }
        } else if (e89Var.isDone()) {
            if (f.c(this, null, i(e89Var))) {
                f(this, false);
                return true;
            }
        } else {
            e1 e1Var = new e1(this, e89Var);
            if (f.c(this, null, e1Var)) {
                try {
                    e89Var.b(e1Var, im5.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        b1Var = new b1(th);
                    } catch (Error | Exception unused) {
                        b1Var = b1.b;
                    }
                    f.c(this, e1Var, b1Var);
                    return true;
                }
            }
            obj = this.a;
            if (obj instanceof a1) {
                e89Var.cancel(((a1) obj).a);
            }
        }
        return false;
    }

    public final Throwable p() {
        if (!(this instanceof g1)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof b1) {
            return ((b1) obj).a;
        }
        return null;
    }

    public final boolean q() {
        Object obj = this.a;
        return (obj instanceof a1) && ((a1) obj).a;
    }

    public final String toString() {
        String strK;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof e1) {
                sb.append(", setFuture=[");
                e89 e89Var = ((e1) obj).b;
                try {
                    if (e89Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(e89Var);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strK = k();
                    if (strK == null || strK.isEmpty()) {
                        strK = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strK = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strK != null) {
                    p.j(sb, ", info=[", strK, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                c(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        n1 n1Var = n1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof e1))) {
                return h(obj2);
            }
            n1 n1Var2 = this.c;
            if (n1Var2 != n1Var) {
                n1 n1Var3 = new n1();
                do {
                    grk grkVar = f;
                    grkVar.g(n1Var3, n1Var2);
                    if (grkVar.d(this, n1Var2, n1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                l(n1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e1))));
                        return h(obj);
                    }
                    n1Var2 = this.c;
                } while (n1Var2 != n1Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
