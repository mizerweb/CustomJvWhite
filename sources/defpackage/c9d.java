package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class c9d extends o9d {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9d(View view, int i) {
        super(view);
        this.u = i;
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                a9d a9dVar = (a9d) k79Var;
                b9d b9dVar = (b9d) view;
                b9dVar.setAnswerText(a9dVar.c);
                b9dVar.b.a(a9dVar.d, a9dVar.e);
                break;
            default:
                d9d d9dVar = (d9d) k79Var;
                j9d j9dVar = (j9d) view;
                j9dVar.setAnswerText(d9dVar.c);
                j9dVar.b.a(d9dVar.d, d9dVar.e);
                break;
        }
    }
}
