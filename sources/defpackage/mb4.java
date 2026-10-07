package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class mb4 implements z09 {
    public final /* synthetic */ ConfirmPhoneScreen a;

    public mb4(ConfirmPhoneScreen confirmPhoneScreen) {
        this.a = confirmPhoneScreen;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        if (m09Var == m09.ON_STOP) {
            ((bk8) this.a.k.getValue()).a((2 & 1) != 0, false);
        }
    }
}
