package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class tj7 extends s7g implements e5e {
    public final kbc u;

    public tj7(Context context) {
        super(new yyb(context));
        this.u = pq3.j.e(context).j().b;
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof sj7) {
            sj7 sj7Var = (sj7) k79Var;
            Integer num = sj7Var.d;
            CharSequence charSequenceA = sj7Var.f.a(this);
            if (charSequenceA == null) {
                charSequenceA = "";
            }
            yyb yybVar = (yyb) this.a;
            kbc kbcVar = this.u;
            yybVar.setCustomTheme(kbcVar);
            yybVar.setAppearance(wyb.b);
            yybVar.setText(charSequenceA);
            yybVar.getContext();
            Drawable jjcVar = new jjc(kbcVar.getText().b, sj7Var.b / sj7Var.c);
            if (num != null) {
                jjcVar = yybVar.getContext().getDrawable(num.intValue());
            }
            yybVar.setIcon(jjcVar);
            yybVar.setIconSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        }
    }

    @Override // defpackage.e5e
    public final void b(k79 k79Var, kx kxVar) {
        B(k79Var);
        if (k79Var instanceof sj7) {
            qe7.H(this.a, 300L, new z36(kxVar, 6, k79Var));
        }
    }
}
