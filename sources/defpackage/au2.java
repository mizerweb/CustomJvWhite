package defpackage;

import one.me.profile.screens.members.ChatAdminsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class au2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAdminsScreen b;

    public /* synthetic */ au2(ChatAdminsScreen chatAdminsScreen, int i) {
        this.a = i;
        this.b = chatAdminsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChatAdminsScreen chatAdminsScreen = this.b;
        switch (i) {
            case 0:
                hu2 hu2Var = (hu2) chatAdminsScreen.d.getAccessor().c(1076);
                return new gu2(chatAdminsScreen.p1(), hu2Var.a, hu2Var.b, hu2Var.c, hu2Var.d, hu2Var.e, hu2Var.f);
            case 1:
                wtc wtcVar = chatAdminsScreen.d;
                o9a o9aVarD = wtcVar.d();
                n61 n61Var = new n61(1, chatAdminsScreen.o1(), gu2.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0, 3);
                kj1 kj1Var = new kj1(0, chatAdminsScreen.o1(), gu2.class, "getButtonActions", "getButtonActions()Lkotlinx/coroutines/flow/Flow;", 0, 8);
                zt2 zt2Var = new zt2(chatAdminsScreen.p1(), wtcVar.a(), wtcVar.getAccessor().d(132), wtcVar.getAccessor().d(479), wtcVar.b(), wtcVar.getAccessor().d(480), wtcVar.c(), wtcVar.getAccessor().d(377));
                o9aVarD.getClass();
                return new n9a(n61Var, kj1Var, zt2Var);
            default:
                return Long.valueOf(((s7f) ((et3) ((ifh) chatAdminsScreen.d.b()).getValue())).t());
        }
    }
}
