package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xx2 extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(yx2 yx2Var) {
        wx2 wx2Var = (wx2) this.a;
        wx2Var.setTitle(yx2Var.a);
        wx2Var.setSubtitle(yx2Var.b);
        String str = yx2Var.c;
        CharSequence charSequence = yx2Var.d;
        long j = yx2Var.e;
        wx2Var.a.setOverlay(yx2Var.f ? xvb.a : null);
        kwb kwbVar = wx2Var.a;
        Long lValueOf = Long.valueOf(j);
        if (charSequence == null) {
            charSequence = "";
        }
        kwb.v(kwbVar, str, lValueOf, charSequence);
        wx2Var.setDescriptions(yx2Var.g);
    }
}
