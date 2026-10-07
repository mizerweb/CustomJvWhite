package defpackage;

import one.me.profile.screens.members.ChatMembersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a73 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ a73(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatMembersScreen.k;
                chatMembersScreen.getRouter().D();
                break;
            default:
                zv8[] zv8VarArr2 = ChatMembersScreen.k;
                mjg mjgVar = chatMembersScreen.q1().h;
                mjgVar.getClass();
                mjgVar.j(null, c76.a);
                break;
        }
        return sbiVar;
    }
}
