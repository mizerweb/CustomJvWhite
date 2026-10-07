package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class fee implements AutoCloseable {
    public final AtomicBoolean a;
    public final dee b;
    public final long c;
    public final xr6 d;
    public final xva e;

    public fee(dee deeVar, long j, xr6 xr6Var, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        xva xvaVar = Build.VERSION.SDK_INT >= 30 ? new xva(9, new tt3()) : new xva(9, new dul(20));
        this.e = xvaVar;
        this.b = deeVar;
        this.c = j;
        this.d = xr6Var;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((ut3) xvaVar.b).a("stop");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public final void b(int i, RuntimeException runtimeException) {
        final int i2;
        final RuntimeException runtimeException2;
        ((ut3) this.e.b).close();
        if (this.a.getAndSet(true)) {
            return;
        }
        final dee deeVar = this.b;
        synchronized (deeVar.j) {
            try {
                if (!dee.t(this, deeVar.q) && !dee.t(this, deeVar.p)) {
                    tvj.a("Recorder", "stop() called on a recording that is no longer active: " + this.d);
                    return;
                }
                qi0 qi0Var = null;
                switch (deeVar.m.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        i2 = i;
                        runtimeException2 = runtimeException;
                        qyj.l(null, dee.t(this, deeVar.q));
                        qi0 qi0Var2 = deeVar.q;
                        deeVar.q = null;
                        deeVar.C();
                        qi0Var = qi0Var2;
                        if (qi0Var != null) {
                            if (i2 == 10) {
                                tvj.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                            }
                            deeVar.l(qi0Var, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException2));
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                        deeVar.H(cee.g);
                        final long jNanoTime = System.nanoTime() / 1000;
                        final qi0 qi0Var3 = deeVar.p;
                        i2 = i;
                        runtimeException2 = runtimeException;
                        deeVar.e.execute(new Runnable() { // from class: rde
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                deeVar.M(qi0Var3, jNanoTime, i2, runtimeException2);
                            }
                        });
                        if (qi0Var != null) {
                            if (i2 == 10) {
                                tvj.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                            }
                            deeVar.l(qi0Var, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException2));
                            return;
                        }
                        return;
                    case 6:
                    case 7:
                        qyj.l(null, dee.t(this, deeVar.p));
                    default:
                        i2 = i;
                        runtimeException2 = runtimeException;
                        if (qi0Var != null) {
                            if (i2 == 10) {
                                tvj.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                            }
                            deeVar.l(qi0Var, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException2));
                            return;
                        }
                        return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            ((ut3) this.e.b).q();
            b(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
