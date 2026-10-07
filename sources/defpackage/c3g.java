package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c3g extends s7g {
    public final a8f u;

    public c3g(Context context, a8f a8fVar) {
        super(new yyb(context));
        this.u = a8fVar;
    }

    @Override // defpackage.s7g
    public final /* bridge */ /* synthetic */ void B(k79 k79Var) {
        H();
    }

    public final void H() {
        yyb yybVar = (yyb) this.a;
        yybVar.setText(np4.q(yybVar.getContext(), R.string.chats_list_search_show_more));
        yybVar.setIcon(yybVar.getContext().getDrawable(R.drawable.icon_arrow_down).mutate());
        yybVar.setAppearance(wyb.c);
        qe7.H(yybVar, 300L, new x7(8, this));
    }
}
