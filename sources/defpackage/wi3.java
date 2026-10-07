package defpackage;

import one.me.chats.search.ChatsListSearchScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wi3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListSearchScreen b;

    public /* synthetic */ wi3(ChatsListSearchScreen chatsListSearchScreen, int i) {
        this.a = i;
        this.b = chatsListSearchScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChatsListSearchScreen chatsListSearchScreen = this.b;
        switch (i) {
            case 0:
                return new uj4(chatsListSearchScreen.a.getAccessor().d(97));
            case 1:
                gk3 gk3Var = (gk3) chatsListSearchScreen.a.getAccessor().c(978);
                gk3Var.getClass();
                return new fk3(gk3Var.a, gk3Var.b, gk3Var.c, gk3Var.d, gk3Var.e, gk3Var.f, gk3Var.g, gk3Var.h, gk3Var.i, gk3Var.j, gk3Var.k, gk3Var.l, gk3Var.m, gk3Var.n, gk3Var.o, gk3Var.p, gk3Var.q, gk3Var.r, gk3Var.s, gk3Var.t, gk3Var.u, gk3Var.v, gk3Var.w, gk3Var.x, gk3Var.y, gk3Var.z, gk3Var.A, gk3Var.B, gk3Var.C, gk3Var.D, gk3Var.E, gk3Var.F);
            case 2:
                return ((hm8) chatsListSearchScreen.a.getAccessor().c(752)).a();
            case 3:
                z8 z8Var = (z8) chatsListSearchScreen.a.getAccessor().c(753);
                z8Var.getClass();
                return new y8(z8Var.a, z8Var.b, z8Var.c);
            case 4:
                return ((ap0) chatsListSearchScreen.a.getAccessor().c(936)).a(chatsListSearchScreen.b.getAccessor().d(931), true, new k82(28));
            default:
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                return new jed((xed) chatsListSearchScreen.r1().x1.getValue());
        }
    }
}
