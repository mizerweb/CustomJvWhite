package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fs6 implements Runnable {
    public final /* synthetic */ gs6 a;

    public fs6(gs6 gs6Var) {
        this.a = gs6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs6 gs6Var = this.a;
        f40 f40Var = gs6Var.a;
        ds6 ds6Var = gs6Var.b;
        boolean z = gs6Var.f;
        if (z && ds6Var != null) {
            ds6Var.log("WriteTask: writePrefs");
        }
        p1f p1fVar = (p1f) gs6Var.d.getAndSet(null);
        if (p1fVar == null) {
            if (ds6Var != null) {
                ds6Var.log("WriteTask: early return in run cuz of writeMap.getAndSet(null) is null");
                return;
            }
            return;
        }
        File parentFile = f40Var.c.getParentFile();
        if (z && ds6Var != null) {
            ds6Var.log("checkFilesDirAvailable: filesDir = " + parentFile);
        }
        if (qe7.W(z, ds6Var, new d2(21, f40Var))) {
            try {
                qyj.Y(f40Var, new g3(28, p1fVar));
            } catch (IOException unused) {
            }
        } else {
            throw new IllegalStateException(new IllegalStateException("dir " + f40Var + " not created").toString());
        }
    }
}
