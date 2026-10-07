package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class tn1 extends g6g {
    public final i1m f;

    public tn1(i1m i1mVar, ExecutorService executorService) {
        super(executorService);
        this.f = i1mVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof sn1)) {
            s7gVar.B((k79) F(i));
            return;
        }
        sn1 sn1Var = (sn1) s7gVar;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof cq1) {
            sn1Var.B(k79Var);
            qe7.H((atf) sn1Var.a, 300L, new ee(this.f, 5, (cq1) k79Var));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new sn1(new atf(viewGroup.getContext()));
    }
}
