package defpackage;

import one.me.profile.screens.joinrequests.JoinRequestsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class er8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ JoinRequestsScreen b;

    public /* synthetic */ er8(JoinRequestsScreen joinRequestsScreen, int i) {
        this.a = i;
        this.b = joinRequestsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        JoinRequestsScreen joinRequestsScreen = this.b;
        switch (i) {
            case 0:
                tr8 tr8Var = (tr8) joinRequestsScreen.d.getAccessor().c(1080);
                vv vvVar = joinRequestsScreen.b;
                zv8 zv8Var = JoinRequestsScreen.k[0];
                return new sr8(((Number) vvVar.a(joinRequestsScreen)).longValue(), tr8Var.a, tr8Var.b, tr8Var.c, tr8Var.d, tr8Var.e, tr8Var.f);
            default:
                zv8[] zv8VarArr = JoinRequestsScreen.k;
                return new qq8(new c7k(16, joinRequestsScreen), new dc9(joinRequestsScreen.getContext()), joinRequestsScreen.d.getExecutors().a());
        }
    }
}
