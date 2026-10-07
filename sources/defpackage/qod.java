package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qod implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ qod(lp0 lp0Var, int i) {
        this.a = i;
        this.b = lp0Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        lp0 lp0Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                ((ProfileEditScreen) lp0Var.g).s1().c.n(1, str);
                break;
            case 1:
                ((ProfileEditScreen) lp0Var.g).s1().c.n(2, str);
                break;
            case 2:
                ((ProfileEditScreen) lp0Var.g).s1().c.n(131072, str);
                break;
            default:
                ((ProfileEditScreen) lp0Var.g).s1().c.n(4, str);
                break;
        }
        return sbiVar;
    }
}
