package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class fe2 implements ug4 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ mx1 b;
    public final /* synthetic */ he2 c;

    public fe2(p09 p09Var, Executor executor, mx1 mx1Var) {
        this.c = p09Var;
        this.a = executor;
        this.b = mx1Var;
    }

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        v3j v3jVar = (v3j) obj;
        if (v3jVar instanceof q3j) {
            if (wxl.c()) {
                he2 he2Var = this.c;
                fee feeVar = (fee) he2Var.l.remove(this);
                if (feeVar != null && he2Var.k == feeVar) {
                    he2Var.k = null;
                }
            } else {
                this.a.execute(new c3(29, this));
            }
        }
        this.b.accept(v3jVar);
    }
}
