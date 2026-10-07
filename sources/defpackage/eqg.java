package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class eqg implements Runnable {
    public final ijd a;
    public final kig b;
    public final boolean c;
    public final int d;

    public eqg(ijd ijdVar, kig kigVar, boolean z, int i) {
        this.a = ijdVar;
        this.b = kigVar;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        boolean zD;
        h0k h0kVarB;
        boolean z = this.c;
        ijd ijdVar = this.a;
        kig kigVar = this.b;
        if (z) {
            int i = this.d;
            ijdVar.getClass();
            String str = kigVar.a.a;
            synchronized (ijdVar.k) {
                h0kVarB = ijdVar.b(str);
            }
            zD = ijd.d(str, h0kVarB, i);
        } else {
            int i2 = this.d;
            ijdVar.getClass();
            String str2 = kigVar.a.a;
            synchronized (ijdVar.k) {
                try {
                    if (ijdVar.f.get(str2) != null) {
                        n1g.x().p(ijd.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) ijdVar.h.get(str2);
                        if (set != null && set.contains(kigVar)) {
                            zD = ijd.d(str2, ijdVar.b(str2), i2);
                        }
                    }
                    zD = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        n1g.x().p(n1g.Z("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zD);
    }
}
