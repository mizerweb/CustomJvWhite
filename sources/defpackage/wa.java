package defpackage;

import one.me.profile.screens.addadmins.AddChatAdminsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wa implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddChatAdminsScreen b;

    public /* synthetic */ wa(AddChatAdminsScreen addChatAdminsScreen, int i) {
        this.a = i;
        this.b = addChatAdminsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                AddChatAdminsScreen addChatAdminsScreen = this.b;
                wtc wtcVar = addChatAdminsScreen.c;
                o9a o9aVarD = wtcVar.d();
                ra raVar = new ra(addChatAdminsScreen.o1(), wtcVar.a(), wtcVar.getAccessor().d(479), wtcVar.b(), wtcVar.getAccessor().d(480), wtcVar.c(), wtcVar.getAccessor().d(377), 0);
                vi2 vi2Var = new vi2(6);
                va vaVar = new va(1);
                o9aVarD.getClass();
                return new n9a(vi2Var, vaVar, raVar);
            default:
                zv8[] zv8VarArr = AddChatAdminsScreen.l;
                AddChatAdminsScreen addChatAdminsScreen2 = this.b;
                return new sa(addChatAdminsScreen2.o1(), addChatAdminsScreen2.b, addChatAdminsScreen2.i, addChatAdminsScreen2);
        }
    }
}
