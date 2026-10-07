package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class dl0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(dl0.class, "notCompletedCount$volatile");
    public final xf5[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public dl0(xf5[] xf5VarArr) {
        this.a = xf5VarArr;
        this.notCompletedCount$volatile = xf5VarArr.length;
    }

    public final Object a(lq4 lq4Var) {
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        vo8[] vo8VarArr = this.a;
        int length = vo8VarArr.length;
        al0[] al0VarArr = new al0[length];
        for (int i = 0; i < length; i++) {
            vo8 vo8Var = vo8VarArr[i];
            ((up8) vo8Var).start();
            al0 al0Var = new al0(this, ek2Var);
            al0Var.i = vd7.D(vo8Var, al0Var);
            al0VarArr[i] = al0Var;
        }
        cl0 cl0Var = new cl0(al0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            al0VarArr[i2].r(cl0Var);
        }
        if (ek2Var.t() instanceof hib) {
            ek2Var.x(cl0Var);
        } else {
            cl0Var.a();
        }
        return ek2Var.s();
    }
}
