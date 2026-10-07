package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class ux3 extends te {
    public static final uy8 n = new uy8(ux3.class);
    public s88 l;
    public tx3 m;

    public ux3(c98 c98Var, g35 g35Var) {
        int size = c98Var.size();
        this.h = null;
        this.i = size;
        this.l = c98Var;
        this.m = new tx3(this, g35Var);
        im5 im5Var = im5.a;
        Objects.requireNonNull(this.l);
        if (!this.l.isEmpty()) {
            qe qeVar = new qe(this, 0, null);
            pci it = this.l.iterator();
            while (it.hasNext()) {
                e89 e89Var = (e89) it.next();
                if (e89Var.isDone()) {
                    r(null);
                } else {
                    e89Var.b(qeVar, im5Var);
                }
            }
            return;
        }
        tx3 tx3Var = this.m;
        if (tx3Var != null) {
            try {
                tx3Var.c.getClass();
                tx3Var.run();
            } catch (RejectedExecutionException e) {
                tx3Var.d.n(e);
            }
        }
    }

    @Override // defpackage.o1
    public final void d() {
        s88 s88Var = this.l;
        this.l = null;
        this.m = null;
        if ((this.a instanceof a1) && (s88Var != null)) {
            boolean zQ = q();
            pci it = s88Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zQ);
            }
        }
    }

    @Override // defpackage.o1
    public final void j() {
        tx3 tx3Var = this.m;
        if (tx3Var != null) {
            tx3Var.c();
        }
    }

    @Override // defpackage.o1
    public final String k() {
        s88 s88Var = this.l;
        if (s88Var == null) {
            return super.k();
        }
        return "futures=" + s88Var;
    }

    public final void r(s88 s88Var) {
        int iA = te.j.a(this);
        lvb.Z("Less than 0 remaining futures", iA >= 0);
        if (iA == 0) {
            if (s88Var != null) {
                pci it = s88Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            vd7.C(future);
                        } catch (ExecutionException e) {
                            s(e.getCause());
                        } catch (Throwable th) {
                            s(th);
                        }
                    }
                }
            }
            this.h = null;
            tx3 tx3Var = this.m;
            if (tx3Var != null) {
                try {
                    tx3Var.c.getClass();
                    tx3Var.run();
                } catch (RejectedExecutionException e2) {
                    tx3Var.d.n(e2);
                }
            }
            this.l = null;
        }
    }

    public final void s(Throwable th) {
        th.getClass();
        if (th instanceof Error) {
            n.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }
}
