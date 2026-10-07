package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class qq8 extends g6g {
    public final c7k f;
    public final dc9 g;

    public qq8(c7k c7kVar, dc9 dc9Var, ExecutorService executorService) {
        super(executorService);
        this.f = c7kVar;
        this.g = dc9Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(wq8 wq8Var, int i) {
        rq8 rq8Var = (rq8) ((k79) F(i));
        wq8Var.B(rq8Var);
        izb izbVar = (izb) wq8Var.a;
        izbVar.i();
        c7k c7kVar = this.f;
        qe7.H(izbVar, 300L, new z36(c7kVar, 12, rq8Var));
        dc9 dc9Var = wq8Var.u;
        izbVar.p((LayerDrawable) ((ny8) dc9Var.b).getValue(), (LayerDrawable) ((ny8) dc9Var.c).getValue(), new w14(c7kVar, 24, rq8Var));
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return 1;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new wq8(viewGroup.getContext(), this.g);
    }
}
