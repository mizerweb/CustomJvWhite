package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xvf extends s7g {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof lbf) {
            cyb cybVar = (cyb) this.a;
            lbf lbfVar = (lbf) k79Var;
            CharSequence charSequenceA = lbfVar.a.a(this);
            if (charSequenceA == null) {
                charSequenceA = "";
            }
            cybVar.setText(charSequenceA);
            CharSequence charSequenceA2 = lbfVar.c.a(this);
            cybVar.setCounterText(charSequenceA2 != null ? charSequenceA2.toString() : null);
        }
    }
}
