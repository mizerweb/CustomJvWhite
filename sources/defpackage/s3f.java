package defpackage;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public class s3f extends m0 implements iu4 {
    public final lq4 f;

    public s3f(lq4 lq4Var, vt4 vt4Var) {
        super(vt4Var, true);
        this.f = lq4Var;
    }

    @Override // defpackage.up8
    public final boolean P() {
        return true;
    }

    @Override // defpackage.iu4
    public final iu4 getCallerFrame() {
        lq4 lq4Var = this.f;
        if (lq4Var instanceof iu4) {
            return (iu4) lq4Var;
        }
        return null;
    }

    @Override // defpackage.up8
    public void n(Object obj) throws DispatchException {
        e9i.w0(p90.B(this.f), cqk.E(obj));
    }

    public void n0() {
    }

    @Override // defpackage.up8
    public void o(Object obj) {
        this.f.resumeWith(cqk.E(obj));
    }
}
