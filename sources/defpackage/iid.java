package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iid {
    public static final iid b;
    public final tw5 a;

    static {
        tw5 tw5Var = new tw5();
        tw5Var.a = new Object();
        tw5Var.c = g88.c;
        tw5Var.f = new HashMap();
        tw5Var.g = new HashSet();
        b = new iid(tw5Var);
    }

    public iid(tw5 tw5Var) {
        this.a = tw5Var;
    }

    public final o09 a(g19 g19Var, fh2 fh2Var, kr6 kr6Var) {
        tw5 tw5Var = this.a;
        cqk.f("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (tw5.c(tw5Var) == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            tw5.d(tw5Var, 1);
            o09 o09VarF = tw5.f(tw5Var, g19Var, fh2Var, new ec1((List) kr6Var.b, (b9j) kr6Var.a, (List) kr6Var.c));
            Trace.endSection();
            return o09VarF;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
