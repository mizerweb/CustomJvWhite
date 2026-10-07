package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d04 extends g6g {
    public final vn7 f;

    public d04(vn7 vn7Var, ExecutorService executorService) {
        super(executorService);
        this.f = vn7Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(m04 m04Var, int i) {
        e04 e04Var = (e04) ((k79) F(i));
        m04Var.B(e04Var);
        izb izbVar = (izb) m04Var.a;
        izbVar.i();
        Integer numValueOf = Integer.valueOf(R.drawable.icon_cross);
        vn7 vn7Var = this.f;
        izbVar.n(numValueOf, (6 & 2) != 0 ? zxb.SECONDARY : zxb.GHOST, null, new za2(vn7Var, 22, e04Var));
        qe7.H(izbVar, 300L, new ee(vn7Var, 20, e04Var));
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return 1;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new m04(new izb(viewGroup.getContext(), true));
    }
}
