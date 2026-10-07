package defpackage;

import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class rf3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ rf3(ChatTitleIconScreen chatTitleIconScreen, rbb rbbVar, int i) {
        this.a = i;
        this.b = rbbVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        rbb rbbVar = this.b;
        switch (i) {
            case 0:
                ohg ohgVar = (ohg) obj;
                ohgVar.k();
                ohgVar.e(ohgVar.j(((jf3) rbbVar).b));
                break;
            case 1:
                ohg ohgVar2 = (ohg) obj;
                ohgVar2.k();
                o65.c(ohgVar2.b(), nbh.s(((if3) rbbVar).b, ":profile/edit/link?id=", "&type=local_chat&flow=create"), null, null, 6);
                break;
            default:
                ohg ohgVar3 = (ohg) obj;
                ohgVar3.k();
                o65.c(ohgVar3.b(), zo5.j(((hf3) rbbVar).b, ":start-conversation/add-subscribers?id="), null, null, 6);
                break;
        }
        return sbiVar;
    }
}
