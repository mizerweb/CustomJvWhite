package defpackage;

import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r63 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    public /* synthetic */ r63(ChatMembersCompactWidget chatMembersCompactWidget, int i) {
        this.a = i;
        this.b = chatMembersCompactWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChatMembersCompactWidget chatMembersCompactWidget = this.b;
        switch (i) {
            case 0:
                m73 m73Var = (m73) chatMembersCompactWidget.c.getAccessor().c(1075);
                return new l73(chatMembersCompactWidget.o1(), true, m73Var.a, m73Var.b, m73Var.c, m73Var.d, m73Var.e, m73Var.f);
            default:
                wtc wtcVar = chatMembersCompactWidget.c;
                o9a o9aVarD = wtcVar.d();
                j22 j22Var = new j22(11, chatMembersCompactWidget);
                kj1 kj1Var = new kj1(0, chatMembersCompactWidget.p1(), l73.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 10);
                ra raVar = new ra(chatMembersCompactWidget.o1(), wtcVar.a(), wtcVar.getAccessor().d(479), wtcVar.b(), wtcVar.getAccessor().d(480), wtcVar.c(), wtcVar.getAccessor().d(377), 1);
                o9aVarD.getClass();
                return new n9a(j22Var, kj1Var, raVar);
        }
    }
}
