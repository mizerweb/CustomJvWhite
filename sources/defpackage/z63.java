package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z63 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ z63(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (i) {
            case 0:
                m73 m73Var = (m73) chatMembersScreen.d.getAccessor().c(1075);
                return new l73(chatMembersScreen.o1(), false, m73Var.a, m73Var.b, m73Var.c, m73Var.d, m73Var.e, m73Var.f);
            case 1:
                wtc wtcVar = chatMembersScreen.d;
                o9a o9aVarD = wtcVar.d();
                n61 n61Var = new n61(1, chatMembersScreen.p1(), l73.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0, 11);
                kj1 kj1Var = new kj1(0, chatMembersScreen.p1(), l73.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 11);
                ra raVar = new ra(chatMembersScreen.o1(), wtcVar.a(), wtcVar.getAccessor().d(479), wtcVar.b(), wtcVar.getAccessor().d(480), wtcVar.c(), wtcVar.getAccessor().d(377), 1);
                o9aVarD.getClass();
                return new n9a(n61Var, kj1Var, raVar);
            default:
                zv8[] zv8VarArr = ChatMembersScreen.k;
                t3f t3fVar = chatMembersScreen.c;
                long jO1 = chatMembersScreen.o1();
                String string = chatMembersScreen.getArgs().getString("profile:memberslist:type");
                if (string == null) {
                    string = "";
                }
                MembersListWidget membersListWidget = new MembersListWidget(t3fVar, new c9a(jO1, p63.valueOf(string), 12));
                membersListWidget.setTargetWidget(chatMembersScreen);
                return membersListWidget;
        }
    }
}
