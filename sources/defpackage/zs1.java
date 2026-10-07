package defpackage;

import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zs1 extends s7g {
    public final p52 u;
    public final s52 v;
    public final boolean w;

    public zs1(FrameLayout frameLayout, p52 p52Var) {
        super(frameLayout);
        this.u = p52Var;
        s52 s52Var = (s52) frameLayout.findViewById(R.id.call_opponent);
        this.v = s52Var;
        this.w = s52Var.getMode() == q52.SMALL;
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        gp1 gp1Var = (gp1) k79Var;
        CharSequence charSequence = gp1Var.c;
        String str = gp1Var.d;
        s52 s52Var = this.v;
        s52Var.I(str, charSequence);
        s52Var.H(gp1Var.l, false);
        s52Var.D(gp1Var.h);
        s52Var.E(gp1Var.f);
        s52Var.setAvatar(gp1Var.e);
        s52Var.setRaiseHand(gp1Var.k);
        s52Var.setOpponentVideo(gp1Var.p);
        e61 e61VarA = gp1Var.q;
        if (this.w) {
            e61VarA = e61.a(e61VarA, 0, 7);
        }
        s52Var.setButtonAction(e61VarA);
        s52Var.x1 = gp1Var.a;
        s52Var.s1 = this.u;
    }

    @Override // defpackage.s7g
    public final void F() {
        this.v.C();
    }
}
