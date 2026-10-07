package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class lg2 {
    public final z05 a;
    public final int b;
    public final Object c;
    public boolean d;

    public lg2(z05 z05Var) {
        this.a = z05Var;
        g40 g40Var = ng2.a;
        g40Var.getClass();
        this.b = g40.b.incrementAndGet(g40Var);
        this.c = new Object();
    }

    public final fi2 a() {
        fi2 fi2Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            fi2Var = (fi2) this.a.z.get();
        }
        return fi2Var;
    }

    public final me2 b() {
        me2 me2Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            me2Var = (me2) this.a.x.get();
        }
        return me2Var;
    }

    public final ze2 c(se2 se2Var, xe2 xe2Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) ef2.b(se2Var.a)));
            return (ze2) new w05(this.a.c, new ih(se2Var, xe2Var)).s.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
