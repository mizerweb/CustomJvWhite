package defpackage;

import java.util.Locale;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes2.dex */
public abstract class f1l<V> extends t4l implements e4l<V> {
    static final boolean d;
    static final b4l e;
    private static final u0l f;
    private static final Object g;
    private volatile Object a;
    private volatile x0l b;
    private volatile d1l c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        u0l a1lVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new b4l(f1l.class);
        try {
            a1lVar = new c1l(null);
            th2 = null;
            th = null;
        } catch (Error | Exception e2) {
            try {
                th = e2;
                a1lVar = new y0l(AtomicReferenceFieldUpdater.newUpdater(d1l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(d1l.class, d1l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f1l.class, d1l.class, DatabaseHelper.COMPRESSED_COLUMN_NAME), AtomicReferenceFieldUpdater.newUpdater(f1l.class, x0l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f1l.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e3) {
                th = e2;
                th2 = e3;
                a1lVar = new a1l(null);
            }
        }
        f = a1lVar;
        if (th2 != null) {
            b4l b4lVar = e;
            Logger loggerA = b4lVar.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            b4lVar.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object r(e4l e4lVar) {
        Throwable thC;
        if (e4lVar instanceof b1l) {
            Object v0lVar = ((f1l) e4lVar).a;
            if (v0lVar instanceof v0l) {
                v0l v0lVar2 = (v0l) v0lVar;
                if (v0lVar2.a) {
                    Throwable th = v0lVar2.b;
                    v0lVar = th != null ? new v0l(false, th) : v0l.d;
                }
            }
            Objects.requireNonNull(v0lVar);
            return v0lVar;
        }
        if ((e4lVar instanceof t4l) && (thC = ((t4l) e4lVar).c()) != null) {
            return new w0l(thC);
        }
        boolean zIsCancelled = e4lVar.isCancelled();
        if ((!d) && zIsCancelled) {
            v0l v0lVar3 = v0l.d;
            Objects.requireNonNull(v0lVar3);
            return v0lVar3;
        }
        try {
            Object objS = s(e4lVar);
            if (zIsCancelled) {
                return new v0l(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(e4lVar))));
            }
            return objS == null ? g : objS;
        } catch (Error | Exception e2) {
            return new w0l(e2);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new w0l(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(e4lVar)), e3)) : new v0l(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new v0l(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(e4lVar)), e4)) : new w0l(e4.getCause());
        }
    }

    private static Object s(Future future) throws ExecutionException {
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

    private final void t(StringBuilder sb) {
        try {
            Object objS = s(this);
            sb.append("SUCCESS, result=[");
            if (objS == null) {
                sb.append("null");
            } else if (objS == this) {
                sb.append("this future");
            } else {
                sb.append(objS.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objS)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void u(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.a;
        if (obj instanceof z0l) {
            sb.append(", setFuture=[");
            v(sb, ((z0l) obj).b);
            sb.append("]");
        } else {
            try {
                strConcat = pqk.a(i());
            } catch (Exception | StackOverflowError e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (strConcat != null) {
                p.j(sb, ", info=[", strConcat, "]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            t(sb);
        }
    }

    private final void v(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
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
    }

    public static void w(f1l f1lVar, boolean z) {
        x0l x0lVar = null;
        while (true) {
            for (d1l d1lVarB = f.b(f1lVar, d1l.c); d1lVarB != null; d1lVarB = d1lVarB.b) {
                Thread thread = d1lVarB.a;
                if (thread != null) {
                    d1lVarB.a = null;
                    LockSupport.unpark(thread);
                }
            }
            f1lVar.n();
            x0l x0lVar2 = x0lVar;
            x0l x0lVarA = f.a(f1lVar, x0l.d);
            x0l x0lVar3 = x0lVar2;
            while (x0lVarA != null) {
                x0l x0lVar4 = x0lVarA.c;
                x0lVarA.c = x0lVar3;
                x0lVar3 = x0lVarA;
                x0lVarA = x0lVar4;
            }
            while (x0lVar3 != null) {
                Runnable runnable = x0lVar3.a;
                x0l x0lVar5 = x0lVar3.c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof z0l) {
                    z0l z0lVar = (z0l) runnable2;
                    f1lVar = z0lVar.a;
                    if (f1lVar.a == z0lVar) {
                        if (f.f(f1lVar, z0lVar, r(z0lVar.b))) {
                            x0lVar = x0lVar5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = x0lVar3.b;
                    Objects.requireNonNull(executor);
                    x(runnable2, executor);
                }
                x0lVar3 = x0lVar5;
            }
            return;
        }
    }

    private static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", qv1.l("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    private final void y(d1l d1lVar) {
        d1lVar.a = null;
        while (true) {
            d1l d1lVar2 = this.c;
            if (d1lVar2 != d1l.c) {
                d1l d1lVar3 = null;
                while (d1lVar2 != null) {
                    d1l d1lVar4 = d1lVar2.b;
                    if (d1lVar2.a != null) {
                        d1lVar3 = d1lVar2;
                    } else if (d1lVar3 != null) {
                        d1lVar3.b = d1lVar4;
                        if (d1lVar3.a == null) {
                        }
                    } else if (!f.g(this, d1lVar2, d1lVar4)) {
                    }
                    d1lVar2 = d1lVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object z(Object obj) throws ExecutionException {
        if (obj instanceof v0l) {
            Throwable th = ((v0l) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof w0l) {
            throw new ExecutionException(((w0l) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.e4l
    public final void a(Runnable runnable, Executor executor) {
        x0l x0lVar;
        vpk.c(executor, "Executor was null.");
        if (!isDone() && (x0lVar = this.b) != x0l.d) {
            x0l x0lVar2 = new x0l(runnable, executor);
            do {
                x0lVar2.c = x0lVar;
                if (f.e(this, x0lVar, x0lVar2)) {
                    return;
                } else {
                    x0lVar = this.b;
                }
            } while (x0lVar != x0l.d);
        }
        x(runnable, executor);
    }

    @Override // defpackage.t4l
    public final Throwable c() {
        if (!(this instanceof b1l)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof w0l) {
            return ((w0l) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        v0l v0lVar;
        Object obj = this.a;
        if (!(obj instanceof z0l) && !(obj == null)) {
            return false;
        }
        if (d) {
            v0lVar = new v0l(z, new CancellationException("Future.cancel() was called."));
        } else {
            v0lVar = z ? v0l.c : v0l.d;
            Objects.requireNonNull(v0lVar);
        }
        boolean z2 = false;
        while (true) {
            if (f.f(this, obj, v0lVar)) {
                w(this, z);
                if (obj instanceof z0l) {
                    e4l<? extends V> e4lVar = ((z0l) obj).b;
                    if (e4lVar instanceof b1l) {
                        this = (f1l) e4lVar;
                        obj = this.a;
                        if (!(obj == null) && !(obj instanceof z0l)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        e4lVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (!(obj instanceof z0l)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof z0l))) {
            return z(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            d1l d1lVar = this.c;
            if (d1lVar != d1l.c) {
                d1l d1lVar2 = new d1l();
                while (true) {
                    u0l u0lVar = f;
                    u0lVar.c(d1lVar2, d1lVar);
                    if (u0lVar.g(this, d1lVar, d1lVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                y(d1lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof z0l))) {
                                return z(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        y(d1lVar2);
                        break;
                    }
                    d1lVar = this.c;
                    if (d1lVar == d1l.c) {
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return z(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.a;
            if ((obj4 != null) && (!(obj4 instanceof z0l))) {
                return z(obj4);
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
        String strD = ewi.d(j, "Waited ", " ", timeUnit.toString().toLowerCase(locale));
        if (nanos + 1000 < 0) {
            String strConcat = strD.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
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
            strD = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strD.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(zo5.p(strD, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (this instanceof ScheduledFuture) {
            return nbh.s(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof v0l;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & (!(obj instanceof z0l));
    }

    public void n() {
    }

    public final boolean o(Throwable th) {
        if (!f.f(this, null, new w0l(th))) {
            return false;
        }
        w(this, false);
        return true;
    }

    public final boolean p(e4l e4lVar) {
        w0l w0lVar;
        e4lVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (e4lVar.isDone()) {
                if (!f.f(this, null, r(e4lVar))) {
                    return false;
                }
                w(this, false);
                return true;
            }
            z0l z0lVar = new z0l(this, e4lVar);
            if (f.f(this, null, z0lVar)) {
                try {
                    e4lVar.a(z0lVar, j2l.INSTANCE);
                } catch (Throwable th) {
                    try {
                        w0lVar = new w0l(th);
                    } catch (Error | Exception unused) {
                        w0lVar = w0l.b;
                    }
                    f.f(this, z0lVar, w0lVar);
                }
                return true;
            }
            obj = this.a;
        }
        if (obj instanceof v0l) {
            e4lVar.cancel(((v0l) obj).a);
        }
        return false;
    }

    public final boolean q() {
        Object obj = this.a;
        return (obj instanceof v0l) && ((v0l) obj).a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof v0l) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            t(sb);
        } else {
            u(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof z0l))) {
                return z(obj2);
            }
            d1l d1lVar = this.c;
            if (d1lVar != d1l.c) {
                d1l d1lVar2 = new d1l();
                do {
                    u0l u0lVar = f;
                    u0lVar.c(d1lVar2, d1lVar);
                    if (u0lVar.g(this, d1lVar, d1lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                y(d1lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof z0l))));
                        return z(obj);
                    }
                    d1lVar = this.c;
                } while (d1lVar != d1l.c);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return z(obj3);
        }
        throw new InterruptedException();
    }
}
