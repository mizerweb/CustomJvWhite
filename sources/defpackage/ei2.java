package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ei2 implements AutoCloseable {
    public final Surface a;
    public final int b;
    public final b40 c;
    public final /* synthetic */ fi2 d;

    public ei2(fi2 fi2Var, Surface surface) {
        this.d = fi2Var;
        this.a = surface;
        g40 g40Var = fi2.d;
        g40Var.getClass();
        this.b = g40.b.incrementAndGet(g40Var);
        this.c = gvk.a(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<nmi> listT1;
        if (this.c.a()) {
            fi2 fi2Var = this.d;
            synchronized (fi2Var.a) {
                surface = this.a;
                Integer num = (Integer) fi2Var.b.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                fi2Var.b.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listT1 = ww3.T1(fi2Var.c);
                    fi2Var.b.remove(surface);
                } else {
                    listT1 = null;
                }
            }
            if (listT1 != null) {
                for (nmi nmiVar : listT1) {
                    synchronized (nmiVar.e) {
                        try {
                            wf5 wf5Var = (wf5) nmiVar.g.remove(surface);
                            if (wf5Var != null) {
                                if (tvj.f(3, "CXCP")) {
                                    Log.d("CXCP", "SurfaceInactive " + wf5Var + " in " + nmiVar);
                                }
                                nmiVar.c.l(wf5Var);
                                try {
                                    wf5Var.b();
                                } catch (IllegalStateException e) {
                                    if (tvj.f(5, "CXCP")) {
                                        Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                    }
                                }
                                nmiVar.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.b;
    }
}
