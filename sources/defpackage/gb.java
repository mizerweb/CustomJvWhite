package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements mjd {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gb(rrh[] rrhVarArr) {
        rrh[] rrhVarArr2 = rrhVarArr;
        this.b = rrhVarArr2;
        oc9.m(0, rrhVarArr2.length);
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        switch (this.a) {
            case 0:
                ((mjd) this.b).b(new fb(lq0Var, 0), es0Var);
                break;
            default:
                if (es0Var.a.h == null) {
                    lq0Var.g(1, null);
                } else if (!c(0, lq0Var, es0Var)) {
                    lq0Var.g(1, null);
                }
                break;
        }
    }

    public boolean c(int i, lq0 lq0Var, es0 es0Var) {
        rrh[] rrhVarArr = (rrh[]) this.b;
        bne bneVar = es0Var.a.h;
        while (true) {
            if (i >= rrhVarArr.length) {
                i = -1;
                break;
            }
            if (rrhVarArr[i].a(bneVar)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        rrhVarArr[i].b(new prh(this, lq0Var, es0Var, i), es0Var);
        return true;
    }

    public gb(mjd mjdVar) {
        this.b = mjdVar;
    }
}
