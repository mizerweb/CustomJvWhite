package defpackage;

import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class old implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ old(lp0 lp0Var, int i) {
        this.a = i;
        this.b = lp0Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        lp0 lp0Var = this.b;
        switch (i) {
            case 0:
                ((ProfileChangeLinkScreen) lp0Var.g).s1().c.a();
                break;
            case 1:
                gq2 gq2VarS1 = ((ProfileChangeLinkScreen) lp0Var.g).s1();
                yab.i0(gq2VarS1.b, null, 0, new fq2(gq2VarS1, null, 0), 3);
                break;
            default:
                ((ProfileChangeLinkScreen) lp0Var.g).s1().c.e();
                break;
        }
        return sbiVar;
    }
}
