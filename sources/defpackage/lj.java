package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class lj extends jj {
    public lj(View view, oi8 oi8Var, cf7 cf7Var) {
        super(view, oi8Var, cf7Var, 40);
    }

    @Override // defpackage.jj
    public final ixj i(ixj ixjVar) {
        exj exjVar = ixjVar.a;
        mi8 mi8VarF = exjVar.f(this.j);
        mi8 mi8VarF2 = exjVar.f(this.d);
        mi8 mi8VarB = mi8.b(mi8VarF.a - mi8VarF2.a, mi8VarF.b - mi8VarF2.b, mi8VarF.c - mi8VarF2.c, mi8VarF.d - mi8VarF2.d);
        mi8 mi8VarB2 = mi8.b(Math.max(mi8VarB.a, 0), Math.max(mi8VarB.b, 0), Math.max(mi8VarB.c, 0), Math.max(mi8VarB.d, 0));
        this.a.setTranslationY(mi8VarB2.b - mi8VarB2.d);
        return ixjVar;
    }

    @Override // defpackage.jj
    public final void j() {
        this.a.setTranslationY(0.0f);
    }
}
