package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class d6b {
    public final RecyclerView a;
    public final qpa b;
    public final x5b c;
    public final oqa d;
    public tp3 e;
    public b65 f;

    public d6b(k96 k96Var, qpa qpaVar, x5b x5bVar, oqa oqaVar) {
        this.a = k96Var;
        this.b = qpaVar;
        this.c = x5bVar;
        this.d = oqaVar;
    }

    public final void a() {
        int iL;
        MessageModel messageModelQ;
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            lfe lfeVarS = recyclerView.S(recyclerView.getChildAt(i));
            tea teaVar = lfeVarS instanceof tea ? (tea) lfeVarS : null;
            if (teaVar != null && (iL = teaVar.l()) != -1 && (messageModelQ = this.b.Q(iL)) != null) {
                teaVar.M(messageModelQ);
                teaVar.J(messageModelQ);
            }
        }
    }
}
