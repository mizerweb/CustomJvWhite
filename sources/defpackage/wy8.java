package defpackage;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class wy8 extends sgg {
    public final lq4 f;

    /* JADX WARN: Multi-variable type inference failed */
    public wy8(vt4 vt4Var, qf7 qf7Var) {
        super(vt4Var, false);
        this.f = ((mq0) qf7Var).create(this, this);
    }

    @Override // defpackage.up8
    public final void X() throws Throwable {
        try {
            e9i.w0(p90.B(this.f), sbi.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).a;
            }
            resumeWith(new poe(th));
            throw th;
        }
    }
}
