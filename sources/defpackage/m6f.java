package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class m6f extends mn8 {
    public final lsa c;
    public final String d = m6f.class.getName();

    public m6f(lsa lsaVar) {
        this.c = lsaVar;
    }

    public static final boolean d(m6f m6fVar, RecyclerView recyclerView, int i) {
        return tre.j0(recyclerView, i - 1) && tre.j0(recyclerView, tre.V(recyclerView, 1.0f));
    }

    public static final void e(m6f m6fVar, nee neeVar) {
        int iL = neeVar.l() - 1;
        String str = m6fVar.d;
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(iL, "scrollToBottomNotifier scroll to bottom position, pos:"), null);
            }
        }
        MessagesListWidget messagesListWidget = m6fVar.c.b;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        fva fvaVarG0 = messagesListWidget.F1().g0();
        fvaVarG0.g(yab.h0(fvaVarG0.c, fvaVarG0.b, 2, new c37(fvaVarG0, lq4Var, 8)));
    }

    @Override // defpackage.mn8
    public final pee c(RecyclerView recyclerView, nee neeVar) {
        return new l6f(this, recyclerView, neeVar);
    }
}
