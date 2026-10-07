package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class c18 extends s30 {
    public final /* synthetic */ d18 m;

    public c18(d18 d18Var) {
        this.m = d18Var;
    }

    @Override // defpackage.s30
    public final void k() {
        this.m.e(9);
        w08 w08Var = this.m.b;
        synchronized (w08Var) {
            long j = w08Var.n;
            long j2 = w08Var.m;
            if (j < j2) {
                return;
            }
            w08Var.m = j2 + 1;
            w08Var.o = System.nanoTime() + 1000000000;
            w08Var.h.c(new u08(0, w08Var, zo5.w(new StringBuilder(), w08Var.c, " ping")), 0L);
        }
    }

    public final void l() throws SocketTimeoutException {
        if (j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
