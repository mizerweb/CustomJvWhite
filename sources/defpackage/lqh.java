package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class lqh implements mjd {
    public final /* synthetic */ int a;
    public final mjd b;
    public final Object c;

    public /* synthetic */ lqh(mjd mjdVar, Object obj, int i) {
        this.a = i;
        this.b = mjdVar;
        this.c = obj;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        switch (this.a) {
            case 0:
                fbc fbcVar = (fbc) this.c;
                pjd pjdVar = es0Var.c;
                qe7.v();
                es0Var.l.w.getClass();
                xa9 xa9Var = new xa9(lq0Var, pjdVar, es0Var, this);
                es0Var.a(new r68(xa9Var, this));
                synchronized (fbcVar) {
                    ((Executor) fbcVar.b).execute(xa9Var);
                }
                return;
            default:
                ((ane) this.b).b(new w21(this, lq0Var, es0Var), es0Var);
                return;
        }
    }
}
