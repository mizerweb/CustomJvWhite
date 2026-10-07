package defpackage;

import one.me.login.LoginScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginScreen b;

    public /* synthetic */ tg9(LoginScreen loginScreen, int i) {
        this.a = i;
        this.b = loginScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        LoginScreen loginScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = LoginScreen.f;
                return new r6c(loginScreen.getContext());
            default:
                ca2 ca2Var = loginScreen.c;
                return new wg9(ca2Var.getAccessor().d(34), ca2Var.getAccessor().d(102), ca2Var.getAccessor().d(85));
        }
    }
}
