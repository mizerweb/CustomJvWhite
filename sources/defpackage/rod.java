package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rod implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ rod(lp0 lp0Var, int i) {
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
                ((ProfileEditScreen) lp0Var.g).s1().c.a(64);
                break;
            case 1:
                ((ProfileEditScreen) lp0Var.g).s1().c.a(np0.m);
                break;
            case 2:
                ((ProfileEditScreen) lp0Var.g).s1().c.a(np0.n);
                break;
            default:
                ((ProfileEditScreen) lp0Var.g).s1().c.a(np0.o);
                break;
        }
        return sbiVar;
    }
}
