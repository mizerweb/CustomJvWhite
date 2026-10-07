package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zqf extends s7g {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof az0) {
            izb izbVar = (izb) this.a;
            az0 az0Var = (az0) k79Var;
            izbVar.setTitle(az0Var.c);
            izbVar.j(az0Var.a, az0Var.d, az0Var.b);
            Integer num = az0Var.e;
            izbVar.setSubtitle(num != null ? izbVar.getContext().getString(num.intValue()) : null);
        }
    }
}
