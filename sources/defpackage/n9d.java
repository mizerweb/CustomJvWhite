package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n9d extends o9d {
    public final fz7 u;

    public n9d(Context context, fz7 fz7Var) {
        yyb yybVar = new yyb(context);
        super(yybVar);
        this.u = fz7Var;
        yybVar.setText(np4.q(yybVar.getContext(), R.string.oneme_poll_create__show_all_voters_button_title));
        yybVar.setIcon(yybVar.getContext().getDrawable(R.drawable.icon_users).mutate());
        yybVar.setAppearance(wyb.b);
        yybVar.setIconSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        qe7.H((yyb) this.a, 300L, new aeb(this, 10, (m9d) k79Var));
    }
}
