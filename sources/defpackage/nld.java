package defpackage;

import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nld implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ nld(lp0 lp0Var, int i) {
        this.a = i;
        this.b = lp0Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        lp0 lp0Var = this.b;
        switch (i) {
            case 0:
                ((ProfileChangeLinkScreen) lp0Var.g).s1().c.m(((Integer) obj).intValue());
                break;
            default:
                ((ProfileChangeLinkScreen) lp0Var.g).s1().c.l((String) obj);
                break;
        }
        return sbiVar;
    }
}
