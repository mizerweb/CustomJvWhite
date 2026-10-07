package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class uc extends s7g {
    public final tbj u;

    public uc(Context context, tbj tbjVar) {
        super(new izb(context, false));
        this.u = tbjVar;
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H */
    public final void B(eni eniVar) {
        izb izbVar = (izb) this.a;
        izbVar.setCustomTheme(pq3.j.l(izbVar).b);
        izbVar.setCallButtonMode(dzb.b);
        CharSequence charSequenceB = eniVar.a.b(izbVar.getContext());
        izbVar.setTitle(charSequenceB != null ? charSequenceB.toString() : null);
        izbVar.setSubtitle(null);
        izbVar.setVerified(eniVar.e);
        tj0 tj0Var = eniVar.b;
        izbVar.j(tj0Var.a, tj0Var.b, eniVar.c);
    }
}
